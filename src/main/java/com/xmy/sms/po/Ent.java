package com.xmy.sms.po;

import javax.persistence.*;

public class Ent {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ENT_NAME")
    private String entName;

    @Column(name = "ENT_NUMBER")
    private Integer entNumber;

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
     * @return ENT_NAME
     */
    public String getEntName() {
        return entName;
    }

    /**
     * @param entName
     */
    public void setEntName(String entName) {
        this.entName = entName;
    }

    /**
     * @return ENT_NUMBER
     */
    public Integer getEntNumber() {
        return entNumber;
    }

    /**
     * @param entNumber
     */
    public void setEntNumber(Integer entNumber) {
        this.entNumber = entNumber;
    }
}