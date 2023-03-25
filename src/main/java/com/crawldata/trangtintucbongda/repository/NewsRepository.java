package com.crawldata.trangtintucbongda.repository;

import com.crawldata.trangtintucbongda.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NewsRepository extends JpaRepository<NewsEntity, Long> {
    @Query("select n from NewsEntity n where n.category.category_id = :id")
    List<NewsEntity> getAllByCategoryEntityId(@Param("id") Long id);
}
