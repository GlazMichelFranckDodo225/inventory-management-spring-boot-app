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
@Table(name = "tbl_category")
public class Category {
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
    @Column(name = "category_code")
    private String categoryCode;
    @Column(name = "category_designation")
    private String categoryDesignation;
    @Column(name = "date_created", nullable = false)
    @OneToMany(mappedBy = "category")
    private List<Article> articles;
}
