package com.xmy.sms.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mixing_data")
public class MixingData {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TENDER_ID")
    private Integer tenderId;

    @Column(name = "PRODUCTION_NAME")
    private String productionName;

    @Column(name = "CONSTRUCTION_POINT")
    private String constructionPoint;

    @Column(name = "DESIGN_STRENGTH")
    private String designStrength;

    @Column(name = "VOLUME")
    private Float volume;

    @Column(name = "QUALIFIED")
    private Integer qualified;

    @Column(name = "PRODUCTION_DATE")
    private Date productionDate;

    @Column(name = "DATA_ID")
    private Integer dataId;

    @Column(name = "DATA_CONTENT")
    private String dataContent;

    @Column(name = "DELETE")
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
}