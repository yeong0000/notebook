//package com.itwill.spring6.service;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.itwill.spring6.dto.ChatDto;
//
//@Service
//public interface ChatServiceImpl implements ChatService {
//
//    @Autowired
//    private ChatDto chatDto;
//
//    @Override
//    public Map<String, Object> doAdd(Map<String, Object> param) {
//        chatDto.add(param);
//
//        Map<String, Object> rs = new HashMap<>();
//
//        rs.put("resultCode", "S-1");
//        rs.put("msg", "채팅방이 생성되었습니다.");
//        int id = ((BigInteger) param.get("id")).intValue();
//        rs.put("id", id);
//
//        return rs;
//    }
//
//    @Override
//    public List<ChatRoom> getList() {
//        return chatDto.getList();
//    }
//
//    @Override
//    public ChatRoom findById(int id) {
//        return chatDto.findById(id);
//    }
//
//    @Override
//    public Map<String, Object> addMessage(Map<String, Object> param) {
//        chatDao.addMessage(param);
//
//        Map<String, Object> rs = new HashMap<>();
//
//        rs.put("resultCode", "S-1");
//        rs.put("msg", "채팅 메세지가 생성되었습니다.");
//        int id = ((BigInteger) param.get("id")).intValue();
//        rs.put("id", id);
//
//        return rs;
//    }
//
//    @Override
//    public List<ChatMessage> getMessages(int roomId, int from) {
//        return chatDao.getMessages(roomId, from);
//    }
//    
//}
