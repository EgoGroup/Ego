package com.yoke.ego.common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Long value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Long value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Long value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Long value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Long value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Long> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Long> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Long value1, Long value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Long value1, Long value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogNameIsNull() {
            addCriterion("log_name is null");
            return (Criteria) this;
        }

        public Criteria andLogNameIsNotNull() {
            addCriterion("log_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogNameEqualTo(String value) {
            addCriterion("log_name =", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotEqualTo(String value) {
            addCriterion("log_name <>", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameGreaterThan(String value) {
            addCriterion("log_name >", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameGreaterThanOrEqualTo(String value) {
            addCriterion("log_name >=", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLessThan(String value) {
            addCriterion("log_name <", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLessThanOrEqualTo(String value) {
            addCriterion("log_name <=", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLike(String value) {
            addCriterion("log_name like", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotLike(String value) {
            addCriterion("log_name not like", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameIn(List<String> values) {
            addCriterion("log_name in", values, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotIn(List<String> values) {
            addCriterion("log_name not in", values, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameBetween(String value1, String value2) {
            addCriterion("log_name between", value1, value2, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotBetween(String value1, String value2) {
            addCriterion("log_name not between", value1, value2, "logName");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNull() {
            addCriterion("log_type is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("log_type is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(String value) {
            addCriterion("log_type =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(String value) {
            addCriterion("log_type <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(String value) {
            addCriterion("log_type >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("log_type >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(String value) {
            addCriterion("log_type <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(String value) {
            addCriterion("log_type <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLike(String value) {
            addCriterion("log_type like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotLike(String value) {
            addCriterion("log_type not like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<String> values) {
            addCriterion("log_type in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<String> values) {
            addCriterion("log_type not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(String value1, String value2) {
            addCriterion("log_type between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(String value1, String value2) {
            addCriterion("log_type not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogUrlIsNull() {
            addCriterion("log_url is null");
            return (Criteria) this;
        }

        public Criteria andLogUrlIsNotNull() {
            addCriterion("log_url is not null");
            return (Criteria) this;
        }

        public Criteria andLogUrlEqualTo(String value) {
            addCriterion("log_url =", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlNotEqualTo(String value) {
            addCriterion("log_url <>", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlGreaterThan(String value) {
            addCriterion("log_url >", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlGreaterThanOrEqualTo(String value) {
            addCriterion("log_url >=", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlLessThan(String value) {
            addCriterion("log_url <", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlLessThanOrEqualTo(String value) {
            addCriterion("log_url <=", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlLike(String value) {
            addCriterion("log_url like", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlNotLike(String value) {
            addCriterion("log_url not like", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlIn(List<String> values) {
            addCriterion("log_url in", values, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlNotIn(List<String> values) {
            addCriterion("log_url not in", values, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlBetween(String value1, String value2) {
            addCriterion("log_url between", value1, value2, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlNotBetween(String value1, String value2) {
            addCriterion("log_url not between", value1, value2, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogRequestParamIsNull() {
            addCriterion("log_request_param is null");
            return (Criteria) this;
        }

        public Criteria andLogRequestParamIsNotNull() {
            addCriterion("log_request_param is not null");
            return (Criteria) this;
        }

        public Criteria andLogRequestParamEqualTo(String value) {
            addCriterion("log_request_param =", value, "logRequestParam");
            return (Criteria) this;
        }

        public Criteria andLogRequestParamNotEqualTo(String value) {
            addCriterion("log_request_param <>", value, "logRequestParam");
            return (Criteria) this;
        }

        public Criteria andLogRequestParamGreaterThan(String value) {
            addCriterion("log_request_param >", value, "logRequestParam");
            return (Criteria) this;
        }

        public Criteria andLogRequestParamGreaterThanOrEqualTo(String value) {
            addCriterion("log_request_param >=", value, "logRequestParam");
            return (Criteria) this;
        }

        public Criteria andLogRequestParamLessThan(String value) {
            addCriterion("log_request_param <", value, "logRequestParam");
            return (Criteria) this;
        }

        public Criteria andLogRequestParamLessThanOrEqualTo(String value) {
            addCriterion("log_request_param <=", value, "logRequestParam");
            return (Criteria) this;
        }

        public Criteria andLogRequestParamLike(String value) {
            addCriterion("log_request_param like", value, "logRequestParam");
            return (Criteria) this;
        }

        public Criteria andLogRequestParamNotLike(String value) {
            addCriterion("log_request_param not like", value, "logRequestParam");
            return (Criteria) this;
        }

        public Criteria andLogRequestParamIn(List<String> values) {
            addCriterion("log_request_param in", values, "logRequestParam");
            return (Criteria) this;
        }

        public Criteria andLogRequestParamNotIn(List<String> values) {
            addCriterion("log_request_param not in", values, "logRequestParam");
            return (Criteria) this;
        }

        public Criteria andLogRequestParamBetween(String value1, String value2) {
            addCriterion("log_request_param between", value1, value2, "logRequestParam");
            return (Criteria) this;
        }

        public Criteria andLogRequestParamNotBetween(String value1, String value2) {
            addCriterion("log_request_param not between", value1, value2, "logRequestParam");
            return (Criteria) this;
        }

        public Criteria andLogUserIdIsNull() {
            addCriterion("log_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLogUserIdIsNotNull() {
            addCriterion("log_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogUserIdEqualTo(Long value) {
            addCriterion("log_user_id =", value, "logUserId");
            return (Criteria) this;
        }

        public Criteria andLogUserIdNotEqualTo(Long value) {
            addCriterion("log_user_id <>", value, "logUserId");
            return (Criteria) this;
        }

        public Criteria andLogUserIdGreaterThan(Long value) {
            addCriterion("log_user_id >", value, "logUserId");
            return (Criteria) this;
        }

        public Criteria andLogUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("log_user_id >=", value, "logUserId");
            return (Criteria) this;
        }

        public Criteria andLogUserIdLessThan(Long value) {
            addCriterion("log_user_id <", value, "logUserId");
            return (Criteria) this;
        }

        public Criteria andLogUserIdLessThanOrEqualTo(Long value) {
            addCriterion("log_user_id <=", value, "logUserId");
            return (Criteria) this;
        }

        public Criteria andLogUserIdIn(List<Long> values) {
            addCriterion("log_user_id in", values, "logUserId");
            return (Criteria) this;
        }

        public Criteria andLogUserIdNotIn(List<Long> values) {
            addCriterion("log_user_id not in", values, "logUserId");
            return (Criteria) this;
        }

        public Criteria andLogUserIdBetween(Long value1, Long value2) {
            addCriterion("log_user_id between", value1, value2, "logUserId");
            return (Criteria) this;
        }

        public Criteria andLogUserIdNotBetween(Long value1, Long value2) {
            addCriterion("log_user_id not between", value1, value2, "logUserId");
            return (Criteria) this;
        }

        public Criteria andLogUserIpIsNull() {
            addCriterion("log_user_ip is null");
            return (Criteria) this;
        }

        public Criteria andLogUserIpIsNotNull() {
            addCriterion("log_user_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLogUserIpEqualTo(String value) {
            addCriterion("log_user_ip =", value, "logUserIp");
            return (Criteria) this;
        }

        public Criteria andLogUserIpNotEqualTo(String value) {
            addCriterion("log_user_ip <>", value, "logUserIp");
            return (Criteria) this;
        }

        public Criteria andLogUserIpGreaterThan(String value) {
            addCriterion("log_user_ip >", value, "logUserIp");
            return (Criteria) this;
        }

        public Criteria andLogUserIpGreaterThanOrEqualTo(String value) {
            addCriterion("log_user_ip >=", value, "logUserIp");
            return (Criteria) this;
        }

        public Criteria andLogUserIpLessThan(String value) {
            addCriterion("log_user_ip <", value, "logUserIp");
            return (Criteria) this;
        }

        public Criteria andLogUserIpLessThanOrEqualTo(String value) {
            addCriterion("log_user_ip <=", value, "logUserIp");
            return (Criteria) this;
        }

        public Criteria andLogUserIpLike(String value) {
            addCriterion("log_user_ip like", value, "logUserIp");
            return (Criteria) this;
        }

        public Criteria andLogUserIpNotLike(String value) {
            addCriterion("log_user_ip not like", value, "logUserIp");
            return (Criteria) this;
        }

        public Criteria andLogUserIpIn(List<String> values) {
            addCriterion("log_user_ip in", values, "logUserIp");
            return (Criteria) this;
        }

        public Criteria andLogUserIpNotIn(List<String> values) {
            addCriterion("log_user_ip not in", values, "logUserIp");
            return (Criteria) this;
        }

        public Criteria andLogUserIpBetween(String value1, String value2) {
            addCriterion("log_user_ip between", value1, value2, "logUserIp");
            return (Criteria) this;
        }

        public Criteria andLogUserIpNotBetween(String value1, String value2) {
            addCriterion("log_user_ip not between", value1, value2, "logUserIp");
            return (Criteria) this;
        }

        public Criteria andLogCreatedIsNull() {
            addCriterion("log_created is null");
            return (Criteria) this;
        }

        public Criteria andLogCreatedIsNotNull() {
            addCriterion("log_created is not null");
            return (Criteria) this;
        }

        public Criteria andLogCreatedEqualTo(Date value) {
            addCriterion("log_created =", value, "logCreated");
            return (Criteria) this;
        }

        public Criteria andLogCreatedNotEqualTo(Date value) {
            addCriterion("log_created <>", value, "logCreated");
            return (Criteria) this;
        }

        public Criteria andLogCreatedGreaterThan(Date value) {
            addCriterion("log_created >", value, "logCreated");
            return (Criteria) this;
        }

        public Criteria andLogCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("log_created >=", value, "logCreated");
            return (Criteria) this;
        }

        public Criteria andLogCreatedLessThan(Date value) {
            addCriterion("log_created <", value, "logCreated");
            return (Criteria) this;
        }

        public Criteria andLogCreatedLessThanOrEqualTo(Date value) {
            addCriterion("log_created <=", value, "logCreated");
            return (Criteria) this;
        }

        public Criteria andLogCreatedIn(List<Date> values) {
            addCriterion("log_created in", values, "logCreated");
            return (Criteria) this;
        }

        public Criteria andLogCreatedNotIn(List<Date> values) {
            addCriterion("log_created not in", values, "logCreated");
            return (Criteria) this;
        }

        public Criteria andLogCreatedBetween(Date value1, Date value2) {
            addCriterion("log_created between", value1, value2, "logCreated");
            return (Criteria) this;
        }

        public Criteria andLogCreatedNotBetween(Date value1, Date value2) {
            addCriterion("log_created not between", value1, value2, "logCreated");
            return (Criteria) this;
        }

        public Criteria andLogRequestTypeIsNull() {
            addCriterion("log_request_type is null");
            return (Criteria) this;
        }

        public Criteria andLogRequestTypeIsNotNull() {
            addCriterion("log_request_type is not null");
            return (Criteria) this;
        }

        public Criteria andLogRequestTypeEqualTo(String value) {
            addCriterion("log_request_type =", value, "logRequestType");
            return (Criteria) this;
        }

        public Criteria andLogRequestTypeNotEqualTo(String value) {
            addCriterion("log_request_type <>", value, "logRequestType");
            return (Criteria) this;
        }

        public Criteria andLogRequestTypeGreaterThan(String value) {
            addCriterion("log_request_type >", value, "logRequestType");
            return (Criteria) this;
        }

        public Criteria andLogRequestTypeGreaterThanOrEqualTo(String value) {
            addCriterion("log_request_type >=", value, "logRequestType");
            return (Criteria) this;
        }

        public Criteria andLogRequestTypeLessThan(String value) {
            addCriterion("log_request_type <", value, "logRequestType");
            return (Criteria) this;
        }

        public Criteria andLogRequestTypeLessThanOrEqualTo(String value) {
            addCriterion("log_request_type <=", value, "logRequestType");
            return (Criteria) this;
        }

        public Criteria andLogRequestTypeLike(String value) {
            addCriterion("log_request_type like", value, "logRequestType");
            return (Criteria) this;
        }

        public Criteria andLogRequestTypeNotLike(String value) {
            addCriterion("log_request_type not like", value, "logRequestType");
            return (Criteria) this;
        }

        public Criteria andLogRequestTypeIn(List<String> values) {
            addCriterion("log_request_type in", values, "logRequestType");
            return (Criteria) this;
        }

        public Criteria andLogRequestTypeNotIn(List<String> values) {
            addCriterion("log_request_type not in", values, "logRequestType");
            return (Criteria) this;
        }

        public Criteria andLogRequestTypeBetween(String value1, String value2) {
            addCriterion("log_request_type between", value1, value2, "logRequestType");
            return (Criteria) this;
        }

        public Criteria andLogRequestTypeNotBetween(String value1, String value2) {
            addCriterion("log_request_type not between", value1, value2, "logRequestType");
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