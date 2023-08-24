package com.itwill.spring6.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.itwill.spring6.repository.recipe.Recipe;
import com.itwill.spring6.repository.recipe.RecipeRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class RecipeService {
    
    private final RecipeRepository recipeRepository;
    
    @Transactional()
    public List<Recipe> read() {
        log.info("read()");
        return recipeRepository.findByOrderIdDesc();
    }

}
