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
@Table(name = "tbl_sale_line")
public class SaleLine {
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
    @ManyToOne
    @JoinColumn(name = "saleId")
    private Sale sale;
    private BigDecimal quantity;
    @Column(name = "unit_price_ht")
    private BigDecimal unitPriceHT;
}
