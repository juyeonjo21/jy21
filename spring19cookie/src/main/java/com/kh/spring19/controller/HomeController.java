package com.kh.spring19.controller;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
      
   @RequestMapping("/")
   public String home() {
      return "home"; // View resolver 적용 후
   }
   /*
    * 쿠키는 HttpCookie 클래스의 객체로 생성
    * 생성 시 다음 정보를 설정할 수 있다
    * - 이름(name), 값(value) 필수 설정
    * - 만료시간(maxAge, 초), 발행경로(path) 선택 설정
    * 
    * (중요) 사용자가 쿠키를 가지고 있어야 하므로 응답 객체에 탑재시켜야 한다
    */
   @RequestMapping("/create1")
   public String create1(HttpServletResponse response) {
      Cookie cookie = new Cookie("popup", "false");
      cookie.setMaxAge(Integer.MAX_VALUE);
      response.addCookie(cookie);
      return "redirect:/";
   }
   @RequestMapping("/create2")
   public String create2(HttpServletResponse response) {
      Cookie cookie = new Cookie("popup", "false");
      cookie.setMaxAge(7 * 24 * 60 * 60);
      response.addCookie(cookie);
      return "redirect:/";
   }
   @RequestMapping("/create3")
   public String create3(HttpServletResponse response) {
      Cookie cookie = new Cookie("popup", "false");
      cookie.setMaxAge(1 * 24 * 60 * 60);
      response.addCookie(cookie);
      return "redirect:/";
   }
   @RequestMapping("/create4")
   public String create4(HttpServletResponse response) {
       Cookie cookie = new Cookie("popup", "false");
       
//       // ZonedDateTime을 사용하여 현재 날짜와 시간을 얻습니다
//       ZonedDateTime now = ZonedDateTime.now(ZoneId.systemDefault());
//       ZonedDateTime nextDay = now.toLocalDate().plusDays(1).atStartOfDay(now.getZone());
//
//       long secondsUntilNextDay = Duration.between(now, nextDay).getSeconds();
//
//       // 초 단위의 시간 차이를 int로 변환
//       int maxAge = (int) secondsUntilNextDay;
       LocalDateTime midnight 
       = LocalDateTime.now()
       .plusDays(1L).withHour(0).withMinute(0).withSecond(0);
       LocalDateTime current = LocalDateTime.now();
       
       int seconds = (int) ChronoUnit.SECONDS.between(current, midnight);
       cookie.setMaxAge(seconds);
       response.addCookie(cookie);
       return "redirect:/";
   }

   @PostMapping("/login")
   public String login(
		   HttpServletResponse response, //도구추가
		   @RequestParam String memberId,
		   @RequestParam String memberPw,
		   @RequestParam(required = false) String remember //미 체크 시 null
//		   @RequestParam(required = false, defaultValue="N") String remember //미 체크 시 N
		   ) {
	   //쿠키 생성 조건 - 로그인 성공 후 아이디 저장하기를 체크한 경우
	   //쿠키 삭제 조건 - 로그인 성공 후 아이디 저장하기를 체크하지 않은 경우
	   
	   //if(로그인 성공 시){
	   if(remember != null) {//아이디 저장하기를 체크했다면
		   Cookie cookie = new Cookie("saved", memberId);//쿠키 생성
			cookie.setMaxAge(4*7*24*60*60);//4주	(주/일/시/분/초-단위)   
			response.addCookie(cookie);//쿠키 발행
	   }
	   else {//아이디 저장하기를 체크하지 않았다면
		   Cookie cookie = new Cookie("saved", memberId);//쿠키 생성
		   cookie.setMaxAge(0);//발행 즉시 삭제  
			response.addCookie(cookie);//쿠키 발행

	   }
	   return "redirect:/";
   }
}