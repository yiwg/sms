package com.xmy.sms.to;

import javax.persistence.*;
import java.util.Date;

public class MixingDataTo {
    private Integer id;

    private Integer tenderId;

    private Integer tenderType;

    private String productionName;

    private String constructionPoint;

    private String designStrength;

    private Float volume;

    private Integer qualified;

    private Date productionDate;

    private Integer dataId;

    private String dataContent;

    private Integer delete;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return TENDER_ID
     */
    public Integer getTenderId() {
        return tenderId;
    }

    /**
     * @param tenderId
     */
    public void setTenderId(Integer tenderId) {
        this.tenderId = tenderId;
    }

    /**
     * @return PRODUCTION_NAME
     */
    public String getProductionName() {
        return productionName;
    }

    /**
     * @param productionName
     */
    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }

    /**
     * @return CONSTRUCTION_POINT
     */
    public String getConstructionPoint() {
        return constructionPoint;
    }

    /**
     * @param constructionPoint
     */
    public void setConstructionPoint(String constructionPoint) {
        this.constructionPoint = constructionPoint;
    }

    /**
     * @return DESIGN_STRENGTH
     */
    public String getDesignStrength() {
        return designStrength;
    }

    /**
     * @param designStrength
     */
    public void setDesignStrength(String designStrength) {
        this.designStrength = designStrength;
    }

    /**
     * @return VOLUME
     */
    public Float getVolume() {
        return volume;
    }

    /**
     * @param volume
     */
    public void setVolume(Float volume) {
        this.volume = volume;
    }

    /**
     * @return QUALIFIED
     */
    public Integer getQualified() {
        return qualified;
    }

    /**
     * @param qualified
     */
    public void setQualified(Integer qualified) {
        this.qualified = qualified;
    }

    /**
     * @return PRODUCTION_DATE
     */
    public Date getProductionDate() {
        return productionDate;
    }

    /**
     * @param productionDate
     */
    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    /**
     * @return DATA_ID
     */
    public Integer getDataId() {
        return dataId;
    }

    /**
     * @param dataId
     */
    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    /**
     * @return DATA_CONTENT
     */
    public String getDataContent() {
        return dataContent;
    }

    /**
     * @param dataContent
     */
    public void setDataContent(String dataContent) {
        this.dataContent = dataContent;
    }

    /**
     * @return DELETE
     */
    public Integer getDelete() {
        return delete;
    }

    /**
     * @param delete
     */
    public void setDelete(Integer delete) {
        this.delete = delete;
    }

    public Integer getTenderType() {
        return tenderType;
    }

    public void setTenderType(Integer tenderType) {
        this.tenderType = tenderType;
    }
}