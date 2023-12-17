package com.dgmf.mapper;

import com.dgmf.dto.SupplierDto;
import com.dgmf.entity.Supplier;

public class SupplierMapper {
    public SupplierDto mapToSupplierDto(Supplier supplier) {
        if(supplier == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "Supplier" to "SupplierDto"
        SupplierDto supplierDto = SupplierDto.builder()
                .id(supplier.getId())
                .firstName(supplier.getFirstName())
                .lastName(supplier.getLastName())
                .email(supplier.getEmail())
                .phoneNumber(supplier.getPhoneNumber())
                .build();

        return supplierDto;
    }

    public Supplier mapToSupplier(SupplierDto supplierDto) {

        if(supplierDto == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "SupplierDto" to "Supplier"
        Supplier supplier = Supplier.builder()
                .id(supplierDto.getId())
                .firstName(supplierDto.getFirstName())
                .lastName(supplierDto.getLastName())
                .email(supplierDto.getEmail())
                .phoneNumber(supplierDto.getPhoneNumber())
                .build();

        return supplier;
    }
}
