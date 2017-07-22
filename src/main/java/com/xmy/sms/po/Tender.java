package com.xmy.sms.po;

import javax.persistence.*;

public class Tender {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标段名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 项目编号
     */
    @Column(name = "ITEM_ID")
    private Integer itemId;

    /**
     * 工程编号
     */
    @Column(name = "PROJECT_ID")
    private Integer projectId;

    /**
     * 位置
     */
    @Column(name = "POSITION")
    private String position;

    /**
     * 图片
     */
    @Column(name = "PHOTO")
    private String photo;

    /**
     * 获取自增主键
     *
     * @return ID - 自增主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增主键
     *
     * @param id 自增主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取标段名称
     *
     * @return NAME - 标段名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置标段名称
     *
     * @param name 标段名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取工程编号
     *
     * @return PROJECT_ID - 工程编号
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * 设置工程编号
     *
     * @param projectId 工程编号
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取位置
     *
     * @return POSITION - 位置
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置位置
     *
     * @param position 位置
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取图片
     *
     * @return PHOTO - 图片
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * 设置图片
     *
     * @param photo 图片
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }
}