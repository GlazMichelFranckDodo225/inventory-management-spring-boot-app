package com.dgmf.entity;

import com.dgmf.Utility.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_category")
public class Category extends AbstractEntity {
    @Column(name = "category_code")
    private long categoryCode;
    @Column(name = "category_designation")
    private String categoryDesignation;
    @Column(name = "date_created", nullable = false)
    @OneToMany(mappedBy = "category")
    private List<Article> articles;
}
