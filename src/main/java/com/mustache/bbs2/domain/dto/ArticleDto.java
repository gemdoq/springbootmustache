package com.mustache.bbs2.domain.dto;

import com.mustache.bbs2.domain.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class ArticleDto {
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(this.title, this.content);
    }
}