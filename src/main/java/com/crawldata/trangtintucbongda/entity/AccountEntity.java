package com.crawldata.trangtintucbongda.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Account")
public class AccountEntity {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long account_id;


    @Column(name = "account_fullname", columnDefinition = "nvarchar(max)")
    private String account_fullname;
    @Column(name = "account_email", columnDefinition = "nvarchar(max)")
    private String account_email;
    @Column(name = "account_telephone", columnDefinition = "nvarchar(max)")
    private String account_telephone;
    @Column(name = "account_country", columnDefinition = "nvarchar(max)")
    private String account_country;
    @Column(name = "account_password", columnDefinition = "nvarchar(max)")
    private String account_password;
    @Column(name = "account_createdate")
    private Date account_createdate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    @JsonIgnore
    private RoleEntity role;

    @OneToMany(mappedBy = "account")
    @JsonIgnore
    private Set<CommentEntity> comments;

    @OneToMany(mappedBy = "account")
    @JsonIgnore
    private Set<ViewedEntity> viewed;

    @JsonIgnore
    @OneToMany(mappedBy = "account")
    private Set<LikesEntity> likes;

    public AccountEntity() {
    }

    public AccountEntity(String account_fullname, String account_email, String account_telephone, String account_country, String account_password, Date account_createdate, RoleEntity role, Set<CommentEntity> comments, Set<ViewedEntity> viewed, Set<LikesEntity> likes) {
        this.account_fullname = account_fullname;
        this.account_email = account_email;
        this.account_telephone = account_telephone;
        this.account_country = account_country;
        this.account_password = account_password;
        this.account_createdate = account_createdate;
        this.role = role;
        this.comments = comments;
        this.viewed = viewed;
        this.likes = likes;
    }

    public Long getAccount_id() {
        return account_id;
    }

    public Set<CommentEntity> getComments() {
        return comments;
    }

    public void setComments(Set<CommentEntity> comments) {
        this.comments = comments;
    }

    public Set<LikesEntity> getLikes() {
        return likes;
    }

    public void setLikes(Set<LikesEntity> likes) {
        this.likes = likes;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
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
