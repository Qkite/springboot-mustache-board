package com.springboot.springbootmustacheboard.repository;

import com.springboot.springbootmustacheboard.domain.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

// <Article, idì íì>
public interface ArticleRepository extends JpaRepository<Article, Long> {


}
