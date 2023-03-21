package com.crawldata.trangtintucbongda.dto;

import com.crawldata.trangtintucbongda.entity.AccountEntity;

import java.util.Set;

public class RoleDTO {
    private Long role_id;
    private String role_name;

    private Set<AccountEntity> accounts;

    public RoleDTO() {
    }

    public RoleDTO(Long role_id, String role_name, Set<AccountEntity> accounts) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.accounts = accounts;
    }

    public Long getRole_id() {
        return role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public Set<AccountEntity> getAccounts() {
        return accounts;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public void setAccounts(Set<AccountEntity> accounts) {
        this.accounts = accounts;
    }


}
