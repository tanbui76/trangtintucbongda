package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.converter.CategoryMapper;
import com.crawldata.trangtintucbongda.entity.CategoryEntity;
import com.crawldata.trangtintucbongda.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryAPI {
    private CategoryService categoryService;
    private CategoryMapper categoryMapper;

    public CategoryAPI(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    // build create api get all category
    @CrossOrigin
    @GetMapping
    public List<CategoryEntity> getAllCategory(){
        return categoryService.getAllCategory();
    }

    @CrossOrigin
    @PostMapping("/addCategory")
    public CategoryEntity addCategory(String name){
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setCategory_name(name);
        return categoryService.addCategory(categoryEntity);
    }
}
