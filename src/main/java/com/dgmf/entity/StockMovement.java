package com.dgmf.entity;

import com.dgmf.Utility.AbstractEntity;
import com.dgmf.Utility.StockMovementType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "tbl_stock_mvt")
public class StockMovement {
    @Id @GeneratedValue
    private Long id;
    @CreatedDate
    @Column(name = "created_date", nullable = false)
    @JsonIgnore
    private Instant createdDate;
    @LastModifiedDate
    @Column(name = "last_modified_date")
    @JsonIgnore
    private Instant lastModifiedDate;
    @Column(name = "stock_mvt_date")
    private Instant stockMvtDate;
    private BigDecimal quantity;
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    @Column(name = "stock_mvt_type")
    private StockMovementType stockMvtType;
}
