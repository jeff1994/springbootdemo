package com.jeff.springbootdemo.Domain;

import java.util.ArrayList;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
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

        public Criteria andAcIdIsNull() {
            addCriterion("ac_id is null");
            return (Criteria) this;
        }

        public Criteria andAcIdIsNotNull() {
            addCriterion("ac_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcIdEqualTo(Integer value) {
            addCriterion("ac_id =", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotEqualTo(Integer value) {
            addCriterion("ac_id <>", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThan(Integer value) {
            addCriterion("ac_id >", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ac_id >=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThan(Integer value) {
            addCriterion("ac_id <", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThanOrEqualTo(Integer value) {
            addCriterion("ac_id <=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdIn(List<Integer> values) {
            addCriterion("ac_id in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotIn(List<Integer> values) {
            addCriterion("ac_id not in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdBetween(Integer value1, Integer value2) {
            addCriterion("ac_id between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ac_id not between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andAcPridIsNull() {
            addCriterion("ac_prid is null");
            return (Criteria) this;
        }

        public Criteria andAcPridIsNotNull() {
            addCriterion("ac_prid is not null");
            return (Criteria) this;
        }

        public Criteria andAcPridEqualTo(String value) {
            addCriterion("ac_prid =", value, "acPrid");
            return (Criteria) this;
        }

        public Criteria andAcPridNotEqualTo(String value) {
            addCriterion("ac_prid <>", value, "acPrid");
            return (Criteria) this;
        }

        public Criteria andAcPridGreaterThan(String value) {
            addCriterion("ac_prid >", value, "acPrid");
            return (Criteria) this;
        }

        public Criteria andAcPridGreaterThanOrEqualTo(String value) {
            addCriterion("ac_prid >=", value, "acPrid");
            return (Criteria) this;
        }

        public Criteria andAcPridLessThan(String value) {
            addCriterion("ac_prid <", value, "acPrid");
            return (Criteria) this;
        }

        public Criteria andAcPridLessThanOrEqualTo(String value) {
            addCriterion("ac_prid <=", value, "acPrid");
            return (Criteria) this;
        }

        public Criteria andAcPridLike(String value) {
            addCriterion("ac_prid like", value, "acPrid");
            return (Criteria) this;
        }

        public Criteria andAcPridNotLike(String value) {
            addCriterion("ac_prid not like", value, "acPrid");
            return (Criteria) this;
        }

        public Criteria andAcPridIn(List<String> values) {
            addCriterion("ac_prid in", values, "acPrid");
            return (Criteria) this;
        }

        public Criteria andAcPridNotIn(List<String> values) {
            addCriterion("ac_prid not in", values, "acPrid");
            return (Criteria) this;
        }

        public Criteria andAcPridBetween(String value1, String value2) {
            addCriterion("ac_prid between", value1, value2, "acPrid");
            return (Criteria) this;
        }

        public Criteria andAcPridNotBetween(String value1, String value2) {
            addCriterion("ac_prid not between", value1, value2, "acPrid");
            return (Criteria) this;
        }

        public Criteria andScSalaryIsNull() {
            addCriterion("sc_salary is null");
            return (Criteria) this;
        }

        public Criteria andScSalaryIsNotNull() {
            addCriterion("sc_salary is not null");
            return (Criteria) this;
        }

        public Criteria andScSalaryEqualTo(String value) {
            addCriterion("sc_salary =", value, "scSalary");
            return (Criteria) this;
        }

        public Criteria andScSalaryNotEqualTo(String value) {
            addCriterion("sc_salary <>", value, "scSalary");
            return (Criteria) this;
        }

        public Criteria andScSalaryGreaterThan(String value) {
            addCriterion("sc_salary >", value, "scSalary");
            return (Criteria) this;
        }

        public Criteria andScSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("sc_salary >=", value, "scSalary");
            return (Criteria) this;
        }

        public Criteria andScSalaryLessThan(String value) {
            addCriterion("sc_salary <", value, "scSalary");
            return (Criteria) this;
        }

        public Criteria andScSalaryLessThanOrEqualTo(String value) {
            addCriterion("sc_salary <=", value, "scSalary");
            return (Criteria) this;
        }

        public Criteria andScSalaryLike(String value) {
            addCriterion("sc_salary like", value, "scSalary");
            return (Criteria) this;
        }

        public Criteria andScSalaryNotLike(String value) {
            addCriterion("sc_salary not like", value, "scSalary");
            return (Criteria) this;
        }

        public Criteria andScSalaryIn(List<String> values) {
            addCriterion("sc_salary in", values, "scSalary");
            return (Criteria) this;
        }

        public Criteria andScSalaryNotIn(List<String> values) {
            addCriterion("sc_salary not in", values, "scSalary");
            return (Criteria) this;
        }

        public Criteria andScSalaryBetween(String value1, String value2) {
            addCriterion("sc_salary between", value1, value2, "scSalary");
            return (Criteria) this;
        }

        public Criteria andScSalaryNotBetween(String value1, String value2) {
            addCriterion("sc_salary not between", value1, value2, "scSalary");
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