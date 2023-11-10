package com.dgmf.entity;

import com.dgmf.Utility.AbstractEntity;
import com.dgmf.Utility.Address;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_company")
public class Company extends AbstractEntity {
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
