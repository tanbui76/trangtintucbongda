package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.entity.CategoryEntity;
import com.crawldata.trangtintucbongda.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryAPI {
    private CategoryService categoryService;

    public CategoryAPI(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    // build create api get all category
    @GetMapping
    public List<CategoryEntity> getAllCategory(){
        return categoryService.getAllCategory();
    }

}
