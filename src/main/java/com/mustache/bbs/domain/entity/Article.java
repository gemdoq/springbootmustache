package com.mustache.bbs.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // mark for recognition for objects
@NoArgsConstructor
@Getter
public class Article {
    @Id // represents the id of the entity(PK)
    @GeneratedValue // autogenerate for value
    private Long id;

    @Column // mark for recognition from the database
    private String title;
    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Article(String title) {
    }
}