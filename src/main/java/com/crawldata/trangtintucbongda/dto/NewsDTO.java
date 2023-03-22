package com.crawldata.trangtintucbongda.dto;

import com.crawldata.trangtintucbongda.entity.CommentEntity;
import com.crawldata.trangtintucbongda.entity.LikesEntity;

import java.util.Date;
import java.util.Set;

public class NewsDTO {
    private int news_id;
    private String news_title;
    private String news_images;
    private Date news_submitdate;
    private String news_describe;
    private String news_author;
    private Set<LikesEntity> likes;
    private Set<CommentEntity> comments;

    public NewsDTO() {
    }

    public NewsDTO(int news_id, String news_title, String news_images, Date news_submitdate, String news_describe, String news_author, Set<LikesEntity> likes, Set<CommentEntity> comments) {
        this.news_id = news_id;
        this.news_title = news_title;
        this.news_images = news_images;
        this.news_submitdate = news_submitdate;
        this.news_describe = news_describe;
        this.news_author = news_author;
        this.likes = likes;
        this.comments = comments;
    }

    public int getNews_id() {
        return news_id;
    }

    public void setNews_id(int news_id) {
        this.news_id = news_id;
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

    public Set<LikesEntity> getLikes() {
        return likes;
    }

    public void setLikes(Set<LikesEntity> likes) {
        this.likes = likes;
    }

    public Set<CommentEntity> getComments() {
        return comments;
    }

    public void setComments(Set<CommentEntity> comments) {
        this.comments = comments;
    }
}
