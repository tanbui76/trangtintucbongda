package com.crawldata.trangtintucbongda.dto;

import java.util.ArrayList;
import java.util.List;

public class CategoryDTO {
    private Long category_id;
    private String category_name;
    private List<NewsDTO> newsDTOS = new ArrayList<>();

    public CategoryDTO() {
    }

    public CategoryDTO(Long category_id, String category_name, List<NewsDTO> newsDTOS) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.newsDTOS = newsDTOS;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public List<NewsDTO> getNewsDTOS() {
        return newsDTOS;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public void setNewsDTOS(List<NewsDTO> newsDTOS) {
        this.newsDTOS = newsDTOS;
    }

}
