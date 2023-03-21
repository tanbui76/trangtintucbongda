package com.crawldata.trangtintucbongda.dto;

public class CommentDTO {
    private Long comment_id;
    private String comment_title;
    private Long account_id;
    private Long news_id;

    public CommentDTO() {
    }

    public CommentDTO(Long comment_id, String comment_title, Long account_id, Long news_id) {
        this.comment_id = comment_id;
        this.comment_title = comment_title;
        this.account_id = account_id;
        this.news_id = news_id;
    }

    public Long getComment_id() {
        return comment_id;
    }

    public String getComment_title() {
        return comment_title;
    }

    public Long getAccount_id() {
        return account_id;
    }

    public Long getNews_id() {
        return news_id;
    }

    public void setComment_id(Long comment_id) {
        this.comment_id = comment_id;
    }

    public void setComment_title(String comment_title) {
        this.comment_title = comment_title;
    }

    public void setAccount_id(Long account_id) {
        this.account_id = account_id;
    }

    public void setNews_id(Long news_id) {
        this.news_id = news_id;
    }
}
