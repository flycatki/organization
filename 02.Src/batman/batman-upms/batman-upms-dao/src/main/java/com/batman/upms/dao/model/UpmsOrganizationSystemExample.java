package com.batman.upms.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UpmsOrganizationSystemExample implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public UpmsOrganizationSystemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUpmsOrganizationUuidIsNull() {
            addCriterion("upms_organization_uuid is null");
            return (Criteria) this;
        }

        public Criteria andUpmsOrganizationUuidIsNotNull() {
            addCriterion("upms_organization_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUpmsOrganizationUuidEqualTo(String value) {
            addCriterion("upms_organization_uuid =", value, "upmsOrganizationUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsOrganizationUuidNotEqualTo(String value) {
            addCriterion("upms_organization_uuid <>", value, "upmsOrganizationUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsOrganizationUuidGreaterThan(String value) {
            addCriterion("upms_organization_uuid >", value, "upmsOrganizationUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsOrganizationUuidGreaterThanOrEqualTo(String value) {
            addCriterion("upms_organization_uuid >=", value, "upmsOrganizationUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsOrganizationUuidLessThan(String value) {
            addCriterion("upms_organization_uuid <", value, "upmsOrganizationUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsOrganizationUuidLessThanOrEqualTo(String value) {
            addCriterion("upms_organization_uuid <=", value, "upmsOrganizationUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsOrganizationUuidLike(String value) {
            addCriterion("upms_organization_uuid like", value, "upmsOrganizationUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsOrganizationUuidNotLike(String value) {
            addCriterion("upms_organization_uuid not like", value, "upmsOrganizationUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsOrganizationUuidIn(List<String> values) {
            addCriterion("upms_organization_uuid in", values, "upmsOrganizationUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsOrganizationUuidNotIn(List<String> values) {
            addCriterion("upms_organization_uuid not in", values, "upmsOrganizationUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsOrganizationUuidBetween(String value1, String value2) {
            addCriterion("upms_organization_uuid between", value1, value2, "upmsOrganizationUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsOrganizationUuidNotBetween(String value1, String value2) {
            addCriterion("upms_organization_uuid not between", value1, value2, "upmsOrganizationUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsSystemUuidIsNull() {
            addCriterion("upms_system_uuid is null");
            return (Criteria) this;
        }

        public Criteria andUpmsSystemUuidIsNotNull() {
            addCriterion("upms_system_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUpmsSystemUuidEqualTo(String value) {
            addCriterion("upms_system_uuid =", value, "upmsSystemUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsSystemUuidNotEqualTo(String value) {
            addCriterion("upms_system_uuid <>", value, "upmsSystemUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsSystemUuidGreaterThan(String value) {
            addCriterion("upms_system_uuid >", value, "upmsSystemUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsSystemUuidGreaterThanOrEqualTo(String value) {
            addCriterion("upms_system_uuid >=", value, "upmsSystemUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsSystemUuidLessThan(String value) {
            addCriterion("upms_system_uuid <", value, "upmsSystemUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsSystemUuidLessThanOrEqualTo(String value) {
            addCriterion("upms_system_uuid <=", value, "upmsSystemUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsSystemUuidLike(String value) {
            addCriterion("upms_system_uuid like", value, "upmsSystemUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsSystemUuidNotLike(String value) {
            addCriterion("upms_system_uuid not like", value, "upmsSystemUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsSystemUuidIn(List<String> values) {
            addCriterion("upms_system_uuid in", values, "upmsSystemUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsSystemUuidNotIn(List<String> values) {
            addCriterion("upms_system_uuid not in", values, "upmsSystemUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsSystemUuidBetween(String value1, String value2) {
            addCriterion("upms_system_uuid between", value1, value2, "upmsSystemUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsSystemUuidNotBetween(String value1, String value2) {
            addCriterion("upms_system_uuid not between", value1, value2, "upmsSystemUuid");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNull() {
            addCriterion("deleteflag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNotNull() {
            addCriterion("deleteflag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagEqualTo(Integer value) {
            addCriterion("deleteflag =", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotEqualTo(Integer value) {
            addCriterion("deleteflag <>", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThan(Integer value) {
            addCriterion("deleteflag >", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleteflag >=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThan(Integer value) {
            addCriterion("deleteflag <", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThanOrEqualTo(Integer value) {
            addCriterion("deleteflag <=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIn(List<Integer> values) {
            addCriterion("deleteflag in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotIn(List<Integer> values) {
            addCriterion("deleteflag not in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagBetween(Integer value1, Integer value2) {
            addCriterion("deleteflag between", value1, value2, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotBetween(Integer value1, Integer value2) {
            addCriterion("deleteflag not between", value1, value2, "deleteflag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table upms_organization_system
     *
     * @mbg.generated do_not_delete_during_merge Wed Aug 09 15:48:31 CST 2017
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public static class Criterion implements Serializable {
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