package com.dgmf.mapper;

import com.dgmf.dto.ArticleDto;
import com.dgmf.entity.Article;

public class ArticleMapper {
    public ArticleDto mapToArticleDto(Article article) {
        if(article == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "Article" to "ArticleDto"
        ArticleDto articleDto = ArticleDto.builder()
                .id(article.getId())
                .articleCode(article.getArticleCode())
                .articleDesignation(article.getArticleDesignation())
                .unitPriceHT(article.getUnitPriceHT())
                .tvaRate(article.getTvaRate())
                .photo(article.getPhoto())
                .build();

        return articleDto;
    }

    public Article mapToArticle(ArticleDto articleDto) {

        if(articleDto == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "ArticleDto" to "Article"
        Article article = Article.builder()
                .id(articleDto.getId())
                .articleCode(articleDto.getArticleCode())
                .articleDesignation(articleDto.getArticleDesignation())
                .unitPriceHT(articleDto.getUnitPriceHT())
                .tvaRate(articleDto.getTvaRate())
                .photo(articleDto.getPhoto())
                .build();

        return article;
    }
}
