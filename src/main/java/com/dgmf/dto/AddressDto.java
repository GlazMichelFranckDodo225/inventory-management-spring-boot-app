package com.dgmf.dto;

import com.dgmf.Utility.Address;
import com.dgmf.entity.Category;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class AddressDto {
    private String address1;
    private String address2;
    private String city;
    private String zipCode;
    private String country;
}
