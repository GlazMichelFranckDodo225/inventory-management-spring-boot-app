package com.dgmf.mapper;

import com.dgmf.dto.CategoryDto;
import com.dgmf.entity.Category;

public class CategoryMapper {
    public CategoryDto mapToCategoryDto(Category category) {
        if(category == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "Category" to "CategoryDto"
        CategoryDto categoryDto = CategoryDto.builder()
                .id(category.getId())
                .categoryCode(category.getCategoryCode())
                .categoryDesignation(category.getCategoryDesignation())
                .build();

        return categoryDto;
    }

    public Category mapToCategory(CategoryDto categoryDto) {

        if(categoryDto == null) {
            // TODO throw an Exception
            return null;
        }

        // Mapping from "CategoryDto" to "Category"
        Category category = Category.builder()
                .id(categoryDto.getId())
                .categoryCode(categoryDto.getCategoryCode())
                .categoryDesignation(categoryDto.getCategoryDesignation())
                .build();

        return category;
    }
}
