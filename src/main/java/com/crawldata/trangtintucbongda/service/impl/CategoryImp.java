package com.crawldata.trangtintucbongda.service.impl;

import com.crawldata.trangtintucbongda.entity.CategoryEntity;
import com.crawldata.trangtintucbongda.repository.CategoryRepository;
import com.crawldata.trangtintucbongda.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CategoryImp implements CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryImp(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryEntity> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public CategoryEntity addCategory(CategoryEntity categoryEntity) {
        return categoryRepository.save(categoryEntity);
    }
}
