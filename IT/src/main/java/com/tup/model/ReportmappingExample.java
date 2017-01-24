package com.tup.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportmappingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    protected String offset;
    protected String rows;

    public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getRows() {
		return rows;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}
    public ReportmappingExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRptaccountnoIsNull() {
            addCriterion("rptaccountno is null");
            return (Criteria) this;
        }

        public Criteria andRptaccountnoIsNotNull() {
            addCriterion("rptaccountno is not null");
            return (Criteria) this;
        }

        public Criteria andRptaccountnoEqualTo(String value) {
            addCriterion("rptaccountno =", value, "rptaccountno");
            return (Criteria) this;
        }

        public Criteria andRptaccountnoNotEqualTo(String value) {
            addCriterion("rptaccountno <>", value, "rptaccountno");
            return (Criteria) this;
        }

        public Criteria andRptaccountnoGreaterThan(String value) {
            addCriterion("rptaccountno >", value, "rptaccountno");
            return (Criteria) this;
        }

        public Criteria andRptaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("rptaccountno >=", value, "rptaccountno");
            return (Criteria) this;
        }

        public Criteria andRptaccountnoLessThan(String value) {
            addCriterion("rptaccountno <", value, "rptaccountno");
            return (Criteria) this;
        }

        public Criteria andRptaccountnoLessThanOrEqualTo(String value) {
            addCriterion("rptaccountno <=", value, "rptaccountno");
            return (Criteria) this;
        }

        public Criteria andRptaccountnoLike(String value) {
            addCriterion("rptaccountno like", value, "rptaccountno");
            return (Criteria) this;
        }

        public Criteria andRptaccountnoNotLike(String value) {
            addCriterion("rptaccountno not like", value, "rptaccountno");
            return (Criteria) this;
        }

        public Criteria andRptaccountnoIn(List<String> values) {
            addCriterion("rptaccountno in", values, "rptaccountno");
            return (Criteria) this;
        }

        public Criteria andRptaccountnoNotIn(List<String> values) {
            addCriterion("rptaccountno not in", values, "rptaccountno");
            return (Criteria) this;
        }

        public Criteria andRptaccountnoBetween(String value1, String value2) {
            addCriterion("rptaccountno between", value1, value2, "rptaccountno");
            return (Criteria) this;
        }

        public Criteria andRptaccountnoNotBetween(String value1, String value2) {
            addCriterion("rptaccountno not between", value1, value2, "rptaccountno");
            return (Criteria) this;
        }

        public Criteria andRptusernameIsNull() {
            addCriterion("rptusername is null");
            return (Criteria) this;
        }

        public Criteria andRptusernameIsNotNull() {
            addCriterion("rptusername is not null");
            return (Criteria) this;
        }

        public Criteria andRptusernameEqualTo(String value) {
            addCriterion("rptusername =", value, "rptusername");
            return (Criteria) this;
        }

        public Criteria andRptusernameNotEqualTo(String value) {
            addCriterion("rptusername <>", value, "rptusername");
            return (Criteria) this;
        }

        public Criteria andRptusernameGreaterThan(String value) {
            addCriterion("rptusername >", value, "rptusername");
            return (Criteria) this;
        }

        public Criteria andRptusernameGreaterThanOrEqualTo(String value) {
            addCriterion("rptusername >=", value, "rptusername");
            return (Criteria) this;
        }

        public Criteria andRptusernameLessThan(String value) {
            addCriterion("rptusername <", value, "rptusername");
            return (Criteria) this;
        }

        public Criteria andRptusernameLessThanOrEqualTo(String value) {
            addCriterion("rptusername <=", value, "rptusername");
            return (Criteria) this;
        }

        public Criteria andRptusernameLike(String value) {
            addCriterion("rptusername like", value, "rptusername");
            return (Criteria) this;
        }

        public Criteria andRptusernameNotLike(String value) {
            addCriterion("rptusername not like", value, "rptusername");
            return (Criteria) this;
        }

        public Criteria andRptusernameIn(List<String> values) {
            addCriterion("rptusername in", values, "rptusername");
            return (Criteria) this;
        }

        public Criteria andRptusernameNotIn(List<String> values) {
            addCriterion("rptusername not in", values, "rptusername");
            return (Criteria) this;
        }

        public Criteria andRptusernameBetween(String value1, String value2) {
            addCriterion("rptusername between", value1, value2, "rptusername");
            return (Criteria) this;
        }

        public Criteria andRptusernameNotBetween(String value1, String value2) {
            addCriterion("rptusername not between", value1, value2, "rptusername");
            return (Criteria) this;
        }

        public Criteria andStrurlIsNull() {
            addCriterion("strurl is null");
            return (Criteria) this;
        }

        public Criteria andStrurlIsNotNull() {
            addCriterion("strurl is not null");
            return (Criteria) this;
        }

        public Criteria andStrurlEqualTo(String value) {
            addCriterion("strurl =", value, "strurl");
            return (Criteria) this;
        }

        public Criteria andStrurlNotEqualTo(String value) {
            addCriterion("strurl <>", value, "strurl");
            return (Criteria) this;
        }

        public Criteria andStrurlGreaterThan(String value) {
            addCriterion("strurl >", value, "strurl");
            return (Criteria) this;
        }

        public Criteria andStrurlGreaterThanOrEqualTo(String value) {
            addCriterion("strurl >=", value, "strurl");
            return (Criteria) this;
        }

        public Criteria andStrurlLessThan(String value) {
            addCriterion("strurl <", value, "strurl");
            return (Criteria) this;
        }

        public Criteria andStrurlLessThanOrEqualTo(String value) {
            addCriterion("strurl <=", value, "strurl");
            return (Criteria) this;
        }

        public Criteria andStrurlLike(String value) {
            addCriterion("strurl like", value, "strurl");
            return (Criteria) this;
        }

        public Criteria andStrurlNotLike(String value) {
            addCriterion("strurl not like", value, "strurl");
            return (Criteria) this;
        }

        public Criteria andStrurlIn(List<String> values) {
            addCriterion("strurl in", values, "strurl");
            return (Criteria) this;
        }

        public Criteria andStrurlNotIn(List<String> values) {
            addCriterion("strurl not in", values, "strurl");
            return (Criteria) this;
        }

        public Criteria andStrurlBetween(String value1, String value2) {
            addCriterion("strurl between", value1, value2, "strurl");
            return (Criteria) this;
        }

        public Criteria andStrurlNotBetween(String value1, String value2) {
            addCriterion("strurl not between", value1, value2, "strurl");
            return (Criteria) this;
        }

        public Criteria andRptnameIsNull() {
            addCriterion("rptname is null");
            return (Criteria) this;
        }

        public Criteria andRptnameIsNotNull() {
            addCriterion("rptname is not null");
            return (Criteria) this;
        }

        public Criteria andRptnameEqualTo(String value) {
            addCriterion("rptname =", value, "rptname");
            return (Criteria) this;
        }

        public Criteria andRptnameNotEqualTo(String value) {
            addCriterion("rptname <>", value, "rptname");
            return (Criteria) this;
        }

        public Criteria andRptnameGreaterThan(String value) {
            addCriterion("rptname >", value, "rptname");
            return (Criteria) this;
        }

        public Criteria andRptnameGreaterThanOrEqualTo(String value) {
            addCriterion("rptname >=", value, "rptname");
            return (Criteria) this;
        }

        public Criteria andRptnameLessThan(String value) {
            addCriterion("rptname <", value, "rptname");
            return (Criteria) this;
        }

        public Criteria andRptnameLessThanOrEqualTo(String value) {
            addCriterion("rptname <=", value, "rptname");
            return (Criteria) this;
        }

        public Criteria andRptnameLike(String value) {
            addCriterion("rptname like", value, "rptname");
            return (Criteria) this;
        }

        public Criteria andRptnameNotLike(String value) {
            addCriterion("rptname not like", value, "rptname");
            return (Criteria) this;
        }

        public Criteria andRptnameIn(List<String> values) {
            addCriterion("rptname in", values, "rptname");
            return (Criteria) this;
        }

        public Criteria andRptnameNotIn(List<String> values) {
            addCriterion("rptname not in", values, "rptname");
            return (Criteria) this;
        }

        public Criteria andRptnameBetween(String value1, String value2) {
            addCriterion("rptname between", value1, value2, "rptname");
            return (Criteria) this;
        }

        public Criteria andRptnameNotBetween(String value1, String value2) {
            addCriterion("rptname not between", value1, value2, "rptname");
            return (Criteria) this;
        }

        public Criteria andAreanoIsNull() {
            addCriterion("areano is null");
            return (Criteria) this;
        }

        public Criteria andAreanoIsNotNull() {
            addCriterion("areano is not null");
            return (Criteria) this;
        }

        public Criteria andAreanoEqualTo(String value) {
            addCriterion("areano =", value, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoNotEqualTo(String value) {
            addCriterion("areano <>", value, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoGreaterThan(String value) {
            addCriterion("areano >", value, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoGreaterThanOrEqualTo(String value) {
            addCriterion("areano >=", value, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoLessThan(String value) {
            addCriterion("areano <", value, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoLessThanOrEqualTo(String value) {
            addCriterion("areano <=", value, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoLike(String value) {
            addCriterion("areano like", value, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoNotLike(String value) {
            addCriterion("areano not like", value, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoIn(List<String> values) {
            addCriterion("areano in", values, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoNotIn(List<String> values) {
            addCriterion("areano not in", values, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoBetween(String value1, String value2) {
            addCriterion("areano between", value1, value2, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoNotBetween(String value1, String value2) {
            addCriterion("areano not between", value1, value2, "areano");
            return (Criteria) this;
        }

        public Criteria andProvincenoIsNull() {
            addCriterion("provinceno is null");
            return (Criteria) this;
        }

        public Criteria andProvincenoIsNotNull() {
            addCriterion("provinceno is not null");
            return (Criteria) this;
        }

        public Criteria andProvincenoEqualTo(String value) {
            addCriterion("provinceno =", value, "provinceno");
            return (Criteria) this;
        }

        public Criteria andProvincenoNotEqualTo(String value) {
            addCriterion("provinceno <>", value, "provinceno");
            return (Criteria) this;
        }

        public Criteria andProvincenoGreaterThan(String value) {
            addCriterion("provinceno >", value, "provinceno");
            return (Criteria) this;
        }

        public Criteria andProvincenoGreaterThanOrEqualTo(String value) {
            addCriterion("provinceno >=", value, "provinceno");
            return (Criteria) this;
        }

        public Criteria andProvincenoLessThan(String value) {
            addCriterion("provinceno <", value, "provinceno");
            return (Criteria) this;
        }

        public Criteria andProvincenoLessThanOrEqualTo(String value) {
            addCriterion("provinceno <=", value, "provinceno");
            return (Criteria) this;
        }

        public Criteria andProvincenoLike(String value) {
            addCriterion("provinceno like", value, "provinceno");
            return (Criteria) this;
        }

        public Criteria andProvincenoNotLike(String value) {
            addCriterion("provinceno not like", value, "provinceno");
            return (Criteria) this;
        }

        public Criteria andProvincenoIn(List<String> values) {
            addCriterion("provinceno in", values, "provinceno");
            return (Criteria) this;
        }

        public Criteria andProvincenoNotIn(List<String> values) {
            addCriterion("provinceno not in", values, "provinceno");
            return (Criteria) this;
        }

        public Criteria andProvincenoBetween(String value1, String value2) {
            addCriterion("provinceno between", value1, value2, "provinceno");
            return (Criteria) this;
        }

        public Criteria andProvincenoNotBetween(String value1, String value2) {
            addCriterion("provinceno not between", value1, value2, "provinceno");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andQuarterIsNull() {
            addCriterion("quarter is null");
            return (Criteria) this;
        }

        public Criteria andQuarterIsNotNull() {
            addCriterion("quarter is not null");
            return (Criteria) this;
        }

        public Criteria andQuarterEqualTo(String value) {
            addCriterion("quarter =", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotEqualTo(String value) {
            addCriterion("quarter <>", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterGreaterThan(String value) {
            addCriterion("quarter >", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterGreaterThanOrEqualTo(String value) {
            addCriterion("quarter >=", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterLessThan(String value) {
            addCriterion("quarter <", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterLessThanOrEqualTo(String value) {
            addCriterion("quarter <=", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterLike(String value) {
            addCriterion("quarter like", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotLike(String value) {
            addCriterion("quarter not like", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterIn(List<String> values) {
            addCriterion("quarter in", values, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotIn(List<String> values) {
            addCriterion("quarter not in", values, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterBetween(String value1, String value2) {
            addCriterion("quarter between", value1, value2, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotBetween(String value1, String value2) {
            addCriterion("quarter not between", value1, value2, "quarter");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("month like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("month not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andWeekIsNull() {
            addCriterion("week is null");
            return (Criteria) this;
        }

        public Criteria andWeekIsNotNull() {
            addCriterion("week is not null");
            return (Criteria) this;
        }

        public Criteria andWeekEqualTo(String value) {
            addCriterion("week =", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotEqualTo(String value) {
            addCriterion("week <>", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThan(String value) {
            addCriterion("week >", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThanOrEqualTo(String value) {
            addCriterion("week >=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThan(String value) {
            addCriterion("week <", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThanOrEqualTo(String value) {
            addCriterion("week <=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLike(String value) {
            addCriterion("week like", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotLike(String value) {
            addCriterion("week not like", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekIn(List<String> values) {
            addCriterion("week in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotIn(List<String> values) {
            addCriterion("week not in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekBetween(String value1, String value2) {
            addCriterion("week between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotBetween(String value1, String value2) {
            addCriterion("week not between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andRplclsIsNull() {
            addCriterion("rplcls is null");
            return (Criteria) this;
        }

        public Criteria andRplclsIsNotNull() {
            addCriterion("rplcls is not null");
            return (Criteria) this;
        }

        public Criteria andRplclsEqualTo(String value) {
            addCriterion("rplcls =", value, "rplcls");
            return (Criteria) this;
        }

        public Criteria andRplclsNotEqualTo(String value) {
            addCriterion("rplcls <>", value, "rplcls");
            return (Criteria) this;
        }

        public Criteria andRplclsGreaterThan(String value) {
            addCriterion("rplcls >", value, "rplcls");
            return (Criteria) this;
        }

        public Criteria andRplclsGreaterThanOrEqualTo(String value) {
            addCriterion("rplcls >=", value, "rplcls");
            return (Criteria) this;
        }

        public Criteria andRplclsLessThan(String value) {
            addCriterion("rplcls <", value, "rplcls");
            return (Criteria) this;
        }

        public Criteria andRplclsLessThanOrEqualTo(String value) {
            addCriterion("rplcls <=", value, "rplcls");
            return (Criteria) this;
        }

        public Criteria andRplclsLike(String value) {
            addCriterion("rplcls like", value, "rplcls");
            return (Criteria) this;
        }

        public Criteria andRplclsNotLike(String value) {
            addCriterion("rplcls not like", value, "rplcls");
            return (Criteria) this;
        }

        public Criteria andRplclsIn(List<String> values) {
            addCriterion("rplcls in", values, "rplcls");
            return (Criteria) this;
        }

        public Criteria andRplclsNotIn(List<String> values) {
            addCriterion("rplcls not in", values, "rplcls");
            return (Criteria) this;
        }

        public Criteria andRplclsBetween(String value1, String value2) {
            addCriterion("rplcls between", value1, value2, "rplcls");
            return (Criteria) this;
        }

        public Criteria andRplclsNotBetween(String value1, String value2) {
            addCriterion("rplcls not between", value1, value2, "rplcls");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNull() {
            addCriterion("isactive is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("isactive is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(Integer value) {
            addCriterion("isactive =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(Integer value) {
            addCriterion("isactive <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(Integer value) {
            addCriterion("isactive >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("isactive >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(Integer value) {
            addCriterion("isactive <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(Integer value) {
            addCriterion("isactive <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<Integer> values) {
            addCriterion("isactive in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<Integer> values) {
            addCriterion("isactive not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(Integer value1, Integer value2) {
            addCriterion("isactive between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(Integer value1, Integer value2) {
            addCriterion("isactive not between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updatedate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("updatedate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("updatedate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("updatedate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("updatedate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("updatedate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("updatedate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("updatedate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("updatedate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("updatedate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("updatedate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNull() {
            addCriterion("deleteFlag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNotNull() {
            addCriterion("deleteFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagEqualTo(Integer value) {
            addCriterion("deleteFlag =", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotEqualTo(Integer value) {
            addCriterion("deleteFlag <>", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThan(Integer value) {
            addCriterion("deleteFlag >", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleteFlag >=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThan(Integer value) {
            addCriterion("deleteFlag <", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThanOrEqualTo(Integer value) {
            addCriterion("deleteFlag <=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIn(List<Integer> values) {
            addCriterion("deleteFlag in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotIn(List<Integer> values) {
            addCriterion("deleteFlag not in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagBetween(Integer value1, Integer value2) {
            addCriterion("deleteFlag between", value1, value2, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotBetween(Integer value1, Integer value2) {
            addCriterion("deleteFlag not between", value1, value2, "deleteflag");
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