package com.itwill.spring6.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.itwill.spring6.repository.recipe.Recipe;
import com.itwill.spring6.service.RecipeService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("/recipe")
public class RecipeController {

    private final RecipeService recipeService;
    
    @GetMapping
    public String read(Model model) {
        log.info("read()");
        
     // 목록 검색:
        List<Recipe> list = recipeService.read();
        
    // Model에 검색 결과를 세팅:
    model.addAttribute("recipes", list);
    
    return "/recipe/read";
        
    }
    
    
    
}
