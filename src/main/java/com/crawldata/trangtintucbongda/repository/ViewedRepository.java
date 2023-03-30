package com.crawldata.trangtintucbongda.repository;

import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.entity.ViewedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ViewedRepository extends JpaRepository<ViewedEntity, Long> {


    @Query("SELECT n FROM ViewedEntity v JOIN v.account a JOIN v.news n WHERE a.account_id = :account_id")
    List<NewsEntity> getAllNewsViewed (@Param("account_id")Long account_id);

}
