package com.xmy.sms.po;

import javax.persistence.*;

@Table(name = "user_menu")
public class UserMenu {
    /**
     * 项目编号
     */
    @Column(name = "ITEM_ID")
    private Integer itemId;

    /**
     * 用户编号
     */
    @Column(name = "USER_ID")
    private Integer userId;

    /**
     * 菜单编号
     */
    @Column(name = "MENU_ID")
    private Integer menuId;

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
     * 获取用户编号
     *
     * @return USER_ID - 用户编号
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取菜单编号
     *
     * @return MENU_ID - 菜单编号
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置菜单编号
     *
     * @param menuId 菜单编号
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}