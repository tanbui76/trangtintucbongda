package com.crawldata.trangtintucbongda.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private Set<LikesEntity> likes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    @JsonIgnore
    private CategoryEntity category;

    @OneToMany(mappedBy = "news")
    @JsonIgnore
    private Set<CommentEntity> comments;

    @Column(name = "news_title", columnDefinition = "nvarchar(max)")
    private String news_title;
    @Column(name = "news_images", columnDefinition = "nvarchar(max)")
    private String news_images;
    @Column(name = "news_submitdate", columnDefinition = "nvarchar(max)")
    private String news_submitdate;
    @Column(name = "news_describe", columnDefinition = "nvarchar(max)")
    private String news_describe;
    @Column(name = "news_author", columnDefinition = "nvarchar(max)")
    private String news_author;

    @Column(name="news_detailContent",columnDefinition = "nvarchar(max)")
    private String news_detailContent;

    public NewsEntity() {
    }

    public NewsEntity(Long news_id, Set<LikesEntity> likes, CategoryEntity category, Set<CommentEntity> comments, String news_title, String news_images, String news_submitdate, String news_describe, String news_author, String news_detailContent) {
        this.news_id = news_id;
        this.likes = likes;
        this.category = category;
        this.comments = comments;
        this.news_title = news_title;
        this.news_images = news_images;
        this.news_submitdate = news_submitdate;
        this.news_describe = news_describe;
        this.news_author = news_author;
        this.news_detailContent = news_detailContent;
    }

    public Long getNews_id() {
        return news_id;
    }

    public Set<LikesEntity> getLikes() {
        return likes;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public Set<CommentEntity> getComments() {
        return comments;
    }

    public String getNews_title() {
        return news_title;
    }

    public String getNews_images() {
        return news_images;
    }

    public String getNews_submitdate() {
        return news_submitdate;
    }

    public String getNews_describe() {
        return news_describe;
    }

    public String getNews_author() {
        return news_author;
    }

    public String getNews_detailContent() {
        return news_detailContent;
    }
}
