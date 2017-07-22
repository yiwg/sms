package com.xmy.sms.po;

import javax.persistence.*;

public class Item {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 项目名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 工程id
     */
    @Column(name = "PROJECT_ID")
    private Integer projectId;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

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
     * 获取项目名称
     *
     * @return NAME - 项目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置项目名称
     *
     * @param name 项目名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取工程id
     *
     * @return PROJECT_ID - 工程id
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * 设置工程id
     *
     * @param projectId 工程id
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}