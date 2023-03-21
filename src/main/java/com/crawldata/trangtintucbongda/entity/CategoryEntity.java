package com.crawldata.trangtintucbongda.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Category")
public class CategoryEntity {
    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_id;

    @Column(name = "category_name")
    private String category_name;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private Set<NewsEntity> news;

    public CategoryEntity() {
    }

    public CategoryEntity(Set<NewsEntity> news, String category_name) {
        this.news = news;
        this.category_name = category_name;
    }

    public Set<NewsEntity> getNews() {
        return news;
    }

    public void setNews(Set<NewsEntity> news) {
        this.news = news;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Long getCategory_id() {
        return category_id;
    }



}
