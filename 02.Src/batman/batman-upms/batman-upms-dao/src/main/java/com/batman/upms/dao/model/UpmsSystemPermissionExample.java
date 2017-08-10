package com.batman.upms.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UpmsSystemPermissionExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public UpmsSystemPermissionExample() {
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

        public Criteria andUpmsPermissionUuidIsNull() {
            addCriterion("upms_permission_uuid is null");
            return (Criteria) this;
        }

        public Criteria andUpmsPermissionUuidIsNotNull() {
            addCriterion("upms_permission_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUpmsPermissionUuidEqualTo(String value) {
            addCriterion("upms_permission_uuid =", value, "upmsPermissionUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsPermissionUuidNotEqualTo(String value) {
            addCriterion("upms_permission_uuid <>", value, "upmsPermissionUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsPermissionUuidGreaterThan(String value) {
            addCriterion("upms_permission_uuid >", value, "upmsPermissionUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsPermissionUuidGreaterThanOrEqualTo(String value) {
            addCriterion("upms_permission_uuid >=", value, "upmsPermissionUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsPermissionUuidLessThan(String value) {
            addCriterion("upms_permission_uuid <", value, "upmsPermissionUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsPermissionUuidLessThanOrEqualTo(String value) {
            addCriterion("upms_permission_uuid <=", value, "upmsPermissionUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsPermissionUuidLike(String value) {
            addCriterion("upms_permission_uuid like", value, "upmsPermissionUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsPermissionUuidNotLike(String value) {
            addCriterion("upms_permission_uuid not like", value, "upmsPermissionUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsPermissionUuidIn(List<String> values) {
            addCriterion("upms_permission_uuid in", values, "upmsPermissionUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsPermissionUuidNotIn(List<String> values) {
            addCriterion("upms_permission_uuid not in", values, "upmsPermissionUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsPermissionUuidBetween(String value1, String value2) {
            addCriterion("upms_permission_uuid between", value1, value2, "upmsPermissionUuid");
            return (Criteria) this;
        }

        public Criteria andUpmsPermissionUuidNotBetween(String value1, String value2) {
            addCriterion("upms_permission_uuid not between", value1, value2, "upmsPermissionUuid");
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

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

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