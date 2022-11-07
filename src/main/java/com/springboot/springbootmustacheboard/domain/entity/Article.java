package com.springboot.springbootmustacheboard.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


// @Entity 와 @Id가 있어야 Entity가 된다
// @Entity: JPA에서 객체로 다루겠다는 선언
// @Id: @Entity가 붙어있다면 꼭 붙여줘야 함, primary key를 의미함

@Entity
@NoArgsConstructor
@Getter
public class Article {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String contents;

    public Article(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
}
