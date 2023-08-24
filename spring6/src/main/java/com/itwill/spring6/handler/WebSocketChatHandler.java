//package com.itwill.spring6.handler;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.socket.TextMessage;
//import org.springframework.web.socket.WebSocketSession;
//import org.springframework.web.socket.handler.TextWebSocketHandler;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import com.itwill.spring6.dto.ChatDto;
//import com.itwill.spring6.dto.ChatRoomDto;
//import com.itwill.spring6.service.ChatService;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//@Component
//@RequiredArgsConstructor
//public class WebSocketChatHandler extends TextWebSocketHandler {
//
//    private final ObjectMapper mapper;
//
//    private final ChatService service;
//
//    @Override
//    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
//        String payload = message.getPayload();
//        log.info("payload {}", payload);
//
////        TextMessage textMessage = new TextMessage("Welcome Chatting Server");
////        session.sendMessage(textMessage);
//
//        ChatDto chatMessage = mapper.readValue(payload, ChatDto.class);
//        log.info("session {}", chatMessage.toString());
//
//        ChatRoomDto room = service.findRoomById(chatMessage.getRoomId());
//        log.info("room {}", room.toString());
//
//        room.handleAction(session, chatMessage, service);
//    }
//
//}