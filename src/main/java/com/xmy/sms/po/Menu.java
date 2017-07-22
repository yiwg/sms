package com.xmy.sms.po;

import javax.persistence.*;

public class Menu {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 图标
     */
    @Column(name = "ICON")
    private String icon;

    /**
     * 描述
     */
    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * 链接
     */
    @Column(name = "URL")
    private String url;

    /**
     * 父级id
     */
    @Column(name = "PARENT_ID")
    private Integer parentId;

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
     * 获取名称
     *
     * @return NAME - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取图标
     *
     * @return ICON - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取描述
     *
     * @return DESCRIPTION - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取链接
     *
     * @return URL - 链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置链接
     *
     * @param url 链接
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取父级id
     *
     * @return PARENT_ID - 父级id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父级id
     *
     * @param parentId 父级id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}