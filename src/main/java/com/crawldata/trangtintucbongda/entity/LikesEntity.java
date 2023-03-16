package com.crawldata.trangtintucbongda.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Likes")
public class LikesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long likes_id;

    @ManyToOne
    @JoinColumn(name = "news_id")
    @JoinTable(name = "News")
    private long news_id;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private long account_id;

    public LikesEntity() {
    }

    public LikesEntity(long news_id, long account_id) {
        this.news_id = news_id;
        this.account_id = account_id;
    }

    public long getNews_id() {
        return news_id;
    }

    public void setNews_id(long news_id) {
        this.news_id = news_id;
    }

    public long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(long account_id) {
        this.account_id = account_id;
    }
}
