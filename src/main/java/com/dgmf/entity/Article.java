package com.dgmf.entity;

import com.dgmf.Utility.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_article")
public class Article extends AbstractEntity {
    @Column(name = "article_code")
    private long articleCode;
    @Column(name = "article_designation")
    private String articleDesignation;
    @Column(name = "unit_price_ht")
    private BigDecimal unitPriceHT;
    @Column(name = "tva_rate")
    private BigDecimal tvaRate;
    @Column(name = "unit_price_ttc")
    private BigDecimal unitPriceTTC;
    private String photo;
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;
}
