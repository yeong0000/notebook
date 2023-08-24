package com.itwill.test7.dto;

import java.sql.Timestamp;

import com.itwill.test7.domain.Post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//디비에서 이런 데이터를 불러와야겠다-> sql 연결
public class PostListDto {
    private long id;
    private String title;
    private String author;
    private Timestamp createdTime;
    
    
    //레퍼지토리 값을 디티오로 바꾸고 싶어서
    public static PostListDto fromEntity(Post post) {
        return PostListDto.builder() 
                .id(post.getId())
                .title(post.getTitle())
                .author(post.getAuthor())
                .createdTime(Timestamp.valueOf(post.getCreated_time()))
                .build();
    }
    
}
