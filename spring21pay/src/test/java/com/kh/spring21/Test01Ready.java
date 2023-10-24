package com.kh.spring21;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test01Ready {

	@Test
	public void test() throws URISyntaxException {
		//웹서버에서 PG사(제 3의 서버)로 요청을 보내기 위해선 다음 둘 중 하나가 필요
		//-[1] RestTemplate(미래엔 비권장-사용은 가능)
		//-[2] WebClient(최신)
		
		//전송 도구 생성
		RestTemplate template = new RestTemplate();
		
		//주소 설정
		URI uri = new URI("https://kapi.kakao.com/v1/payment/ready");
		
		//헤더 설정
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "KakaoAK 642e3d01b608c6541a705c21170592ec"); //내 admin 앱 키
		headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
		
		//바디 설정
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", "TC0ONETIME");//테스트결제 가맹점번호
		body.add("partner_order_id", UUID.randomUUID().toString());//가맹점 주문번호(랜덤번호설정)
		body.add("partner_user_id", "testuser1");//가맹점 회원 아이디(주문자)
		body.add("item_name", "아이스 아메리카노 T");//상품명(2개이상이면 '외 0개'로 표시 - 나중에 코드 추가해야함)
		body.add("quantity", "1");//상품수량 - 통신은 문자열만 가능(숫자를 문자로 보내라)-실제 수량은 DB에서 관리
		body.add("total_amount", "3000");//판매금액 - 개발 단계에선 최대 100만원까지만 가능
		body.add("tax_free_amount", "0");//상품 비과세 금액/부가세는 값 전달x 시, VAT자동계산
		body.add("approval_url", "http://localhost:8080/pay/success");//결제 성공 시 - redirct url
		body.add("cancel_url", "http://localhost:8080/pay/cancel");//결제 취소 시
		body.add("fail_url", "http://localhost:8080/pay/fail");//결제 실패 시
		
		//요청 발송
//		HttpEntity<MultiValueMap<String,String>> entity = new HttpEntity<>(body, headers);
		HttpEntity entity = new HttpEntity(body, headers); // 헤더+바디
		
		Map response = template.postForObject(uri, entity, Map.class); //주소,리퀘스트,서버응답(key,value - 잘 모르면 Map사용)
		log.debug("response = {}", response);
		//log.debug("url = {}", response.get("next_redirect_pc"));
		
	}
}
