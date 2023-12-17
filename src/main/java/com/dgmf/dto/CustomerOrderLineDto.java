package com.dgmf.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class CustomerOrderLineDto {
    private Long id;
    private BigDecimal quantity;
    private BigDecimal unitPriceHT;
    private ArticleDto articleDto;
    private CustomerOrderDto customerOrderDto;
}
