package com.dgmf.entity;

import com.dgmf.Utility.AbstractEntity;
import com.dgmf.Utility.StockMovementType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_stock_mvt")
public class StockMovement extends AbstractEntity {
    @Column(name = "stock_mvt_date")
    private Instant stockMvtDate;
    private BigDecimal quantity;
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    @Column(name = "stock_mvt_type")
    private StockMovementType stockMvtType;
}
