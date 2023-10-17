package com.kh.spring18;

import java.io.File;
import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test07 {
	
	@Autowired
	private JavaMailSender sender;
	
	@Test
	public void test() throws MessagingException, IOException {
		//목표 : 이메일에 첨부파일 넣고 전송하기
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
		
		helper.setTo(new String[] {"1998_225@naver.com"});
		helper.setSubject("첨부파일 테스트");
		helper.setText("첨부파일 확인해주세요!");
		
		//첨부파일을 찾아서 메일에 추가
		ClassPathResource resource = new ClassPathResource("static/images/옥지.png");
//		helper.addAttachment("tweety", resource);
		helper.addAttachment(resource.getFilename(), resource);
		
		sender.send(message);
	}

}
