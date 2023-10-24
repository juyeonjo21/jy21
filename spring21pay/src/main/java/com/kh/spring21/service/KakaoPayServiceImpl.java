package com.kh.spring21.service;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.kh.spring21.configuration.KakaoPayProperties;
import com.kh.spring21.vo.KakaoPayReadyRequestVO;
import com.kh.spring21.vo.KakaoPayReadyResponseVO;

@Service
public class KakaoPayServiceImpl implements KakaoPayService{
	
	@Autowired
	private KakaoPayProperties kakaoPayProperties;
	
	@Autowired
	private RestTemplate template;

	@Autowired
	private HttpHeaders headers;
	
	@Override
	public KakaoPayReadyResponseVO ready(KakaoPayReadyRequestVO request) throws URISyntaxException {
		//주소 설정
		URI uri = new URI("https://kapi.kakao.com/v1/payment/ready");
		
		//바디 설정
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid",kakaoPayProperties.getCid());//테스트결제 가맹점번호
		body.add("partner_order_id", request.getPartnerOrderId());//가맹점 주문번호
		body.add("partner_user_id", request.getPartnerUserId());//가맹점 회원 아이디(주문자)
		body.add("item_name", request.getItemName());//상품명
		body.add("total_amount", String.valueOf(request.getItemPrice()));//int -> String으로 바꾸는 명령/String.valueof
		body.add("quantity", "3000");//판매금액
		body.add("tax_free_amount", "0");//상품 비과세 금액
		body.add("approval_url", "http://localhost:8080/pay/success");//결제 성공 시
		body.add("cancel_url", "http://localhost:8080/pay/cancel");//결제 취소 시
		body.add("fail_url", "http://localhost:8080/pay/fail");//결제 실패 시
		
		
		//요청 발송
		HttpEntity entity = new HttpEntity(body, headers); // 헤더+바디
		
		KakaoPayReadyResponseVO response = 
				template.postForObject(uri, entity, KakaoPayReadyResponseVO.class);
		
		return response;
	}

}
