package com.crawldata.trangtintucbongda.converter;

import com.crawldata.trangtintucbongda.dto.CategoryDTO;
import com.crawldata.trangtintucbongda.entity.CategoryEntity;

public class CategoryMapper {
    public CategoryDTO toDto(CategoryEntity categoryEntity){
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setCategory_name(categoryEntity.getCategory_name());
        return categoryDTO;
    }


    public CategoryEntity toEntity(CategoryDTO categoryDTO){
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setCategory_name(categoryEntity.getCategory_name());

        return categoryEntity;

    }

}
