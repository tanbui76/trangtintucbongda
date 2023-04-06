package com.crawldata.trangtintucbongda.repository;

import com.crawldata.trangtintucbongda.entity.SavedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavedRepository extends JpaRepository<SavedEntity, Long> {
}
