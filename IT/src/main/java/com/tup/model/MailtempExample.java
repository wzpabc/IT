package com.tup.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MailtempExample {
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
    public MailtempExample() {
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

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andEmailtoIsNull() {
            addCriterion("emailTo is null");
            return (Criteria) this;
        }

        public Criteria andEmailtoIsNotNull() {
            addCriterion("emailTo is not null");
            return (Criteria) this;
        }

        public Criteria andEmailtoEqualTo(String value) {
            addCriterion("emailTo =", value, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoNotEqualTo(String value) {
            addCriterion("emailTo <>", value, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoGreaterThan(String value) {
            addCriterion("emailTo >", value, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoGreaterThanOrEqualTo(String value) {
            addCriterion("emailTo >=", value, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoLessThan(String value) {
            addCriterion("emailTo <", value, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoLessThanOrEqualTo(String value) {
            addCriterion("emailTo <=", value, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoLike(String value) {
            addCriterion("emailTo like", value, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoNotLike(String value) {
            addCriterion("emailTo not like", value, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoIn(List<String> values) {
            addCriterion("emailTo in", values, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoNotIn(List<String> values) {
            addCriterion("emailTo not in", values, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoBetween(String value1, String value2) {
            addCriterion("emailTo between", value1, value2, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoNotBetween(String value1, String value2) {
            addCriterion("emailTo not between", value1, value2, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailccIsNull() {
            addCriterion("emailCC is null");
            return (Criteria) this;
        }

        public Criteria andEmailccIsNotNull() {
            addCriterion("emailCC is not null");
            return (Criteria) this;
        }

        public Criteria andEmailccEqualTo(String value) {
            addCriterion("emailCC =", value, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccNotEqualTo(String value) {
            addCriterion("emailCC <>", value, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccGreaterThan(String value) {
            addCriterion("emailCC >", value, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccGreaterThanOrEqualTo(String value) {
            addCriterion("emailCC >=", value, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccLessThan(String value) {
            addCriterion("emailCC <", value, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccLessThanOrEqualTo(String value) {
            addCriterion("emailCC <=", value, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccLike(String value) {
            addCriterion("emailCC like", value, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccNotLike(String value) {
            addCriterion("emailCC not like", value, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccIn(List<String> values) {
            addCriterion("emailCC in", values, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccNotIn(List<String> values) {
            addCriterion("emailCC not in", values, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccBetween(String value1, String value2) {
            addCriterion("emailCC between", value1, value2, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccNotBetween(String value1, String value2) {
            addCriterion("emailCC not between", value1, value2, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailbcIsNull() {
            addCriterion("emailBC is null");
            return (Criteria) this;
        }

        public Criteria andEmailbcIsNotNull() {
            addCriterion("emailBC is not null");
            return (Criteria) this;
        }

        public Criteria andEmailbcEqualTo(String value) {
            addCriterion("emailBC =", value, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcNotEqualTo(String value) {
            addCriterion("emailBC <>", value, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcGreaterThan(String value) {
            addCriterion("emailBC >", value, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcGreaterThanOrEqualTo(String value) {
            addCriterion("emailBC >=", value, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcLessThan(String value) {
            addCriterion("emailBC <", value, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcLessThanOrEqualTo(String value) {
            addCriterion("emailBC <=", value, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcLike(String value) {
            addCriterion("emailBC like", value, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcNotLike(String value) {
            addCriterion("emailBC not like", value, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcIn(List<String> values) {
            addCriterion("emailBC in", values, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcNotIn(List<String> values) {
            addCriterion("emailBC not in", values, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcBetween(String value1, String value2) {
            addCriterion("emailBC between", value1, value2, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcNotBetween(String value1, String value2) {
            addCriterion("emailBC not between", value1, value2, "emailbc");
            return (Criteria) this;
        }

        public Criteria andAttpathIsNull() {
            addCriterion("attPath is null");
            return (Criteria) this;
        }

        public Criteria andAttpathIsNotNull() {
            addCriterion("attPath is not null");
            return (Criteria) this;
        }

        public Criteria andAttpathEqualTo(String value) {
            addCriterion("attPath =", value, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathNotEqualTo(String value) {
            addCriterion("attPath <>", value, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathGreaterThan(String value) {
            addCriterion("attPath >", value, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathGreaterThanOrEqualTo(String value) {
            addCriterion("attPath >=", value, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathLessThan(String value) {
            addCriterion("attPath <", value, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathLessThanOrEqualTo(String value) {
            addCriterion("attPath <=", value, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathLike(String value) {
            addCriterion("attPath like", value, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathNotLike(String value) {
            addCriterion("attPath not like", value, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathIn(List<String> values) {
            addCriterion("attPath in", values, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathNotIn(List<String> values) {
            addCriterion("attPath not in", values, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathBetween(String value1, String value2) {
            addCriterion("attPath between", value1, value2, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathNotBetween(String value1, String value2) {
            addCriterion("attPath not between", value1, value2, "attpath");
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

        public Criteria andExecdateIsNull() {
            addCriterion("execDate is null");
            return (Criteria) this;
        }

        public Criteria andExecdateIsNotNull() {
            addCriterion("execDate is not null");
            return (Criteria) this;
        }

        public Criteria andExecdateEqualTo(Date value) {
            addCriterion("execDate =", value, "execdate");
            return (Criteria) this;
        }

        public Criteria andExecdateNotEqualTo(Date value) {
            addCriterion("execDate <>", value, "execdate");
            return (Criteria) this;
        }

        public Criteria andExecdateGreaterThan(Date value) {
            addCriterion("execDate >", value, "execdate");
            return (Criteria) this;
        }

        public Criteria andExecdateGreaterThanOrEqualTo(Date value) {
            addCriterion("execDate >=", value, "execdate");
            return (Criteria) this;
        }

        public Criteria andExecdateLessThan(Date value) {
            addCriterion("execDate <", value, "execdate");
            return (Criteria) this;
        }

        public Criteria andExecdateLessThanOrEqualTo(Date value) {
            addCriterion("execDate <=", value, "execdate");
            return (Criteria) this;
        }

        public Criteria andExecdateIn(List<Date> values) {
            addCriterion("execDate in", values, "execdate");
            return (Criteria) this;
        }

        public Criteria andExecdateNotIn(List<Date> values) {
            addCriterion("execDate not in", values, "execdate");
            return (Criteria) this;
        }

        public Criteria andExecdateBetween(Date value1, Date value2) {
            addCriterion("execDate between", value1, value2, "execdate");
            return (Criteria) this;
        }

        public Criteria andExecdateNotBetween(Date value1, Date value2) {
            addCriterion("execDate not between", value1, value2, "execdate");
            return (Criteria) this;
        }

        public Criteria andLastexecdateIsNull() {
            addCriterion("lastexecDate is null");
            return (Criteria) this;
        }

        public Criteria andLastexecdateIsNotNull() {
            addCriterion("lastexecDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastexecdateEqualTo(Date value) {
            addCriterion("lastexecDate =", value, "lastexecdate");
            return (Criteria) this;
        }

        public Criteria andLastexecdateNotEqualTo(Date value) {
            addCriterion("lastexecDate <>", value, "lastexecdate");
            return (Criteria) this;
        }

        public Criteria andLastexecdateGreaterThan(Date value) {
            addCriterion("lastexecDate >", value, "lastexecdate");
            return (Criteria) this;
        }

        public Criteria andLastexecdateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastexecDate >=", value, "lastexecdate");
            return (Criteria) this;
        }

        public Criteria andLastexecdateLessThan(Date value) {
            addCriterion("lastexecDate <", value, "lastexecdate");
            return (Criteria) this;
        }

        public Criteria andLastexecdateLessThanOrEqualTo(Date value) {
            addCriterion("lastexecDate <=", value, "lastexecdate");
            return (Criteria) this;
        }

        public Criteria andLastexecdateIn(List<Date> values) {
            addCriterion("lastexecDate in", values, "lastexecdate");
            return (Criteria) this;
        }

        public Criteria andLastexecdateNotIn(List<Date> values) {
            addCriterion("lastexecDate not in", values, "lastexecdate");
            return (Criteria) this;
        }

        public Criteria andLastexecdateBetween(Date value1, Date value2) {
            addCriterion("lastexecDate between", value1, value2, "lastexecdate");
            return (Criteria) this;
        }

        public Criteria andLastexecdateNotBetween(Date value1, Date value2) {
            addCriterion("lastexecDate not between", value1, value2, "lastexecdate");
            return (Criteria) this;
        }

        public Criteria andRetrytimesIsNull() {
            addCriterion("retrytimes is null");
            return (Criteria) this;
        }

        public Criteria andRetrytimesIsNotNull() {
            addCriterion("retrytimes is not null");
            return (Criteria) this;
        }

        public Criteria andRetrytimesEqualTo(Integer value) {
            addCriterion("retrytimes =", value, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesNotEqualTo(Integer value) {
            addCriterion("retrytimes <>", value, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesGreaterThan(Integer value) {
            addCriterion("retrytimes >", value, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("retrytimes >=", value, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesLessThan(Integer value) {
            addCriterion("retrytimes <", value, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesLessThanOrEqualTo(Integer value) {
            addCriterion("retrytimes <=", value, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesIn(List<Integer> values) {
            addCriterion("retrytimes in", values, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesNotIn(List<Integer> values) {
            addCriterion("retrytimes not in", values, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesBetween(Integer value1, Integer value2) {
            addCriterion("retrytimes between", value1, value2, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesNotBetween(Integer value1, Integer value2) {
            addCriterion("retrytimes not between", value1, value2, "retrytimes");
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