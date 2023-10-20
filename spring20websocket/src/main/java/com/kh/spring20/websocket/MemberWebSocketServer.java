package com.kh.spring20.websocket;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MemberWebSocketServer extends TextWebSocketHandler {
	
	private Set<WebSocketSession> clients = new CopyOnWriteArraySet<>();
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		clients.add(session);
		log.debug("session = {}", session.getAttributes());
		
		//session의 추가 정보(attributes)를 조사하여 HttpSession의 정보를 추출하여 사용
		
		log.debug("사용자 접속 = {}", clients.size());
	}
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		clients.remove(session);
		log.debug("사용자 접속 종료 = {}", clients.size());
	}
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		for(WebSocketSession client:clients) {
			client.sendMessage(message);
		}
	}
}
