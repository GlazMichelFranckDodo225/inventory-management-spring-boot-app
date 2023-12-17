package com.dgmf.entity;

import com.dgmf.Utility.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "tbl_customer_order")
public class CustomerOrder {
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
