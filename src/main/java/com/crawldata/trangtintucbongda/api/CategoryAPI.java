package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.converter.CategoryMapper;
import com.crawldata.trangtintucbongda.entity.CategoryEntity;
import com.crawldata.trangtintucbongda.service.CategoryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        //convert entity to dto
        // cần xử lý chớ ko thể nào lấy entity đổ ra (chỉ đổ ra dữ liệu cần)




        return categoryService.getAllCategory();
    }

}
