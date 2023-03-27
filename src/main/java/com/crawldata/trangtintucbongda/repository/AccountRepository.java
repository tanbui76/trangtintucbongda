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

    @Query("UPDATE AccountEntity u SET u.account_fullname = :account_fullname WHERE u.account_id = :account_id")
    AccountEntity updateAccount(@Param("account_fullname") String account_fullname,@Param("account_id") Long account_id);

    @Query("UPDATE AccountEntity u SET u.account_password = :account_password WHERE u.account_id = :account_id")
    AccountEntity updateAccountPassword(@Param("account_password") String account_password,@Param("account_id") Long account_id);

    @Query("UPDATE AccountEntity u SET u.account_telephone = :account_telephone WHERE u.account_id = :account_id")
    AccountEntity updateAccountTelephone(@Param("account_telephone") String account_telephone,@Param("account_id") Long account_id);

    @Query("UPDATE AccountEntity u SET u.account_email = :account_email WHERE u.account_id = :account_id")
    AccountEntity updateAccountEmail(@Param("account_email") String account_email,@Param("account_id") Long account_id);

    @Query("UPDATE AccountEntity u SET u.account_country = :account_country WHERE u.account_id = :account_id")
    AccountEntity updateAccountCountry(@Param("account_country") String account_country,@Param("account_id") Long account_id);

    @Query("UPDATE AccountEntity u SET u.account_username = :account_username WHERE u.account_id = :account_id")
    AccountEntity updateAccountUsername(@Param("account_username") String account_username,@Param("account_id") Long account_id);

    @Query("UPDATE AccountEntity u SET u.account_birthday = :account_birthday WHERE u.account_id = :account_id")
    AccountEntity updateAccountBirthday(@Param("account_birthday") String account_birthday,@Param("account_id") Long account_id);


}
