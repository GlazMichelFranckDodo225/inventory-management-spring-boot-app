package com.dgmf.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class ArticleDto {
    private Long id;
    private Long articleCode;
    private String articleDesignation;
    private BigDecimal unitPriceHT;
    private BigDecimal tvaRate;
    private BigDecimal unitPriceTTC;
    private String photo;
    private CategoryDto categoryDto;
}
