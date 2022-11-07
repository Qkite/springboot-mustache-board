package com.springboot.springbootmustacheboard.controller;

import com.springboot.springbootmustacheboard.domain.dto.ArticleDto;
import com.springboot.springbootmustacheboard.domain.entity.Article;
import com.springboot.springbootmustacheboard.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
@Slf4j
public class ArticleController {

    private final ArticleRepository articleRepository;
    // Autowired보다 private final로 선언한 뒤 생성자로 넣는 것을 많이 사용함

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping(value="/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping(value = "/posts")
    public String createArticle(ArticleDto form){
        log.info(form.toString());
        Article article = form.toEntity();
        articleRepository.save(article);
        return "";
    }
}
