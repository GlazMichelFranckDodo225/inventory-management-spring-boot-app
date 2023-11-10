package com.dgmf.entity;

import com.dgmf.Utility.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_sale")
public class Sale extends AbstractEntity {
    private String code;
    @Column(name = "sale_date")
    private Instant saleDate;
    private String comment;
}
