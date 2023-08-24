package com.itwill.test7.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.test7.dto.PostListDto;
import com.itwill.test7.dto.PostReviewDto;
import com.itwill.test7.service.PostService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j // 로그
@Controller 
public class PostController {
    
    
    @Autowired
    private PostService postService ;

    @GetMapping("/post/test7list") // GET 방식의 /post/list 요청 주소를 처리하는 메서드.
    public String postlist(Model model) {
        log.info("postlist()");
        
        //jsp에 뿌려줄 정보 추출(디비)
        //service -> repository -> mappers
        //1. dto만들기(service와 jsp페이지를 위해서)
        //2. service 만들기(repository로 이동)
        //3. repository 만들기(mapper를 위해서)
        //4. mapper 만들기(쿼리를 집어 넣자 
        //:: developer에서 내가 예상한 결과가 나와야 함)
        
        List<PostListDto> dto = postService.read();
        
        //추출할 정보를 모델에 담기()
        model.addAttribute("posts", dto);
        
        return "/post/test7list";
    }
    
    @GetMapping("/post/review") //왜? GET도 하고 POST도 함??
    public void review() {
        log.info("GET: review()");
    }
    
    @PostMapping("/post/review") //submit 제출해야되니까
    public String review(PostReviewDto dto) {
        log.info("POST: review()", dto);
        
        return null;
    }
}
