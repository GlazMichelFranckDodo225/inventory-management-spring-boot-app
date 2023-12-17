package com.dgmf.mapper;

import com.dgmf.dto.CustomerOrderLineDto;
import com.dgmf.entity.CustomerOrderLine;

public class CustomerOrderLineMapper {
    public CustomerOrderLineDto mapToCustomerOrderLineDto(CustomerOrderLine customerOrderLine) {
        if(customerOrderLine == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "CustomerOrderLine" to "CustomerOrderLineDto"
        CustomerOrderLineDto customerOrderLineDto = CustomerOrderLineDto.builder()
                .id(customerOrderLine.getId())
                .quantity(customerOrderLine.getQuantity())
                .unitPriceHT(customerOrderLine.getUnitPriceHT())
                .build();

        return customerOrderLineDto;
    }

    public CustomerOrderLine mapToCustomerOrderLine(CustomerOrderLineDto customerOrderLineDto) {

        if(customerOrderLineDto == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "CustomerOrderLineDto" to "CustomerOrderLine"
        CustomerOrderLine customerOrderLine = CustomerOrderLine.builder()
                .id(customerOrderLineDto.getId())
                .quantity(customerOrderLineDto.getQuantity())
                .unitPriceHT(customerOrderLineDto.getUnitPriceHT())
                .build();

        return customerOrderLine;
    }
}
