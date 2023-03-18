package com.crawldata.trangtintucbongda.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Likes")
public class LikesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long likes_id;

    @OneToMany
    @JoinColumn(name = "news_id")
    @JoinTable(name = "News")
    private List<NewsEntity> newsEntities;

    @OneToMany
    @JoinColumn(name = "account_id")
    @JoinTable(name = "Account")
    private List<AccountEntity> accountEntities;

    public LikesEntity() {
    }

    public LikesEntity(long likes_id, List<NewsEntity> newsEntities, List<AccountEntity> accountEntities) {
        this.likes_id = likes_id;
        this.newsEntities = newsEntities;
        this.accountEntities = accountEntities;
    }

    public long getLikes_id() {
        return likes_id;
    }

    public void setLikes_id(long likes_id) {
        this.likes_id = likes_id;
    }

    public List<NewsEntity> getNewsEntities() {
        return newsEntities;
    }

    public void setNewsEntities(List<NewsEntity> newsEntities) {
        this.newsEntities = newsEntities;
    }

    public List<AccountEntity> getAccountEntities() {
        return accountEntities;
    }

    public void setAccountEntities(List<AccountEntity> accountEntities) {
        this.accountEntities = accountEntities;
    }

}
