package com.github.magicsih.guessmind.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

public class GuessMindWebSocketHandler implements WebSocketHandler {

	private final static Logger LOG = LoggerFactory.getLogger(GuessMindWebSocketHandler.class);
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		LOG.debug("afterConnectionClosed: {}-{}", session.getId(), status.getReason());

	}

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		LOG.debug("afterConnectionEstablished: {}", session.getId());
	}

	@Override
	public void handleMessage(WebSocketSession arg0, WebSocketMessage<?> arg1) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
		session.close(CloseStatus.SERVER_ERROR); 
		LOG.error("handleTransportError: {}", session.getId(), exception);
	}

	@Override
	public boolean supportsPartialMessages() {
		// TODO Auto-generated method stub
		return false;
	}

}
