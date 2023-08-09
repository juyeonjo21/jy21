package com.springhome.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

//회원인지 아닌지를 검사하여 비회원을 차단하는 인터셉터 구현
//세션에서 name이라는 값이 있으면 - 회원 / 없으면 - 비회원
@Component
public class MemberInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		//세션이 주어지지 않으므로, 요청정보에서 세션 객체를 추출하여 사용
		HttpSession session = request.getSession();
		//세션에서 값(name) 추출
		String memberId = (String) session.getAttribute("name");
		boolean isLogin = memberId != null;
		
		if(isLogin) {//회원이면
			return true;
		}
		else { //비회원이면 - 차단+로그인 페이지로 redirect -> 수동으로 할 땐 response를 쓴다
			//return "redirect:/member/login";
			response.sendRedirect("/member/login");
			
			//[2]권한 없음 오류 발생
			//response.sendError(401);
			return false;
		}
	}

}
