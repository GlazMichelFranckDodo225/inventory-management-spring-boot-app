package com.dgmf.mapper;

import com.dgmf.dto.SupplierOrderDto;
import com.dgmf.entity.SupplierOrder;

public class SupplierOrderMapper {
    public SupplierOrderDto mapToSupplierOrderDto(SupplierOrder supplierOrder) {
        if(supplierOrder == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "SupplierOrder" to "SupplierOrderDto"
        SupplierOrderDto supplierOrderDto = SupplierOrderDto.builder()
                .id(supplierOrder.getId())
                .orderCode(supplierOrder.getOrderCode())
                .build();

        return supplierOrderDto;
    }

    public SupplierOrder mapToSupplierOrder(SupplierOrderDto supplierOrderDto) {

        if(supplierOrderDto == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "SupplierOrderDto" to "SupplierOrder"
        SupplierOrder supplierOrder = SupplierOrder.builder()
                .id(supplierOrderDto.getId())
                .orderCode(supplierOrderDto.getOrderCode())
                .build();

        return supplierOrder;
    }
}
