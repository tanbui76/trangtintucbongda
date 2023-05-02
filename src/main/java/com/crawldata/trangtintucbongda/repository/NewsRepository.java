package com.crawldata.trangtintucbongda.repository;

import com.crawldata.trangtintucbongda.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface NewsRepository extends JpaRepository<NewsEntity, Long> {
    @Query("select n from NewsEntity n where n.category.category_id = :id")
    List<NewsEntity> getAllByCategoryEntityId(@Param("id") Long id);
    @Query("select n.news_id from NewsEntity n")
    List<Long> getListIdNews();
    @Query("select n from NewsEntity n where n.news_id = :id")
    NewsEntity  getNewsRandomId(@Param("id") Long id);
    @Query("select n.news_submitdate from NewsEntity n")
    List<Date> getAllDateNews();
    @Query("select n from NewsEntity n where n.news_submitdate between :startDate and :endDate")
    List<NewsEntity> getAllNewsEqualTwoDay(@Param("startDate") Date startDate, @Param("endDate") Date endDate);






}
