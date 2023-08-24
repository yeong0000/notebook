package com.itwill.test7.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwill.test7.domain.Post;
import com.itwill.test7.dto.PostListDto;
import com.itwill.test7.dto.PostReviewDto;
import com.itwill.test7.repository.PostRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PostService {
    
    @Autowired
    private PostRepository postRepository;
    
    public List<PostListDto> read(){
        
        List<Post> list =  postRepository.selectAll(); //데이터가 담겨져있음
        log.info("read() = {}", list);
        
        List<PostListDto> result = new  ArrayList<>();
        for(Post post : list) {
            result.add(PostListDto.fromEntity(post));
        }
        
        return result;
    }
    
    //리뷰작성 페이지
    public int review(PostReviewDto dto) {
        return postRepository.insert(dto.toEntity());
    }
    
}
