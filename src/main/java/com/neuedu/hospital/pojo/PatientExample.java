package com.neuedu.hospital.pojo;

import java.util.ArrayList;
import java.util.List;

public class PatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientExample() {
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

        public Criteria andPatientIdIsNull() {
            addCriterion("patient_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(Integer value) {
            addCriterion("patient_id =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(Integer value) {
            addCriterion("patient_id <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(Integer value) {
            addCriterion("patient_id >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_id >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(Integer value) {
            addCriterion("patient_id <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(Integer value) {
            addCriterion("patient_id <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<Integer> values) {
            addCriterion("patient_id in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<Integer> values) {
            addCriterion("patient_id not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(Integer value1, Integer value2) {
            addCriterion("patient_id between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_id not between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("patient_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("patient_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("patient_name =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("patient_name <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("patient_name >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_name >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("patient_name <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("patient_name <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("patient_name like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("patient_name not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("patient_name in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("patient_name not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("patient_name between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("patient_name not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientCertidIsNull() {
            addCriterion("patient_certId is null");
            return (Criteria) this;
        }

        public Criteria andPatientCertidIsNotNull() {
            addCriterion("patient_certId is not null");
            return (Criteria) this;
        }

        public Criteria andPatientCertidEqualTo(String value) {
            addCriterion("patient_certId =", value, "patientCertid");
            return (Criteria) this;
        }

        public Criteria andPatientCertidNotEqualTo(String value) {
            addCriterion("patient_certId <>", value, "patientCertid");
            return (Criteria) this;
        }

        public Criteria andPatientCertidGreaterThan(String value) {
            addCriterion("patient_certId >", value, "patientCertid");
            return (Criteria) this;
        }

        public Criteria andPatientCertidGreaterThanOrEqualTo(String value) {
            addCriterion("patient_certId >=", value, "patientCertid");
            return (Criteria) this;
        }

        public Criteria andPatientCertidLessThan(String value) {
            addCriterion("patient_certId <", value, "patientCertid");
            return (Criteria) this;
        }

        public Criteria andPatientCertidLessThanOrEqualTo(String value) {
            addCriterion("patient_certId <=", value, "patientCertid");
            return (Criteria) this;
        }

        public Criteria andPatientCertidLike(String value) {
            addCriterion("patient_certId like", value, "patientCertid");
            return (Criteria) this;
        }

        public Criteria andPatientCertidNotLike(String value) {
            addCriterion("patient_certId not like", value, "patientCertid");
            return (Criteria) this;
        }

        public Criteria andPatientCertidIn(List<String> values) {
            addCriterion("patient_certId in", values, "patientCertid");
            return (Criteria) this;
        }

        public Criteria andPatientCertidNotIn(List<String> values) {
            addCriterion("patient_certId not in", values, "patientCertid");
            return (Criteria) this;
        }

        public Criteria andPatientCertidBetween(String value1, String value2) {
            addCriterion("patient_certId between", value1, value2, "patientCertid");
            return (Criteria) this;
        }

        public Criteria andPatientCertidNotBetween(String value1, String value2) {
            addCriterion("patient_certId not between", value1, value2, "patientCertid");
            return (Criteria) this;
        }

        public Criteria andPatientSexIsNull() {
            addCriterion("patient_sex is null");
            return (Criteria) this;
        }

        public Criteria andPatientSexIsNotNull() {
            addCriterion("patient_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPatientSexEqualTo(String value) {
            addCriterion("patient_sex =", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotEqualTo(String value) {
            addCriterion("patient_sex <>", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexGreaterThan(String value) {
            addCriterion("patient_sex >", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexGreaterThanOrEqualTo(String value) {
            addCriterion("patient_sex >=", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLessThan(String value) {
            addCriterion("patient_sex <", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLessThanOrEqualTo(String value) {
            addCriterion("patient_sex <=", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLike(String value) {
            addCriterion("patient_sex like", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotLike(String value) {
            addCriterion("patient_sex not like", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexIn(List<String> values) {
            addCriterion("patient_sex in", values, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotIn(List<String> values) {
            addCriterion("patient_sex not in", values, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexBetween(String value1, String value2) {
            addCriterion("patient_sex between", value1, value2, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotBetween(String value1, String value2) {
            addCriterion("patient_sex not between", value1, value2, "patientSex");
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

        public Criteria andPatientTelIsNull() {
            addCriterion("patient_tel is null");
            return (Criteria) this;
        }

        public Criteria andPatientTelIsNotNull() {
            addCriterion("patient_tel is not null");
            return (Criteria) this;
        }

        public Criteria andPatientTelEqualTo(String value) {
            addCriterion("patient_tel =", value, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelNotEqualTo(String value) {
            addCriterion("patient_tel <>", value, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelGreaterThan(String value) {
            addCriterion("patient_tel >", value, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelGreaterThanOrEqualTo(String value) {
            addCriterion("patient_tel >=", value, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelLessThan(String value) {
            addCriterion("patient_tel <", value, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelLessThanOrEqualTo(String value) {
            addCriterion("patient_tel <=", value, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelLike(String value) {
            addCriterion("patient_tel like", value, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelNotLike(String value) {
            addCriterion("patient_tel not like", value, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelIn(List<String> values) {
            addCriterion("patient_tel in", values, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelNotIn(List<String> values) {
            addCriterion("patient_tel not in", values, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelBetween(String value1, String value2) {
            addCriterion("patient_tel between", value1, value2, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelNotBetween(String value1, String value2) {
            addCriterion("patient_tel not between", value1, value2, "patientTel");
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