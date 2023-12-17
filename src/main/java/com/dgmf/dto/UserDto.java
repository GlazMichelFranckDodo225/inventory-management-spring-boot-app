package com.dgmf.dto;

import com.dgmf.Utility.Address;
import com.dgmf.entity.Company;
import com.dgmf.entity.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String photo;
    private Instant dateOfBirth;
    private AddressDto addressDto;
    private CompanyDto companyDto;
    private List<RoleDto> roleDtos;
}
