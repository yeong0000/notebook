package com.itwill.spring6.dto;

import java.util.HashSet;

import org.springframework.web.socket.WebSocketSession;

import com.itwill.spring6.service.ChatService;

import lombok.Data;

@Data
public class ChatRoomDto {
    private String roomId; // 채팅방아이디
    private String name; // 채팅방 이름
    //private Set<WebSocketSession> session = new HashSet()<>();
    
    
    public Object getUserCount() {
        // TODO Auto-generated method stub
        return null;
    }


    public void handleAction(WebSocketSession session, ChatDto chatMessage, ChatService service) {
        // TODO Auto-generated method stub
        
    }
    
    
}
