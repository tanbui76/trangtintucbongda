package com.crawldata.trangtintucbongda.entity;

import jakarta.persistence.*;

import javax.swing.text.View;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "News")

public class NewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "category_id")
    @OneToMany(mappedBy = "viewedEntity", cascade = CascadeType.ALL)

   // private List<ViewedEntity>  list = new ArrayList<>();

    private  CategoryEntity categoryEntity;

    private Long news_id;
    @Column(name = "news_title")
    private  String news_title;
    @Column(name = "news_images")
    private String news_images;
    @Column(name = "news_submitdate")

    private Date news_submitdate;
    @Column(name = "news_describe")

    private String news_describe;
    @Column(name = "news_author")

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
