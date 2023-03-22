package com.crawldata.trangtintucbongda.dto;

public class ViewedDTO {
    private Long viewed_id;
    private Long account_id;
    private Long news_id;

    public ViewedDTO() {
    }

    public ViewedDTO(Long viewed_id, Long account_id, Long news_id) {
        this.viewed_id = viewed_id;
        this.account_id = account_id;
        this.news_id = news_id;
    }

    public Long getViewed_id() {
        return viewed_id;
    }

    public Long getAccount_id() {
        return account_id;
    }

    public Long getNews_id() {
        return news_id;
    }

    public void setViewed_id(Long viewed_id) {
        this.viewed_id = viewed_id;
    }

    public void setAccount_id(Long account_id) {
        this.account_id = account_id;
    }

    public void setNews_id(Long news_id) {
        this.news_id = news_id;
    }
}
