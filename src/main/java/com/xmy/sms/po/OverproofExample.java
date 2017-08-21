package com.xmy.sms.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OverproofExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OverproofExample() {
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

        public Criteria andDataIdIsNull() {
            addCriterion("DATA_ID is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("DATA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(Integer value) {
            addCriterion("DATA_ID =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(Integer value) {
            addCriterion("DATA_ID <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(Integer value) {
            addCriterion("DATA_ID >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DATA_ID >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(Integer value) {
            addCriterion("DATA_ID <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(Integer value) {
            addCriterion("DATA_ID <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<Integer> values) {
            addCriterion("DATA_ID in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<Integer> values) {
            addCriterion("DATA_ID not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(Integer value1, Integer value2) {
            addCriterion("DATA_ID between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DATA_ID not between", value1, value2, "dataId");
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

        public Criteria andBuildMsgIsNull() {
            addCriterion("BUILD_MSG is null");
            return (Criteria) this;
        }

        public Criteria andBuildMsgIsNotNull() {
            addCriterion("BUILD_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andBuildMsgEqualTo(String value) {
            addCriterion("BUILD_MSG =", value, "buildMsg");
            return (Criteria) this;
        }

        public Criteria andBuildMsgNotEqualTo(String value) {
            addCriterion("BUILD_MSG <>", value, "buildMsg");
            return (Criteria) this;
        }

        public Criteria andBuildMsgGreaterThan(String value) {
            addCriterion("BUILD_MSG >", value, "buildMsg");
            return (Criteria) this;
        }

        public Criteria andBuildMsgGreaterThanOrEqualTo(String value) {
            addCriterion("BUILD_MSG >=", value, "buildMsg");
            return (Criteria) this;
        }

        public Criteria andBuildMsgLessThan(String value) {
            addCriterion("BUILD_MSG <", value, "buildMsg");
            return (Criteria) this;
        }

        public Criteria andBuildMsgLessThanOrEqualTo(String value) {
            addCriterion("BUILD_MSG <=", value, "buildMsg");
            return (Criteria) this;
        }

        public Criteria andBuildMsgLike(String value) {
            addCriterion("BUILD_MSG like", value, "buildMsg");
            return (Criteria) this;
        }

        public Criteria andBuildMsgNotLike(String value) {
            addCriterion("BUILD_MSG not like", value, "buildMsg");
            return (Criteria) this;
        }

        public Criteria andBuildMsgIn(List<String> values) {
            addCriterion("BUILD_MSG in", values, "buildMsg");
            return (Criteria) this;
        }

        public Criteria andBuildMsgNotIn(List<String> values) {
            addCriterion("BUILD_MSG not in", values, "buildMsg");
            return (Criteria) this;
        }

        public Criteria andBuildMsgBetween(String value1, String value2) {
            addCriterion("BUILD_MSG between", value1, value2, "buildMsg");
            return (Criteria) this;
        }

        public Criteria andBuildMsgNotBetween(String value1, String value2) {
            addCriterion("BUILD_MSG not between", value1, value2, "buildMsg");
            return (Criteria) this;
        }

        public Criteria andBuildStaffIsNull() {
            addCriterion("BUILD_STAFF is null");
            return (Criteria) this;
        }

        public Criteria andBuildStaffIsNotNull() {
            addCriterion("BUILD_STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andBuildStaffEqualTo(String value) {
            addCriterion("BUILD_STAFF =", value, "buildStaff");
            return (Criteria) this;
        }

        public Criteria andBuildStaffNotEqualTo(String value) {
            addCriterion("BUILD_STAFF <>", value, "buildStaff");
            return (Criteria) this;
        }

        public Criteria andBuildStaffGreaterThan(String value) {
            addCriterion("BUILD_STAFF >", value, "buildStaff");
            return (Criteria) this;
        }

        public Criteria andBuildStaffGreaterThanOrEqualTo(String value) {
            addCriterion("BUILD_STAFF >=", value, "buildStaff");
            return (Criteria) this;
        }

        public Criteria andBuildStaffLessThan(String value) {
            addCriterion("BUILD_STAFF <", value, "buildStaff");
            return (Criteria) this;
        }

        public Criteria andBuildStaffLessThanOrEqualTo(String value) {
            addCriterion("BUILD_STAFF <=", value, "buildStaff");
            return (Criteria) this;
        }

        public Criteria andBuildStaffLike(String value) {
            addCriterion("BUILD_STAFF like", value, "buildStaff");
            return (Criteria) this;
        }

        public Criteria andBuildStaffNotLike(String value) {
            addCriterion("BUILD_STAFF not like", value, "buildStaff");
            return (Criteria) this;
        }

        public Criteria andBuildStaffIn(List<String> values) {
            addCriterion("BUILD_STAFF in", values, "buildStaff");
            return (Criteria) this;
        }

        public Criteria andBuildStaffNotIn(List<String> values) {
            addCriterion("BUILD_STAFF not in", values, "buildStaff");
            return (Criteria) this;
        }

        public Criteria andBuildStaffBetween(String value1, String value2) {
            addCriterion("BUILD_STAFF between", value1, value2, "buildStaff");
            return (Criteria) this;
        }

        public Criteria andBuildStaffNotBetween(String value1, String value2) {
            addCriterion("BUILD_STAFF not between", value1, value2, "buildStaff");
            return (Criteria) this;
        }

        public Criteria andBuildDateIsNull() {
            addCriterion("BUILD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBuildDateIsNotNull() {
            addCriterion("BUILD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBuildDateEqualTo(Date value) {
            addCriterion("BUILD_DATE =", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotEqualTo(Date value) {
            addCriterion("BUILD_DATE <>", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateGreaterThan(Date value) {
            addCriterion("BUILD_DATE >", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateGreaterThanOrEqualTo(Date value) {
            addCriterion("BUILD_DATE >=", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateLessThan(Date value) {
            addCriterion("BUILD_DATE <", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateLessThanOrEqualTo(Date value) {
            addCriterion("BUILD_DATE <=", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateIn(List<Date> values) {
            addCriterion("BUILD_DATE in", values, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotIn(List<Date> values) {
            addCriterion("BUILD_DATE not in", values, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateBetween(Date value1, Date value2) {
            addCriterion("BUILD_DATE between", value1, value2, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotBetween(Date value1, Date value2) {
            addCriterion("BUILD_DATE not between", value1, value2, "buildDate");
            return (Criteria) this;
        }

        public Criteria andTestMsgIsNull() {
            addCriterion("TEST_MSG is null");
            return (Criteria) this;
        }

        public Criteria andTestMsgIsNotNull() {
            addCriterion("TEST_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andTestMsgEqualTo(String value) {
            addCriterion("TEST_MSG =", value, "testMsg");
            return (Criteria) this;
        }

        public Criteria andTestMsgNotEqualTo(String value) {
            addCriterion("TEST_MSG <>", value, "testMsg");
            return (Criteria) this;
        }

        public Criteria andTestMsgGreaterThan(String value) {
            addCriterion("TEST_MSG >", value, "testMsg");
            return (Criteria) this;
        }

        public Criteria andTestMsgGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_MSG >=", value, "testMsg");
            return (Criteria) this;
        }

        public Criteria andTestMsgLessThan(String value) {
            addCriterion("TEST_MSG <", value, "testMsg");
            return (Criteria) this;
        }

        public Criteria andTestMsgLessThanOrEqualTo(String value) {
            addCriterion("TEST_MSG <=", value, "testMsg");
            return (Criteria) this;
        }

        public Criteria andTestMsgLike(String value) {
            addCriterion("TEST_MSG like", value, "testMsg");
            return (Criteria) this;
        }

        public Criteria andTestMsgNotLike(String value) {
            addCriterion("TEST_MSG not like", value, "testMsg");
            return (Criteria) this;
        }

        public Criteria andTestMsgIn(List<String> values) {
            addCriterion("TEST_MSG in", values, "testMsg");
            return (Criteria) this;
        }

        public Criteria andTestMsgNotIn(List<String> values) {
            addCriterion("TEST_MSG not in", values, "testMsg");
            return (Criteria) this;
        }

        public Criteria andTestMsgBetween(String value1, String value2) {
            addCriterion("TEST_MSG between", value1, value2, "testMsg");
            return (Criteria) this;
        }

        public Criteria andTestMsgNotBetween(String value1, String value2) {
            addCriterion("TEST_MSG not between", value1, value2, "testMsg");
            return (Criteria) this;
        }

        public Criteria andTestStaffIsNull() {
            addCriterion("TEST_STAFF is null");
            return (Criteria) this;
        }

        public Criteria andTestStaffIsNotNull() {
            addCriterion("TEST_STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andTestStaffEqualTo(String value) {
            addCriterion("TEST_STAFF =", value, "testStaff");
            return (Criteria) this;
        }

        public Criteria andTestStaffNotEqualTo(String value) {
            addCriterion("TEST_STAFF <>", value, "testStaff");
            return (Criteria) this;
        }

        public Criteria andTestStaffGreaterThan(String value) {
            addCriterion("TEST_STAFF >", value, "testStaff");
            return (Criteria) this;
        }

        public Criteria andTestStaffGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_STAFF >=", value, "testStaff");
            return (Criteria) this;
        }

        public Criteria andTestStaffLessThan(String value) {
            addCriterion("TEST_STAFF <", value, "testStaff");
            return (Criteria) this;
        }

        public Criteria andTestStaffLessThanOrEqualTo(String value) {
            addCriterion("TEST_STAFF <=", value, "testStaff");
            return (Criteria) this;
        }

        public Criteria andTestStaffLike(String value) {
            addCriterion("TEST_STAFF like", value, "testStaff");
            return (Criteria) this;
        }

        public Criteria andTestStaffNotLike(String value) {
            addCriterion("TEST_STAFF not like", value, "testStaff");
            return (Criteria) this;
        }

        public Criteria andTestStaffIn(List<String> values) {
            addCriterion("TEST_STAFF in", values, "testStaff");
            return (Criteria) this;
        }

        public Criteria andTestStaffNotIn(List<String> values) {
            addCriterion("TEST_STAFF not in", values, "testStaff");
            return (Criteria) this;
        }

        public Criteria andTestStaffBetween(String value1, String value2) {
            addCriterion("TEST_STAFF between", value1, value2, "testStaff");
            return (Criteria) this;
        }

        public Criteria andTestStaffNotBetween(String value1, String value2) {
            addCriterion("TEST_STAFF not between", value1, value2, "testStaff");
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

        public Criteria andSupervisorMsgIsNull() {
            addCriterion("SUPERVISOR_MSG is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorMsgIsNotNull() {
            addCriterion("SUPERVISOR_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorMsgEqualTo(String value) {
            addCriterion("SUPERVISOR_MSG =", value, "supervisorMsg");
            return (Criteria) this;
        }

        public Criteria andSupervisorMsgNotEqualTo(String value) {
            addCriterion("SUPERVISOR_MSG <>", value, "supervisorMsg");
            return (Criteria) this;
        }

        public Criteria andSupervisorMsgGreaterThan(String value) {
            addCriterion("SUPERVISOR_MSG >", value, "supervisorMsg");
            return (Criteria) this;
        }

        public Criteria andSupervisorMsgGreaterThanOrEqualTo(String value) {
            addCriterion("SUPERVISOR_MSG >=", value, "supervisorMsg");
            return (Criteria) this;
        }

        public Criteria andSupervisorMsgLessThan(String value) {
            addCriterion("SUPERVISOR_MSG <", value, "supervisorMsg");
            return (Criteria) this;
        }

        public Criteria andSupervisorMsgLessThanOrEqualTo(String value) {
            addCriterion("SUPERVISOR_MSG <=", value, "supervisorMsg");
            return (Criteria) this;
        }

        public Criteria andSupervisorMsgLike(String value) {
            addCriterion("SUPERVISOR_MSG like", value, "supervisorMsg");
            return (Criteria) this;
        }

        public Criteria andSupervisorMsgNotLike(String value) {
            addCriterion("SUPERVISOR_MSG not like", value, "supervisorMsg");
            return (Criteria) this;
        }

        public Criteria andSupervisorMsgIn(List<String> values) {
            addCriterion("SUPERVISOR_MSG in", values, "supervisorMsg");
            return (Criteria) this;
        }

        public Criteria andSupervisorMsgNotIn(List<String> values) {
            addCriterion("SUPERVISOR_MSG not in", values, "supervisorMsg");
            return (Criteria) this;
        }

        public Criteria andSupervisorMsgBetween(String value1, String value2) {
            addCriterion("SUPERVISOR_MSG between", value1, value2, "supervisorMsg");
            return (Criteria) this;
        }

        public Criteria andSupervisorMsgNotBetween(String value1, String value2) {
            addCriterion("SUPERVISOR_MSG not between", value1, value2, "supervisorMsg");
            return (Criteria) this;
        }

        public Criteria andSupervisorStaffIsNull() {
            addCriterion("SUPERVISOR_STAFF is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorStaffIsNotNull() {
            addCriterion("SUPERVISOR_STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorStaffEqualTo(String value) {
            addCriterion("SUPERVISOR_STAFF =", value, "supervisorStaff");
            return (Criteria) this;
        }

        public Criteria andSupervisorStaffNotEqualTo(String value) {
            addCriterion("SUPERVISOR_STAFF <>", value, "supervisorStaff");
            return (Criteria) this;
        }

        public Criteria andSupervisorStaffGreaterThan(String value) {
            addCriterion("SUPERVISOR_STAFF >", value, "supervisorStaff");
            return (Criteria) this;
        }

        public Criteria andSupervisorStaffGreaterThanOrEqualTo(String value) {
            addCriterion("SUPERVISOR_STAFF >=", value, "supervisorStaff");
            return (Criteria) this;
        }

        public Criteria andSupervisorStaffLessThan(String value) {
            addCriterion("SUPERVISOR_STAFF <", value, "supervisorStaff");
            return (Criteria) this;
        }

        public Criteria andSupervisorStaffLessThanOrEqualTo(String value) {
            addCriterion("SUPERVISOR_STAFF <=", value, "supervisorStaff");
            return (Criteria) this;
        }

        public Criteria andSupervisorStaffLike(String value) {
            addCriterion("SUPERVISOR_STAFF like", value, "supervisorStaff");
            return (Criteria) this;
        }

        public Criteria andSupervisorStaffNotLike(String value) {
            addCriterion("SUPERVISOR_STAFF not like", value, "supervisorStaff");
            return (Criteria) this;
        }

        public Criteria andSupervisorStaffIn(List<String> values) {
            addCriterion("SUPERVISOR_STAFF in", values, "supervisorStaff");
            return (Criteria) this;
        }

        public Criteria andSupervisorStaffNotIn(List<String> values) {
            addCriterion("SUPERVISOR_STAFF not in", values, "supervisorStaff");
            return (Criteria) this;
        }

        public Criteria andSupervisorStaffBetween(String value1, String value2) {
            addCriterion("SUPERVISOR_STAFF between", value1, value2, "supervisorStaff");
            return (Criteria) this;
        }

        public Criteria andSupervisorStaffNotBetween(String value1, String value2) {
            addCriterion("SUPERVISOR_STAFF not between", value1, value2, "supervisorStaff");
            return (Criteria) this;
        }

        public Criteria andSupervisorDateIsNull() {
            addCriterion("SUPERVISOR_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorDateIsNotNull() {
            addCriterion("SUPERVISOR_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorDateEqualTo(Date value) {
            addCriterion("SUPERVISOR_DATE =", value, "supervisorDate");
            return (Criteria) this;
        }

        public Criteria andSupervisorDateNotEqualTo(Date value) {
            addCriterion("SUPERVISOR_DATE <>", value, "supervisorDate");
            return (Criteria) this;
        }

        public Criteria andSupervisorDateGreaterThan(Date value) {
            addCriterion("SUPERVISOR_DATE >", value, "supervisorDate");
            return (Criteria) this;
        }

        public Criteria andSupervisorDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SUPERVISOR_DATE >=", value, "supervisorDate");
            return (Criteria) this;
        }

        public Criteria andSupervisorDateLessThan(Date value) {
            addCriterion("SUPERVISOR_DATE <", value, "supervisorDate");
            return (Criteria) this;
        }

        public Criteria andSupervisorDateLessThanOrEqualTo(Date value) {
            addCriterion("SUPERVISOR_DATE <=", value, "supervisorDate");
            return (Criteria) this;
        }

        public Criteria andSupervisorDateIn(List<Date> values) {
            addCriterion("SUPERVISOR_DATE in", values, "supervisorDate");
            return (Criteria) this;
        }

        public Criteria andSupervisorDateNotIn(List<Date> values) {
            addCriterion("SUPERVISOR_DATE not in", values, "supervisorDate");
            return (Criteria) this;
        }

        public Criteria andSupervisorDateBetween(Date value1, Date value2) {
            addCriterion("SUPERVISOR_DATE between", value1, value2, "supervisorDate");
            return (Criteria) this;
        }

        public Criteria andSupervisorDateNotBetween(Date value1, Date value2) {
            addCriterion("SUPERVISOR_DATE not between", value1, value2, "supervisorDate");
            return (Criteria) this;
        }

        public Criteria andMsgNumIsNull() {
            addCriterion("MSG_NUM is null");
            return (Criteria) this;
        }

        public Criteria andMsgNumIsNotNull() {
            addCriterion("MSG_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andMsgNumEqualTo(String value) {
            addCriterion("MSG_NUM =", value, "msgNum");
            return (Criteria) this;
        }

        public Criteria andMsgNumNotEqualTo(String value) {
            addCriterion("MSG_NUM <>", value, "msgNum");
            return (Criteria) this;
        }

        public Criteria andMsgNumGreaterThan(String value) {
            addCriterion("MSG_NUM >", value, "msgNum");
            return (Criteria) this;
        }

        public Criteria andMsgNumGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_NUM >=", value, "msgNum");
            return (Criteria) this;
        }

        public Criteria andMsgNumLessThan(String value) {
            addCriterion("MSG_NUM <", value, "msgNum");
            return (Criteria) this;
        }

        public Criteria andMsgNumLessThanOrEqualTo(String value) {
            addCriterion("MSG_NUM <=", value, "msgNum");
            return (Criteria) this;
        }

        public Criteria andMsgNumLike(String value) {
            addCriterion("MSG_NUM like", value, "msgNum");
            return (Criteria) this;
        }

        public Criteria andMsgNumNotLike(String value) {
            addCriterion("MSG_NUM not like", value, "msgNum");
            return (Criteria) this;
        }

        public Criteria andMsgNumIn(List<String> values) {
            addCriterion("MSG_NUM in", values, "msgNum");
            return (Criteria) this;
        }

        public Criteria andMsgNumNotIn(List<String> values) {
            addCriterion("MSG_NUM not in", values, "msgNum");
            return (Criteria) this;
        }

        public Criteria andMsgNumBetween(String value1, String value2) {
            addCriterion("MSG_NUM between", value1, value2, "msgNum");
            return (Criteria) this;
        }

        public Criteria andMsgNumNotBetween(String value1, String value2) {
            addCriterion("MSG_NUM not between", value1, value2, "msgNum");
            return (Criteria) this;
        }

        public Criteria andIsDealIsNull() {
            addCriterion("IS_DEAL is null");
            return (Criteria) this;
        }

        public Criteria andIsDealIsNotNull() {
            addCriterion("IS_DEAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsDealEqualTo(Integer value) {
            addCriterion("IS_DEAL =", value, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealNotEqualTo(Integer value) {
            addCriterion("IS_DEAL <>", value, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealGreaterThan(Integer value) {
            addCriterion("IS_DEAL >", value, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_DEAL >=", value, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealLessThan(Integer value) {
            addCriterion("IS_DEAL <", value, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealLessThanOrEqualTo(Integer value) {
            addCriterion("IS_DEAL <=", value, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealIn(List<Integer> values) {
            addCriterion("IS_DEAL in", values, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealNotIn(List<Integer> values) {
            addCriterion("IS_DEAL not in", values, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealBetween(Integer value1, Integer value2) {
            addCriterion("IS_DEAL between", value1, value2, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_DEAL not between", value1, value2, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsWarmIsNull() {
            addCriterion("IS_WARM is null");
            return (Criteria) this;
        }

        public Criteria andIsWarmIsNotNull() {
            addCriterion("IS_WARM is not null");
            return (Criteria) this;
        }

        public Criteria andIsWarmEqualTo(Integer value) {
            addCriterion("IS_WARM =", value, "isWarm");
            return (Criteria) this;
        }

        public Criteria andIsWarmNotEqualTo(Integer value) {
            addCriterion("IS_WARM <>", value, "isWarm");
            return (Criteria) this;
        }

        public Criteria andIsWarmGreaterThan(Integer value) {
            addCriterion("IS_WARM >", value, "isWarm");
            return (Criteria) this;
        }

        public Criteria andIsWarmGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_WARM >=", value, "isWarm");
            return (Criteria) this;
        }

        public Criteria andIsWarmLessThan(Integer value) {
            addCriterion("IS_WARM <", value, "isWarm");
            return (Criteria) this;
        }

        public Criteria andIsWarmLessThanOrEqualTo(Integer value) {
            addCriterion("IS_WARM <=", value, "isWarm");
            return (Criteria) this;
        }

        public Criteria andIsWarmIn(List<Integer> values) {
            addCriterion("IS_WARM in", values, "isWarm");
            return (Criteria) this;
        }

        public Criteria andIsWarmNotIn(List<Integer> values) {
            addCriterion("IS_WARM not in", values, "isWarm");
            return (Criteria) this;
        }

        public Criteria andIsWarmBetween(Integer value1, Integer value2) {
            addCriterion("IS_WARM between", value1, value2, "isWarm");
            return (Criteria) this;
        }

        public Criteria andIsWarmNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_WARM not between", value1, value2, "isWarm");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("DATA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("DATA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(Integer value) {
            addCriterion("DATA_TYPE =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(Integer value) {
            addCriterion("DATA_TYPE <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(Integer value) {
            addCriterion("DATA_TYPE >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DATA_TYPE >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(Integer value) {
            addCriterion("DATA_TYPE <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(Integer value) {
            addCriterion("DATA_TYPE <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<Integer> values) {
            addCriterion("DATA_TYPE in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<Integer> values) {
            addCriterion("DATA_TYPE not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(Integer value1, Integer value2) {
            addCriterion("DATA_TYPE between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DATA_TYPE not between", value1, value2, "dataType");
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