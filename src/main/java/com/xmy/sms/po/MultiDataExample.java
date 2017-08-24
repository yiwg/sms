package com.xmy.sms.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MultiDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MultiDataExample() {
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

        public Criteria andRebarNumIsNull() {
            addCriterion("REBAR_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRebarNumIsNotNull() {
            addCriterion("REBAR_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRebarNumEqualTo(String value) {
            addCriterion("REBAR_NUM =", value, "rebarNum");
            return (Criteria) this;
        }

        public Criteria andRebarNumNotEqualTo(String value) {
            addCriterion("REBAR_NUM <>", value, "rebarNum");
            return (Criteria) this;
        }

        public Criteria andRebarNumGreaterThan(String value) {
            addCriterion("REBAR_NUM >", value, "rebarNum");
            return (Criteria) this;
        }

        public Criteria andRebarNumGreaterThanOrEqualTo(String value) {
            addCriterion("REBAR_NUM >=", value, "rebarNum");
            return (Criteria) this;
        }

        public Criteria andRebarNumLessThan(String value) {
            addCriterion("REBAR_NUM <", value, "rebarNum");
            return (Criteria) this;
        }

        public Criteria andRebarNumLessThanOrEqualTo(String value) {
            addCriterion("REBAR_NUM <=", value, "rebarNum");
            return (Criteria) this;
        }

        public Criteria andRebarNumLike(String value) {
            addCriterion("REBAR_NUM like", value, "rebarNum");
            return (Criteria) this;
        }

        public Criteria andRebarNumNotLike(String value) {
            addCriterion("REBAR_NUM not like", value, "rebarNum");
            return (Criteria) this;
        }

        public Criteria andRebarNumIn(List<String> values) {
            addCriterion("REBAR_NUM in", values, "rebarNum");
            return (Criteria) this;
        }

        public Criteria andRebarNumNotIn(List<String> values) {
            addCriterion("REBAR_NUM not in", values, "rebarNum");
            return (Criteria) this;
        }

        public Criteria andRebarNumBetween(String value1, String value2) {
            addCriterion("REBAR_NUM between", value1, value2, "rebarNum");
            return (Criteria) this;
        }

        public Criteria andRebarNumNotBetween(String value1, String value2) {
            addCriterion("REBAR_NUM not between", value1, value2, "rebarNum");
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

        public Criteria andDiameterIsNull() {
            addCriterion("DIAMETER is null");
            return (Criteria) this;
        }

        public Criteria andDiameterIsNotNull() {
            addCriterion("DIAMETER is not null");
            return (Criteria) this;
        }

        public Criteria andDiameterEqualTo(Float value) {
            addCriterion("DIAMETER =", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterNotEqualTo(Float value) {
            addCriterion("DIAMETER <>", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterGreaterThan(Float value) {
            addCriterion("DIAMETER >", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterGreaterThanOrEqualTo(Float value) {
            addCriterion("DIAMETER >=", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterLessThan(Float value) {
            addCriterion("DIAMETER <", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterLessThanOrEqualTo(Float value) {
            addCriterion("DIAMETER <=", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterIn(List<Float> values) {
            addCriterion("DIAMETER in", values, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterNotIn(List<Float> values) {
            addCriterion("DIAMETER not in", values, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterBetween(Float value1, Float value2) {
            addCriterion("DIAMETER between", value1, value2, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterNotBetween(Float value1, Float value2) {
            addCriterion("DIAMETER not between", value1, value2, "diameter");
            return (Criteria) this;
        }

        public Criteria andYieldpowerOneIsNull() {
            addCriterion("YIELDPOWER_ONE is null");
            return (Criteria) this;
        }

        public Criteria andYieldpowerOneIsNotNull() {
            addCriterion("YIELDPOWER_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andYieldpowerOneEqualTo(Float value) {
            addCriterion("YIELDPOWER_ONE =", value, "yieldpowerOne");
            return (Criteria) this;
        }

        public Criteria andYieldpowerOneNotEqualTo(Float value) {
            addCriterion("YIELDPOWER_ONE <>", value, "yieldpowerOne");
            return (Criteria) this;
        }

        public Criteria andYieldpowerOneGreaterThan(Float value) {
            addCriterion("YIELDPOWER_ONE >", value, "yieldpowerOne");
            return (Criteria) this;
        }

        public Criteria andYieldpowerOneGreaterThanOrEqualTo(Float value) {
            addCriterion("YIELDPOWER_ONE >=", value, "yieldpowerOne");
            return (Criteria) this;
        }

        public Criteria andYieldpowerOneLessThan(Float value) {
            addCriterion("YIELDPOWER_ONE <", value, "yieldpowerOne");
            return (Criteria) this;
        }

        public Criteria andYieldpowerOneLessThanOrEqualTo(Float value) {
            addCriterion("YIELDPOWER_ONE <=", value, "yieldpowerOne");
            return (Criteria) this;
        }

        public Criteria andYieldpowerOneIn(List<Float> values) {
            addCriterion("YIELDPOWER_ONE in", values, "yieldpowerOne");
            return (Criteria) this;
        }

        public Criteria andYieldpowerOneNotIn(List<Float> values) {
            addCriterion("YIELDPOWER_ONE not in", values, "yieldpowerOne");
            return (Criteria) this;
        }

        public Criteria andYieldpowerOneBetween(Float value1, Float value2) {
            addCriterion("YIELDPOWER_ONE between", value1, value2, "yieldpowerOne");
            return (Criteria) this;
        }

        public Criteria andYieldpowerOneNotBetween(Float value1, Float value2) {
            addCriterion("YIELDPOWER_ONE not between", value1, value2, "yieldpowerOne");
            return (Criteria) this;
        }

        public Criteria andYieldpowerTwoIsNull() {
            addCriterion("YIELDPOWER_TWO is null");
            return (Criteria) this;
        }

        public Criteria andYieldpowerTwoIsNotNull() {
            addCriterion("YIELDPOWER_TWO is not null");
            return (Criteria) this;
        }

        public Criteria andYieldpowerTwoEqualTo(Float value) {
            addCriterion("YIELDPOWER_TWO =", value, "yieldpowerTwo");
            return (Criteria) this;
        }

        public Criteria andYieldpowerTwoNotEqualTo(Float value) {
            addCriterion("YIELDPOWER_TWO <>", value, "yieldpowerTwo");
            return (Criteria) this;
        }

        public Criteria andYieldpowerTwoGreaterThan(Float value) {
            addCriterion("YIELDPOWER_TWO >", value, "yieldpowerTwo");
            return (Criteria) this;
        }

        public Criteria andYieldpowerTwoGreaterThanOrEqualTo(Float value) {
            addCriterion("YIELDPOWER_TWO >=", value, "yieldpowerTwo");
            return (Criteria) this;
        }

        public Criteria andYieldpowerTwoLessThan(Float value) {
            addCriterion("YIELDPOWER_TWO <", value, "yieldpowerTwo");
            return (Criteria) this;
        }

        public Criteria andYieldpowerTwoLessThanOrEqualTo(Float value) {
            addCriterion("YIELDPOWER_TWO <=", value, "yieldpowerTwo");
            return (Criteria) this;
        }

        public Criteria andYieldpowerTwoIn(List<Float> values) {
            addCriterion("YIELDPOWER_TWO in", values, "yieldpowerTwo");
            return (Criteria) this;
        }

        public Criteria andYieldpowerTwoNotIn(List<Float> values) {
            addCriterion("YIELDPOWER_TWO not in", values, "yieldpowerTwo");
            return (Criteria) this;
        }

        public Criteria andYieldpowerTwoBetween(Float value1, Float value2) {
            addCriterion("YIELDPOWER_TWO between", value1, value2, "yieldpowerTwo");
            return (Criteria) this;
        }

        public Criteria andYieldpowerTwoNotBetween(Float value1, Float value2) {
            addCriterion("YIELDPOWER_TWO not between", value1, value2, "yieldpowerTwo");
            return (Criteria) this;
        }

        public Criteria andYieldpowerThreeIsNull() {
            addCriterion("YIELDPOWER_THREE is null");
            return (Criteria) this;
        }

        public Criteria andYieldpowerThreeIsNotNull() {
            addCriterion("YIELDPOWER_THREE is not null");
            return (Criteria) this;
        }

        public Criteria andYieldpowerThreeEqualTo(Float value) {
            addCriterion("YIELDPOWER_THREE =", value, "yieldpowerThree");
            return (Criteria) this;
        }

        public Criteria andYieldpowerThreeNotEqualTo(Float value) {
            addCriterion("YIELDPOWER_THREE <>", value, "yieldpowerThree");
            return (Criteria) this;
        }

        public Criteria andYieldpowerThreeGreaterThan(Float value) {
            addCriterion("YIELDPOWER_THREE >", value, "yieldpowerThree");
            return (Criteria) this;
        }

        public Criteria andYieldpowerThreeGreaterThanOrEqualTo(Float value) {
            addCriterion("YIELDPOWER_THREE >=", value, "yieldpowerThree");
            return (Criteria) this;
        }

        public Criteria andYieldpowerThreeLessThan(Float value) {
            addCriterion("YIELDPOWER_THREE <", value, "yieldpowerThree");
            return (Criteria) this;
        }

        public Criteria andYieldpowerThreeLessThanOrEqualTo(Float value) {
            addCriterion("YIELDPOWER_THREE <=", value, "yieldpowerThree");
            return (Criteria) this;
        }

        public Criteria andYieldpowerThreeIn(List<Float> values) {
            addCriterion("YIELDPOWER_THREE in", values, "yieldpowerThree");
            return (Criteria) this;
        }

        public Criteria andYieldpowerThreeNotIn(List<Float> values) {
            addCriterion("YIELDPOWER_THREE not in", values, "yieldpowerThree");
            return (Criteria) this;
        }

        public Criteria andYieldpowerThreeBetween(Float value1, Float value2) {
            addCriterion("YIELDPOWER_THREE between", value1, value2, "yieldpowerThree");
            return (Criteria) this;
        }

        public Criteria andYieldpowerThreeNotBetween(Float value1, Float value2) {
            addCriterion("YIELDPOWER_THREE not between", value1, value2, "yieldpowerThree");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthOneIsNull() {
            addCriterion("YIELDSTRENGTH_ONE is null");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthOneIsNotNull() {
            addCriterion("YIELDSTRENGTH_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthOneEqualTo(Float value) {
            addCriterion("YIELDSTRENGTH_ONE =", value, "yieldstrengthOne");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthOneNotEqualTo(Float value) {
            addCriterion("YIELDSTRENGTH_ONE <>", value, "yieldstrengthOne");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthOneGreaterThan(Float value) {
            addCriterion("YIELDSTRENGTH_ONE >", value, "yieldstrengthOne");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthOneGreaterThanOrEqualTo(Float value) {
            addCriterion("YIELDSTRENGTH_ONE >=", value, "yieldstrengthOne");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthOneLessThan(Float value) {
            addCriterion("YIELDSTRENGTH_ONE <", value, "yieldstrengthOne");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthOneLessThanOrEqualTo(Float value) {
            addCriterion("YIELDSTRENGTH_ONE <=", value, "yieldstrengthOne");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthOneIn(List<Float> values) {
            addCriterion("YIELDSTRENGTH_ONE in", values, "yieldstrengthOne");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthOneNotIn(List<Float> values) {
            addCriterion("YIELDSTRENGTH_ONE not in", values, "yieldstrengthOne");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthOneBetween(Float value1, Float value2) {
            addCriterion("YIELDSTRENGTH_ONE between", value1, value2, "yieldstrengthOne");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthOneNotBetween(Float value1, Float value2) {
            addCriterion("YIELDSTRENGTH_ONE not between", value1, value2, "yieldstrengthOne");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthTwoIsNull() {
            addCriterion("YIELDSTRENGTH_TWO is null");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthTwoIsNotNull() {
            addCriterion("YIELDSTRENGTH_TWO is not null");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthTwoEqualTo(Float value) {
            addCriterion("YIELDSTRENGTH_TWO =", value, "yieldstrengthTwo");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthTwoNotEqualTo(Float value) {
            addCriterion("YIELDSTRENGTH_TWO <>", value, "yieldstrengthTwo");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthTwoGreaterThan(Float value) {
            addCriterion("YIELDSTRENGTH_TWO >", value, "yieldstrengthTwo");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthTwoGreaterThanOrEqualTo(Float value) {
            addCriterion("YIELDSTRENGTH_TWO >=", value, "yieldstrengthTwo");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthTwoLessThan(Float value) {
            addCriterion("YIELDSTRENGTH_TWO <", value, "yieldstrengthTwo");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthTwoLessThanOrEqualTo(Float value) {
            addCriterion("YIELDSTRENGTH_TWO <=", value, "yieldstrengthTwo");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthTwoIn(List<Float> values) {
            addCriterion("YIELDSTRENGTH_TWO in", values, "yieldstrengthTwo");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthTwoNotIn(List<Float> values) {
            addCriterion("YIELDSTRENGTH_TWO not in", values, "yieldstrengthTwo");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthTwoBetween(Float value1, Float value2) {
            addCriterion("YIELDSTRENGTH_TWO between", value1, value2, "yieldstrengthTwo");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthTwoNotBetween(Float value1, Float value2) {
            addCriterion("YIELDSTRENGTH_TWO not between", value1, value2, "yieldstrengthTwo");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthThreeIsNull() {
            addCriterion("YIELDSTRENGTH_THREE is null");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthThreeIsNotNull() {
            addCriterion("YIELDSTRENGTH_THREE is not null");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthThreeEqualTo(Float value) {
            addCriterion("YIELDSTRENGTH_THREE =", value, "yieldstrengthThree");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthThreeNotEqualTo(Float value) {
            addCriterion("YIELDSTRENGTH_THREE <>", value, "yieldstrengthThree");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthThreeGreaterThan(Float value) {
            addCriterion("YIELDSTRENGTH_THREE >", value, "yieldstrengthThree");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthThreeGreaterThanOrEqualTo(Float value) {
            addCriterion("YIELDSTRENGTH_THREE >=", value, "yieldstrengthThree");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthThreeLessThan(Float value) {
            addCriterion("YIELDSTRENGTH_THREE <", value, "yieldstrengthThree");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthThreeLessThanOrEqualTo(Float value) {
            addCriterion("YIELDSTRENGTH_THREE <=", value, "yieldstrengthThree");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthThreeIn(List<Float> values) {
            addCriterion("YIELDSTRENGTH_THREE in", values, "yieldstrengthThree");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthThreeNotIn(List<Float> values) {
            addCriterion("YIELDSTRENGTH_THREE not in", values, "yieldstrengthThree");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthThreeBetween(Float value1, Float value2) {
            addCriterion("YIELDSTRENGTH_THREE between", value1, value2, "yieldstrengthThree");
            return (Criteria) this;
        }

        public Criteria andYieldstrengthThreeNotBetween(Float value1, Float value2) {
            addCriterion("YIELDSTRENGTH_THREE not between", value1, value2, "yieldstrengthThree");
            return (Criteria) this;
        }

        public Criteria andTensilepowerOneIsNull() {
            addCriterion("TENSILEPOWER_ONE is null");
            return (Criteria) this;
        }

        public Criteria andTensilepowerOneIsNotNull() {
            addCriterion("TENSILEPOWER_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andTensilepowerOneEqualTo(Float value) {
            addCriterion("TENSILEPOWER_ONE =", value, "tensilepowerOne");
            return (Criteria) this;
        }

        public Criteria andTensilepowerOneNotEqualTo(Float value) {
            addCriterion("TENSILEPOWER_ONE <>", value, "tensilepowerOne");
            return (Criteria) this;
        }

        public Criteria andTensilepowerOneGreaterThan(Float value) {
            addCriterion("TENSILEPOWER_ONE >", value, "tensilepowerOne");
            return (Criteria) this;
        }

        public Criteria andTensilepowerOneGreaterThanOrEqualTo(Float value) {
            addCriterion("TENSILEPOWER_ONE >=", value, "tensilepowerOne");
            return (Criteria) this;
        }

        public Criteria andTensilepowerOneLessThan(Float value) {
            addCriterion("TENSILEPOWER_ONE <", value, "tensilepowerOne");
            return (Criteria) this;
        }

        public Criteria andTensilepowerOneLessThanOrEqualTo(Float value) {
            addCriterion("TENSILEPOWER_ONE <=", value, "tensilepowerOne");
            return (Criteria) this;
        }

        public Criteria andTensilepowerOneIn(List<Float> values) {
            addCriterion("TENSILEPOWER_ONE in", values, "tensilepowerOne");
            return (Criteria) this;
        }

        public Criteria andTensilepowerOneNotIn(List<Float> values) {
            addCriterion("TENSILEPOWER_ONE not in", values, "tensilepowerOne");
            return (Criteria) this;
        }

        public Criteria andTensilepowerOneBetween(Float value1, Float value2) {
            addCriterion("TENSILEPOWER_ONE between", value1, value2, "tensilepowerOne");
            return (Criteria) this;
        }

        public Criteria andTensilepowerOneNotBetween(Float value1, Float value2) {
            addCriterion("TENSILEPOWER_ONE not between", value1, value2, "tensilepowerOne");
            return (Criteria) this;
        }

        public Criteria andTensilepowerTwoIsNull() {
            addCriterion("TENSILEPOWER_TWO is null");
            return (Criteria) this;
        }

        public Criteria andTensilepowerTwoIsNotNull() {
            addCriterion("TENSILEPOWER_TWO is not null");
            return (Criteria) this;
        }

        public Criteria andTensilepowerTwoEqualTo(Float value) {
            addCriterion("TENSILEPOWER_TWO =", value, "tensilepowerTwo");
            return (Criteria) this;
        }

        public Criteria andTensilepowerTwoNotEqualTo(Float value) {
            addCriterion("TENSILEPOWER_TWO <>", value, "tensilepowerTwo");
            return (Criteria) this;
        }

        public Criteria andTensilepowerTwoGreaterThan(Float value) {
            addCriterion("TENSILEPOWER_TWO >", value, "tensilepowerTwo");
            return (Criteria) this;
        }

        public Criteria andTensilepowerTwoGreaterThanOrEqualTo(Float value) {
            addCriterion("TENSILEPOWER_TWO >=", value, "tensilepowerTwo");
            return (Criteria) this;
        }

        public Criteria andTensilepowerTwoLessThan(Float value) {
            addCriterion("TENSILEPOWER_TWO <", value, "tensilepowerTwo");
            return (Criteria) this;
        }

        public Criteria andTensilepowerTwoLessThanOrEqualTo(Float value) {
            addCriterion("TENSILEPOWER_TWO <=", value, "tensilepowerTwo");
            return (Criteria) this;
        }

        public Criteria andTensilepowerTwoIn(List<Float> values) {
            addCriterion("TENSILEPOWER_TWO in", values, "tensilepowerTwo");
            return (Criteria) this;
        }

        public Criteria andTensilepowerTwoNotIn(List<Float> values) {
            addCriterion("TENSILEPOWER_TWO not in", values, "tensilepowerTwo");
            return (Criteria) this;
        }

        public Criteria andTensilepowerTwoBetween(Float value1, Float value2) {
            addCriterion("TENSILEPOWER_TWO between", value1, value2, "tensilepowerTwo");
            return (Criteria) this;
        }

        public Criteria andTensilepowerTwoNotBetween(Float value1, Float value2) {
            addCriterion("TENSILEPOWER_TWO not between", value1, value2, "tensilepowerTwo");
            return (Criteria) this;
        }

        public Criteria andTensilepowerThreeIsNull() {
            addCriterion("TENSILEPOWER_THREE is null");
            return (Criteria) this;
        }

        public Criteria andTensilepowerThreeIsNotNull() {
            addCriterion("TENSILEPOWER_THREE is not null");
            return (Criteria) this;
        }

        public Criteria andTensilepowerThreeEqualTo(Float value) {
            addCriterion("TENSILEPOWER_THREE =", value, "tensilepowerThree");
            return (Criteria) this;
        }

        public Criteria andTensilepowerThreeNotEqualTo(Float value) {
            addCriterion("TENSILEPOWER_THREE <>", value, "tensilepowerThree");
            return (Criteria) this;
        }

        public Criteria andTensilepowerThreeGreaterThan(Float value) {
            addCriterion("TENSILEPOWER_THREE >", value, "tensilepowerThree");
            return (Criteria) this;
        }

        public Criteria andTensilepowerThreeGreaterThanOrEqualTo(Float value) {
            addCriterion("TENSILEPOWER_THREE >=", value, "tensilepowerThree");
            return (Criteria) this;
        }

        public Criteria andTensilepowerThreeLessThan(Float value) {
            addCriterion("TENSILEPOWER_THREE <", value, "tensilepowerThree");
            return (Criteria) this;
        }

        public Criteria andTensilepowerThreeLessThanOrEqualTo(Float value) {
            addCriterion("TENSILEPOWER_THREE <=", value, "tensilepowerThree");
            return (Criteria) this;
        }

        public Criteria andTensilepowerThreeIn(List<Float> values) {
            addCriterion("TENSILEPOWER_THREE in", values, "tensilepowerThree");
            return (Criteria) this;
        }

        public Criteria andTensilepowerThreeNotIn(List<Float> values) {
            addCriterion("TENSILEPOWER_THREE not in", values, "tensilepowerThree");
            return (Criteria) this;
        }

        public Criteria andTensilepowerThreeBetween(Float value1, Float value2) {
            addCriterion("TENSILEPOWER_THREE between", value1, value2, "tensilepowerThree");
            return (Criteria) this;
        }

        public Criteria andTensilepowerThreeNotBetween(Float value1, Float value2) {
            addCriterion("TENSILEPOWER_THREE not between", value1, value2, "tensilepowerThree");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthOneIsNull() {
            addCriterion("TENSILESTRENGTH_ONE is null");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthOneIsNotNull() {
            addCriterion("TENSILESTRENGTH_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthOneEqualTo(Float value) {
            addCriterion("TENSILESTRENGTH_ONE =", value, "tensilestrengthOne");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthOneNotEqualTo(Float value) {
            addCriterion("TENSILESTRENGTH_ONE <>", value, "tensilestrengthOne");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthOneGreaterThan(Float value) {
            addCriterion("TENSILESTRENGTH_ONE >", value, "tensilestrengthOne");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthOneGreaterThanOrEqualTo(Float value) {
            addCriterion("TENSILESTRENGTH_ONE >=", value, "tensilestrengthOne");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthOneLessThan(Float value) {
            addCriterion("TENSILESTRENGTH_ONE <", value, "tensilestrengthOne");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthOneLessThanOrEqualTo(Float value) {
            addCriterion("TENSILESTRENGTH_ONE <=", value, "tensilestrengthOne");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthOneIn(List<Float> values) {
            addCriterion("TENSILESTRENGTH_ONE in", values, "tensilestrengthOne");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthOneNotIn(List<Float> values) {
            addCriterion("TENSILESTRENGTH_ONE not in", values, "tensilestrengthOne");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthOneBetween(Float value1, Float value2) {
            addCriterion("TENSILESTRENGTH_ONE between", value1, value2, "tensilestrengthOne");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthOneNotBetween(Float value1, Float value2) {
            addCriterion("TENSILESTRENGTH_ONE not between", value1, value2, "tensilestrengthOne");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthTwoIsNull() {
            addCriterion("TENSILESTRENGTH_TWO is null");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthTwoIsNotNull() {
            addCriterion("TENSILESTRENGTH_TWO is not null");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthTwoEqualTo(Float value) {
            addCriterion("TENSILESTRENGTH_TWO =", value, "tensilestrengthTwo");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthTwoNotEqualTo(Float value) {
            addCriterion("TENSILESTRENGTH_TWO <>", value, "tensilestrengthTwo");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthTwoGreaterThan(Float value) {
            addCriterion("TENSILESTRENGTH_TWO >", value, "tensilestrengthTwo");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthTwoGreaterThanOrEqualTo(Float value) {
            addCriterion("TENSILESTRENGTH_TWO >=", value, "tensilestrengthTwo");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthTwoLessThan(Float value) {
            addCriterion("TENSILESTRENGTH_TWO <", value, "tensilestrengthTwo");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthTwoLessThanOrEqualTo(Float value) {
            addCriterion("TENSILESTRENGTH_TWO <=", value, "tensilestrengthTwo");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthTwoIn(List<Float> values) {
            addCriterion("TENSILESTRENGTH_TWO in", values, "tensilestrengthTwo");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthTwoNotIn(List<Float> values) {
            addCriterion("TENSILESTRENGTH_TWO not in", values, "tensilestrengthTwo");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthTwoBetween(Float value1, Float value2) {
            addCriterion("TENSILESTRENGTH_TWO between", value1, value2, "tensilestrengthTwo");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthTwoNotBetween(Float value1, Float value2) {
            addCriterion("TENSILESTRENGTH_TWO not between", value1, value2, "tensilestrengthTwo");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthThreeIsNull() {
            addCriterion("TENSILESTRENGTH_THREE is null");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthThreeIsNotNull() {
            addCriterion("TENSILESTRENGTH_THREE is not null");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthThreeEqualTo(Float value) {
            addCriterion("TENSILESTRENGTH_THREE =", value, "tensilestrengthThree");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthThreeNotEqualTo(Float value) {
            addCriterion("TENSILESTRENGTH_THREE <>", value, "tensilestrengthThree");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthThreeGreaterThan(Float value) {
            addCriterion("TENSILESTRENGTH_THREE >", value, "tensilestrengthThree");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthThreeGreaterThanOrEqualTo(Float value) {
            addCriterion("TENSILESTRENGTH_THREE >=", value, "tensilestrengthThree");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthThreeLessThan(Float value) {
            addCriterion("TENSILESTRENGTH_THREE <", value, "tensilestrengthThree");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthThreeLessThanOrEqualTo(Float value) {
            addCriterion("TENSILESTRENGTH_THREE <=", value, "tensilestrengthThree");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthThreeIn(List<Float> values) {
            addCriterion("TENSILESTRENGTH_THREE in", values, "tensilestrengthThree");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthThreeNotIn(List<Float> values) {
            addCriterion("TENSILESTRENGTH_THREE not in", values, "tensilestrengthThree");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthThreeBetween(Float value1, Float value2) {
            addCriterion("TENSILESTRENGTH_THREE between", value1, value2, "tensilestrengthThree");
            return (Criteria) this;
        }

        public Criteria andTensilestrengthThreeNotBetween(Float value1, Float value2) {
            addCriterion("TENSILESTRENGTH_THREE not between", value1, value2, "tensilestrengthThree");
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