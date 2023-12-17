package com.dgmf.mapper;

import com.dgmf.dto.SaleLineDto;
import com.dgmf.entity.SaleLine;

public class SaleLineMapper {
    public SaleLineDto mapToSaleLineDto(SaleLine saleLine) {
        if(saleLine == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "SaleLine" to "SaleLineDto"
        SaleLineDto saleLineDto = SaleLineDto.builder()
                .id(saleLine.getId())
                .quantity(saleLine.getQuantity())
                .unitPriceHT(saleLine.getUnitPriceHT())
                .build();

        return saleLineDto;
    }

    public SaleLine mapToSaleLine(SaleLineDto saleLineDto) {

        if(saleLineDto == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "SaleLineDto" to "SaleLine"
        SaleLine saleLine = SaleLine.builder()
                .id(saleLineDto.getId())
                .quantity(saleLineDto.getQuantity())
                .unitPriceHT(saleLineDto.getUnitPriceHT())
                .build();

        return saleLine;
    }
}
