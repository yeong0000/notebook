package com.itwill.spring6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.spring6.service.ChatService;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ChatController {
    
    
    @GetMapping("/chat")
    public String chatGET(){

        log.info("@ChatController, chat GET()");
        
        return "/chat/chat";
    }
}
