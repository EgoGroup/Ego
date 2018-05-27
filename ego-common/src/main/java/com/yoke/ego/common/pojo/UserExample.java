package com.yoke.ego.common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Byte value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Byte value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Byte value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Byte value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Byte value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Byte> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Byte> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Byte value1, Byte value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserCreatedIsNull() {
            addCriterion("user_created is null");
            return (Criteria) this;
        }

        public Criteria andUserCreatedIsNotNull() {
            addCriterion("user_created is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreatedEqualTo(Date value) {
            addCriterion("user_created =", value, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedNotEqualTo(Date value) {
            addCriterion("user_created <>", value, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedGreaterThan(Date value) {
            addCriterion("user_created >", value, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("user_created >=", value, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedLessThan(Date value) {
            addCriterion("user_created <", value, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedLessThanOrEqualTo(Date value) {
            addCriterion("user_created <=", value, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedIn(List<Date> values) {
            addCriterion("user_created in", values, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedNotIn(List<Date> values) {
            addCriterion("user_created not in", values, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedBetween(Date value1, Date value2) {
            addCriterion("user_created between", value1, value2, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedNotBetween(Date value1, Date value2) {
            addCriterion("user_created not between", value1, value2, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedIsNull() {
            addCriterion("user_updated is null");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedIsNotNull() {
            addCriterion("user_updated is not null");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedEqualTo(Date value) {
            addCriterion("user_updated =", value, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedNotEqualTo(Date value) {
            addCriterion("user_updated <>", value, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedGreaterThan(Date value) {
            addCriterion("user_updated >", value, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("user_updated >=", value, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedLessThan(Date value) {
            addCriterion("user_updated <", value, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("user_updated <=", value, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedIn(List<Date> values) {
            addCriterion("user_updated in", values, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedNotIn(List<Date> values) {
            addCriterion("user_updated not in", values, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedBetween(Date value1, Date value2) {
            addCriterion("user_updated between", value1, value2, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("user_updated not between", value1, value2, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserMemoIsNull() {
            addCriterion("user_memo is null");
            return (Criteria) this;
        }

        public Criteria andUserMemoIsNotNull() {
            addCriterion("user_memo is not null");
            return (Criteria) this;
        }

        public Criteria andUserMemoEqualTo(String value) {
            addCriterion("user_memo =", value, "userMemo");
            return (Criteria) this;
        }

        public Criteria andUserMemoNotEqualTo(String value) {
            addCriterion("user_memo <>", value, "userMemo");
            return (Criteria) this;
        }

        public Criteria andUserMemoGreaterThan(String value) {
            addCriterion("user_memo >", value, "userMemo");
            return (Criteria) this;
        }

        public Criteria andUserMemoGreaterThanOrEqualTo(String value) {
            addCriterion("user_memo >=", value, "userMemo");
            return (Criteria) this;
        }

        public Criteria andUserMemoLessThan(String value) {
            addCriterion("user_memo <", value, "userMemo");
            return (Criteria) this;
        }

        public Criteria andUserMemoLessThanOrEqualTo(String value) {
            addCriterion("user_memo <=", value, "userMemo");
            return (Criteria) this;
        }

        public Criteria andUserMemoLike(String value) {
            addCriterion("user_memo like", value, "userMemo");
            return (Criteria) this;
        }

        public Criteria andUserMemoNotLike(String value) {
            addCriterion("user_memo not like", value, "userMemo");
            return (Criteria) this;
        }

        public Criteria andUserMemoIn(List<String> values) {
            addCriterion("user_memo in", values, "userMemo");
            return (Criteria) this;
        }

        public Criteria andUserMemoNotIn(List<String> values) {
            addCriterion("user_memo not in", values, "userMemo");
            return (Criteria) this;
        }

        public Criteria andUserMemoBetween(String value1, String value2) {
            addCriterion("user_memo between", value1, value2, "userMemo");
            return (Criteria) this;
        }

        public Criteria andUserMemoNotBetween(String value1, String value2) {
            addCriterion("user_memo not between", value1, value2, "userMemo");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNull() {
            addCriterion("user_tel is null");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNotNull() {
            addCriterion("user_tel is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelEqualTo(String value) {
            addCriterion("user_tel =", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotEqualTo(String value) {
            addCriterion("user_tel <>", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThan(String value) {
            addCriterion("user_tel >", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("user_tel >=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThan(String value) {
            addCriterion("user_tel <", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThanOrEqualTo(String value) {
            addCriterion("user_tel <=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLike(String value) {
            addCriterion("user_tel like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotLike(String value) {
            addCriterion("user_tel not like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelIn(List<String> values) {
            addCriterion("user_tel in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotIn(List<String> values) {
            addCriterion("user_tel not in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelBetween(String value1, String value2) {
            addCriterion("user_tel between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotBetween(String value1, String value2) {
            addCriterion("user_tel not between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeIsNull() {
            addCriterion("user_last_time is null");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeIsNotNull() {
            addCriterion("user_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeEqualTo(Date value) {
            addCriterion("user_last_time =", value, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeNotEqualTo(Date value) {
            addCriterion("user_last_time <>", value, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeGreaterThan(Date value) {
            addCriterion("user_last_time >", value, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_last_time >=", value, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeLessThan(Date value) {
            addCriterion("user_last_time <", value, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_last_time <=", value, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeIn(List<Date> values) {
            addCriterion("user_last_time in", values, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeNotIn(List<Date> values) {
            addCriterion("user_last_time not in", values, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeBetween(Date value1, Date value2) {
            addCriterion("user_last_time between", value1, value2, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_last_time not between", value1, value2, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberIsNull() {
            addCriterion("user_id_number is null");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberIsNotNull() {
            addCriterion("user_id_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberEqualTo(String value) {
            addCriterion("user_id_number =", value, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberNotEqualTo(String value) {
            addCriterion("user_id_number <>", value, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberGreaterThan(String value) {
            addCriterion("user_id_number >", value, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_id_number >=", value, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberLessThan(String value) {
            addCriterion("user_id_number <", value, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberLessThanOrEqualTo(String value) {
            addCriterion("user_id_number <=", value, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberLike(String value) {
            addCriterion("user_id_number like", value, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberNotLike(String value) {
            addCriterion("user_id_number not like", value, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberIn(List<String> values) {
            addCriterion("user_id_number in", values, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberNotIn(List<String> values) {
            addCriterion("user_id_number not in", values, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberBetween(String value1, String value2) {
            addCriterion("user_id_number between", value1, value2, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdNumberNotBetween(String value1, String value2) {
            addCriterion("user_id_number not between", value1, value2, "userIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNull() {
            addCriterion("user_real_name is null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNotNull() {
            addCriterion("user_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameEqualTo(String value) {
            addCriterion("user_real_name =", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotEqualTo(String value) {
            addCriterion("user_real_name <>", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThan(String value) {
            addCriterion("user_real_name >", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_real_name >=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThan(String value) {
            addCriterion("user_real_name <", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThanOrEqualTo(String value) {
            addCriterion("user_real_name <=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLike(String value) {
            addCriterion("user_real_name like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotLike(String value) {
            addCriterion("user_real_name not like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIn(List<String> values) {
            addCriterion("user_real_name in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotIn(List<String> values) {
            addCriterion("user_real_name not in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameBetween(String value1, String value2) {
            addCriterion("user_real_name between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotBetween(String value1, String value2) {
            addCriterion("user_real_name not between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(Byte value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(Byte value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(Byte value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(Byte value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(Byte value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<Byte> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<Byte> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(Byte value1, Byte value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(Byte value1, Byte value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserImageIsNull() {
            addCriterion("user_image is null");
            return (Criteria) this;
        }

        public Criteria andUserImageIsNotNull() {
            addCriterion("user_image is not null");
            return (Criteria) this;
        }

        public Criteria andUserImageEqualTo(String value) {
            addCriterion("user_image =", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageNotEqualTo(String value) {
            addCriterion("user_image <>", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageGreaterThan(String value) {
            addCriterion("user_image >", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageGreaterThanOrEqualTo(String value) {
            addCriterion("user_image >=", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageLessThan(String value) {
            addCriterion("user_image <", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageLessThanOrEqualTo(String value) {
            addCriterion("user_image <=", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageLike(String value) {
            addCriterion("user_image like", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageNotLike(String value) {
            addCriterion("user_image not like", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageIn(List<String> values) {
            addCriterion("user_image in", values, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageNotIn(List<String> values) {
            addCriterion("user_image not in", values, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageBetween(String value1, String value2) {
            addCriterion("user_image between", value1, value2, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageNotBetween(String value1, String value2) {
            addCriterion("user_image not between", value1, value2, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserAccountNumberIsNull() {
            addCriterion("user_account_number is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountNumberIsNotNull() {
            addCriterion("user_account_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountNumberEqualTo(String value) {
            addCriterion("user_account_number =", value, "userAccountNumber");
            return (Criteria) this;
        }

        public Criteria andUserAccountNumberNotEqualTo(String value) {
            addCriterion("user_account_number <>", value, "userAccountNumber");
            return (Criteria) this;
        }

        public Criteria andUserAccountNumberGreaterThan(String value) {
            addCriterion("user_account_number >", value, "userAccountNumber");
            return (Criteria) this;
        }

        public Criteria andUserAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_account_number >=", value, "userAccountNumber");
            return (Criteria) this;
        }

        public Criteria andUserAccountNumberLessThan(String value) {
            addCriterion("user_account_number <", value, "userAccountNumber");
            return (Criteria) this;
        }

        public Criteria andUserAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("user_account_number <=", value, "userAccountNumber");
            return (Criteria) this;
        }

        public Criteria andUserAccountNumberLike(String value) {
            addCriterion("user_account_number like", value, "userAccountNumber");
            return (Criteria) this;
        }

        public Criteria andUserAccountNumberNotLike(String value) {
            addCriterion("user_account_number not like", value, "userAccountNumber");
            return (Criteria) this;
        }

        public Criteria andUserAccountNumberIn(List<String> values) {
            addCriterion("user_account_number in", values, "userAccountNumber");
            return (Criteria) this;
        }

        public Criteria andUserAccountNumberNotIn(List<String> values) {
            addCriterion("user_account_number not in", values, "userAccountNumber");
            return (Criteria) this;
        }

        public Criteria andUserAccountNumberBetween(String value1, String value2) {
            addCriterion("user_account_number between", value1, value2, "userAccountNumber");
            return (Criteria) this;
        }

        public Criteria andUserAccountNumberNotBetween(String value1, String value2) {
            addCriterion("user_account_number not between", value1, value2, "userAccountNumber");
            return (Criteria) this;
        }

        public Criteria andUserPointsIsNull() {
            addCriterion("user_points is null");
            return (Criteria) this;
        }

        public Criteria andUserPointsIsNotNull() {
            addCriterion("user_points is not null");
            return (Criteria) this;
        }

        public Criteria andUserPointsEqualTo(Long value) {
            addCriterion("user_points =", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsNotEqualTo(Long value) {
            addCriterion("user_points <>", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsGreaterThan(Long value) {
            addCriterion("user_points >", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsGreaterThanOrEqualTo(Long value) {
            addCriterion("user_points >=", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsLessThan(Long value) {
            addCriterion("user_points <", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsLessThanOrEqualTo(Long value) {
            addCriterion("user_points <=", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsIn(List<Long> values) {
            addCriterion("user_points in", values, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsNotIn(List<Long> values) {
            addCriterion("user_points not in", values, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsBetween(Long value1, Long value2) {
            addCriterion("user_points between", value1, value2, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsNotBetween(Long value1, Long value2) {
            addCriterion("user_points not between", value1, value2, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserTimeIsNull() {
            addCriterion("user_time is null");
            return (Criteria) this;
        }

        public Criteria andUserTimeIsNotNull() {
            addCriterion("user_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserTimeEqualTo(Long value) {
            addCriterion("user_time =", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeNotEqualTo(Long value) {
            addCriterion("user_time <>", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeGreaterThan(Long value) {
            addCriterion("user_time >", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("user_time >=", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeLessThan(Long value) {
            addCriterion("user_time <", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeLessThanOrEqualTo(Long value) {
            addCriterion("user_time <=", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeIn(List<Long> values) {
            addCriterion("user_time in", values, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeNotIn(List<Long> values) {
            addCriterion("user_time not in", values, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeBetween(Long value1, Long value2) {
            addCriterion("user_time between", value1, value2, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeNotBetween(Long value1, Long value2) {
            addCriterion("user_time not between", value1, value2, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserStudentIdIsNull() {
            addCriterion("user_student_id is null");
            return (Criteria) this;
        }

        public Criteria andUserStudentIdIsNotNull() {
            addCriterion("user_student_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserStudentIdEqualTo(String value) {
            addCriterion("user_student_id =", value, "userStudentId");
            return (Criteria) this;
        }

        public Criteria andUserStudentIdNotEqualTo(String value) {
            addCriterion("user_student_id <>", value, "userStudentId");
            return (Criteria) this;
        }

        public Criteria andUserStudentIdGreaterThan(String value) {
            addCriterion("user_student_id >", value, "userStudentId");
            return (Criteria) this;
        }

        public Criteria andUserStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_student_id >=", value, "userStudentId");
            return (Criteria) this;
        }

        public Criteria andUserStudentIdLessThan(String value) {
            addCriterion("user_student_id <", value, "userStudentId");
            return (Criteria) this;
        }

        public Criteria andUserStudentIdLessThanOrEqualTo(String value) {
            addCriterion("user_student_id <=", value, "userStudentId");
            return (Criteria) this;
        }

        public Criteria andUserStudentIdLike(String value) {
            addCriterion("user_student_id like", value, "userStudentId");
            return (Criteria) this;
        }

        public Criteria andUserStudentIdNotLike(String value) {
            addCriterion("user_student_id not like", value, "userStudentId");
            return (Criteria) this;
        }

        public Criteria andUserStudentIdIn(List<String> values) {
            addCriterion("user_student_id in", values, "userStudentId");
            return (Criteria) this;
        }

        public Criteria andUserStudentIdNotIn(List<String> values) {
            addCriterion("user_student_id not in", values, "userStudentId");
            return (Criteria) this;
        }

        public Criteria andUserStudentIdBetween(String value1, String value2) {
            addCriterion("user_student_id between", value1, value2, "userStudentId");
            return (Criteria) this;
        }

        public Criteria andUserStudentIdNotBetween(String value1, String value2) {
            addCriterion("user_student_id not between", value1, value2, "userStudentId");
            return (Criteria) this;
        }

        public Criteria andUserSchoolIsNull() {
            addCriterion("user_school is null");
            return (Criteria) this;
        }

        public Criteria andUserSchoolIsNotNull() {
            addCriterion("user_school is not null");
            return (Criteria) this;
        }

        public Criteria andUserSchoolEqualTo(String value) {
            addCriterion("user_school =", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolNotEqualTo(String value) {
            addCriterion("user_school <>", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolGreaterThan(String value) {
            addCriterion("user_school >", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("user_school >=", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolLessThan(String value) {
            addCriterion("user_school <", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolLessThanOrEqualTo(String value) {
            addCriterion("user_school <=", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolLike(String value) {
            addCriterion("user_school like", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolNotLike(String value) {
            addCriterion("user_school not like", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolIn(List<String> values) {
            addCriterion("user_school in", values, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolNotIn(List<String> values) {
            addCriterion("user_school not in", values, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolBetween(String value1, String value2) {
            addCriterion("user_school between", value1, value2, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolNotBetween(String value1, String value2) {
            addCriterion("user_school not between", value1, value2, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserIssalerIsNull() {
            addCriterion("user_issaler is null");
            return (Criteria) this;
        }

        public Criteria andUserIssalerIsNotNull() {
            addCriterion("user_issaler is not null");
            return (Criteria) this;
        }

        public Criteria andUserIssalerEqualTo(Byte value) {
            addCriterion("user_issaler =", value, "userIssaler");
            return (Criteria) this;
        }

        public Criteria andUserIssalerNotEqualTo(Byte value) {
            addCriterion("user_issaler <>", value, "userIssaler");
            return (Criteria) this;
        }

        public Criteria andUserIssalerGreaterThan(Byte value) {
            addCriterion("user_issaler >", value, "userIssaler");
            return (Criteria) this;
        }

        public Criteria andUserIssalerGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_issaler >=", value, "userIssaler");
            return (Criteria) this;
        }

        public Criteria andUserIssalerLessThan(Byte value) {
            addCriterion("user_issaler <", value, "userIssaler");
            return (Criteria) this;
        }

        public Criteria andUserIssalerLessThanOrEqualTo(Byte value) {
            addCriterion("user_issaler <=", value, "userIssaler");
            return (Criteria) this;
        }

        public Criteria andUserIssalerIn(List<Byte> values) {
            addCriterion("user_issaler in", values, "userIssaler");
            return (Criteria) this;
        }

        public Criteria andUserIssalerNotIn(List<Byte> values) {
            addCriterion("user_issaler not in", values, "userIssaler");
            return (Criteria) this;
        }

        public Criteria andUserIssalerBetween(Byte value1, Byte value2) {
            addCriterion("user_issaler between", value1, value2, "userIssaler");
            return (Criteria) this;
        }

        public Criteria andUserIssalerNotBetween(Byte value1, Byte value2) {
            addCriterion("user_issaler not between", value1, value2, "userIssaler");
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