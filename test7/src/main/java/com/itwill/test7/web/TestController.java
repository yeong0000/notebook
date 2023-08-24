package com.itwill.test7.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class TestController {
    
    @GetMapping("/")
    public String test7() {
        log.info("test7()");
        
        return "test7";
    }
    
}
