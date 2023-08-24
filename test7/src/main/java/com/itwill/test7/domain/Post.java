package com.itwill.test7.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {

//    ID            NOT NULL NUMBER(8)           
//    TITLE         NOT NULL VARCHAR2(100 CHAR)  
//    CONTENT       NOT NULL VARCHAR2(1000 CHAR) 
//    AUTHOR        NOT NULL VARCHAR2(20 CHAR)   
//    CREATED_TIME           TIMESTAMP(6)        
//    MODIFIED_TIME          TIMESTAMP(6)        

    //컨트롤 알트 방향키아래 커서있는 곳 복사 / 컨트롤 쉬프트 y -> 소문자, x->대문자
    private long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime created_time;
    private LocalDateTime modified_time;
    
    
}
