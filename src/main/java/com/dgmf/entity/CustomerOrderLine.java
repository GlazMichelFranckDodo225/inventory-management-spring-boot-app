package com.dgmf.entity;

import com.dgmf.Utility.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_customer_order_line")
public class CustomerOrderLine extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "articleId")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "customerOrderId")
    private CustomerOrder customerOrder;
    private BigDecimal quantity;
    @Column(name = "unit_price_ht")
    private BigDecimal unitPriceHT;
}
