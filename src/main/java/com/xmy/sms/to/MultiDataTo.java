package com.xmy.sms.to;

import javax.persistence.*;
import java.util.Date;

public class MultiDataTo {

    private Integer id;

    private Integer tenderId;

    private Integer tenderType;

    private String labName;

    private String deviceName;

    private String testType;

    private String constructionPoint;

    private String deviceNum;

    private String rebarNum;

    private Date testDate;

    private Float diameter;

    private Float yieldpowerOne;

    private Float yieldpowerTwo;

    private Float yieldpowerThree;

    private Float yieldstrengthOne;

    private Float yieldstrengthTwo;

    private Float yieldstrengthThree;

    private Float tensilepowerOne;

    private Float tensilepowerTwo;

    private Float tensilepowerThree;

    private Float tensilestrengthOne;

    private Float tensilestrengthTwo;

    private Float tensilestrengthThree;

    private Integer qualified;

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
     * @return LAB_NAME
     */
    public String getLabName() {
        return labName;
    }

    /**
     * @param labName
     */
    public void setLabName(String labName) {
        this.labName = labName;
    }

    /**
     * @return DEVICE_NAME
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * @return TEST_TYPE
     */
    public String getTestType() {
        return testType;
    }

    /**
     * @param testType
     */
    public void setTestType(String testType) {
        this.testType = testType;
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
     * @return DEVICE_NUM
     */
    public String getDeviceNum() {
        return deviceNum;
    }

    /**
     * @param deviceNum
     */
    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum;
    }

    /**
     * @return REBAR_NUM
     */
    public String getRebarNum() {
        return rebarNum;
    }

    /**
     * @param rebarNum
     */
    public void setRebarNum(String rebarNum) {
        this.rebarNum = rebarNum;
    }

    /**
     * @return TEST_DATE
     */
    public Date getTestDate() {
        return testDate;
    }

    /**
     * @param testDate
     */
    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    /**
     * @return DIAMETER
     */
    public Float getDiameter() {
        return diameter;
    }

    /**
     * @param diameter
     */
    public void setDiameter(Float diameter) {
        this.diameter = diameter;
    }

    /**
     * @return YIELDPOWER_ONE
     */
    public Float getYieldpowerOne() {
        return yieldpowerOne;
    }

    /**
     * @param yieldpowerOne
     */
    public void setYieldpowerOne(Float yieldpowerOne) {
        this.yieldpowerOne = yieldpowerOne;
    }

    /**
     * @return YIELDPOWER_TWO
     */
    public Float getYieldpowerTwo() {
        return yieldpowerTwo;
    }

    /**
     * @param yieldpowerTwo
     */
    public void setYieldpowerTwo(Float yieldpowerTwo) {
        this.yieldpowerTwo = yieldpowerTwo;
    }

    /**
     * @return YIELDPOWER_THREE
     */
    public Float getYieldpowerThree() {
        return yieldpowerThree;
    }

    /**
     * @param yieldpowerThree
     */
    public void setYieldpowerThree(Float yieldpowerThree) {
        this.yieldpowerThree = yieldpowerThree;
    }

    /**
     * @return YIELDSTRENGTH_ONE
     */
    public Float getYieldstrengthOne() {
        return yieldstrengthOne;
    }

    /**
     * @param yieldstrengthOne
     */
    public void setYieldstrengthOne(Float yieldstrengthOne) {
        this.yieldstrengthOne = yieldstrengthOne;
    }

    /**
     * @return YIELDSTRENGTH_TWO
     */
    public Float getYieldstrengthTwo() {
        return yieldstrengthTwo;
    }

    /**
     * @param yieldstrengthTwo
     */
    public void setYieldstrengthTwo(Float yieldstrengthTwo) {
        this.yieldstrengthTwo = yieldstrengthTwo;
    }

    /**
     * @return YIELDSTRENGTH_THREE
     */
    public Float getYieldstrengthThree() {
        return yieldstrengthThree;
    }

    /**
     * @param yieldstrengthThree
     */
    public void setYieldstrengthThree(Float yieldstrengthThree) {
        this.yieldstrengthThree = yieldstrengthThree;
    }

    /**
     * @return TENSILEPOWER_ONE
     */
    public Float getTensilepowerOne() {
        return tensilepowerOne;
    }

    /**
     * @param tensilepowerOne
     */
    public void setTensilepowerOne(Float tensilepowerOne) {
        this.tensilepowerOne = tensilepowerOne;
    }

    /**
     * @return TENSILEPOWER_TWO
     */
    public Float getTensilepowerTwo() {
        return tensilepowerTwo;
    }

    /**
     * @param tensilepowerTwo
     */
    public void setTensilepowerTwo(Float tensilepowerTwo) {
        this.tensilepowerTwo = tensilepowerTwo;
    }

    /**
     * @return TENSILEPOWER_THREE
     */
    public Float getTensilepowerThree() {
        return tensilepowerThree;
    }

    /**
     * @param tensilepowerThree
     */
    public void setTensilepowerThree(Float tensilepowerThree) {
        this.tensilepowerThree = tensilepowerThree;
    }

    /**
     * @return TENSILESTRENGTH_ONE
     */
    public Float getTensilestrengthOne() {
        return tensilestrengthOne;
    }

    /**
     * @param tensilestrengthOne
     */
    public void setTensilestrengthOne(Float tensilestrengthOne) {
        this.tensilestrengthOne = tensilestrengthOne;
    }

    /**
     * @return TENSILESTRENGTH_TWO
     */
    public Float getTensilestrengthTwo() {
        return tensilestrengthTwo;
    }

    /**
     * @param tensilestrengthTwo
     */
    public void setTensilestrengthTwo(Float tensilestrengthTwo) {
        this.tensilestrengthTwo = tensilestrengthTwo;
    }

    /**
     * @return TENSILESTRENGTH_THREE
     */
    public Float getTensilestrengthThree() {
        return tensilestrengthThree;
    }

    /**
     * @param tensilestrengthThree
     */
    public void setTensilestrengthThree(Float tensilestrengthThree) {
        this.tensilestrengthThree = tensilestrengthThree;
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

    @Override
    public String toString() {
        return "MultiDataTo{" +
                "id=" + id +
                ", tenderId=" + tenderId +
                ", tenderType=" + tenderType +
                ", labName='" + labName + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", testType='" + testType + '\'' +
                ", constructionPoint='" + constructionPoint + '\'' +
                ", deviceNum='" + deviceNum + '\'' +
                ", rebarNum='" + rebarNum + '\'' +
                ", testDate=" + testDate +
                ", diameter=" + diameter +
                ", yieldpowerOne=" + yieldpowerOne +
                ", yieldpowerTwo=" + yieldpowerTwo +
                ", yieldpowerThree=" + yieldpowerThree +
                ", yieldstrengthOne=" + yieldstrengthOne +
                ", yieldstrengthTwo=" + yieldstrengthTwo +
                ", yieldstrengthThree=" + yieldstrengthThree +
                ", tensilepowerOne=" + tensilepowerOne +
                ", tensilepowerTwo=" + tensilepowerTwo +
                ", tensilepowerThree=" + tensilepowerThree +
                ", tensilestrengthOne=" + tensilestrengthOne +
                ", tensilestrengthTwo=" + tensilestrengthTwo +
                ", tensilestrengthThree=" + tensilestrengthThree +
                ", qualified=" + qualified +
                ", delete=" + delete +
                '}';
    }
}