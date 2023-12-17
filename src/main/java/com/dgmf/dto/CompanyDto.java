package com.dgmf.dto;

import com.dgmf.entity.Company;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class CompanyDto {
    private Long id;
    private String name;
    private String description;
    private String taxCode; // Code Fiscal
    private String photo;
    private String email;
    private String phoneNumber;
    private String website;
    private AddressDto addressDto;
    private List<UserDto> userDtos;
}
