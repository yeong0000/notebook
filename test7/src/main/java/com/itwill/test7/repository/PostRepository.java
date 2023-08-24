package com.itwill.test7.repository;

import java.util.List;

import com.itwill.test7.domain.Post;

public interface PostRepository {

    List<Post> selectAll();

    int insert(Post post);
    
    
    
}
