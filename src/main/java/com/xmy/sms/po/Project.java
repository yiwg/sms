package com.xmy.sms.po;

import javax.persistence.*;

public class Project {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 工程名称
     */
    @Column(name = "NAME")
    private String name;

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
     * 获取工程名称
     *
     * @return NAME - 工程名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置工程名称
     *
     * @param name 工程名称
     */
    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}