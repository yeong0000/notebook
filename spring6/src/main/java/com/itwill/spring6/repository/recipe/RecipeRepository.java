package com.itwill.spring6.repository.recipe;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe,Long> {

    //id 내림차순 정렬:
    //select * from RECIPES order by ID desc
    List<Recipe> findByOrderIdDesc();

}
