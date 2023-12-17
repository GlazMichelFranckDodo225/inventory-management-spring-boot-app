package com.dgmf.mapper;

import com.dgmf.dto.UserDto;
import com.dgmf.entity.User;

public class UserMapper {
    public UserDto mapToUserDto(User user) {
        if(user == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "User" to "UserDto"
        UserDto userDto = UserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .password(user.getPassword())
                .photo(user.getPhoto())
                .build();

        return userDto;
    }

    public User mapToUser(UserDto userDto) {

        if(userDto == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "UserDto" to "User"
        User user = User.builder()
                .id(userDto.getId())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .photo(userDto.getPhoto())
                .build();

        return user;
    }
}
