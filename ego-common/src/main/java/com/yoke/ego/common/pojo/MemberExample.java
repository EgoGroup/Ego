package com.yoke.ego.common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIsNull() {
            addCriterion("member_password is null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIsNotNull() {
            addCriterion("member_password is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordEqualTo(String value) {
            addCriterion("member_password =", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotEqualTo(String value) {
            addCriterion("member_password <>", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordGreaterThan(String value) {
            addCriterion("member_password >", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("member_password >=", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLessThan(String value) {
            addCriterion("member_password <", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLessThanOrEqualTo(String value) {
            addCriterion("member_password <=", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLike(String value) {
            addCriterion("member_password like", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotLike(String value) {
            addCriterion("member_password not like", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIn(List<String> values) {
            addCriterion("member_password in", values, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotIn(List<String> values) {
            addCriterion("member_password not in", values, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordBetween(String value1, String value2) {
            addCriterion("member_password between", value1, value2, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotBetween(String value1, String value2) {
            addCriterion("member_password not between", value1, value2, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedIsNull() {
            addCriterion("member_created is null");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedIsNotNull() {
            addCriterion("member_created is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedEqualTo(Date value) {
            addCriterion("member_created =", value, "memberCreated");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedNotEqualTo(Date value) {
            addCriterion("member_created <>", value, "memberCreated");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedGreaterThan(Date value) {
            addCriterion("member_created >", value, "memberCreated");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("member_created >=", value, "memberCreated");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedLessThan(Date value) {
            addCriterion("member_created <", value, "memberCreated");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedLessThanOrEqualTo(Date value) {
            addCriterion("member_created <=", value, "memberCreated");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedIn(List<Date> values) {
            addCriterion("member_created in", values, "memberCreated");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedNotIn(List<Date> values) {
            addCriterion("member_created not in", values, "memberCreated");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedBetween(Date value1, Date value2) {
            addCriterion("member_created between", value1, value2, "memberCreated");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedNotBetween(Date value1, Date value2) {
            addCriterion("member_created not between", value1, value2, "memberCreated");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedIsNull() {
            addCriterion("member_updated is null");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedIsNotNull() {
            addCriterion("member_updated is not null");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedEqualTo(Date value) {
            addCriterion("member_updated =", value, "memberUpdated");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedNotEqualTo(Date value) {
            addCriterion("member_updated <>", value, "memberUpdated");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedGreaterThan(Date value) {
            addCriterion("member_updated >", value, "memberUpdated");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("member_updated >=", value, "memberUpdated");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedLessThan(Date value) {
            addCriterion("member_updated <", value, "memberUpdated");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("member_updated <=", value, "memberUpdated");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedIn(List<Date> values) {
            addCriterion("member_updated in", values, "memberUpdated");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedNotIn(List<Date> values) {
            addCriterion("member_updated not in", values, "memberUpdated");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedBetween(Date value1, Date value2) {
            addCriterion("member_updated between", value1, value2, "memberUpdated");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("member_updated not between", value1, value2, "memberUpdated");
            return (Criteria) this;
        }

        public Criteria andMemberTelIsNull() {
            addCriterion("member_tel is null");
            return (Criteria) this;
        }

        public Criteria andMemberTelIsNotNull() {
            addCriterion("member_tel is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTelEqualTo(String value) {
            addCriterion("member_tel =", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelNotEqualTo(String value) {
            addCriterion("member_tel <>", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelGreaterThan(String value) {
            addCriterion("member_tel >", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelGreaterThanOrEqualTo(String value) {
            addCriterion("member_tel >=", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelLessThan(String value) {
            addCriterion("member_tel <", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelLessThanOrEqualTo(String value) {
            addCriterion("member_tel <=", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelLike(String value) {
            addCriterion("member_tel like", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelNotLike(String value) {
            addCriterion("member_tel not like", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelIn(List<String> values) {
            addCriterion("member_tel in", values, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelNotIn(List<String> values) {
            addCriterion("member_tel not in", values, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelBetween(String value1, String value2) {
            addCriterion("member_tel between", value1, value2, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelNotBetween(String value1, String value2) {
            addCriterion("member_tel not between", value1, value2, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNull() {
            addCriterion("member_email is null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNotNull() {
            addCriterion("member_email is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailEqualTo(String value) {
            addCriterion("member_email =", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotEqualTo(String value) {
            addCriterion("member_email <>", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThan(String value) {
            addCriterion("member_email >", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThanOrEqualTo(String value) {
            addCriterion("member_email >=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThan(String value) {
            addCriterion("member_email <", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThanOrEqualTo(String value) {
            addCriterion("member_email <=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLike(String value) {
            addCriterion("member_email like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotLike(String value) {
            addCriterion("member_email not like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIn(List<String> values) {
            addCriterion("member_email in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotIn(List<String> values) {
            addCriterion("member_email not in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailBetween(String value1, String value2) {
            addCriterion("member_email between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotBetween(String value1, String value2) {
            addCriterion("member_email not between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberStatusIsNull() {
            addCriterion("member_status is null");
            return (Criteria) this;
        }

        public Criteria andMemberStatusIsNotNull() {
            addCriterion("member_status is not null");
            return (Criteria) this;
        }

        public Criteria andMemberStatusEqualTo(Byte value) {
            addCriterion("member_status =", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusNotEqualTo(Byte value) {
            addCriterion("member_status <>", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusGreaterThan(Byte value) {
            addCriterion("member_status >", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("member_status >=", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusLessThan(Byte value) {
            addCriterion("member_status <", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusLessThanOrEqualTo(Byte value) {
            addCriterion("member_status <=", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusIn(List<Byte> values) {
            addCriterion("member_status in", values, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusNotIn(List<Byte> values) {
            addCriterion("member_status not in", values, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusBetween(Byte value1, Byte value2) {
            addCriterion("member_status between", value1, value2, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("member_status not between", value1, value2, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberLastTimeIsNull() {
            addCriterion("member_last_time is null");
            return (Criteria) this;
        }

        public Criteria andMemberLastTimeIsNotNull() {
            addCriterion("member_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLastTimeEqualTo(Date value) {
            addCriterion("member_last_time =", value, "memberLastTime");
            return (Criteria) this;
        }

        public Criteria andMemberLastTimeNotEqualTo(Date value) {
            addCriterion("member_last_time <>", value, "memberLastTime");
            return (Criteria) this;
        }

        public Criteria andMemberLastTimeGreaterThan(Date value) {
            addCriterion("member_last_time >", value, "memberLastTime");
            return (Criteria) this;
        }

        public Criteria andMemberLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("member_last_time >=", value, "memberLastTime");
            return (Criteria) this;
        }

        public Criteria andMemberLastTimeLessThan(Date value) {
            addCriterion("member_last_time <", value, "memberLastTime");
            return (Criteria) this;
        }

        public Criteria andMemberLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("member_last_time <=", value, "memberLastTime");
            return (Criteria) this;
        }

        public Criteria andMemberLastTimeIn(List<Date> values) {
            addCriterion("member_last_time in", values, "memberLastTime");
            return (Criteria) this;
        }

        public Criteria andMemberLastTimeNotIn(List<Date> values) {
            addCriterion("member_last_time not in", values, "memberLastTime");
            return (Criteria) this;
        }

        public Criteria andMemberLastTimeBetween(Date value1, Date value2) {
            addCriterion("member_last_time between", value1, value2, "memberLastTime");
            return (Criteria) this;
        }

        public Criteria andMemberLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("member_last_time not between", value1, value2, "memberLastTime");
            return (Criteria) this;
        }

        public Criteria andMemberImageIsNull() {
            addCriterion("member_image is null");
            return (Criteria) this;
        }

        public Criteria andMemberImageIsNotNull() {
            addCriterion("member_image is not null");
            return (Criteria) this;
        }

        public Criteria andMemberImageEqualTo(String value) {
            addCriterion("member_image =", value, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageNotEqualTo(String value) {
            addCriterion("member_image <>", value, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageGreaterThan(String value) {
            addCriterion("member_image >", value, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageGreaterThanOrEqualTo(String value) {
            addCriterion("member_image >=", value, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageLessThan(String value) {
            addCriterion("member_image <", value, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageLessThanOrEqualTo(String value) {
            addCriterion("member_image <=", value, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageLike(String value) {
            addCriterion("member_image like", value, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageNotLike(String value) {
            addCriterion("member_image not like", value, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageIn(List<String> values) {
            addCriterion("member_image in", values, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageNotIn(List<String> values) {
            addCriterion("member_image not in", values, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageBetween(String value1, String value2) {
            addCriterion("member_image between", value1, value2, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageNotBetween(String value1, String value2) {
            addCriterion("member_image not between", value1, value2, "memberImage");
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