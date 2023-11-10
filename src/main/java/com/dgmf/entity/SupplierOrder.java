package com.dgmf.entity;

import com.dgmf.Utility.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_supplier_order")
public class SupplierOrder extends AbstractEntity {
    @Column(name = "order_code")
    private String orderCode;
    @Column(name = "order_date")
    private Instant orderDate;
    @ManyToOne
    @JoinColumn(name = "supplierId")
    private Supplier supplier;
    @OneToMany(mappedBy = "supplierOrder")
    private List<SupplierOrderLine> supplierOrderLines;
}
