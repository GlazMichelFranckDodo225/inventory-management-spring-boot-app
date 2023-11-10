package com.dgmf.entity;

import com.dgmf.Utility.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_customer_order")
public class CustomerOrder extends AbstractEntity {
    @Column(name = "order_code")
    private String orderCode;
    @Column(name = "order_date")
    private Instant orderDate;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
    @OneToMany(mappedBy = "customerOrder")
    private List<CustomerOrderLine> customerOrderLines;
}
