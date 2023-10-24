package com.kh.spring21;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.kh.spring21.vo.KakaoPayReadyRequestVO;
import com.kh.spring21.vo.KakaoPayReadyResponseVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test03Ready {

	@Test
	public void test() throws URISyntaxException {
		//변하는 정보와 중요한 정보들을 분리하여 모듈로 개발
		
		//결제 준비 요청 정보를 클래스로 모듈화(KakaoPayReadyRequestVO)
		KakaoPayReadyRequestVO request = KakaoPayReadyRequestVO.builder()
												.partnerOrderId(UUID.randomUUID().toString())
												.partnerUserId("testuser1")
												.itemName("빵빵이 빵")
												.itemPrice(3500)
												.build();
		
		
		//전송 도구 생성
		RestTemplate template = new RestTemplate();
		
		//(+추가) SNAKE_CASE를 CAMEL_CASE로 처리하도록 추가 도구를 설정
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
		
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		
		template.getMessageConverters().add(0,converter);
		
		//주소 설정
		URI uri = new URI("https://kapi.kakao.com/v1/payment/ready");
		
		//헤더 설정
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "KakaoAK 642e3d01b608c6541a705c21170592ec"); //내 admin 앱 키
		headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
		
		//바디 설정
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", "TC0ONETIME");//테스트결제 가맹점번호
		body.add("partner_order_id", request.getPartnerOrderId());//가맹점 주문번호
		body.add("partner_user_id", request.getPartnerUserId());//가맹점 회원 아이디(주문자)
		body.add("item_name", request.getItemName());//상품명
		body.add("quantity", String.valueOf(request.getItemPrice()));//int -> String으로 바꾸는 명령/String.valueof
		body.add("total_amount", "3000");//판매금액
		body.add("tax_free_amount", "0");//상품 비과세 금액
		body.add("approval_url", "http://localhost:8080/pay/success");//결제 성공 시
		body.add("cancel_url", "http://localhost:8080/pay/cancel");//결제 취소 시
		body.add("fail_url", "http://localhost:8080/pay/fail");//결제 실패 시
		
		//요청 발송
//		HttpEntity<MultiValueMap<String,String>> entity = new HttpEntity<>(body, headers);
		HttpEntity entity = new HttpEntity(body, headers); // 헤더+바디
		
		//Map response = template.postForObject(uri, entity, Map.class); //주소,리퀘스트,서버응답(key,value - 잘 모르면 Map사용)
		KakaoPayReadyResponseVO response = 
				template.postForObject(uri, entity, KakaoPayReadyResponseVO.class);
		log.debug("response = {}", response);
		log.debug("url = {}", response.getNextRedirectPcUrl());
		
	}
}
