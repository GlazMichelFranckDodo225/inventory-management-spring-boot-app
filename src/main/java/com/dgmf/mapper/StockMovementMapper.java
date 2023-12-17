package com.dgmf.mapper;

import com.dgmf.dto.StockMovementDto;
import com.dgmf.entity.StockMovement;

public class StockMovementMapper {
    public StockMovementDto mapToStockMovementDto(StockMovement stockMovement) {
        if(stockMovement == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "StockMovement" to "StockMovementDto"
        StockMovementDto stockMovementDto = StockMovementDto.builder()
                .id(stockMovement.getId())
                .quantity(stockMovement.getQuantity())
                .build();

        return stockMovementDto;
    }

    public StockMovement mapToStockMovement(StockMovementDto stockMovementDto) {

        if(stockMovementDto == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "StockMovementDto" to "StockMovement"
        StockMovement stockMovement = StockMovement.builder()
                .id(stockMovementDto.getId())
                .quantity(stockMovementDto.getQuantity())
                .build();

        return stockMovement;
    }
}
