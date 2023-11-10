package com.dgmf.entity;

import com.dgmf.Utility.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_supplier_order_line")
public class SupplierOrderLine extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "articleId")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "supplierOrderId")
    private SupplierOrder supplierOrder;
    private BigDecimal quantity;
    @Column(name = "unit_price_ht")
    private BigDecimal unitPriceHT;
}
