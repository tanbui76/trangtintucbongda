package com.crawldata.trangtintucbongda.service;

import com.crawldata.trangtintucbongda.entity.NewsEntity;

import java.util.List;


public interface NewsService {
    List<NewsEntity> getAllNews();// lấy tất cả các tin tức

    NewsEntity getNewsById(Long id);// lấy tin tức theo id

    NewsEntity saveNews(NewsEntity newsEntity);// lưu tin tức

    NewsEntity updateNews(NewsEntity newsEntity);// cập nhật tin tức

    void deleteNews(int id);// xóa tin tức theo id


}
