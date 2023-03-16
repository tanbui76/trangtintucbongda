package com.crawldata.trangtintucbongda.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "News")

public class NewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "category_id")

    private Long news_id;
    private  String news_title;
    private String news_images;
    private Date news_submitdate;
    private String news_describe;
    private String news_author;

    public Long getNews_id() {
        return news_id;
    }

    public String getNews_title() {
        return news_title;
    }

    public String getNews_images() {
        return news_images;
    }

    public Date getNews_submitdate() {
        return news_submitdate;
    }

    public String getNews_describe() {
        return news_describe;
    }

    public String getNews_author() {
        return news_author;
    }



    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    public void setNews_images(String news_images) {
        this.news_images = news_images;
    }

    public void setNews_submitdate(Date news_submitdate) {
        this.news_submitdate = news_submitdate;
    }

    public void setNews_describe(String news_describe) {
        this.news_describe = news_describe;
    }

    public void setNews_author(String news_author) {
        this.news_author = news_author;
    }
}
