package com.kh.spring21;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.kh.spring21.configuration.KakaoPayProperties;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test06Approve {
	@Autowired
	private RestTemplate template;
	@Autowired
	private HttpHeaders headers;
	@Autowired
	private KakaoPayProperties kakaoPayProperties;

	@Test
	public void test() throws URISyntaxException {
		URI uri = new URI("https://kapi.kakao.com/v1/payment/approve");
		
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", kakaoPayProperties.getCid());
		body.add("tid","T5376b962b8b1abb00dd");//거래번호
		body.add("partner_order_id", "8961a371-f07b-4855-9e61-a59958672454");
		body.add("partner_user_id", "testuser1");
		body.add("pg_token", "9e353efb69db37c8054f");
		
		HttpEntity entity = new HttpEntity(body, headers);
		
		Map response = template.postForObject(uri, entity, Map.class);
		log.debug("response = {}", response);
	}
}
