package com.crawldata.trangtintucbongda.dto;

public class LikesDTO {
    private Long likes_id;

    private Long account_id;

    private Long news_id;

    public LikesDTO() {
    }

    public LikesDTO(Long likes_id, Long account_id, Long news_id) {
        this.likes_id = likes_id;
        this.account_id = account_id;
        this.news_id = news_id;
    }

    public Long getLikes_id() {
        return likes_id;
    }

    public void setLikes_id(Long likes_id) {
        this.likes_id = likes_id;
    }

    public Long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Long account_id) {
        this.account_id = account_id;
    }

    public Long getNews_id() {
        return news_id;
    }

    public void setNews_id(Long news_id) {
        this.news_id = news_id;
    }

    
}
