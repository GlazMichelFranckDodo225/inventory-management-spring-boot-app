package com.dgmf.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class SupplierOrderDto {
    private Long id;
    private String orderCode;
    private Instant orderDate;
    private SupplierDto supplierDto;
    private List<SupplierOrderLineDto> supplierOrderLineDtos;
}
