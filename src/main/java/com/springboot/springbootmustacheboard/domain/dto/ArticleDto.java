package com.springboot.springbootmustacheboard.domain.dto;

import com.springboot.springbootmustacheboard.domain.entity.Article;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ArticleDto {
    private Long id;
    private String title;
    private String content;


    public ArticleDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Article toEntity(){
        return new Article(title, content);
    }
}
