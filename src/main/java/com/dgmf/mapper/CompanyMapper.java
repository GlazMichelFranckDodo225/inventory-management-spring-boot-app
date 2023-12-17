package com.dgmf.mapper;

import com.dgmf.dto.CompanyDto;
import com.dgmf.entity.Company;

public class CompanyMapper {
    public CompanyDto mapToCompanyDto(Company company) {
        if(company == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "Company" to "CompanyDto"
        CompanyDto companyDto = CompanyDto.builder()
                .id(company.getId())
                .name(company.getName())
                .description(company.getDescription())
                .taxCode(company.getTaxCode())
                .photo(company.getPhoto())
                .email(company.getEmail())
                .phoneNumber(company.getPhoneNumber())
                .website(company.getWebsite())
                .build();

        return companyDto;
    }

    public Company mapToCompany(CompanyDto companyDto) {

        if(companyDto == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "CompanyDto" to "Company"
        Company company = Company.builder()
                .id(companyDto.getId())
                .name(companyDto.getName())
                .description(companyDto.getDescription())
                .taxCode(companyDto.getTaxCode())
                .photo(companyDto.getPhoto())
                .email(companyDto.getEmail())
                .phoneNumber(companyDto.getPhoneNumber())
                .website(companyDto.getWebsite())
                .build();

        return company;
    }
}
