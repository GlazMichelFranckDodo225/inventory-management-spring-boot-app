package com.dgmf.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class SaleDto {
    private Long id;
    private String code;
    private String comment;
    private Instant saleDate;
}
