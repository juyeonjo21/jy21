package com.kh.spring20.websocket;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kh.spring20.vo.ClientVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SockJsWebSocketServer extends TextWebSocketHandler {

	// 저장소
	// private Set<WebSocketSession> clients = new CopyOnWriteArraySet<>();
	private Set<ClientVO> clients = new CopyOnWriteArraySet<>();// 전체회원
	private Set<ClientVO> members = new CopyOnWriteArraySet<>();// 로그인한 회원

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		ClientVO client = new ClientVO(session); // 생성자 만들어 뒀으니 여기서 씀
		clients.add(client);

		if (client.isMember()) { // 회원이라면
			members.add(client);// 추가

		}

		// clients.add(session);
		log.debug("사용자 접속. 현재 {}명", clients.size());
		log.debug("접속한 사용자 ={}", client);

		// 모든 접속자에게 접속자 명단을 전송
		// 메소드 추가
		sendClientList();
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		ClientVO client = new ClientVO(session);
		clients.remove(client);

		if (client.isMember()) {
			members.remove(client);

		}

		// clients.remove(session);
		log.debug("사용자 접속 종료! 현재 {}명", clients.size());

		// 모든 접속자에게 접속자 명단을 전송
		// 메소드 추가
		sendClientList();
	}

	// 접속자 명단(clients)을 모든 접속자에게 전송하는 메소드
	public void sendClientList() throws IOException {
		// 1. clients를 전송 가능한 형태(JSON 문자열)로 변환
		ObjectMapper mapper = new ObjectMapper();

		Map<String, Object> data = new HashMap<>();
		// data.put("clients", clients);//전체회원 명단(null이 문제가 됨)
		data.put("clients", members);// 로그인한 회원명단
		String clientJson = mapper.writeValueAsString(data);

		// 2.모든 사용자에게 전송
		TextMessage message = new TextMessage(clientJson);
		for (ClientVO client : clients) {
			client.send(message);
		}
	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		// 사용자가 보낸 메세지를 모두에게 broadcast (회원이 아닌 전체에게 전송)
		ClientVO client = new ClientVO(session);
		if (client.isMember() == false)
			return; // 멤버가 아니면 메세지 못 봄

		// 정보를 Map에 담아 변환 후 전송
		Map<String, Object> map = new HashMap<>();
		map.put("memberId", client.getMemberId());
		map.put("memberLevel", client.getMemberLevel());
		map.put("content", message.getPayload());
		// 시간 추가 등

		ObjectMapper mapper = new ObjectMapper();
		String messageJson = mapper.writeValueAsString(map);
		TextMessage tm = new TextMessage(messageJson);

		for (ClientVO c : clients) {
			c.send(tm);
		}
	}
}
