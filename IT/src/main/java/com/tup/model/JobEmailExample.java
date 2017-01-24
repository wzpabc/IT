package com.tup.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobEmailExample {
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
    public JobEmailExample() {
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

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
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

        public Criteria andNextexecdateIsNull() {
            addCriterion("nextExecDate is null");
            return (Criteria) this;
        }

        public Criteria andNextexecdateIsNotNull() {
            addCriterion("nextExecDate is not null");
            return (Criteria) this;
        }

        public Criteria andNextexecdateEqualTo(Date value) {
            addCriterion("nextExecDate =", value, "nextexecdate");
            return (Criteria) this;
        }

        public Criteria andNextexecdateNotEqualTo(Date value) {
            addCriterion("nextExecDate <>", value, "nextexecdate");
            return (Criteria) this;
        }

        public Criteria andNextexecdateGreaterThan(Date value) {
            addCriterion("nextExecDate >", value, "nextexecdate");
            return (Criteria) this;
        }

        public Criteria andNextexecdateGreaterThanOrEqualTo(Date value) {
            addCriterion("nextExecDate >=", value, "nextexecdate");
            return (Criteria) this;
        }

        public Criteria andNextexecdateLessThan(Date value) {
            addCriterion("nextExecDate <", value, "nextexecdate");
            return (Criteria) this;
        }

        public Criteria andNextexecdateLessThanOrEqualTo(Date value) {
            addCriterion("nextExecDate <=", value, "nextexecdate");
            return (Criteria) this;
        }

        public Criteria andNextexecdateIn(List<Date> values) {
            addCriterion("nextExecDate in", values, "nextexecdate");
            return (Criteria) this;
        }

        public Criteria andNextexecdateNotIn(List<Date> values) {
            addCriterion("nextExecDate not in", values, "nextexecdate");
            return (Criteria) this;
        }

        public Criteria andNextexecdateBetween(Date value1, Date value2) {
            addCriterion("nextExecDate between", value1, value2, "nextexecdate");
            return (Criteria) this;
        }

        public Criteria andNextexecdateNotBetween(Date value1, Date value2) {
            addCriterion("nextExecDate not between", value1, value2, "nextexecdate");
            return (Criteria) this;
        }

        public Criteria andYearweekIsNull() {
            addCriterion("YearWeek is null");
            return (Criteria) this;
        }

        public Criteria andYearweekIsNotNull() {
            addCriterion("YearWeek is not null");
            return (Criteria) this;
        }

        public Criteria andYearweekEqualTo(String value) {
            addCriterion("YearWeek =", value, "yearweek");
            return (Criteria) this;
        }

        public Criteria andYearweekNotEqualTo(String value) {
            addCriterion("YearWeek <>", value, "yearweek");
            return (Criteria) this;
        }

        public Criteria andYearweekGreaterThan(String value) {
            addCriterion("YearWeek >", value, "yearweek");
            return (Criteria) this;
        }

        public Criteria andYearweekGreaterThanOrEqualTo(String value) {
            addCriterion("YearWeek >=", value, "yearweek");
            return (Criteria) this;
        }

        public Criteria andYearweekLessThan(String value) {
            addCriterion("YearWeek <", value, "yearweek");
            return (Criteria) this;
        }

        public Criteria andYearweekLessThanOrEqualTo(String value) {
            addCriterion("YearWeek <=", value, "yearweek");
            return (Criteria) this;
        }

        public Criteria andYearweekLike(String value) {
            addCriterion("YearWeek like", value, "yearweek");
            return (Criteria) this;
        }

        public Criteria andYearweekNotLike(String value) {
            addCriterion("YearWeek not like", value, "yearweek");
            return (Criteria) this;
        }

        public Criteria andYearweekIn(List<String> values) {
            addCriterion("YearWeek in", values, "yearweek");
            return (Criteria) this;
        }

        public Criteria andYearweekNotIn(List<String> values) {
            addCriterion("YearWeek not in", values, "yearweek");
            return (Criteria) this;
        }

        public Criteria andYearweekBetween(String value1, String value2) {
            addCriterion("YearWeek between", value1, value2, "yearweek");
            return (Criteria) this;
        }

        public Criteria andYearweekNotBetween(String value1, String value2) {
            addCriterion("YearWeek not between", value1, value2, "yearweek");
            return (Criteria) this;
        }

        public Criteria andOrgannoIsNull() {
            addCriterion("OrganNo is null");
            return (Criteria) this;
        }

        public Criteria andOrgannoIsNotNull() {
            addCriterion("OrganNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrgannoEqualTo(String value) {
            addCriterion("OrganNo =", value, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoNotEqualTo(String value) {
            addCriterion("OrganNo <>", value, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoGreaterThan(String value) {
            addCriterion("OrganNo >", value, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoGreaterThanOrEqualTo(String value) {
            addCriterion("OrganNo >=", value, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoLessThan(String value) {
            addCriterion("OrganNo <", value, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoLessThanOrEqualTo(String value) {
            addCriterion("OrganNo <=", value, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoLike(String value) {
            addCriterion("OrganNo like", value, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoNotLike(String value) {
            addCriterion("OrganNo not like", value, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoIn(List<String> values) {
            addCriterion("OrganNo in", values, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoNotIn(List<String> values) {
            addCriterion("OrganNo not in", values, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoBetween(String value1, String value2) {
            addCriterion("OrganNo between", value1, value2, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannoNotBetween(String value1, String value2) {
            addCriterion("OrganNo not between", value1, value2, "organno");
            return (Criteria) this;
        }

        public Criteria andOrgannameIsNull() {
            addCriterion("organName is null");
            return (Criteria) this;
        }

        public Criteria andOrgannameIsNotNull() {
            addCriterion("organName is not null");
            return (Criteria) this;
        }

        public Criteria andOrgannameEqualTo(String value) {
            addCriterion("organName =", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameNotEqualTo(String value) {
            addCriterion("organName <>", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameGreaterThan(String value) {
            addCriterion("organName >", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameGreaterThanOrEqualTo(String value) {
            addCriterion("organName >=", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameLessThan(String value) {
            addCriterion("organName <", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameLessThanOrEqualTo(String value) {
            addCriterion("organName <=", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameLike(String value) {
            addCriterion("organName like", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameNotLike(String value) {
            addCriterion("organName not like", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameIn(List<String> values) {
            addCriterion("organName in", values, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameNotIn(List<String> values) {
            addCriterion("organName not in", values, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameBetween(String value1, String value2) {
            addCriterion("organName between", value1, value2, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameNotBetween(String value1, String value2) {
            addCriterion("organName not between", value1, value2, "organname");
            return (Criteria) this;
        }

        public Criteria andEmailtoIsNull() {
            addCriterion("EmailTo is null");
            return (Criteria) this;
        }

        public Criteria andEmailtoIsNotNull() {
            addCriterion("EmailTo is not null");
            return (Criteria) this;
        }

        public Criteria andEmailtoEqualTo(String value) {
            addCriterion("EmailTo =", value, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoNotEqualTo(String value) {
            addCriterion("EmailTo <>", value, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoGreaterThan(String value) {
            addCriterion("EmailTo >", value, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoGreaterThanOrEqualTo(String value) {
            addCriterion("EmailTo >=", value, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoLessThan(String value) {
            addCriterion("EmailTo <", value, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoLessThanOrEqualTo(String value) {
            addCriterion("EmailTo <=", value, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoLike(String value) {
            addCriterion("EmailTo like", value, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoNotLike(String value) {
            addCriterion("EmailTo not like", value, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoIn(List<String> values) {
            addCriterion("EmailTo in", values, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoNotIn(List<String> values) {
            addCriterion("EmailTo not in", values, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoBetween(String value1, String value2) {
            addCriterion("EmailTo between", value1, value2, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailtoNotBetween(String value1, String value2) {
            addCriterion("EmailTo not between", value1, value2, "emailto");
            return (Criteria) this;
        }

        public Criteria andEmailccIsNull() {
            addCriterion("EmailCC is null");
            return (Criteria) this;
        }

        public Criteria andEmailccIsNotNull() {
            addCriterion("EmailCC is not null");
            return (Criteria) this;
        }

        public Criteria andEmailccEqualTo(String value) {
            addCriterion("EmailCC =", value, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccNotEqualTo(String value) {
            addCriterion("EmailCC <>", value, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccGreaterThan(String value) {
            addCriterion("EmailCC >", value, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccGreaterThanOrEqualTo(String value) {
            addCriterion("EmailCC >=", value, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccLessThan(String value) {
            addCriterion("EmailCC <", value, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccLessThanOrEqualTo(String value) {
            addCriterion("EmailCC <=", value, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccLike(String value) {
            addCriterion("EmailCC like", value, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccNotLike(String value) {
            addCriterion("EmailCC not like", value, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccIn(List<String> values) {
            addCriterion("EmailCC in", values, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccNotIn(List<String> values) {
            addCriterion("EmailCC not in", values, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccBetween(String value1, String value2) {
            addCriterion("EmailCC between", value1, value2, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailccNotBetween(String value1, String value2) {
            addCriterion("EmailCC not between", value1, value2, "emailcc");
            return (Criteria) this;
        }

        public Criteria andEmailbcIsNull() {
            addCriterion("EmailBC is null");
            return (Criteria) this;
        }

        public Criteria andEmailbcIsNotNull() {
            addCriterion("EmailBC is not null");
            return (Criteria) this;
        }

        public Criteria andEmailbcEqualTo(String value) {
            addCriterion("EmailBC =", value, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcNotEqualTo(String value) {
            addCriterion("EmailBC <>", value, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcGreaterThan(String value) {
            addCriterion("EmailBC >", value, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcGreaterThanOrEqualTo(String value) {
            addCriterion("EmailBC >=", value, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcLessThan(String value) {
            addCriterion("EmailBC <", value, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcLessThanOrEqualTo(String value) {
            addCriterion("EmailBC <=", value, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcLike(String value) {
            addCriterion("EmailBC like", value, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcNotLike(String value) {
            addCriterion("EmailBC not like", value, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcIn(List<String> values) {
            addCriterion("EmailBC in", values, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcNotIn(List<String> values) {
            addCriterion("EmailBC not in", values, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcBetween(String value1, String value2) {
            addCriterion("EmailBC between", value1, value2, "emailbc");
            return (Criteria) this;
        }

        public Criteria andEmailbcNotBetween(String value1, String value2) {
            addCriterion("EmailBC not between", value1, value2, "emailbc");
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

        public Criteria andIsactiveIsNull() {
            addCriterion("isActive is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("isActive is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(Integer value) {
            addCriterion("isActive =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(Integer value) {
            addCriterion("isActive <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(Integer value) {
            addCriterion("isActive >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("isActive >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(Integer value) {
            addCriterion("isActive <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(Integer value) {
            addCriterion("isActive <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<Integer> values) {
            addCriterion("isActive in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<Integer> values) {
            addCriterion("isActive not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(Integer value1, Integer value2) {
            addCriterion("isActive between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(Integer value1, Integer value2) {
            addCriterion("isActive not between", value1, value2, "isactive");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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