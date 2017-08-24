package com.xmy.sms.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "multi_data")
public class MultiData {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TENDER_ID")
    private Integer tenderId;

    @Column(name = "LAB_NAME")
    private String labName;

    @Column(name = "DEVICE_NAME")
    private String deviceName;

    @Column(name = "TEST_TYPE")
    private String testType;

    @Column(name = "CONSTRUCTION_POINT")
    private String constructionPoint;

    @Column(name = "DEVICE_NUM")
    private String deviceNum;

    @Column(name = "REBAR_NUM")
    private String rebarNum;

    @Column(name = "TEST_DATE")
    private Date testDate;

    @Column(name = "DIAMETER")
    private Float diameter;

    @Column(name = "YIELDPOWER_ONE")
    private Float yieldpowerOne;

    @Column(name = "YIELDPOWER_TWO")
    private Float yieldpowerTwo;

    @Column(name = "YIELDPOWER_THREE")
    private Float yieldpowerThree;

    @Column(name = "YIELDSTRENGTH_ONE")
    private Float yieldstrengthOne;

    @Column(name = "YIELDSTRENGTH_TWO")
    private Float yieldstrengthTwo;

    @Column(name = "YIELDSTRENGTH_THREE")
    private Float yieldstrengthThree;

    @Column(name = "TENSILEPOWER_ONE")
    private Float tensilepowerOne;

    @Column(name = "TENSILEPOWER_TWO")
    private Float tensilepowerTwo;

    @Column(name = "TENSILEPOWER_THREE")
    private Float tensilepowerThree;

    @Column(name = "TENSILESTRENGTH_ONE")
    private Float tensilestrengthOne;

    @Column(name = "TENSILESTRENGTH_TWO")
    private Float tensilestrengthTwo;

    @Column(name = "TENSILESTRENGTH_THREE")
    private Float tensilestrengthThree;

    @Column(name = "QUALIFIED")
    private Integer qualified;

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
}