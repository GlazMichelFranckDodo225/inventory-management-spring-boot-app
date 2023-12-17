package com.dgmf.dto;

import com.dgmf.entity.Customer;
import com.dgmf.entity.CustomerOrderLine;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class CustomerOrderDto {
    private Long id;
    private String orderCode;
    private Instant orderDate;
    private CustomerDto customerDto;
    private List<CustomerOrderLineDto> customerOrderLineDtos;
}
