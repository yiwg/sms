package com.xmy.sms.to;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TenderTo {

    private Integer id;

    private String name;

    private Integer itemId;

    private String itemName;

    private Integer projectId;

    private String projectName;

    private String position;

    private String photo;

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Integer getItemId() {
        return itemId;
    }


    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }


    public Integer getProjectId() {
        return projectId;
    }


    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }


    public String getPosition() {
        return position;
    }


    public void setPosition(String position) {
        this.position = position;
    }


    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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
}