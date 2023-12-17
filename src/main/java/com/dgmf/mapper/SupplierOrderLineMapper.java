package com.dgmf.mapper;

import com.dgmf.dto.SupplierOrderLineDto;
import com.dgmf.entity.SupplierOrderLine;

public class SupplierOrderLineMapper {
    public SupplierOrderLineDto mapToSupplierOrderLineDto(SupplierOrderLine supplierOrderLine) {
        if(supplierOrderLine == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "SupplierOrderLine" to "SupplierOrderLineDto"
        SupplierOrderLineDto supplierOrderLineDto = SupplierOrderLineDto.builder()
                .id(supplierOrderLine.getId())
                .quantity(supplierOrderLine.getQuantity())
                .unitPriceHT(supplierOrderLine.getUnitPriceHT())
                .build();

        return supplierOrderLineDto;
    }

    public SupplierOrderLine mapToSupplierOrderLine(SupplierOrderLineDto supplierOrderLineDto) {

        if(supplierOrderLineDto == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "SupplierOrderLineDto" to "SupplierOrderLine"
        SupplierOrderLine supplierOrderLine = SupplierOrderLine.builder()
                .id(supplierOrderLineDto.getId())
                .quantity(supplierOrderLineDto.getQuantity())
                .unitPriceHT(supplierOrderLineDto.getUnitPriceHT())
                .build();

        return supplierOrderLine;
    }
}
