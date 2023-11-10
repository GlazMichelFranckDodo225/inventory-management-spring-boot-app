package com.dgmf.entity;

import com.dgmf.Utility.AbstractEntity;
import com.dgmf.Utility.Address;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_customer")
public class Customer extends AbstractEntity {
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    // Compound field
    @Embedded
    private Address address;
    private String photo;
    @OneToMany(mappedBy = "customer")
    private List<CustomerOrder> customerOrders;
}
