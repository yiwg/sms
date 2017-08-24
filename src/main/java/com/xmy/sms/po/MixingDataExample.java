package com.xmy.sms.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MixingDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MixingDataExample() {
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

        public Criteria andProductionNameIsNull() {
            addCriterion("PRODUCTION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductionNameIsNotNull() {
            addCriterion("PRODUCTION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductionNameEqualTo(String value) {
            addCriterion("PRODUCTION_NAME =", value, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameNotEqualTo(String value) {
            addCriterion("PRODUCTION_NAME <>", value, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameGreaterThan(String value) {
            addCriterion("PRODUCTION_NAME >", value, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTION_NAME >=", value, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameLessThan(String value) {
            addCriterion("PRODUCTION_NAME <", value, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTION_NAME <=", value, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameLike(String value) {
            addCriterion("PRODUCTION_NAME like", value, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameNotLike(String value) {
            addCriterion("PRODUCTION_NAME not like", value, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameIn(List<String> values) {
            addCriterion("PRODUCTION_NAME in", values, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameNotIn(List<String> values) {
            addCriterion("PRODUCTION_NAME not in", values, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameBetween(String value1, String value2) {
            addCriterion("PRODUCTION_NAME between", value1, value2, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCTION_NAME not between", value1, value2, "productionName");
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

        public Criteria andVolumeIsNull() {
            addCriterion("VOLUME is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("VOLUME is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Float value) {
            addCriterion("VOLUME =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Float value) {
            addCriterion("VOLUME <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Float value) {
            addCriterion("VOLUME >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("VOLUME >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Float value) {
            addCriterion("VOLUME <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Float value) {
            addCriterion("VOLUME <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Float> values) {
            addCriterion("VOLUME in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Float> values) {
            addCriterion("VOLUME not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Float value1, Float value2) {
            addCriterion("VOLUME between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Float value1, Float value2) {
            addCriterion("VOLUME not between", value1, value2, "volume");
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

        public Criteria andProductionDateIsNull() {
            addCriterion("PRODUCTION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProductionDateIsNotNull() {
            addCriterion("PRODUCTION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProductionDateEqualTo(Date value) {
            addCriterion("PRODUCTION_DATE =", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotEqualTo(Date value) {
            addCriterion("PRODUCTION_DATE <>", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateGreaterThan(Date value) {
            addCriterion("PRODUCTION_DATE >", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PRODUCTION_DATE >=", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateLessThan(Date value) {
            addCriterion("PRODUCTION_DATE <", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateLessThanOrEqualTo(Date value) {
            addCriterion("PRODUCTION_DATE <=", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateIn(List<Date> values) {
            addCriterion("PRODUCTION_DATE in", values, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotIn(List<Date> values) {
            addCriterion("PRODUCTION_DATE not in", values, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateBetween(Date value1, Date value2) {
            addCriterion("PRODUCTION_DATE between", value1, value2, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotBetween(Date value1, Date value2) {
            addCriterion("PRODUCTION_DATE not between", value1, value2, "productionDate");
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

        public Criteria andDataContentIsNull() {
            addCriterion("DATA_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andDataContentIsNotNull() {
            addCriterion("DATA_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andDataContentEqualTo(String value) {
            addCriterion("DATA_CONTENT =", value, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentNotEqualTo(String value) {
            addCriterion("DATA_CONTENT <>", value, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentGreaterThan(String value) {
            addCriterion("DATA_CONTENT >", value, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_CONTENT >=", value, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentLessThan(String value) {
            addCriterion("DATA_CONTENT <", value, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentLessThanOrEqualTo(String value) {
            addCriterion("DATA_CONTENT <=", value, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentLike(String value) {
            addCriterion("DATA_CONTENT like", value, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentNotLike(String value) {
            addCriterion("DATA_CONTENT not like", value, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentIn(List<String> values) {
            addCriterion("DATA_CONTENT in", values, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentNotIn(List<String> values) {
            addCriterion("DATA_CONTENT not in", values, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentBetween(String value1, String value2) {
            addCriterion("DATA_CONTENT between", value1, value2, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentNotBetween(String value1, String value2) {
            addCriterion("DATA_CONTENT not between", value1, value2, "dataContent");
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