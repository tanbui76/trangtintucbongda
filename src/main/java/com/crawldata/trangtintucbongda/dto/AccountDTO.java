package com.crawldata.trangtintucbongda.dto;

import java.util.Date;

public class AccountDTO {
    private String account_fullname;
    private String account_email;
    private String account_telephone;
    private String account_country;
    private String account_password;
    private Date account_createdate;
    private Long role_id;

    public AccountDTO() {
    }

    public AccountDTO(String account_fullname, String account_email, String account_telephone, String account_country, String account_password, Date account_createdate, Long role_id) {
        this.account_fullname = account_fullname;
        this.account_email = account_email;
        this.account_telephone = account_telephone;
        this.account_country = account_country;
        this.account_password = account_password;
        this.account_createdate = account_createdate;
        this.role_id = role_id;
    }

    public String getAccount_fullname() {
        return account_fullname;
    }

    public String getAccount_email() {
        return account_email;
    }

    public String getAccount_telephone() {
        return account_telephone;
    }

    public String getAccount_country() {
        return account_country;
    }

    public String getAccount_password() {
        return account_password;
    }

    public Date getAccount_createdate() {
        return account_createdate;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setAccount_fullname(String account_fullname) {
        this.account_fullname = account_fullname;
    }

    public void setAccount_email(String account_email) {
        this.account_email = account_email;
    }

    public void setAccount_telephone(String account_telephone) {
        this.account_telephone = account_telephone;
    }

    public void setAccount_country(String account_country) {
        this.account_country = account_country;
    }

    public void setAccount_password(String account_password) {
        this.account_password = account_password;
    }

    public void setAccount_createdate(Date account_createdate) {
        this.account_createdate = account_createdate;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }
}
