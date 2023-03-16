package com.crawldata.trangtintucbongda.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long account_id;
    @ManyToOne
    @JoinColumn(name = "role_id")
    @JoinTable(name = "Role")
    private Long role_id;

    @Column(name = "account_fullname")
    private  String account_fullname;
    @Column(name = "account_email")
    private  String account_email;
    @Column(name = "account_telephone")
    private  String account_telephone;
    @Column(name = "account_country")
    private  String account_country;
    @Column(name = "account_password")
    private  String account_password;
    @Column(name = "account_createdate")
    private Date account_createdate;

    public AccountEntity() {
    }

    public AccountEntity(String account_fullname, String account_email, String account_telephone, String account_country, String account_password, Date account_createdate) {
        this.account_fullname = account_fullname;
        this.account_email = account_email;
        this.account_telephone = account_telephone;
        this.account_country = account_country;
        this.account_password = account_password;
        this.account_createdate = account_createdate;
    }

    public Long getAccount_id() {
        return account_id;
    }


    public String getAccount_fullname() {
        return account_fullname;
    }

    public void setAccount_fullname(String account_fullname) {
        this.account_fullname = account_fullname;
    }

    public String getAccount_email() {
        return account_email;
    }

    public void setAccount_email(String account_email) {
        this.account_email = account_email;
    }

    public String getAccount_telephone() {
        return account_telephone;
    }

    public void setAccount_telephone(String account_telephone) {
        this.account_telephone = account_telephone;
    }

    public String getAccount_country() {
        return account_country;
    }

    public void setAccount_country(String account_country) {
        this.account_country = account_country;
    }

    public String getAccount_password() {
        return account_password;
    }

    public void setAccount_password(String account_password) {
        this.account_password = account_password;
    }

    public Date getAccount_createdate() {
        return account_createdate;
    }

    public void setAccount_createdate(Date account_createdate) {
        this.account_createdate = account_createdate;
    }

}
