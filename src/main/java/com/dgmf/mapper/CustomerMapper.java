package com.dgmf.mapper;

import com.dgmf.dto.CustomerDto;
import com.dgmf.entity.Customer;

public class CustomerMapper {
    public CustomerDto mapToCustomerDto(Customer customer) {
        if(customer == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "Customer" to "CustomerDto"
        CustomerDto customerDto = CustomerDto.builder()
                .id(customer.getId())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .email(customer.getEmail())
                .phoneNumber(customer.getPhoneNumber())
                .photo(customer.getPhoto())
                .build();

        return customerDto;
    }

    public Customer mapToCustomer(CustomerDto customerDto) {

        if(customerDto == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "CustomerDto" to "Customer"
        Customer customer = Customer.builder()
                .id(customerDto.getId())
                .firstName(customerDto.getFirstName())
                .lastName(customerDto.getLastName())
                .email(customerDto.getEmail())
                .phoneNumber(customerDto.getPhoneNumber())
                .photo(customerDto.getPhoto())
                .build();

        return customer;
    }
}
