package com.springboot.springbootmustacheboard.repository;

import com.springboot.springbootmustacheboard.domain.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

// <Article, id의 타입>
public interface ArticleRepository extends JpaRepository<Article, Long> {


}
