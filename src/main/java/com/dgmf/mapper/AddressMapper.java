package com.dgmf.mapper;

import com.dgmf.dto.AddressDto;
import com.dgmf.entity.Address;

public class AddressMapper {
    public AddressDto mapToAddressDto(Address address) {
        if(address == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "Address" to "AddressDto"
        AddressDto addressDto = AddressDto.builder()
                .address1(address.getAddress1())
                .address2(address.getAddress2())
                .city(address.getCity())
                .zipCode(address.getZipCode())
                .country(address.getCountry())
                .build();

        return addressDto;
    }

    public Address mapToAddress(AddressDto addressDto) {

        if(addressDto == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "AddressDto" to "Address"
        Address address = Address.builder()
                .address1(addressDto.getAddress1())
                .address2(addressDto.getAddress2())
                .city(addressDto.getCity())
                .zipCode(addressDto.getZipCode())
                .country(addressDto.getCountry())
                .build();

        return address;
    }
}
