package com.crawldata.trangtintucbongda.repository;

import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.entity.SavedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SavedRepository extends JpaRepository<SavedEntity, Long> {
    @Query("SELECT n FROM SavedEntity v JOIN v.account a JOIN v.news n WHERE a.account_id = :account_id")
    List<NewsEntity> getListNewSaved(@Param("account_id") Long account_id);

}
