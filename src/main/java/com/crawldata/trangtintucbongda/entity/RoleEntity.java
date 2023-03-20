package com.crawldata.trangtintucbongda.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Role")
public class RoleEntity {
    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;

    @Column(name = "role_name")
    private String role_name;

    @OneToMany(mappedBy = "role")
    private Set<AccountEntity> accounts;

    public Long getRoleId() {
        return role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public Set<AccountEntity> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<AccountEntity> accounts) {
        this.accounts = accounts;
    }
}
