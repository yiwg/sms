package com.xmy.sms.to;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class OverproofTo {
    /**
     * 自增id
     */
    private Integer id;

    /**
     * 数据id
     */
    private Integer dataId;

    /**
     * 标段id
     */
    private Integer tenderId;

    private Integer tenderType;

    /**
     * 施工单位处理信息
     */
    private String buildMsg;

    /**
     * 施工单位处理人员
     */
    private String buildStaff;

    /**
     * 施工单位处理时间
     */
    private Date buildDate;

    /**
     * 中试处理信息
     */
    private String testMsg;

    /**
     * 中试处理人
     */
    private String testStaff;

    /**
     * 中试处理时间
     */
    private Date testDate;

    /**
     * 监理处理信息
     */
    private String supervisorMsg;

    /**
     * 监理处理人
     */
    private String supervisorStaff;

    /**
     * 监理处理时间
     */
    private Date supervisorDate;

    /**
     * 信息编号
     */
    private String msgNum;

    /**
     * 是否处理
     */
    private Integer isDeal;

    /**
     * 是否预警
     */
    private Integer isWarm;

    /**
     * 数据类型
     */
    private Integer dataType;

    private String testType;

    private String dataDate;//数据时间

    private String constructionPoint;

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
     * 获取数据id
     *
     * @return DATA_ID - 数据id
     */
    public Integer getDataId() {
        return dataId;
    }

    /**
     * 设置数据id
     *
     * @param dataId 数据id
     */
    public void setDataId(Integer dataId) {
        this.dataId = dataId;
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
     * 获取施工单位处理信息
     *
     * @return BUILD_MSG - 施工单位处理信息
     */
    public String getBuildMsg() {
        return buildMsg;
    }

    /**
     * 设置施工单位处理信息
     *
     * @param buildMsg 施工单位处理信息
     */
    public void setBuildMsg(String buildMsg) {
        this.buildMsg = buildMsg;
    }

    /**
     * 获取施工单位处理人员
     *
     * @return BUILD_STAFF - 施工单位处理人员
     */
    public String getBuildStaff() {
        return buildStaff;
    }

    /**
     * 设置施工单位处理人员
     *
     * @param buildStaff 施工单位处理人员
     */
    public void setBuildStaff(String buildStaff) {
        this.buildStaff = buildStaff;
    }

    /**
     * 获取施工单位处理时间
     *
     * @return BUILD_DATE - 施工单位处理时间
     */
    public Date getBuildDate() {
        return buildDate;
    }

    /**
     * 设置施工单位处理时间
     *
     * @param buildDate 施工单位处理时间
     */
    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

    /**
     * 获取中试处理信息
     *
     * @return TEST_MSG - 中试处理信息
     */
    public String getTestMsg() {
        return testMsg;
    }

    /**
     * 设置中试处理信息
     *
     * @param testMsg 中试处理信息
     */
    public void setTestMsg(String testMsg) {
        this.testMsg = testMsg;
    }

    /**
     * 获取中试处理人
     *
     * @return TEST_STAFF - 中试处理人
     */
    public String getTestStaff() {
        return testStaff;
    }

    /**
     * 设置中试处理人
     *
     * @param testStaff 中试处理人
     */
    public void setTestStaff(String testStaff) {
        this.testStaff = testStaff;
    }

    /**
     * 获取中试处理时间
     *
     * @return TEST_DATE - 中试处理时间
     */
    public Date getTestDate() {
        return testDate;
    }

    /**
     * 设置中试处理时间
     *
     * @param testDate 中试处理时间
     */
    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    /**
     * 获取监理处理信息
     *
     * @return SUPERVISOR_MSG - 监理处理信息
     */
    public String getSupervisorMsg() {
        return supervisorMsg;
    }

    /**
     * 设置监理处理信息
     *
     * @param supervisorMsg 监理处理信息
     */
    public void setSupervisorMsg(String supervisorMsg) {
        this.supervisorMsg = supervisorMsg;
    }

    /**
     * 获取监理处理人
     *
     * @return SUPERVISOR_STAFF - 监理处理人
     */
    public String getSupervisorStaff() {
        return supervisorStaff;
    }

    /**
     * 设置监理处理人
     *
     * @param supervisorStaff 监理处理人
     */
    public void setSupervisorStaff(String supervisorStaff) {
        this.supervisorStaff = supervisorStaff;
    }

    /**
     * 获取监理处理时间
     *
     * @return SUPERVISOR_DATE - 监理处理时间
     */
    public Date getSupervisorDate() {
        return supervisorDate;
    }

    /**
     * 设置监理处理时间
     *
     * @param supervisorDate 监理处理时间
     */
    public void setSupervisorDate(Date supervisorDate) {
        this.supervisorDate = supervisorDate;
    }

    /**
     * 获取信息编号
     *
     * @return MSG_NUM - 信息编号
     */
    public String getMsgNum() {
        return msgNum;
    }

    /**
     * 设置信息编号
     *
     * @param msgNum 信息编号
     */
    public void setMsgNum(String msgNum) {
        this.msgNum = msgNum;
    }

    /**
     * 获取是否处理
     *
     * @return IS_DEAL - 是否处理
     */
    public Integer getIsDeal() {
        return isDeal;
    }

    /**
     * 设置是否处理
     *
     * @param isDeal 是否处理
     */
    public void setIsDeal(Integer isDeal) {
        this.isDeal = isDeal;
    }

    /**
     * 获取是否预警
     *
     * @return IS_WARM - 是否预警
     */
    public Integer getIsWarm() {
        return isWarm;
    }

    /**
     * 设置是否预警
     *
     * @param isWarm 是否预警
     */
    public void setIsWarm(Integer isWarm) {
        this.isWarm = isWarm;
    }

    /**
     * 获取数据类型
     *
     * @return DATA_TYPE - 数据类型
     */
    public Integer getDataType() {
        return dataType;
    }

    /**
     * 设置数据类型
     *
     * @param dataType 数据类型
     */
    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate;
    }

    public String getConstructionPoint() {
        return constructionPoint;
    }

    public void setConstructionPoint(String constructionPoint) {
        this.constructionPoint = constructionPoint;
    }

    public Integer getTenderType() {
        return tenderType;
    }

    public void setTenderType(Integer tenderType) {
        this.tenderType = tenderType;
    }
}