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


}
