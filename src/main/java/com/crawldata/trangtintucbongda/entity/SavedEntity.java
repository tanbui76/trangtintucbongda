package com.crawldata.trangtintucbongda.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Saved")
public class SavedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long saved_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private AccountEntity account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "news_id")
    private NewsEntity news;

    public SavedEntity() {
    }

    public SavedEntity(AccountEntity account, NewsEntity news) {
        this.account = account;
        this.news = news;
    }

    public Long getSaved_id() {
        return saved_id;
    }

    public void setSaved_id(Long saved_id) {
        this.saved_id = saved_id;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    public NewsEntity getNews() {
        return news;
    }

    public void setNews(NewsEntity news) {
        this.news = news;
    }

}
