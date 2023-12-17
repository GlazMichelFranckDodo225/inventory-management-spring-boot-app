package com.dgmf.dto;

import com.dgmf.Utility.StockMovementType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class StockMovementDto {
    private Long id;
    private BigDecimal quantity;
    private Instant stockMvtDate;
    private ArticleDto articleDto;
    private StockMovementType stockMvtType;
}
