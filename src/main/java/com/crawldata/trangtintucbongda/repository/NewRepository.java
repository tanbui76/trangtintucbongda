package com.crawldata.trangtintucbongda.repository;

import com.crawldata.trangtintucbongda.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
//truyền tham số Bảng tương tác và kiểu dữ liệu của id vào JpaRepository
//Đã có săn các hàm CRUD: save, delete, findAll, findById ,... chỉ cần gọi ra sử dụng
public interface NewRepository extends JpaRepository<NewsEntity,Long> {

}
