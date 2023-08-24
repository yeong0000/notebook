package com.itwill.spring6.repository.recipe;



import com.itwill.spring6.dto.RecipeUpdateDto;
import com.itwill.spring6.entity.BaseTimeEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
@Entity
@Table(name = "RECIPES") //디비 이름
//@SequenceGenerator(name = "RECIPES_TRG_GEN", sequenceName = "RECIPES_TRG", allocationSize = 1)
public class Recipe extends BaseTimeEntity {

    @Id // Primary key 제약조건
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "POSTS_SEQ_GEN")
    private Long id;
    
    @Column(nullable = false) // Not Null 제약조건
    private String title;
    
    @Column(nullable = false)
    private String content;
    
//    @Column(nullable = false)
//    private String author;
    
//    // Recipe 엔터티의 title과 content를 수정해서 리턴하는 메서드:
//    public Recipe update(RecipeUpdateDto dto) {
//        this.title = dto.getTitle();
//        this.content = dto.getContent();
//        
//        return this;
//    }
}
