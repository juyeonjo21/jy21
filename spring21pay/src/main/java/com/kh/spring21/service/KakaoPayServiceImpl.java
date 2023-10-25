package com.kh.spring21.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.kh.spring21.configuration.KakaoPayProperties;
import com.kh.spring21.vo.KakaoPayApproveRequestVO;
import com.kh.spring21.vo.KakaoPayApproveResponseVO;
import com.kh.spring21.vo.KakaoPayCancelRequestVO;
import com.kh.spring21.vo.KakaoPayCancelResponseVO;
import com.kh.spring21.vo.KakaoPayDetailRequestVO;
import com.kh.spring21.vo.KakaoPayDetailResponseVO;
import com.kh.spring21.vo.KakaoPayReadyRequestVO;
import com.kh.spring21.vo.KakaoPayReadyResponseVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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
		body.add("tax_free_amount", "0");//상품 비과세
		
		//현재 페이지 주소 계산
		String path = ServletUriComponentsBuilder
								.fromCurrentRequestUri().toUriString();
		body.add("approval_url", path + "/success");
		body.add("cancel_url", path +"/cancel");
		body.add("fail_url", path +"/fail");
		
		
		//요청 발송
		HttpEntity entity = new HttpEntity(body, headers); // 헤더+바디
		
		KakaoPayReadyResponseVO response = 
				template.postForObject(uri, entity, KakaoPayReadyResponseVO.class);
		
		return response;
	}

	@Override
	public KakaoPayApproveResponseVO approve(KakaoPayApproveRequestVO request) throws URISyntaxException {
		URI uri = new URI("https://kapi.kakao.com/v1/payment/approve");
		
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", kakaoPayProperties.getCid());
		body.add("tid",request.getTid());//거래번호*
		body.add("partner_order_id", request.getPartnerOrderId());
		body.add("partner_user_id", request.getPartnerUserId());
		body.add("pg_token", request.getPgToken());
		
		HttpEntity entity = new HttpEntity(body, headers);	
		
		KakaoPayApproveResponseVO response = 
				template.postForObject(uri, entity, KakaoPayApproveResponseVO.class);
		
		log.debug("결제 승인 완료 = {}", response.getTid());
		log.debug("결제 유형 = {}", response.getPayMentMethodType());
		
		return response;
	}

	@Override
	public KakaoPayDetailResponseVO detail(KakaoPayDetailRequestVO request) throws URISyntaxException {
		URI uri = new URI("https://kapi.kakao.com/v1/payment/order");
		
		MultiValueMap<String,String> body = new LinkedMultiValueMap<>();
		body.add("cid", kakaoPayProperties.getCid());
		body.add("tid", request.getTid());
		
		HttpEntity entity = new HttpEntity(body, headers);
		
		KakaoPayDetailResponseVO response = 
				template.postForObject(uri, entity, KakaoPayDetailResponseVO.class);
		return response;
	}

	@Override
	public KakaoPayCancelResponseVO cancel(KakaoPayCancelRequestVO request) throws URISyntaxException {
		URI uri = new URI("https://kapi.kakao.com/v1/payment/cancel");
		
		MultiValueMap<String,String> body = new LinkedMultiValueMap<>();
		body.add("cid", kakaoPayProperties.getCid());
		body.add("tid", request.getTid());
//		body.add("cancelAmount", ""+request.getCancelAmount()); //int라서 문자열로 변환해서 사용해야함
		body.add("cancel_amount", String.valueOf(request.getCancelAmount()));
		body.add("cancel_tax_free_amount", "0");
		
		HttpEntity entity = new HttpEntity(body,headers);
		
		KakaoPayCancelResponseVO response =
				template.postForObject(uri, entity, KakaoPayCancelResponseVO.class);
		return response;
	}

}