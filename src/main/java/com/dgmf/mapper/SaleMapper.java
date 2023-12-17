package com.dgmf.mapper;

import com.dgmf.dto.SaleDto;
import com.dgmf.entity.Sale;

public class SaleMapper {
    public SaleDto mapToSaleDto(Sale sale) {
        if(sale == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "Sale" to "SaleDto"
        SaleDto saleDto = SaleDto.builder()
                .id(sale.getId())
                .code(sale.getCode())
                .comment(sale.getComment())
                .build();

        return saleDto;
    }

    public Sale mapToSale(SaleDto saleDto) {

        if(saleDto == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "SaleDto" to "Sale"
        Sale sale = Sale.builder()
                .id(saleDto.getId())
                .code(saleDto.getCode())
                .comment(saleDto.getComment())
                .build();

        return sale;
    }
}
