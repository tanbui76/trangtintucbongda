package com.crawldata.trangtintucbongda.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "News")
public class NewsEntity {
    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long news_id;

    @OneToMany(mappedBy = "news")
    private Set<LikesEntity> likes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    @OneToMany(mappedBy = "news")
    private Set<CommentEntity> comments;

    @Column(name = "news_title")
    private String news_title;
    @Column(name = "news_images")
    private String news_images;
    @Column(name = "news_submitdate")

    private Date news_submitdate;
    @Column(name = "news_describe")

    private String news_describe;
    @Column(name = "news_author")

    private String news_author;

    public NewsEntity() {
    }

    public NewsEntity(Set<LikesEntity> likes, CategoryEntity category, Set<CommentEntity> comments, String news_title, String news_images, Date news_submitdate, String news_describe, String news_author) {
        this.likes = likes;
        this.category = category;
        this.comments = comments;
        this.news_title = news_title;
        this.news_images = news_images;
        this.news_submitdate = news_submitdate;
        this.news_describe = news_describe;
        this.news_author = news_author;
    }

    public Set<LikesEntity> getLikes() {
        return likes;
    }

    public void setLikes(Set<LikesEntity> likes) {
        this.likes = likes;
    }

    public String getNews_title() {
        return news_title;
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    public String getNews_images() {
        return news_images;
    }

    public void setNews_images(String news_images) {
        this.news_images = news_images;
    }

    public Date getNews_submitdate() {
        return news_submitdate;
    }

    public void setNews_submitdate(Date news_submitdate) {
        this.news_submitdate = news_submitdate;
    }

    public String getNews_describe() {
        return news_describe;
    }

    public void setNews_describe(String news_describe) {
        this.news_describe = news_describe;
    }

    public String getNews_author() {
        return news_author;
    }

    public void setNews_author(String news_author) {
        this.news_author = news_author;
    }

    public Long getNews_id() {
        return news_id;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }
}