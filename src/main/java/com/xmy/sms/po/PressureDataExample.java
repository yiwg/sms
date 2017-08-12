package com.xmy.sms.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PressureDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PressureDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTenderIdIsNull() {
            addCriterion("TENDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenderIdIsNotNull() {
            addCriterion("TENDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenderIdEqualTo(Integer value) {
            addCriterion("TENDER_ID =", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotEqualTo(Integer value) {
            addCriterion("TENDER_ID <>", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdGreaterThan(Integer value) {
            addCriterion("TENDER_ID >", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TENDER_ID >=", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdLessThan(Integer value) {
            addCriterion("TENDER_ID <", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdLessThanOrEqualTo(Integer value) {
            addCriterion("TENDER_ID <=", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdIn(List<Integer> values) {
            addCriterion("TENDER_ID in", values, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotIn(List<Integer> values) {
            addCriterion("TENDER_ID not in", values, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdBetween(Integer value1, Integer value2) {
            addCriterion("TENDER_ID between", value1, value2, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TENDER_ID not between", value1, value2, "tenderId");
            return (Criteria) this;
        }

        public Criteria andLabNameIsNull() {
            addCriterion("LAB_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLabNameIsNotNull() {
            addCriterion("LAB_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLabNameEqualTo(String value) {
            addCriterion("LAB_NAME =", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameNotEqualTo(String value) {
            addCriterion("LAB_NAME <>", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameGreaterThan(String value) {
            addCriterion("LAB_NAME >", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameGreaterThanOrEqualTo(String value) {
            addCriterion("LAB_NAME >=", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameLessThan(String value) {
            addCriterion("LAB_NAME <", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameLessThanOrEqualTo(String value) {
            addCriterion("LAB_NAME <=", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameLike(String value) {
            addCriterion("LAB_NAME like", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameNotLike(String value) {
            addCriterion("LAB_NAME not like", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameIn(List<String> values) {
            addCriterion("LAB_NAME in", values, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameNotIn(List<String> values) {
            addCriterion("LAB_NAME not in", values, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameBetween(String value1, String value2) {
            addCriterion("LAB_NAME between", value1, value2, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameNotBetween(String value1, String value2) {
            addCriterion("LAB_NAME not between", value1, value2, "labName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("DEVICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("DEVICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("DEVICE_NAME =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("DEVICE_NAME <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("DEVICE_NAME >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_NAME >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("DEVICE_NAME <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_NAME <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("DEVICE_NAME like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("DEVICE_NAME not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("DEVICE_NAME in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("DEVICE_NAME not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("DEVICE_NAME between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("DEVICE_NAME not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andTestTypeIsNull() {
            addCriterion("TEST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTestTypeIsNotNull() {
            addCriterion("TEST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTestTypeEqualTo(String value) {
            addCriterion("TEST_TYPE =", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotEqualTo(String value) {
            addCriterion("TEST_TYPE <>", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeGreaterThan(String value) {
            addCriterion("TEST_TYPE >", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_TYPE >=", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLessThan(String value) {
            addCriterion("TEST_TYPE <", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLessThanOrEqualTo(String value) {
            addCriterion("TEST_TYPE <=", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLike(String value) {
            addCriterion("TEST_TYPE like", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotLike(String value) {
            addCriterion("TEST_TYPE not like", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeIn(List<String> values) {
            addCriterion("TEST_TYPE in", values, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotIn(List<String> values) {
            addCriterion("TEST_TYPE not in", values, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeBetween(String value1, String value2) {
            addCriterion("TEST_TYPE between", value1, value2, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotBetween(String value1, String value2) {
            addCriterion("TEST_TYPE not between", value1, value2, "testType");
            return (Criteria) this;
        }

        public Criteria andDeviceNumIsNull() {
            addCriterion("DEVICE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumIsNotNull() {
            addCriterion("DEVICE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumEqualTo(String value) {
            addCriterion("DEVICE_NUM =", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumNotEqualTo(String value) {
            addCriterion("DEVICE_NUM <>", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumGreaterThan(String value) {
            addCriterion("DEVICE_NUM >", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_NUM >=", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumLessThan(String value) {
            addCriterion("DEVICE_NUM <", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_NUM <=", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumLike(String value) {
            addCriterion("DEVICE_NUM like", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumNotLike(String value) {
            addCriterion("DEVICE_NUM not like", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumIn(List<String> values) {
            addCriterion("DEVICE_NUM in", values, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumNotIn(List<String> values) {
            addCriterion("DEVICE_NUM not in", values, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumBetween(String value1, String value2) {
            addCriterion("DEVICE_NUM between", value1, value2, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumNotBetween(String value1, String value2) {
            addCriterion("DEVICE_NUM not between", value1, value2, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andConstructionPointIsNull() {
            addCriterion("CONSTRUCTION_POINT is null");
            return (Criteria) this;
        }

        public Criteria andConstructionPointIsNotNull() {
            addCriterion("CONSTRUCTION_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionPointEqualTo(String value) {
            addCriterion("CONSTRUCTION_POINT =", value, "constructionPoint");
            return (Criteria) this;
        }

        public Criteria andConstructionPointNotEqualTo(String value) {
            addCriterion("CONSTRUCTION_POINT <>", value, "constructionPoint");
            return (Criteria) this;
        }

        public Criteria andConstructionPointGreaterThan(String value) {
            addCriterion("CONSTRUCTION_POINT >", value, "constructionPoint");
            return (Criteria) this;
        }

        public Criteria andConstructionPointGreaterThanOrEqualTo(String value) {
            addCriterion("CONSTRUCTION_POINT >=", value, "constructionPoint");
            return (Criteria) this;
        }

        public Criteria andConstructionPointLessThan(String value) {
            addCriterion("CONSTRUCTION_POINT <", value, "constructionPoint");
            return (Criteria) this;
        }

        public Criteria andConstructionPointLessThanOrEqualTo(String value) {
            addCriterion("CONSTRUCTION_POINT <=", value, "constructionPoint");
            return (Criteria) this;
        }

        public Criteria andConstructionPointLike(String value) {
            addCriterion("CONSTRUCTION_POINT like", value, "constructionPoint");
            return (Criteria) this;
        }

        public Criteria andConstructionPointNotLike(String value) {
            addCriterion("CONSTRUCTION_POINT not like", value, "constructionPoint");
            return (Criteria) this;
        }

        public Criteria andConstructionPointIn(List<String> values) {
            addCriterion("CONSTRUCTION_POINT in", values, "constructionPoint");
            return (Criteria) this;
        }

        public Criteria andConstructionPointNotIn(List<String> values) {
            addCriterion("CONSTRUCTION_POINT not in", values, "constructionPoint");
            return (Criteria) this;
        }

        public Criteria andConstructionPointBetween(String value1, String value2) {
            addCriterion("CONSTRUCTION_POINT between", value1, value2, "constructionPoint");
            return (Criteria) this;
        }

        public Criteria andConstructionPointNotBetween(String value1, String value2) {
            addCriterion("CONSTRUCTION_POINT not between", value1, value2, "constructionPoint");
            return (Criteria) this;
        }

        public Criteria andTestDateIsNull() {
            addCriterion("TEST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTestDateIsNotNull() {
            addCriterion("TEST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTestDateEqualTo(Date value) {
            addCriterion("TEST_DATE =", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotEqualTo(Date value) {
            addCriterion("TEST_DATE <>", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateGreaterThan(Date value) {
            addCriterion("TEST_DATE >", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TEST_DATE >=", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateLessThan(Date value) {
            addCriterion("TEST_DATE <", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateLessThanOrEqualTo(Date value) {
            addCriterion("TEST_DATE <=", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateIn(List<Date> values) {
            addCriterion("TEST_DATE in", values, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotIn(List<Date> values) {
            addCriterion("TEST_DATE not in", values, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateBetween(Date value1, Date value2) {
            addCriterion("TEST_DATE between", value1, value2, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotBetween(Date value1, Date value2) {
            addCriterion("TEST_DATE not between", value1, value2, "testDate");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andDeviceSizeIsNull() {
            addCriterion("DEVICE_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSizeIsNotNull() {
            addCriterion("DEVICE_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSizeEqualTo(String value) {
            addCriterion("DEVICE_SIZE =", value, "deviceSize");
            return (Criteria) this;
        }

        public Criteria andDeviceSizeNotEqualTo(String value) {
            addCriterion("DEVICE_SIZE <>", value, "deviceSize");
            return (Criteria) this;
        }

        public Criteria andDeviceSizeGreaterThan(String value) {
            addCriterion("DEVICE_SIZE >", value, "deviceSize");
            return (Criteria) this;
        }

        public Criteria andDeviceSizeGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_SIZE >=", value, "deviceSize");
            return (Criteria) this;
        }

        public Criteria andDeviceSizeLessThan(String value) {
            addCriterion("DEVICE_SIZE <", value, "deviceSize");
            return (Criteria) this;
        }

        public Criteria andDeviceSizeLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_SIZE <=", value, "deviceSize");
            return (Criteria) this;
        }

        public Criteria andDeviceSizeLike(String value) {
            addCriterion("DEVICE_SIZE like", value, "deviceSize");
            return (Criteria) this;
        }

        public Criteria andDeviceSizeNotLike(String value) {
            addCriterion("DEVICE_SIZE not like", value, "deviceSize");
            return (Criteria) this;
        }

        public Criteria andDeviceSizeIn(List<String> values) {
            addCriterion("DEVICE_SIZE in", values, "deviceSize");
            return (Criteria) this;
        }

        public Criteria andDeviceSizeNotIn(List<String> values) {
            addCriterion("DEVICE_SIZE not in", values, "deviceSize");
            return (Criteria) this;
        }

        public Criteria andDeviceSizeBetween(String value1, String value2) {
            addCriterion("DEVICE_SIZE between", value1, value2, "deviceSize");
            return (Criteria) this;
        }

        public Criteria andDeviceSizeNotBetween(String value1, String value2) {
            addCriterion("DEVICE_SIZE not between", value1, value2, "deviceSize");
            return (Criteria) this;
        }

        public Criteria andDesignStrengthIsNull() {
            addCriterion("DESIGN_STRENGTH is null");
            return (Criteria) this;
        }

        public Criteria andDesignStrengthIsNotNull() {
            addCriterion("DESIGN_STRENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andDesignStrengthEqualTo(String value) {
            addCriterion("DESIGN_STRENGTH =", value, "designStrength");
            return (Criteria) this;
        }

        public Criteria andDesignStrengthNotEqualTo(String value) {
            addCriterion("DESIGN_STRENGTH <>", value, "designStrength");
            return (Criteria) this;
        }

        public Criteria andDesignStrengthGreaterThan(String value) {
            addCriterion("DESIGN_STRENGTH >", value, "designStrength");
            return (Criteria) this;
        }

        public Criteria andDesignStrengthGreaterThanOrEqualTo(String value) {
            addCriterion("DESIGN_STRENGTH >=", value, "designStrength");
            return (Criteria) this;
        }

        public Criteria andDesignStrengthLessThan(String value) {
            addCriterion("DESIGN_STRENGTH <", value, "designStrength");
            return (Criteria) this;
        }

        public Criteria andDesignStrengthLessThanOrEqualTo(String value) {
            addCriterion("DESIGN_STRENGTH <=", value, "designStrength");
            return (Criteria) this;
        }

        public Criteria andDesignStrengthLike(String value) {
            addCriterion("DESIGN_STRENGTH like", value, "designStrength");
            return (Criteria) this;
        }

        public Criteria andDesignStrengthNotLike(String value) {
            addCriterion("DESIGN_STRENGTH not like", value, "designStrength");
            return (Criteria) this;
        }

        public Criteria andDesignStrengthIn(List<String> values) {
            addCriterion("DESIGN_STRENGTH in", values, "designStrength");
            return (Criteria) this;
        }

        public Criteria andDesignStrengthNotIn(List<String> values) {
            addCriterion("DESIGN_STRENGTH not in", values, "designStrength");
            return (Criteria) this;
        }

        public Criteria andDesignStrengthBetween(String value1, String value2) {
            addCriterion("DESIGN_STRENGTH between", value1, value2, "designStrength");
            return (Criteria) this;
        }

        public Criteria andDesignStrengthNotBetween(String value1, String value2) {
            addCriterion("DESIGN_STRENGTH not between", value1, value2, "designStrength");
            return (Criteria) this;
        }

        public Criteria andLoadOneIsNull() {
            addCriterion("LOAD_ONE is null");
            return (Criteria) this;
        }

        public Criteria andLoadOneIsNotNull() {
            addCriterion("LOAD_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andLoadOneEqualTo(Float value) {
            addCriterion("LOAD_ONE =", value, "loadOne");
            return (Criteria) this;
        }

        public Criteria andLoadOneNotEqualTo(Float value) {
            addCriterion("LOAD_ONE <>", value, "loadOne");
            return (Criteria) this;
        }

        public Criteria andLoadOneGreaterThan(Float value) {
            addCriterion("LOAD_ONE >", value, "loadOne");
            return (Criteria) this;
        }

        public Criteria andLoadOneGreaterThanOrEqualTo(Float value) {
            addCriterion("LOAD_ONE >=", value, "loadOne");
            return (Criteria) this;
        }

        public Criteria andLoadOneLessThan(Float value) {
            addCriterion("LOAD_ONE <", value, "loadOne");
            return (Criteria) this;
        }

        public Criteria andLoadOneLessThanOrEqualTo(Float value) {
            addCriterion("LOAD_ONE <=", value, "loadOne");
            return (Criteria) this;
        }

        public Criteria andLoadOneIn(List<Float> values) {
            addCriterion("LOAD_ONE in", values, "loadOne");
            return (Criteria) this;
        }

        public Criteria andLoadOneNotIn(List<Float> values) {
            addCriterion("LOAD_ONE not in", values, "loadOne");
            return (Criteria) this;
        }

        public Criteria andLoadOneBetween(Float value1, Float value2) {
            addCriterion("LOAD_ONE between", value1, value2, "loadOne");
            return (Criteria) this;
        }

        public Criteria andLoadOneNotBetween(Float value1, Float value2) {
            addCriterion("LOAD_ONE not between", value1, value2, "loadOne");
            return (Criteria) this;
        }

        public Criteria andLoadTwoIsNull() {
            addCriterion("LOAD_TWO is null");
            return (Criteria) this;
        }

        public Criteria andLoadTwoIsNotNull() {
            addCriterion("LOAD_TWO is not null");
            return (Criteria) this;
        }

        public Criteria andLoadTwoEqualTo(Float value) {
            addCriterion("LOAD_TWO =", value, "loadTwo");
            return (Criteria) this;
        }

        public Criteria andLoadTwoNotEqualTo(Float value) {
            addCriterion("LOAD_TWO <>", value, "loadTwo");
            return (Criteria) this;
        }

        public Criteria andLoadTwoGreaterThan(Float value) {
            addCriterion("LOAD_TWO >", value, "loadTwo");
            return (Criteria) this;
        }

        public Criteria andLoadTwoGreaterThanOrEqualTo(Float value) {
            addCriterion("LOAD_TWO >=", value, "loadTwo");
            return (Criteria) this;
        }

        public Criteria andLoadTwoLessThan(Float value) {
            addCriterion("LOAD_TWO <", value, "loadTwo");
            return (Criteria) this;
        }

        public Criteria andLoadTwoLessThanOrEqualTo(Float value) {
            addCriterion("LOAD_TWO <=", value, "loadTwo");
            return (Criteria) this;
        }

        public Criteria andLoadTwoIn(List<Float> values) {
            addCriterion("LOAD_TWO in", values, "loadTwo");
            return (Criteria) this;
        }

        public Criteria andLoadTwoNotIn(List<Float> values) {
            addCriterion("LOAD_TWO not in", values, "loadTwo");
            return (Criteria) this;
        }

        public Criteria andLoadTwoBetween(Float value1, Float value2) {
            addCriterion("LOAD_TWO between", value1, value2, "loadTwo");
            return (Criteria) this;
        }

        public Criteria andLoadTwoNotBetween(Float value1, Float value2) {
            addCriterion("LOAD_TWO not between", value1, value2, "loadTwo");
            return (Criteria) this;
        }

        public Criteria andLoadThreeIsNull() {
            addCriterion("LOAD_THREE is null");
            return (Criteria) this;
        }

        public Criteria andLoadThreeIsNotNull() {
            addCriterion("LOAD_THREE is not null");
            return (Criteria) this;
        }

        public Criteria andLoadThreeEqualTo(Float value) {
            addCriterion("LOAD_THREE =", value, "loadThree");
            return (Criteria) this;
        }

        public Criteria andLoadThreeNotEqualTo(Float value) {
            addCriterion("LOAD_THREE <>", value, "loadThree");
            return (Criteria) this;
        }

        public Criteria andLoadThreeGreaterThan(Float value) {
            addCriterion("LOAD_THREE >", value, "loadThree");
            return (Criteria) this;
        }

        public Criteria andLoadThreeGreaterThanOrEqualTo(Float value) {
            addCriterion("LOAD_THREE >=", value, "loadThree");
            return (Criteria) this;
        }

        public Criteria andLoadThreeLessThan(Float value) {
            addCriterion("LOAD_THREE <", value, "loadThree");
            return (Criteria) this;
        }

        public Criteria andLoadThreeLessThanOrEqualTo(Float value) {
            addCriterion("LOAD_THREE <=", value, "loadThree");
            return (Criteria) this;
        }

        public Criteria andLoadThreeIn(List<Float> values) {
            addCriterion("LOAD_THREE in", values, "loadThree");
            return (Criteria) this;
        }

        public Criteria andLoadThreeNotIn(List<Float> values) {
            addCriterion("LOAD_THREE not in", values, "loadThree");
            return (Criteria) this;
        }

        public Criteria andLoadThreeBetween(Float value1, Float value2) {
            addCriterion("LOAD_THREE between", value1, value2, "loadThree");
            return (Criteria) this;
        }

        public Criteria andLoadThreeNotBetween(Float value1, Float value2) {
            addCriterion("LOAD_THREE not between", value1, value2, "loadThree");
            return (Criteria) this;
        }

        public Criteria andStrengthOneIsNull() {
            addCriterion("STRENGTH_ONE is null");
            return (Criteria) this;
        }

        public Criteria andStrengthOneIsNotNull() {
            addCriterion("STRENGTH_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andStrengthOneEqualTo(Float value) {
            addCriterion("STRENGTH_ONE =", value, "strengthOne");
            return (Criteria) this;
        }

        public Criteria andStrengthOneNotEqualTo(Float value) {
            addCriterion("STRENGTH_ONE <>", value, "strengthOne");
            return (Criteria) this;
        }

        public Criteria andStrengthOneGreaterThan(Float value) {
            addCriterion("STRENGTH_ONE >", value, "strengthOne");
            return (Criteria) this;
        }

        public Criteria andStrengthOneGreaterThanOrEqualTo(Float value) {
            addCriterion("STRENGTH_ONE >=", value, "strengthOne");
            return (Criteria) this;
        }

        public Criteria andStrengthOneLessThan(Float value) {
            addCriterion("STRENGTH_ONE <", value, "strengthOne");
            return (Criteria) this;
        }

        public Criteria andStrengthOneLessThanOrEqualTo(Float value) {
            addCriterion("STRENGTH_ONE <=", value, "strengthOne");
            return (Criteria) this;
        }

        public Criteria andStrengthOneIn(List<Float> values) {
            addCriterion("STRENGTH_ONE in", values, "strengthOne");
            return (Criteria) this;
        }

        public Criteria andStrengthOneNotIn(List<Float> values) {
            addCriterion("STRENGTH_ONE not in", values, "strengthOne");
            return (Criteria) this;
        }

        public Criteria andStrengthOneBetween(Float value1, Float value2) {
            addCriterion("STRENGTH_ONE between", value1, value2, "strengthOne");
            return (Criteria) this;
        }

        public Criteria andStrengthOneNotBetween(Float value1, Float value2) {
            addCriterion("STRENGTH_ONE not between", value1, value2, "strengthOne");
            return (Criteria) this;
        }

        public Criteria andStrengthTwoIsNull() {
            addCriterion("STRENGTH_TWO is null");
            return (Criteria) this;
        }

        public Criteria andStrengthTwoIsNotNull() {
            addCriterion("STRENGTH_TWO is not null");
            return (Criteria) this;
        }

        public Criteria andStrengthTwoEqualTo(Float value) {
            addCriterion("STRENGTH_TWO =", value, "strengthTwo");
            return (Criteria) this;
        }

        public Criteria andStrengthTwoNotEqualTo(Float value) {
            addCriterion("STRENGTH_TWO <>", value, "strengthTwo");
            return (Criteria) this;
        }

        public Criteria andStrengthTwoGreaterThan(Float value) {
            addCriterion("STRENGTH_TWO >", value, "strengthTwo");
            return (Criteria) this;
        }

        public Criteria andStrengthTwoGreaterThanOrEqualTo(Float value) {
            addCriterion("STRENGTH_TWO >=", value, "strengthTwo");
            return (Criteria) this;
        }

        public Criteria andStrengthTwoLessThan(Float value) {
            addCriterion("STRENGTH_TWO <", value, "strengthTwo");
            return (Criteria) this;
        }

        public Criteria andStrengthTwoLessThanOrEqualTo(Float value) {
            addCriterion("STRENGTH_TWO <=", value, "strengthTwo");
            return (Criteria) this;
        }

        public Criteria andStrengthTwoIn(List<Float> values) {
            addCriterion("STRENGTH_TWO in", values, "strengthTwo");
            return (Criteria) this;
        }

        public Criteria andStrengthTwoNotIn(List<Float> values) {
            addCriterion("STRENGTH_TWO not in", values, "strengthTwo");
            return (Criteria) this;
        }

        public Criteria andStrengthTwoBetween(Float value1, Float value2) {
            addCriterion("STRENGTH_TWO between", value1, value2, "strengthTwo");
            return (Criteria) this;
        }

        public Criteria andStrengthTwoNotBetween(Float value1, Float value2) {
            addCriterion("STRENGTH_TWO not between", value1, value2, "strengthTwo");
            return (Criteria) this;
        }

        public Criteria andStrengthThreeIsNull() {
            addCriterion("STRENGTH_THREE is null");
            return (Criteria) this;
        }

        public Criteria andStrengthThreeIsNotNull() {
            addCriterion("STRENGTH_THREE is not null");
            return (Criteria) this;
        }

        public Criteria andStrengthThreeEqualTo(Float value) {
            addCriterion("STRENGTH_THREE =", value, "strengthThree");
            return (Criteria) this;
        }

        public Criteria andStrengthThreeNotEqualTo(Float value) {
            addCriterion("STRENGTH_THREE <>", value, "strengthThree");
            return (Criteria) this;
        }

        public Criteria andStrengthThreeGreaterThan(Float value) {
            addCriterion("STRENGTH_THREE >", value, "strengthThree");
            return (Criteria) this;
        }

        public Criteria andStrengthThreeGreaterThanOrEqualTo(Float value) {
            addCriterion("STRENGTH_THREE >=", value, "strengthThree");
            return (Criteria) this;
        }

        public Criteria andStrengthThreeLessThan(Float value) {
            addCriterion("STRENGTH_THREE <", value, "strengthThree");
            return (Criteria) this;
        }

        public Criteria andStrengthThreeLessThanOrEqualTo(Float value) {
            addCriterion("STRENGTH_THREE <=", value, "strengthThree");
            return (Criteria) this;
        }

        public Criteria andStrengthThreeIn(List<Float> values) {
            addCriterion("STRENGTH_THREE in", values, "strengthThree");
            return (Criteria) this;
        }

        public Criteria andStrengthThreeNotIn(List<Float> values) {
            addCriterion("STRENGTH_THREE not in", values, "strengthThree");
            return (Criteria) this;
        }

        public Criteria andStrengthThreeBetween(Float value1, Float value2) {
            addCriterion("STRENGTH_THREE between", value1, value2, "strengthThree");
            return (Criteria) this;
        }

        public Criteria andStrengthThreeNotBetween(Float value1, Float value2) {
            addCriterion("STRENGTH_THREE not between", value1, value2, "strengthThree");
            return (Criteria) this;
        }

        public Criteria andStrengthValueIsNull() {
            addCriterion("STRENGTH_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andStrengthValueIsNotNull() {
            addCriterion("STRENGTH_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andStrengthValueEqualTo(Float value) {
            addCriterion("STRENGTH_VALUE =", value, "strengthValue");
            return (Criteria) this;
        }

        public Criteria andStrengthValueNotEqualTo(Float value) {
            addCriterion("STRENGTH_VALUE <>", value, "strengthValue");
            return (Criteria) this;
        }

        public Criteria andStrengthValueGreaterThan(Float value) {
            addCriterion("STRENGTH_VALUE >", value, "strengthValue");
            return (Criteria) this;
        }

        public Criteria andStrengthValueGreaterThanOrEqualTo(Float value) {
            addCriterion("STRENGTH_VALUE >=", value, "strengthValue");
            return (Criteria) this;
        }

        public Criteria andStrengthValueLessThan(Float value) {
            addCriterion("STRENGTH_VALUE <", value, "strengthValue");
            return (Criteria) this;
        }

        public Criteria andStrengthValueLessThanOrEqualTo(Float value) {
            addCriterion("STRENGTH_VALUE <=", value, "strengthValue");
            return (Criteria) this;
        }

        public Criteria andStrengthValueIn(List<Float> values) {
            addCriterion("STRENGTH_VALUE in", values, "strengthValue");
            return (Criteria) this;
        }

        public Criteria andStrengthValueNotIn(List<Float> values) {
            addCriterion("STRENGTH_VALUE not in", values, "strengthValue");
            return (Criteria) this;
        }

        public Criteria andStrengthValueBetween(Float value1, Float value2) {
            addCriterion("STRENGTH_VALUE between", value1, value2, "strengthValue");
            return (Criteria) this;
        }

        public Criteria andStrengthValueNotBetween(Float value1, Float value2) {
            addCriterion("STRENGTH_VALUE not between", value1, value2, "strengthValue");
            return (Criteria) this;
        }

        public Criteria andQualifiedIsNull() {
            addCriterion("QUALIFIED is null");
            return (Criteria) this;
        }

        public Criteria andQualifiedIsNotNull() {
            addCriterion("QUALIFIED is not null");
            return (Criteria) this;
        }

        public Criteria andQualifiedEqualTo(Integer value) {
            addCriterion("QUALIFIED =", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedNotEqualTo(Integer value) {
            addCriterion("QUALIFIED <>", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedGreaterThan(Integer value) {
            addCriterion("QUALIFIED >", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUALIFIED >=", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedLessThan(Integer value) {
            addCriterion("QUALIFIED <", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedLessThanOrEqualTo(Integer value) {
            addCriterion("QUALIFIED <=", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedIn(List<Integer> values) {
            addCriterion("QUALIFIED in", values, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedNotIn(List<Integer> values) {
            addCriterion("QUALIFIED not in", values, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedBetween(Integer value1, Integer value2) {
            addCriterion("QUALIFIED between", value1, value2, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("QUALIFIED not between", value1, value2, "qualified");
            return (Criteria) this;
        }

        public Criteria andRemardIsNull() {
            addCriterion("REMARD is null");
            return (Criteria) this;
        }

        public Criteria andRemardIsNotNull() {
            addCriterion("REMARD is not null");
            return (Criteria) this;
        }

        public Criteria andRemardEqualTo(String value) {
            addCriterion("REMARD =", value, "remard");
            return (Criteria) this;
        }

        public Criteria andRemardNotEqualTo(String value) {
            addCriterion("REMARD <>", value, "remard");
            return (Criteria) this;
        }

        public Criteria andRemardGreaterThan(String value) {
            addCriterion("REMARD >", value, "remard");
            return (Criteria) this;
        }

        public Criteria andRemardGreaterThanOrEqualTo(String value) {
            addCriterion("REMARD >=", value, "remard");
            return (Criteria) this;
        }

        public Criteria andRemardLessThan(String value) {
            addCriterion("REMARD <", value, "remard");
            return (Criteria) this;
        }

        public Criteria andRemardLessThanOrEqualTo(String value) {
            addCriterion("REMARD <=", value, "remard");
            return (Criteria) this;
        }

        public Criteria andRemardLike(String value) {
            addCriterion("REMARD like", value, "remard");
            return (Criteria) this;
        }

        public Criteria andRemardNotLike(String value) {
            addCriterion("REMARD not like", value, "remard");
            return (Criteria) this;
        }

        public Criteria andRemardIn(List<String> values) {
            addCriterion("REMARD in", values, "remard");
            return (Criteria) this;
        }

        public Criteria andRemardNotIn(List<String> values) {
            addCriterion("REMARD not in", values, "remard");
            return (Criteria) this;
        }

        public Criteria andRemardBetween(String value1, String value2) {
            addCriterion("REMARD between", value1, value2, "remard");
            return (Criteria) this;
        }

        public Criteria andRemardNotBetween(String value1, String value2) {
            addCriterion("REMARD not between", value1, value2, "remard");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNull() {
            addCriterion("DELETE is null");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNotNull() {
            addCriterion("DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteEqualTo(Integer value) {
            addCriterion("DELETE =", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotEqualTo(Integer value) {
            addCriterion("DELETE <>", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThan(Integer value) {
            addCriterion("DELETE >", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELETE >=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThan(Integer value) {
            addCriterion("DELETE <", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("DELETE <=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteIn(List<Integer> values) {
            addCriterion("DELETE in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotIn(List<Integer> values) {
            addCriterion("DELETE not in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteBetween(Integer value1, Integer value2) {
            addCriterion("DELETE between", value1, value2, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("DELETE not between", value1, value2, "delete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}