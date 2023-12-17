package com.dgmf.mapper;

import com.dgmf.dto.RoleDto;
import com.dgmf.entity.Role;

public class RoleMapper {
    public RoleDto mapToRoleDto(Role role) {
        if(role == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "Role" to "RoleDto"
        RoleDto roleDto = RoleDto.builder()
                .id(role.getId())
                .roleName(role.getRoleName())
                .build();

        return roleDto;
    }

    public Role mapToRole(RoleDto roleDto) {

        if(roleDto == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "RoleDto" to "Role"
        Role role = Role.builder()
                .id(roleDto.getId())
                .roleName(roleDto.getRoleName())
                .build();

        return role;
    }
}
