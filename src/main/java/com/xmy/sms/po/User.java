package com.xmy.sms.po;

import javax.persistence.*;

public class User {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "ACCOUNT")
    private String account;

    @Column(name = "PASS_WORD")
    private String passWord;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return ACCOUNT
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return PASS_WORD
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}