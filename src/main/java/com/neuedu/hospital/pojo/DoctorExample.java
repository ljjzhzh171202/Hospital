package com.neuedu.hospital.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Integer value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Integer value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Integer value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Integer value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Integer> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Integer> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorInameIsNull() {
            addCriterion("doctor_iname is null");
            return (Criteria) this;
        }

        public Criteria andDoctorInameIsNotNull() {
            addCriterion("doctor_iname is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorInameEqualTo(String value) {
            addCriterion("doctor_iname =", value, "doctorIname");
            return (Criteria) this;
        }

        public Criteria andDoctorInameNotEqualTo(String value) {
            addCriterion("doctor_iname <>", value, "doctorIname");
            return (Criteria) this;
        }

        public Criteria andDoctorInameGreaterThan(String value) {
            addCriterion("doctor_iname >", value, "doctorIname");
            return (Criteria) this;
        }

        public Criteria andDoctorInameGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_iname >=", value, "doctorIname");
            return (Criteria) this;
        }

        public Criteria andDoctorInameLessThan(String value) {
            addCriterion("doctor_iname <", value, "doctorIname");
            return (Criteria) this;
        }

        public Criteria andDoctorInameLessThanOrEqualTo(String value) {
            addCriterion("doctor_iname <=", value, "doctorIname");
            return (Criteria) this;
        }

        public Criteria andDoctorInameLike(String value) {
            addCriterion("doctor_iname like", value, "doctorIname");
            return (Criteria) this;
        }

        public Criteria andDoctorInameNotLike(String value) {
            addCriterion("doctor_iname not like", value, "doctorIname");
            return (Criteria) this;
        }

        public Criteria andDoctorInameIn(List<String> values) {
            addCriterion("doctor_iname in", values, "doctorIname");
            return (Criteria) this;
        }

        public Criteria andDoctorInameNotIn(List<String> values) {
            addCriterion("doctor_iname not in", values, "doctorIname");
            return (Criteria) this;
        }

        public Criteria andDoctorInameBetween(String value1, String value2) {
            addCriterion("doctor_iname between", value1, value2, "doctorIname");
            return (Criteria) this;
        }

        public Criteria andDoctorInameNotBetween(String value1, String value2) {
            addCriterion("doctor_iname not between", value1, value2, "doctorIname");
            return (Criteria) this;
        }

        public Criteria andDoctorIcertidIsNull() {
            addCriterion("doctor_icertId is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIcertidIsNotNull() {
            addCriterion("doctor_icertId is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIcertidEqualTo(String value) {
            addCriterion("doctor_icertId =", value, "doctorIcertid");
            return (Criteria) this;
        }

        public Criteria andDoctorIcertidNotEqualTo(String value) {
            addCriterion("doctor_icertId <>", value, "doctorIcertid");
            return (Criteria) this;
        }

        public Criteria andDoctorIcertidGreaterThan(String value) {
            addCriterion("doctor_icertId >", value, "doctorIcertid");
            return (Criteria) this;
        }

        public Criteria andDoctorIcertidGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_icertId >=", value, "doctorIcertid");
            return (Criteria) this;
        }

        public Criteria andDoctorIcertidLessThan(String value) {
            addCriterion("doctor_icertId <", value, "doctorIcertid");
            return (Criteria) this;
        }

        public Criteria andDoctorIcertidLessThanOrEqualTo(String value) {
            addCriterion("doctor_icertId <=", value, "doctorIcertid");
            return (Criteria) this;
        }

        public Criteria andDoctorIcertidLike(String value) {
            addCriterion("doctor_icertId like", value, "doctorIcertid");
            return (Criteria) this;
        }

        public Criteria andDoctorIcertidNotLike(String value) {
            addCriterion("doctor_icertId not like", value, "doctorIcertid");
            return (Criteria) this;
        }

        public Criteria andDoctorIcertidIn(List<String> values) {
            addCriterion("doctor_icertId in", values, "doctorIcertid");
            return (Criteria) this;
        }

        public Criteria andDoctorIcertidNotIn(List<String> values) {
            addCriterion("doctor_icertId not in", values, "doctorIcertid");
            return (Criteria) this;
        }

        public Criteria andDoctorIcertidBetween(String value1, String value2) {
            addCriterion("doctor_icertId between", value1, value2, "doctorIcertid");
            return (Criteria) this;
        }

        public Criteria andDoctorIcertidNotBetween(String value1, String value2) {
            addCriterion("doctor_icertId not between", value1, value2, "doctorIcertid");
            return (Criteria) this;
        }

        public Criteria andDoctorIsexIsNull() {
            addCriterion("doctor_isex is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIsexIsNotNull() {
            addCriterion("doctor_isex is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIsexEqualTo(String value) {
            addCriterion("doctor_isex =", value, "doctorIsex");
            return (Criteria) this;
        }

        public Criteria andDoctorIsexNotEqualTo(String value) {
            addCriterion("doctor_isex <>", value, "doctorIsex");
            return (Criteria) this;
        }

        public Criteria andDoctorIsexGreaterThan(String value) {
            addCriterion("doctor_isex >", value, "doctorIsex");
            return (Criteria) this;
        }

        public Criteria andDoctorIsexGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_isex >=", value, "doctorIsex");
            return (Criteria) this;
        }

        public Criteria andDoctorIsexLessThan(String value) {
            addCriterion("doctor_isex <", value, "doctorIsex");
            return (Criteria) this;
        }

        public Criteria andDoctorIsexLessThanOrEqualTo(String value) {
            addCriterion("doctor_isex <=", value, "doctorIsex");
            return (Criteria) this;
        }

        public Criteria andDoctorIsexLike(String value) {
            addCriterion("doctor_isex like", value, "doctorIsex");
            return (Criteria) this;
        }

        public Criteria andDoctorIsexNotLike(String value) {
            addCriterion("doctor_isex not like", value, "doctorIsex");
            return (Criteria) this;
        }

        public Criteria andDoctorIsexIn(List<String> values) {
            addCriterion("doctor_isex in", values, "doctorIsex");
            return (Criteria) this;
        }

        public Criteria andDoctorIsexNotIn(List<String> values) {
            addCriterion("doctor_isex not in", values, "doctorIsex");
            return (Criteria) this;
        }

        public Criteria andDoctorIsexBetween(String value1, String value2) {
            addCriterion("doctor_isex between", value1, value2, "doctorIsex");
            return (Criteria) this;
        }

        public Criteria andDoctorIsexNotBetween(String value1, String value2) {
            addCriterion("doctor_isex not between", value1, value2, "doctorIsex");
            return (Criteria) this;
        }

        public Criteria andDoctorIdepartmentIsNull() {
            addCriterion("doctor_idepartment is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdepartmentIsNotNull() {
            addCriterion("doctor_idepartment is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdepartmentEqualTo(Integer value) {
            addCriterion("doctor_idepartment =", value, "doctorIdepartment");
            return (Criteria) this;
        }

        public Criteria andDoctorIdepartmentNotEqualTo(Integer value) {
            addCriterion("doctor_idepartment <>", value, "doctorIdepartment");
            return (Criteria) this;
        }

        public Criteria andDoctorIdepartmentGreaterThan(Integer value) {
            addCriterion("doctor_idepartment >", value, "doctorIdepartment");
            return (Criteria) this;
        }

        public Criteria andDoctorIdepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_idepartment >=", value, "doctorIdepartment");
            return (Criteria) this;
        }

        public Criteria andDoctorIdepartmentLessThan(Integer value) {
            addCriterion("doctor_idepartment <", value, "doctorIdepartment");
            return (Criteria) this;
        }

        public Criteria andDoctorIdepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_idepartment <=", value, "doctorIdepartment");
            return (Criteria) this;
        }

        public Criteria andDoctorIdepartmentIn(List<Integer> values) {
            addCriterion("doctor_idepartment in", values, "doctorIdepartment");
            return (Criteria) this;
        }

        public Criteria andDoctorIdepartmentNotIn(List<Integer> values) {
            addCriterion("doctor_idepartment not in", values, "doctorIdepartment");
            return (Criteria) this;
        }

        public Criteria andDoctorIdepartmentBetween(Integer value1, Integer value2) {
            addCriterion("doctor_idepartment between", value1, value2, "doctorIdepartment");
            return (Criteria) this;
        }

        public Criteria andDoctorIdepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_idepartment not between", value1, value2, "doctorIdepartment");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andDoctorTelIsNull() {
            addCriterion("doctor_tel is null");
            return (Criteria) this;
        }

        public Criteria andDoctorTelIsNotNull() {
            addCriterion("doctor_tel is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorTelEqualTo(String value) {
            addCriterion("doctor_tel =", value, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelNotEqualTo(String value) {
            addCriterion("doctor_tel <>", value, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelGreaterThan(String value) {
            addCriterion("doctor_tel >", value, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_tel >=", value, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelLessThan(String value) {
            addCriterion("doctor_tel <", value, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelLessThanOrEqualTo(String value) {
            addCriterion("doctor_tel <=", value, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelLike(String value) {
            addCriterion("doctor_tel like", value, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelNotLike(String value) {
            addCriterion("doctor_tel not like", value, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelIn(List<String> values) {
            addCriterion("doctor_tel in", values, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelNotIn(List<String> values) {
            addCriterion("doctor_tel not in", values, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelBetween(String value1, String value2) {
            addCriterion("doctor_tel between", value1, value2, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelNotBetween(String value1, String value2) {
            addCriterion("doctor_tel not between", value1, value2, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorPriceIsNull() {
            addCriterion("doctor_price is null");
            return (Criteria) this;
        }

        public Criteria andDoctorPriceIsNotNull() {
            addCriterion("doctor_price is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorPriceEqualTo(BigDecimal value) {
            addCriterion("doctor_price =", value, "doctorPrice");
            return (Criteria) this;
        }

        public Criteria andDoctorPriceNotEqualTo(BigDecimal value) {
            addCriterion("doctor_price <>", value, "doctorPrice");
            return (Criteria) this;
        }

        public Criteria andDoctorPriceGreaterThan(BigDecimal value) {
            addCriterion("doctor_price >", value, "doctorPrice");
            return (Criteria) this;
        }

        public Criteria andDoctorPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("doctor_price >=", value, "doctorPrice");
            return (Criteria) this;
        }

        public Criteria andDoctorPriceLessThan(BigDecimal value) {
            addCriterion("doctor_price <", value, "doctorPrice");
            return (Criteria) this;
        }

        public Criteria andDoctorPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("doctor_price <=", value, "doctorPrice");
            return (Criteria) this;
        }

        public Criteria andDoctorPriceIn(List<BigDecimal> values) {
            addCriterion("doctor_price in", values, "doctorPrice");
            return (Criteria) this;
        }

        public Criteria andDoctorPriceNotIn(List<BigDecimal> values) {
            addCriterion("doctor_price not in", values, "doctorPrice");
            return (Criteria) this;
        }

        public Criteria andDoctorPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("doctor_price between", value1, value2, "doctorPrice");
            return (Criteria) this;
        }

        public Criteria andDoctorPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("doctor_price not between", value1, value2, "doctorPrice");
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