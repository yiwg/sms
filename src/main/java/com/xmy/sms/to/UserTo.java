package com.xmy.sms.to;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserTo {
    /**
     * 自增
     */

    private Integer id;

    /**
     * 用户名
     */

    private String name;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String passWord;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 类型
     */
    private String type;

    /**
     * 项目编号
     */
    private Integer itemId;

    /**
     * 电话号码
     */
    private String phoneNum;

    private String itemName;

    private String projectName;

    private String typeName;

    /**
     * 获取自增
     *
     * @return ID - 自增
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增
     *
     * @param id 自增
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return NAME - 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户名
     *
     * @param name 用户名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取账号
     *
     * @return ACCOUNT - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取密码
     *
     * @return PASS_WORD - 密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置密码
     *
     * @param passWord 密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取邮箱
     *
     * @return EMAIL - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取类型
     *
     * @return TYPE - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取项目编号
     *
     * @return ITEM_ID - 项目编号
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 设置项目编号
     *
     * @param itemId 项目编号
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取电话号码
     *
     * @return PHONE_NUM - 电话号码
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 设置电话号码
     *
     * @param phoneNum 电话号码
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "UserTo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", passWord='" + passWord + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                ", itemId=" + itemId +
                ", phoneNum='" + phoneNum + '\'' +
                ", itemName='" + itemName + '\'' +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}