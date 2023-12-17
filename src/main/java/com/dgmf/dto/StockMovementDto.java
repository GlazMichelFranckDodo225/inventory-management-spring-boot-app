package com.dgmf.dto;

import com.dgmf.Utility.StockMovementType;
import com.dgmf.entity.Article;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class StockMovementDto {
    private Long id;
    private Instant stockMvtDate;
    private BigDecimal quantity;
    private ArticleDto articleDto;
    private StockMovementType stockMvtType;
}