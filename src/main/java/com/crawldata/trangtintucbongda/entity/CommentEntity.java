package com.crawldata.trangtintucbongda.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Comment")
public class CommentEntity {
    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comment_id;

    @Column(name = "comment_title", columnDefinition = "nvarchar(max)")
    private String comment_title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    @JsonIgnore
    private AccountEntity account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "news_id")
    @JsonIgnore
    private NewsEntity news;

    public CommentEntity() {
    }

    public CommentEntity(String comment_title, AccountEntity account, NewsEntity news) {
        this.comment_title = comment_title;
        this.account = account;
        this.news = news;
    }

    public NewsEntity getNews() {
        return news;
    }

    public void setNews(NewsEntity news) {
        this.news = news;
    }

    public String getComment_title() {
        return comment_title;
    }

    public void setComment_title(String comment_title) {
        this.comment_title = comment_title;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    public Long getComment_id() {
        return comment_id;
    }
}
