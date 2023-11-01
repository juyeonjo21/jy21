package com.kh.spring21.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "custom.kakaopay") //접두사(""로 시작하는 애들)
public class KakaoPayProperties {
	private String cid, key;

}
