package com.crawldata.trangtintucbongda.repository;

import com.crawldata.trangtintucbongda.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
   // @Query("select c from Category c where c.category_name =  :category_name")
}
