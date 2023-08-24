package com.itwill.spring6.repository.chat;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itwill.spring6.entity.ChatUser;


public interface ChatUserRepository extends JpaRepository<ChatUser, Long> {
    ChatUser findByEmail(String email);
}
