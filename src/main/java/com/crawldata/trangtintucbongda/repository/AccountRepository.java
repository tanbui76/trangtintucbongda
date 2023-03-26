package com.crawldata.trangtintucbongda.repository;

import com.crawldata.trangtintucbongda.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
    @Query("SELECT u FROM AccountEntity u WHERE u.account_username = :account_username and u.account_password = :account_password")
    AccountEntity getAccountByUserAndPass(@Param("account_username") String account_fullname,@Param("account_password") String account_password);
}
