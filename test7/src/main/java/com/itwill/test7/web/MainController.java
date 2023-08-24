package com.itwill.test7.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MainController {

    @GetMapping("/main")
    public String test7() {
        log.info("main()");
        
        return "main";
    }
    
    
}
