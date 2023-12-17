package com.dgmf.entity;

import com.dgmf.Utility.AbstractEntity;
import com.dgmf.Utility.Address;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "tbl_company")
public class Company {
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
    private String name;
    private String description;
    @Embedded
    private Address address;
    @Column(name = "tax_code")
    private String taxCode; // Code Fiscal
    private String photo;
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String website;
    @OneToMany(mappedBy = "company")
    private List<User> users;
}
