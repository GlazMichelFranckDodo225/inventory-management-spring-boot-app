package com.dgmf.mapper;

import com.dgmf.dto.CustomerOrderDto;
import com.dgmf.entity.CustomerOrder;

public class CustomerOrderMapper {
    public CustomerOrderDto mapToCustomerOrderDto(CustomerOrder customerOrder) {
        if(customerOrder == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "CustomerOrder" to "CustomerOrderDto"
        CustomerOrderDto customerOrderDto = CustomerOrderDto.builder()
                .id(customerOrder.getId())
                .orderCode(customerOrder.getOrderCode())
                .build();

        return customerOrderDto;
    }

    public CustomerOrder mapToCustomerOrder(CustomerOrderDto customerOrderDto) {

        if(customerOrderDto == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "CustomerOrderDto" to "CustomerOrder"
        CustomerOrder customerOrder = CustomerOrder.builder()
                .id(customerOrderDto.getId())
                .orderCode(customerOrderDto.getOrderCode())
                .build();

        return customerOrder;
    }
}
