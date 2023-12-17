package com.dgmf.entity;

import com.dgmf.Utility.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "tbl_article")
public class Article {
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
