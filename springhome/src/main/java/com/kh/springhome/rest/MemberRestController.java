package com.kh.springhome.rest;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.dto.StatDto;
import com.kh.springhome.dto.AttachDto;
import com.kh.springhome.configuration.FileUploadProperties;
import com.kh.springhome.dao.AttachDao;
import com.kh.springhome.dao.MemberDao;

@CrossOrigin
@RestController
@RequestMapping("/rest/member")
public class MemberRestController {
	
	@Autowired
	private MemberDao memberDao;
	
	@PostMapping("/idCheck")
	public String idCheck(@RequestParam String memberId) {
		MemberDto memberDto = memberDao.selectOne(memberId);
		if(memberDto == null) { //아이디가 없으면
			return "Y";
		}
		else { //아이디가 있으면
			return "N";
		}	
	}
	
	@PostMapping("/nicknameCheck")
	public String snicknameCheck(@RequestParam String memberNickname) {
		MemberDto memberDto = memberDao.selectOneByNickname(memberNickname);
		if(memberDto == null) { 
			return "Y";
		}
		else {
			return "N";
		}
	}

	//회원 등급별 인원 수 데이터 반환 매핑
	@GetMapping("/stat/count")
	public List<StatDto>statCount() {
		return memberDao.selectGroupByMemberLevel();
	}
	

	//프로필 업로드 & 다운로드 기능
	@Autowired
	private AttachDao attachDao;
	
	//초기 디렉터리 설정
	@Autowired
	private FileUploadProperties props;
	
	private File dir;
	
	@PostConstruct
	public void init() {
		dir = new File(props.getHome());
		dir.mkdirs();
	}
	
	//비동기 통신에서는 화면에서 다음 작업이 가능하도록 파일번호 등을 전달해야한다
	@PostMapping("/upload")
		public Map<String, Object> upload(@RequestParam MultipartFile attach) throws IllegalStateException, IOException{

			//절대규칙 - 파일은 하드디스크에, 정보는 DB에!
			
			//[1] 시퀀스 번호를 생성한다
			int attachNo = attachDao.sequence();
			
			//[2]시퀀스 번호를 파일명으로 하여 실제 파일을 저장한다
			//- 같은 이름에 대한 충돌을 방지하기 위해
			File target = new File(dir,String.valueOf(attachNo)); //저장할 파일
			attach.transferTo(target);//저장
			
			//[3]DB에 저장한 파일의 정보를 모아서 INSERT
			AttachDto attachDto = new AttachDto();
			attachDto.setAttachNo(attachNo);//실제 파일명
			attachDto.setAttachName(attach.getOriginalFilename()); //사용자가 아는 파일명
			attachDto.setAttachSize(attach.getSize());
			attachDto.setAttachType(attach.getContentType());
			attachDao.insert(attachDto);

			//화면에서 사용할 수 있도록 파일번호 또는 다운주소를 반환
//			return 객체 or Map;
			return Map.of("attachNo",attachNo); //-> JSON으로 알아서 반환해줌(class/Map)
												//sts에서 JSON을 반환해주는 라이브러리 = Jackson-databind
		}

		//다운로드는 비동기나 동기나 똑같음(파일번호만 알면 됨)
		@RequestMapping("/download")
		public ResponseEntity<ByteArrayResource>
						download(@RequestParam int attachNo) throws IOException{
			AttachDto attachDto = attachDao.selectOne(attachNo);
			
			if(attachDto == null) {
				//throw new NoTargetException("파일 없음");//내가만든 예외로 통합
				return ResponseEntity.notFound().build();//404 반환
			}
				File target = new File(dir, String.valueOf(attachDto.getAttachNo()));

				
				byte[] data = FileUtils.readFileToByteArray(target);//실제파일정보 불러오기
				ByteArrayResource resource = new ByteArrayResource(data);
				
				
				return ResponseEntity.ok()
						.header(HttpHeaders.CONTENT_ENCODING, StandardCharsets.UTF_8.name())
						.contentLength(attachDto.getAttachSize())
						.header(HttpHeaders.CONTENT_DISPOSITION, 
								ContentDisposition.attachment()
								.filename(attachDto.getAttachName(), StandardCharsets.UTF_8)
								.build().toString()
								)
					.body(resource);
				}
			}

	
	
	
//	@RequestMapping("/download")
//}
