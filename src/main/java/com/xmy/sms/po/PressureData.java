package com.xmy.sms.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pressure_data")
public class PressureData {
    /**
     * 自增id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标段id
     */
    @Column(name = "TENDER_ID")
    private Integer tenderId;

    /**
     * 试验室名称
     */
    @Column(name = "LAB_NAME")
    private String labName;

    /**
     * 设备名称
     */
    @Column(name = "DEVICE_NAME")
    private String deviceName;

    /**
     * 试验类型
     */
    @Column(name = "TEST_TYPE")
    private String testType;

    /**
     * 期间编号
     */
    @Column(name = "DEVICE_NUM")
    private String deviceNum;

    /**
     * 施工部位
     */
    @Column(name = "CONSTRUCTION_POINT")
    private String constructionPoint;

    /**
     * 试验日期
     */
    @Column(name = "TEST_DATE")
    private Date testDate;

    /**
     * 龄期
     */
    @Column(name = "AGE")
    private Integer age;

    /**
     * 器件尺寸
     */
    @Column(name = "DEVICE_SIZE")
    private String deviceSize;

    /**
     * 设计强度
     */
    @Column(name = "DESIGN_STRENGTH")
    private String designStrength;

    /**
     * 荷载1
     */
    @Column(name = "LOAD_ONE")
    private Float loadOne;

    /**
     * 荷载2
     */
    @Column(name = "LOAD_TWO")
    private Float loadTwo;

    /**
     * 荷载3
     */
    @Column(name = "LOAD_THREE")
    private Float loadThree;

    /**
     * 强度单值1
     */
    @Column(name = "STRENGTH_ONE")
    private Float strengthOne;

    /**
     * 强度单值2
     */
    @Column(name = "STRENGTH_TWO")
    private Float strengthTwo;

    /**
     * 强度单值3
     */
    @Column(name = "STRENGTH_THREE")
    private Float strengthThree;

    /**
     * 强度代表值
     */
    @Column(name = "STRENGTH_VALUE")
    private Float strengthValue;

    /**
     * 合格
     */
    @Column(name = "QUALIFIED")
    private Integer qualified;

    /**
     * 备注
     */
    @Column(name = "REMARD")
    private String remard;

    /**
     * 删除
     */
    @Column(name = "DELETE")
    private Integer delete;

    /**
     * 获取自增id
     *
     * @return ID - 自增id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增id
     *
     * @param id 自增id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取标段id
     *
     * @return TENDER_ID - 标段id
     */
    public Integer getTenderId() {
        return tenderId;
    }

    /**
     * 设置标段id
     *
     * @param tenderId 标段id
     */
    public void setTenderId(Integer tenderId) {
        this.tenderId = tenderId;
    }

    /**
     * 获取试验室名称
     *
     * @return LAB_NAME - 试验室名称
     */
    public String getLabName() {
        return labName;
    }

    /**
     * 设置试验室名称
     *
     * @param labName 试验室名称
     */
    public void setLabName(String labName) {
        this.labName = labName;
    }

    /**
     * 获取设备名称
     *
     * @return DEVICE_NAME - 设备名称
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * 设置设备名称
     *
     * @param deviceName 设备名称
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * 获取试验类型
     *
     * @return TEST_TYPE - 试验类型
     */
    public String getTestType() {
        return testType;
    }

    /**
     * 设置试验类型
     *
     * @param testType 试验类型
     */
    public void setTestType(String testType) {
        this.testType = testType;
    }

    /**
     * 获取期间编号
     *
     * @return DEVICE_NUM - 期间编号
     */
    public String getDeviceNum() {
        return deviceNum;
    }

    /**
     * 设置期间编号
     *
     * @param deviceNum 期间编号
     */
    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum;
    }

    /**
     * 获取施工部位
     *
     * @return CONSTRUCTION_POINT - 施工部位
     */
    public String getConstructionPoint() {
        return constructionPoint;
    }

    /**
     * 设置施工部位
     *
     * @param constructionPoint 施工部位
     */
    public void setConstructionPoint(String constructionPoint) {
        this.constructionPoint = constructionPoint;
    }

    /**
     * 获取试验日期
     *
     * @return TEST_DATE - 试验日期
     */
    public Date getTestDate() {
        return testDate;
    }

    /**
     * 设置试验日期
     *
     * @param testDate 试验日期
     */
    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    /**
     * 获取龄期
     *
     * @return AGE - 龄期
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置龄期
     *
     * @param age 龄期
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取器件尺寸
     *
     * @return DEVICE_SIZE - 器件尺寸
     */
    public String getDeviceSize() {
        return deviceSize;
    }

    /**
     * 设置器件尺寸
     *
     * @param deviceSize 器件尺寸
     */
    public void setDeviceSize(String deviceSize) {
        this.deviceSize = deviceSize;
    }

    /**
     * 获取设计强度
     *
     * @return DESIGN_STRENGTH - 设计强度
     */
    public String getDesignStrength() {
        return designStrength;
    }

    /**
     * 设置设计强度
     *
     * @param designStrength 设计强度
     */
    public void setDesignStrength(String designStrength) {
        this.designStrength = designStrength;
    }

    /**
     * 获取荷载1
     *
     * @return LOAD_ONE - 荷载1
     */
    public Float getLoadOne() {
        return loadOne;
    }

    /**
     * 设置荷载1
     *
     * @param loadOne 荷载1
     */
    public void setLoadOne(Float loadOne) {
        this.loadOne = loadOne;
    }

    /**
     * 获取荷载2
     *
     * @return LOAD_TWO - 荷载2
     */
    public Float getLoadTwo() {
        return loadTwo;
    }

    /**
     * 设置荷载2
     *
     * @param loadTwo 荷载2
     */
    public void setLoadTwo(Float loadTwo) {
        this.loadTwo = loadTwo;
    }

    /**
     * 获取荷载3
     *
     * @return LOAD_THREE - 荷载3
     */
    public Float getLoadThree() {
        return loadThree;
    }

    /**
     * 设置荷载3
     *
     * @param loadThree 荷载3
     */
    public void setLoadThree(Float loadThree) {
        this.loadThree = loadThree;
    }

    /**
     * 获取强度单值1
     *
     * @return STRENGTH_ONE - 强度单值1
     */
    public Float getStrengthOne() {
        return strengthOne;
    }

    /**
     * 设置强度单值1
     *
     * @param strengthOne 强度单值1
     */
    public void setStrengthOne(Float strengthOne) {
        this.strengthOne = strengthOne;
    }

    /**
     * 获取强度单值2
     *
     * @return STRENGTH_TWO - 强度单值2
     */
    public Float getStrengthTwo() {
        return strengthTwo;
    }

    /**
     * 设置强度单值2
     *
     * @param strengthTwo 强度单值2
     */
    public void setStrengthTwo(Float strengthTwo) {
        this.strengthTwo = strengthTwo;
    }

    /**
     * 获取强度单值3
     *
     * @return STRENGTH_THREE - 强度单值3
     */
    public Float getStrengthThree() {
        return strengthThree;
    }

    /**
     * 设置强度单值3
     *
     * @param strengthThree 强度单值3
     */
    public void setStrengthThree(Float strengthThree) {
        this.strengthThree = strengthThree;
    }

    /**
     * 获取强度代表值
     *
     * @return STRENGTH_VALUE - 强度代表值
     */
    public Float getStrengthValue() {
        return strengthValue;
    }

    /**
     * 设置强度代表值
     *
     * @param strengthValue 强度代表值
     */
    public void setStrengthValue(Float strengthValue) {
        this.strengthValue = strengthValue;
    }

    /**
     * 获取合格
     *
     * @return QUALIFIED - 合格
     */
    public Integer getQualified() {
        return qualified;
    }

    /**
     * 设置合格
     *
     * @param qualified 合格
     */
    public void setQualified(Integer qualified) {
        this.qualified = qualified;
    }

    /**
     * 获取备注
     *
     * @return REMARD - 备注
     */
    public String getRemard() {
        return remard;
    }

    /**
     * 设置备注
     *
     * @param remard 备注
     */
    public void setRemard(String remard) {
        this.remard = remard;
    }

    /**
     * 获取删除
     *
     * @return DELETE - 删除
     */
    public Integer getDelete() {
        return delete;
    }

    /**
     * 设置删除
     *
     * @param delete 删除
     */
    public void setDelete(Integer delete) {
        this.delete = delete;
    }
}