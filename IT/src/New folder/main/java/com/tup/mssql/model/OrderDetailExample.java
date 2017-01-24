package com.tup.mssql.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSdkcooIsNull() {
            addCriterion("SDKCOO is null");
            return (Criteria) this;
        }

        public Criteria andSdkcooIsNotNull() {
            addCriterion("SDKCOO is not null");
            return (Criteria) this;
        }

        public Criteria andSdkcooEqualTo(String value) {
            addCriterion("SDKCOO =", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooNotEqualTo(String value) {
            addCriterion("SDKCOO <>", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooGreaterThan(String value) {
            addCriterion("SDKCOO >", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooGreaterThanOrEqualTo(String value) {
            addCriterion("SDKCOO >=", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooLessThan(String value) {
            addCriterion("SDKCOO <", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooLessThanOrEqualTo(String value) {
            addCriterion("SDKCOO <=", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooLike(String value) {
            addCriterion("SDKCOO like", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooNotLike(String value) {
            addCriterion("SDKCOO not like", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooIn(List<String> values) {
            addCriterion("SDKCOO in", values, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooNotIn(List<String> values) {
            addCriterion("SDKCOO not in", values, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooBetween(String value1, String value2) {
            addCriterion("SDKCOO between", value1, value2, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooNotBetween(String value1, String value2) {
            addCriterion("SDKCOO not between", value1, value2, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSddocoIsNull() {
            addCriterion("SDDOCO is null");
            return (Criteria) this;
        }

        public Criteria andSddocoIsNotNull() {
            addCriterion("SDDOCO is not null");
            return (Criteria) this;
        }

        public Criteria andSddocoEqualTo(Long value) {
            addCriterion("SDDOCO =", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoNotEqualTo(Long value) {
            addCriterion("SDDOCO <>", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoGreaterThan(Long value) {
            addCriterion("SDDOCO >", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoGreaterThanOrEqualTo(Long value) {
            addCriterion("SDDOCO >=", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoLessThan(Long value) {
            addCriterion("SDDOCO <", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoLessThanOrEqualTo(Long value) {
            addCriterion("SDDOCO <=", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoIn(List<Long> values) {
            addCriterion("SDDOCO in", values, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoNotIn(List<Long> values) {
            addCriterion("SDDOCO not in", values, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoBetween(Long value1, Long value2) {
            addCriterion("SDDOCO between", value1, value2, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoNotBetween(Long value1, Long value2) {
            addCriterion("SDDOCO not between", value1, value2, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddctoIsNull() {
            addCriterion("SDDCTO is null");
            return (Criteria) this;
        }

        public Criteria andSddctoIsNotNull() {
            addCriterion("SDDCTO is not null");
            return (Criteria) this;
        }

        public Criteria andSddctoEqualTo(String value) {
            addCriterion("SDDCTO =", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoNotEqualTo(String value) {
            addCriterion("SDDCTO <>", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoGreaterThan(String value) {
            addCriterion("SDDCTO >", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoGreaterThanOrEqualTo(String value) {
            addCriterion("SDDCTO >=", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoLessThan(String value) {
            addCriterion("SDDCTO <", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoLessThanOrEqualTo(String value) {
            addCriterion("SDDCTO <=", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoLike(String value) {
            addCriterion("SDDCTO like", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoNotLike(String value) {
            addCriterion("SDDCTO not like", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoIn(List<String> values) {
            addCriterion("SDDCTO in", values, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoNotIn(List<String> values) {
            addCriterion("SDDCTO not in", values, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoBetween(String value1, String value2) {
            addCriterion("SDDCTO between", value1, value2, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoNotBetween(String value1, String value2) {
            addCriterion("SDDCTO not between", value1, value2, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSdlnidIsNull() {
            addCriterion("SDLNID is null");
            return (Criteria) this;
        }

        public Criteria andSdlnidIsNotNull() {
            addCriterion("SDLNID is not null");
            return (Criteria) this;
        }

        public Criteria andSdlnidEqualTo(BigDecimal value) {
            addCriterion("SDLNID =", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidNotEqualTo(BigDecimal value) {
            addCriterion("SDLNID <>", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidGreaterThan(BigDecimal value) {
            addCriterion("SDLNID >", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDLNID >=", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidLessThan(BigDecimal value) {
            addCriterion("SDLNID <", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDLNID <=", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidIn(List<BigDecimal> values) {
            addCriterion("SDLNID in", values, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidNotIn(List<BigDecimal> values) {
            addCriterion("SDLNID not in", values, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDLNID between", value1, value2, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDLNID not between", value1, value2, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdmcuIsNull() {
            addCriterion("SDMCU is null");
            return (Criteria) this;
        }

        public Criteria andSdmcuIsNotNull() {
            addCriterion("SDMCU is not null");
            return (Criteria) this;
        }

        public Criteria andSdmcuEqualTo(String value) {
            addCriterion("SDMCU =", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuNotEqualTo(String value) {
            addCriterion("SDMCU <>", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuGreaterThan(String value) {
            addCriterion("SDMCU >", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuGreaterThanOrEqualTo(String value) {
            addCriterion("SDMCU >=", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuLessThan(String value) {
            addCriterion("SDMCU <", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuLessThanOrEqualTo(String value) {
            addCriterion("SDMCU <=", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuLike(String value) {
            addCriterion("SDMCU like", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuNotLike(String value) {
            addCriterion("SDMCU not like", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuIn(List<String> values) {
            addCriterion("SDMCU in", values, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuNotIn(List<String> values) {
            addCriterion("SDMCU not in", values, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuBetween(String value1, String value2) {
            addCriterion("SDMCU between", value1, value2, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuNotBetween(String value1, String value2) {
            addCriterion("SDMCU not between", value1, value2, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdcoIsNull() {
            addCriterion("SDCO is null");
            return (Criteria) this;
        }

        public Criteria andSdcoIsNotNull() {
            addCriterion("SDCO is not null");
            return (Criteria) this;
        }

        public Criteria andSdcoEqualTo(String value) {
            addCriterion("SDCO =", value, "sdco");
            return (Criteria) this;
        }

        public Criteria andSdcoNotEqualTo(String value) {
            addCriterion("SDCO <>", value, "sdco");
            return (Criteria) this;
        }

        public Criteria andSdcoGreaterThan(String value) {
            addCriterion("SDCO >", value, "sdco");
            return (Criteria) this;
        }

        public Criteria andSdcoGreaterThanOrEqualTo(String value) {
            addCriterion("SDCO >=", value, "sdco");
            return (Criteria) this;
        }

        public Criteria andSdcoLessThan(String value) {
            addCriterion("SDCO <", value, "sdco");
            return (Criteria) this;
        }

        public Criteria andSdcoLessThanOrEqualTo(String value) {
            addCriterion("SDCO <=", value, "sdco");
            return (Criteria) this;
        }

        public Criteria andSdcoLike(String value) {
            addCriterion("SDCO like", value, "sdco");
            return (Criteria) this;
        }

        public Criteria andSdcoNotLike(String value) {
            addCriterion("SDCO not like", value, "sdco");
            return (Criteria) this;
        }

        public Criteria andSdcoIn(List<String> values) {
            addCriterion("SDCO in", values, "sdco");
            return (Criteria) this;
        }

        public Criteria andSdcoNotIn(List<String> values) {
            addCriterion("SDCO not in", values, "sdco");
            return (Criteria) this;
        }

        public Criteria andSdcoBetween(String value1, String value2) {
            addCriterion("SDCO between", value1, value2, "sdco");
            return (Criteria) this;
        }

        public Criteria andSdcoNotBetween(String value1, String value2) {
            addCriterion("SDCO not between", value1, value2, "sdco");
            return (Criteria) this;
        }

        public Criteria andSdan8IsNull() {
            addCriterion("SDAN8 is null");
            return (Criteria) this;
        }

        public Criteria andSdan8IsNotNull() {
            addCriterion("SDAN8 is not null");
            return (Criteria) this;
        }

        public Criteria andSdan8EqualTo(Integer value) {
            addCriterion("SDAN8 =", value, "sdan8");
            return (Criteria) this;
        }

        public Criteria andSdan8NotEqualTo(Integer value) {
            addCriterion("SDAN8 <>", value, "sdan8");
            return (Criteria) this;
        }

        public Criteria andSdan8GreaterThan(Integer value) {
            addCriterion("SDAN8 >", value, "sdan8");
            return (Criteria) this;
        }

        public Criteria andSdan8GreaterThanOrEqualTo(Integer value) {
            addCriterion("SDAN8 >=", value, "sdan8");
            return (Criteria) this;
        }

        public Criteria andSdan8LessThan(Integer value) {
            addCriterion("SDAN8 <", value, "sdan8");
            return (Criteria) this;
        }

        public Criteria andSdan8LessThanOrEqualTo(Integer value) {
            addCriterion("SDAN8 <=", value, "sdan8");
            return (Criteria) this;
        }

        public Criteria andSdan8In(List<Integer> values) {
            addCriterion("SDAN8 in", values, "sdan8");
            return (Criteria) this;
        }

        public Criteria andSdan8NotIn(List<Integer> values) {
            addCriterion("SDAN8 not in", values, "sdan8");
            return (Criteria) this;
        }

        public Criteria andSdan8Between(Integer value1, Integer value2) {
            addCriterion("SDAN8 between", value1, value2, "sdan8");
            return (Criteria) this;
        }

        public Criteria andSdan8NotBetween(Integer value1, Integer value2) {
            addCriterion("SDAN8 not between", value1, value2, "sdan8");
            return (Criteria) this;
        }

        public Criteria andSdshanIsNull() {
            addCriterion("SDSHAN is null");
            return (Criteria) this;
        }

        public Criteria andSdshanIsNotNull() {
            addCriterion("SDSHAN is not null");
            return (Criteria) this;
        }

        public Criteria andSdshanEqualTo(Integer value) {
            addCriterion("SDSHAN =", value, "sdshan");
            return (Criteria) this;
        }

        public Criteria andSdshanNotEqualTo(Integer value) {
            addCriterion("SDSHAN <>", value, "sdshan");
            return (Criteria) this;
        }

        public Criteria andSdshanGreaterThan(Integer value) {
            addCriterion("SDSHAN >", value, "sdshan");
            return (Criteria) this;
        }

        public Criteria andSdshanGreaterThanOrEqualTo(Integer value) {
            addCriterion("SDSHAN >=", value, "sdshan");
            return (Criteria) this;
        }

        public Criteria andSdshanLessThan(Integer value) {
            addCriterion("SDSHAN <", value, "sdshan");
            return (Criteria) this;
        }

        public Criteria andSdshanLessThanOrEqualTo(Integer value) {
            addCriterion("SDSHAN <=", value, "sdshan");
            return (Criteria) this;
        }

        public Criteria andSdshanIn(List<Integer> values) {
            addCriterion("SDSHAN in", values, "sdshan");
            return (Criteria) this;
        }

        public Criteria andSdshanNotIn(List<Integer> values) {
            addCriterion("SDSHAN not in", values, "sdshan");
            return (Criteria) this;
        }

        public Criteria andSdshanBetween(Integer value1, Integer value2) {
            addCriterion("SDSHAN between", value1, value2, "sdshan");
            return (Criteria) this;
        }

        public Criteria andSdshanNotBetween(Integer value1, Integer value2) {
            addCriterion("SDSHAN not between", value1, value2, "sdshan");
            return (Criteria) this;
        }

        public Criteria andSdpa8IsNull() {
            addCriterion("SDPA8 is null");
            return (Criteria) this;
        }

        public Criteria andSdpa8IsNotNull() {
            addCriterion("SDPA8 is not null");
            return (Criteria) this;
        }

        public Criteria andSdpa8EqualTo(Integer value) {
            addCriterion("SDPA8 =", value, "sdpa8");
            return (Criteria) this;
        }

        public Criteria andSdpa8NotEqualTo(Integer value) {
            addCriterion("SDPA8 <>", value, "sdpa8");
            return (Criteria) this;
        }

        public Criteria andSdpa8GreaterThan(Integer value) {
            addCriterion("SDPA8 >", value, "sdpa8");
            return (Criteria) this;
        }

        public Criteria andSdpa8GreaterThanOrEqualTo(Integer value) {
            addCriterion("SDPA8 >=", value, "sdpa8");
            return (Criteria) this;
        }

        public Criteria andSdpa8LessThan(Integer value) {
            addCriterion("SDPA8 <", value, "sdpa8");
            return (Criteria) this;
        }

        public Criteria andSdpa8LessThanOrEqualTo(Integer value) {
            addCriterion("SDPA8 <=", value, "sdpa8");
            return (Criteria) this;
        }

        public Criteria andSdpa8In(List<Integer> values) {
            addCriterion("SDPA8 in", values, "sdpa8");
            return (Criteria) this;
        }

        public Criteria andSdpa8NotIn(List<Integer> values) {
            addCriterion("SDPA8 not in", values, "sdpa8");
            return (Criteria) this;
        }

        public Criteria andSdpa8Between(Integer value1, Integer value2) {
            addCriterion("SDPA8 between", value1, value2, "sdpa8");
            return (Criteria) this;
        }

        public Criteria andSdpa8NotBetween(Integer value1, Integer value2) {
            addCriterion("SDPA8 not between", value1, value2, "sdpa8");
            return (Criteria) this;
        }

        public Criteria andSdlntyIsNull() {
            addCriterion("SDLNTY is null");
            return (Criteria) this;
        }

        public Criteria andSdlntyIsNotNull() {
            addCriterion("SDLNTY is not null");
            return (Criteria) this;
        }

        public Criteria andSdlntyEqualTo(String value) {
            addCriterion("SDLNTY =", value, "sdlnty");
            return (Criteria) this;
        }

        public Criteria andSdlntyNotEqualTo(String value) {
            addCriterion("SDLNTY <>", value, "sdlnty");
            return (Criteria) this;
        }

        public Criteria andSdlntyGreaterThan(String value) {
            addCriterion("SDLNTY >", value, "sdlnty");
            return (Criteria) this;
        }

        public Criteria andSdlntyGreaterThanOrEqualTo(String value) {
            addCriterion("SDLNTY >=", value, "sdlnty");
            return (Criteria) this;
        }

        public Criteria andSdlntyLessThan(String value) {
            addCriterion("SDLNTY <", value, "sdlnty");
            return (Criteria) this;
        }

        public Criteria andSdlntyLessThanOrEqualTo(String value) {
            addCriterion("SDLNTY <=", value, "sdlnty");
            return (Criteria) this;
        }

        public Criteria andSdlntyLike(String value) {
            addCriterion("SDLNTY like", value, "sdlnty");
            return (Criteria) this;
        }

        public Criteria andSdlntyNotLike(String value) {
            addCriterion("SDLNTY not like", value, "sdlnty");
            return (Criteria) this;
        }

        public Criteria andSdlntyIn(List<String> values) {
            addCriterion("SDLNTY in", values, "sdlnty");
            return (Criteria) this;
        }

        public Criteria andSdlntyNotIn(List<String> values) {
            addCriterion("SDLNTY not in", values, "sdlnty");
            return (Criteria) this;
        }

        public Criteria andSdlntyBetween(String value1, String value2) {
            addCriterion("SDLNTY between", value1, value2, "sdlnty");
            return (Criteria) this;
        }

        public Criteria andSdlntyNotBetween(String value1, String value2) {
            addCriterion("SDLNTY not between", value1, value2, "sdlnty");
            return (Criteria) this;
        }

        public Criteria andSddrqjIsNull() {
            addCriterion("SDDRQJ is null");
            return (Criteria) this;
        }

        public Criteria andSddrqjIsNotNull() {
            addCriterion("SDDRQJ is not null");
            return (Criteria) this;
        }

        public Criteria andSddrqjEqualTo(Date value) {
            addCriterionForJDBCDate("SDDRQJ =", value, "sddrqj");
            return (Criteria) this;
        }

        public Criteria andSddrqjNotEqualTo(Date value) {
            addCriterionForJDBCDate("SDDRQJ <>", value, "sddrqj");
            return (Criteria) this;
        }

        public Criteria andSddrqjGreaterThan(Date value) {
            addCriterionForJDBCDate("SDDRQJ >", value, "sddrqj");
            return (Criteria) this;
        }

        public Criteria andSddrqjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SDDRQJ >=", value, "sddrqj");
            return (Criteria) this;
        }

        public Criteria andSddrqjLessThan(Date value) {
            addCriterionForJDBCDate("SDDRQJ <", value, "sddrqj");
            return (Criteria) this;
        }

        public Criteria andSddrqjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SDDRQJ <=", value, "sddrqj");
            return (Criteria) this;
        }

        public Criteria andSddrqjIn(List<Date> values) {
            addCriterionForJDBCDate("SDDRQJ in", values, "sddrqj");
            return (Criteria) this;
        }

        public Criteria andSddrqjNotIn(List<Date> values) {
            addCriterionForJDBCDate("SDDRQJ not in", values, "sddrqj");
            return (Criteria) this;
        }

        public Criteria andSddrqjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SDDRQJ between", value1, value2, "sddrqj");
            return (Criteria) this;
        }

        public Criteria andSddrqjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SDDRQJ not between", value1, value2, "sddrqj");
            return (Criteria) this;
        }

        public Criteria andSdtrdjIsNull() {
            addCriterion("SDTRDJ is null");
            return (Criteria) this;
        }

        public Criteria andSdtrdjIsNotNull() {
            addCriterion("SDTRDJ is not null");
            return (Criteria) this;
        }

        public Criteria andSdtrdjEqualTo(Date value) {
            addCriterionForJDBCDate("SDTRDJ =", value, "sdtrdj");
            return (Criteria) this;
        }

        public Criteria andSdtrdjNotEqualTo(Date value) {
            addCriterionForJDBCDate("SDTRDJ <>", value, "sdtrdj");
            return (Criteria) this;
        }

        public Criteria andSdtrdjGreaterThan(Date value) {
            addCriterionForJDBCDate("SDTRDJ >", value, "sdtrdj");
            return (Criteria) this;
        }

        public Criteria andSdtrdjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SDTRDJ >=", value, "sdtrdj");
            return (Criteria) this;
        }

        public Criteria andSdtrdjLessThan(Date value) {
            addCriterionForJDBCDate("SDTRDJ <", value, "sdtrdj");
            return (Criteria) this;
        }

        public Criteria andSdtrdjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SDTRDJ <=", value, "sdtrdj");
            return (Criteria) this;
        }

        public Criteria andSdtrdjIn(List<Date> values) {
            addCriterionForJDBCDate("SDTRDJ in", values, "sdtrdj");
            return (Criteria) this;
        }

        public Criteria andSdtrdjNotIn(List<Date> values) {
            addCriterionForJDBCDate("SDTRDJ not in", values, "sdtrdj");
            return (Criteria) this;
        }

        public Criteria andSdtrdjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SDTRDJ between", value1, value2, "sdtrdj");
            return (Criteria) this;
        }

        public Criteria andSdtrdjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SDTRDJ not between", value1, value2, "sdtrdj");
            return (Criteria) this;
        }

        public Criteria andSdpddjIsNull() {
            addCriterion("SDPDDJ is null");
            return (Criteria) this;
        }

        public Criteria andSdpddjIsNotNull() {
            addCriterion("SDPDDJ is not null");
            return (Criteria) this;
        }

        public Criteria andSdpddjEqualTo(Date value) {
            addCriterion("SDPDDJ =", value, "sdpddj");
            return (Criteria) this;
        }

        public Criteria andSdpddjNotEqualTo(Date value) {
            addCriterion("SDPDDJ <>", value, "sdpddj");
            return (Criteria) this;
        }

        public Criteria andSdpddjGreaterThan(Date value) {
            addCriterion("SDPDDJ >", value, "sdpddj");
            return (Criteria) this;
        }

        public Criteria andSdpddjGreaterThanOrEqualTo(Date value) {
            addCriterion("SDPDDJ >=", value, "sdpddj");
            return (Criteria) this;
        }

        public Criteria andSdpddjLessThan(Date value) {
            addCriterion("SDPDDJ <", value, "sdpddj");
            return (Criteria) this;
        }

        public Criteria andSdpddjLessThanOrEqualTo(Date value) {
            addCriterion("SDPDDJ <=", value, "sdpddj");
            return (Criteria) this;
        }

        public Criteria andSdpddjIn(List<Date> values) {
            addCriterion("SDPDDJ in", values, "sdpddj");
            return (Criteria) this;
        }

        public Criteria andSdpddjNotIn(List<Date> values) {
            addCriterion("SDPDDJ not in", values, "sdpddj");
            return (Criteria) this;
        }

        public Criteria andSdpddjBetween(Date value1, Date value2) {
            addCriterion("SDPDDJ between", value1, value2, "sdpddj");
            return (Criteria) this;
        }

        public Criteria andSdpddjNotBetween(Date value1, Date value2) {
            addCriterion("SDPDDJ not between", value1, value2, "sdpddj");
            return (Criteria) this;
        }

        public Criteria andSdopdjIsNull() {
            addCriterion("SDOPDJ is null");
            return (Criteria) this;
        }

        public Criteria andSdopdjIsNotNull() {
            addCriterion("SDOPDJ is not null");
            return (Criteria) this;
        }

        public Criteria andSdopdjEqualTo(Date value) {
            addCriterion("SDOPDJ =", value, "sdopdj");
            return (Criteria) this;
        }

        public Criteria andSdopdjNotEqualTo(Date value) {
            addCriterion("SDOPDJ <>", value, "sdopdj");
            return (Criteria) this;
        }

        public Criteria andSdopdjGreaterThan(Date value) {
            addCriterion("SDOPDJ >", value, "sdopdj");
            return (Criteria) this;
        }

        public Criteria andSdopdjGreaterThanOrEqualTo(Date value) {
            addCriterion("SDOPDJ >=", value, "sdopdj");
            return (Criteria) this;
        }

        public Criteria andSdopdjLessThan(Date value) {
            addCriterion("SDOPDJ <", value, "sdopdj");
            return (Criteria) this;
        }

        public Criteria andSdopdjLessThanOrEqualTo(Date value) {
            addCriterion("SDOPDJ <=", value, "sdopdj");
            return (Criteria) this;
        }

        public Criteria andSdopdjIn(List<Date> values) {
            addCriterion("SDOPDJ in", values, "sdopdj");
            return (Criteria) this;
        }

        public Criteria andSdopdjNotIn(List<Date> values) {
            addCriterion("SDOPDJ not in", values, "sdopdj");
            return (Criteria) this;
        }

        public Criteria andSdopdjBetween(Date value1, Date value2) {
            addCriterion("SDOPDJ between", value1, value2, "sdopdj");
            return (Criteria) this;
        }

        public Criteria andSdopdjNotBetween(Date value1, Date value2) {
            addCriterion("SDOPDJ not between", value1, value2, "sdopdj");
            return (Criteria) this;
        }

        public Criteria andSdaddjIsNull() {
            addCriterion("SDADDJ is null");
            return (Criteria) this;
        }

        public Criteria andSdaddjIsNotNull() {
            addCriterion("SDADDJ is not null");
            return (Criteria) this;
        }

        public Criteria andSdaddjEqualTo(Date value) {
            addCriterion("SDADDJ =", value, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjNotEqualTo(Date value) {
            addCriterion("SDADDJ <>", value, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjGreaterThan(Date value) {
            addCriterion("SDADDJ >", value, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjGreaterThanOrEqualTo(Date value) {
            addCriterion("SDADDJ >=", value, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjLessThan(Date value) {
            addCriterion("SDADDJ <", value, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjLessThanOrEqualTo(Date value) {
            addCriterion("SDADDJ <=", value, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjIn(List<Date> values) {
            addCriterion("SDADDJ in", values, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjNotIn(List<Date> values) {
            addCriterion("SDADDJ not in", values, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjBetween(Date value1, Date value2) {
            addCriterion("SDADDJ between", value1, value2, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjNotBetween(Date value1, Date value2) {
            addCriterion("SDADDJ not between", value1, value2, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdcndjIsNull() {
            addCriterion("SDCNDJ is null");
            return (Criteria) this;
        }

        public Criteria andSdcndjIsNotNull() {
            addCriterion("SDCNDJ is not null");
            return (Criteria) this;
        }

        public Criteria andSdcndjEqualTo(Date value) {
            addCriterionForJDBCDate("SDCNDJ =", value, "sdcndj");
            return (Criteria) this;
        }

        public Criteria andSdcndjNotEqualTo(Date value) {
            addCriterionForJDBCDate("SDCNDJ <>", value, "sdcndj");
            return (Criteria) this;
        }

        public Criteria andSdcndjGreaterThan(Date value) {
            addCriterionForJDBCDate("SDCNDJ >", value, "sdcndj");
            return (Criteria) this;
        }

        public Criteria andSdcndjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SDCNDJ >=", value, "sdcndj");
            return (Criteria) this;
        }

        public Criteria andSdcndjLessThan(Date value) {
            addCriterionForJDBCDate("SDCNDJ <", value, "sdcndj");
            return (Criteria) this;
        }

        public Criteria andSdcndjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SDCNDJ <=", value, "sdcndj");
            return (Criteria) this;
        }

        public Criteria andSdcndjIn(List<Date> values) {
            addCriterionForJDBCDate("SDCNDJ in", values, "sdcndj");
            return (Criteria) this;
        }

        public Criteria andSdcndjNotIn(List<Date> values) {
            addCriterionForJDBCDate("SDCNDJ not in", values, "sdcndj");
            return (Criteria) this;
        }

        public Criteria andSdcndjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SDCNDJ between", value1, value2, "sdcndj");
            return (Criteria) this;
        }

        public Criteria andSdcndjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SDCNDJ not between", value1, value2, "sdcndj");
            return (Criteria) this;
        }

        public Criteria andSddglIsNull() {
            addCriterion("SDDGL is null");
            return (Criteria) this;
        }

        public Criteria andSddglIsNotNull() {
            addCriterion("SDDGL is not null");
            return (Criteria) this;
        }

        public Criteria andSddglEqualTo(Date value) {
            addCriterionForJDBCDate("SDDGL =", value, "sddgl");
            return (Criteria) this;
        }

        public Criteria andSddglNotEqualTo(Date value) {
            addCriterionForJDBCDate("SDDGL <>", value, "sddgl");
            return (Criteria) this;
        }

        public Criteria andSddglGreaterThan(Date value) {
            addCriterionForJDBCDate("SDDGL >", value, "sddgl");
            return (Criteria) this;
        }

        public Criteria andSddglGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SDDGL >=", value, "sddgl");
            return (Criteria) this;
        }

        public Criteria andSddglLessThan(Date value) {
            addCriterionForJDBCDate("SDDGL <", value, "sddgl");
            return (Criteria) this;
        }

        public Criteria andSddglLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SDDGL <=", value, "sddgl");
            return (Criteria) this;
        }

        public Criteria andSddglIn(List<Date> values) {
            addCriterionForJDBCDate("SDDGL in", values, "sddgl");
            return (Criteria) this;
        }

        public Criteria andSddglNotIn(List<Date> values) {
            addCriterionForJDBCDate("SDDGL not in", values, "sddgl");
            return (Criteria) this;
        }

        public Criteria andSddglBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SDDGL between", value1, value2, "sddgl");
            return (Criteria) this;
        }

        public Criteria andSddglNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SDDGL not between", value1, value2, "sddgl");
            return (Criteria) this;
        }

        public Criteria andSdrsdjIsNull() {
            addCriterion("SDRSDJ is null");
            return (Criteria) this;
        }

        public Criteria andSdrsdjIsNotNull() {
            addCriterion("SDRSDJ is not null");
            return (Criteria) this;
        }

        public Criteria andSdrsdjEqualTo(Date value) {
            addCriterion("SDRSDJ =", value, "sdrsdj");
            return (Criteria) this;
        }

        public Criteria andSdrsdjNotEqualTo(Date value) {
            addCriterion("SDRSDJ <>", value, "sdrsdj");
            return (Criteria) this;
        }

        public Criteria andSdrsdjGreaterThan(Date value) {
            addCriterion("SDRSDJ >", value, "sdrsdj");
            return (Criteria) this;
        }

        public Criteria andSdrsdjGreaterThanOrEqualTo(Date value) {
            addCriterion("SDRSDJ >=", value, "sdrsdj");
            return (Criteria) this;
        }

        public Criteria andSdrsdjLessThan(Date value) {
            addCriterion("SDRSDJ <", value, "sdrsdj");
            return (Criteria) this;
        }

        public Criteria andSdrsdjLessThanOrEqualTo(Date value) {
            addCriterion("SDRSDJ <=", value, "sdrsdj");
            return (Criteria) this;
        }

        public Criteria andSdrsdjIn(List<Date> values) {
            addCriterion("SDRSDJ in", values, "sdrsdj");
            return (Criteria) this;
        }

        public Criteria andSdrsdjNotIn(List<Date> values) {
            addCriterion("SDRSDJ not in", values, "sdrsdj");
            return (Criteria) this;
        }

        public Criteria andSdrsdjBetween(Date value1, Date value2) {
            addCriterion("SDRSDJ between", value1, value2, "sdrsdj");
            return (Criteria) this;
        }

        public Criteria andSdrsdjNotBetween(Date value1, Date value2) {
            addCriterion("SDRSDJ not between", value1, value2, "sdrsdj");
            return (Criteria) this;
        }

        public Criteria andSdvr02IsNull() {
            addCriterion("SDVR02 is null");
            return (Criteria) this;
        }

        public Criteria andSdvr02IsNotNull() {
            addCriterion("SDVR02 is not null");
            return (Criteria) this;
        }

        public Criteria andSdvr02EqualTo(String value) {
            addCriterion("SDVR02 =", value, "sdvr02");
            return (Criteria) this;
        }

        public Criteria andSdvr02NotEqualTo(String value) {
            addCriterion("SDVR02 <>", value, "sdvr02");
            return (Criteria) this;
        }

        public Criteria andSdvr02GreaterThan(String value) {
            addCriterion("SDVR02 >", value, "sdvr02");
            return (Criteria) this;
        }

        public Criteria andSdvr02GreaterThanOrEqualTo(String value) {
            addCriterion("SDVR02 >=", value, "sdvr02");
            return (Criteria) this;
        }

        public Criteria andSdvr02LessThan(String value) {
            addCriterion("SDVR02 <", value, "sdvr02");
            return (Criteria) this;
        }

        public Criteria andSdvr02LessThanOrEqualTo(String value) {
            addCriterion("SDVR02 <=", value, "sdvr02");
            return (Criteria) this;
        }

        public Criteria andSdvr02Like(String value) {
            addCriterion("SDVR02 like", value, "sdvr02");
            return (Criteria) this;
        }

        public Criteria andSdvr02NotLike(String value) {
            addCriterion("SDVR02 not like", value, "sdvr02");
            return (Criteria) this;
        }

        public Criteria andSdvr02In(List<String> values) {
            addCriterion("SDVR02 in", values, "sdvr02");
            return (Criteria) this;
        }

        public Criteria andSdvr02NotIn(List<String> values) {
            addCriterion("SDVR02 not in", values, "sdvr02");
            return (Criteria) this;
        }

        public Criteria andSdvr02Between(String value1, String value2) {
            addCriterion("SDVR02 between", value1, value2, "sdvr02");
            return (Criteria) this;
        }

        public Criteria andSdvr02NotBetween(String value1, String value2) {
            addCriterion("SDVR02 not between", value1, value2, "sdvr02");
            return (Criteria) this;
        }

        public Criteria andSdlitmIsNull() {
            addCriterion("SDLITM is null");
            return (Criteria) this;
        }

        public Criteria andSdlitmIsNotNull() {
            addCriterion("SDLITM is not null");
            return (Criteria) this;
        }

        public Criteria andSdlitmEqualTo(String value) {
            addCriterion("SDLITM =", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmNotEqualTo(String value) {
            addCriterion("SDLITM <>", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmGreaterThan(String value) {
            addCriterion("SDLITM >", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmGreaterThanOrEqualTo(String value) {
            addCriterion("SDLITM >=", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmLessThan(String value) {
            addCriterion("SDLITM <", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmLessThanOrEqualTo(String value) {
            addCriterion("SDLITM <=", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmLike(String value) {
            addCriterion("SDLITM like", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmNotLike(String value) {
            addCriterion("SDLITM not like", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmIn(List<String> values) {
            addCriterion("SDLITM in", values, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmNotIn(List<String> values) {
            addCriterion("SDLITM not in", values, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmBetween(String value1, String value2) {
            addCriterion("SDLITM between", value1, value2, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmNotBetween(String value1, String value2) {
            addCriterion("SDLITM not between", value1, value2, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlocnIsNull() {
            addCriterion("SDLOCN is null");
            return (Criteria) this;
        }

        public Criteria andSdlocnIsNotNull() {
            addCriterion("SDLOCN is not null");
            return (Criteria) this;
        }

        public Criteria andSdlocnEqualTo(String value) {
            addCriterion("SDLOCN =", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnNotEqualTo(String value) {
            addCriterion("SDLOCN <>", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnGreaterThan(String value) {
            addCriterion("SDLOCN >", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnGreaterThanOrEqualTo(String value) {
            addCriterion("SDLOCN >=", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnLessThan(String value) {
            addCriterion("SDLOCN <", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnLessThanOrEqualTo(String value) {
            addCriterion("SDLOCN <=", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnLike(String value) {
            addCriterion("SDLOCN like", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnNotLike(String value) {
            addCriterion("SDLOCN not like", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnIn(List<String> values) {
            addCriterion("SDLOCN in", values, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnNotIn(List<String> values) {
            addCriterion("SDLOCN not in", values, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnBetween(String value1, String value2) {
            addCriterion("SDLOCN between", value1, value2, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnNotBetween(String value1, String value2) {
            addCriterion("SDLOCN not between", value1, value2, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlotnIsNull() {
            addCriterion("SDLOTN is null");
            return (Criteria) this;
        }

        public Criteria andSdlotnIsNotNull() {
            addCriterion("SDLOTN is not null");
            return (Criteria) this;
        }

        public Criteria andSdlotnEqualTo(String value) {
            addCriterion("SDLOTN =", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnNotEqualTo(String value) {
            addCriterion("SDLOTN <>", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnGreaterThan(String value) {
            addCriterion("SDLOTN >", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnGreaterThanOrEqualTo(String value) {
            addCriterion("SDLOTN >=", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnLessThan(String value) {
            addCriterion("SDLOTN <", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnLessThanOrEqualTo(String value) {
            addCriterion("SDLOTN <=", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnLike(String value) {
            addCriterion("SDLOTN like", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnNotLike(String value) {
            addCriterion("SDLOTN not like", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnIn(List<String> values) {
            addCriterion("SDLOTN in", values, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnNotIn(List<String> values) {
            addCriterion("SDLOTN not in", values, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnBetween(String value1, String value2) {
            addCriterion("SDLOTN between", value1, value2, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnNotBetween(String value1, String value2) {
            addCriterion("SDLOTN not between", value1, value2, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSddsc1IsNull() {
            addCriterion("SDDSC1 is null");
            return (Criteria) this;
        }

        public Criteria andSddsc1IsNotNull() {
            addCriterion("SDDSC1 is not null");
            return (Criteria) this;
        }

        public Criteria andSddsc1EqualTo(String value) {
            addCriterion("SDDSC1 =", value, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1NotEqualTo(String value) {
            addCriterion("SDDSC1 <>", value, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1GreaterThan(String value) {
            addCriterion("SDDSC1 >", value, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1GreaterThanOrEqualTo(String value) {
            addCriterion("SDDSC1 >=", value, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1LessThan(String value) {
            addCriterion("SDDSC1 <", value, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1LessThanOrEqualTo(String value) {
            addCriterion("SDDSC1 <=", value, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1In(List<String> values) {
            addCriterion("SDDSC1 in", values, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1NotIn(List<String> values) {
            addCriterion("SDDSC1 not in", values, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1Between(String value1, String value2) {
            addCriterion("SDDSC1 between", value1, value2, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1NotBetween(String value1, String value2) {
            addCriterion("SDDSC1 not between", value1, value2, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc2IsNull() {
            addCriterion("SDDSC2 is null");
            return (Criteria) this;
        }

        public Criteria andSddsc2IsNotNull() {
            addCriterion("SDDSC2 is not null");
            return (Criteria) this;
        }

        public Criteria andSddsc2EqualTo(String value) {
            addCriterion("SDDSC2 =", value, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2NotEqualTo(String value) {
            addCriterion("SDDSC2 <>", value, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2GreaterThan(String value) {
            addCriterion("SDDSC2 >", value, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2GreaterThanOrEqualTo(String value) {
            addCriterion("SDDSC2 >=", value, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2LessThan(String value) {
            addCriterion("SDDSC2 <", value, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2LessThanOrEqualTo(String value) {
            addCriterion("SDDSC2 <=", value, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2In(List<String> values) {
            addCriterion("SDDSC2 in", values, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2NotIn(List<String> values) {
            addCriterion("SDDSC2 not in", values, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2Between(String value1, String value2) {
            addCriterion("SDDSC2 between", value1, value2, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2NotBetween(String value1, String value2) {
            addCriterion("SDDSC2 not between", value1, value2, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSdnxtrIsNull() {
            addCriterion("SDNXTR is null");
            return (Criteria) this;
        }

        public Criteria andSdnxtrIsNotNull() {
            addCriterion("SDNXTR is not null");
            return (Criteria) this;
        }

        public Criteria andSdnxtrEqualTo(Integer value) {
            addCriterion("SDNXTR =", value, "sdnxtr");
            return (Criteria) this;
        }

        public Criteria andSdnxtrNotEqualTo(Integer value) {
            addCriterion("SDNXTR <>", value, "sdnxtr");
            return (Criteria) this;
        }

        public Criteria andSdnxtrGreaterThan(Integer value) {
            addCriterion("SDNXTR >", value, "sdnxtr");
            return (Criteria) this;
        }

        public Criteria andSdnxtrGreaterThanOrEqualTo(Integer value) {
            addCriterion("SDNXTR >=", value, "sdnxtr");
            return (Criteria) this;
        }

        public Criteria andSdnxtrLessThan(Integer value) {
            addCriterion("SDNXTR <", value, "sdnxtr");
            return (Criteria) this;
        }

        public Criteria andSdnxtrLessThanOrEqualTo(Integer value) {
            addCriterion("SDNXTR <=", value, "sdnxtr");
            return (Criteria) this;
        }

        public Criteria andSdnxtrIn(List<Integer> values) {
            addCriterion("SDNXTR in", values, "sdnxtr");
            return (Criteria) this;
        }

        public Criteria andSdnxtrNotIn(List<Integer> values) {
            addCriterion("SDNXTR not in", values, "sdnxtr");
            return (Criteria) this;
        }

        public Criteria andSdnxtrBetween(Integer value1, Integer value2) {
            addCriterion("SDNXTR between", value1, value2, "sdnxtr");
            return (Criteria) this;
        }

        public Criteria andSdnxtrNotBetween(Integer value1, Integer value2) {
            addCriterion("SDNXTR not between", value1, value2, "sdnxtr");
            return (Criteria) this;
        }

        public Criteria andSdlttrIsNull() {
            addCriterion("SDLTTR is null");
            return (Criteria) this;
        }

        public Criteria andSdlttrIsNotNull() {
            addCriterion("SDLTTR is not null");
            return (Criteria) this;
        }

        public Criteria andSdlttrEqualTo(Integer value) {
            addCriterion("SDLTTR =", value, "sdlttr");
            return (Criteria) this;
        }

        public Criteria andSdlttrNotEqualTo(Integer value) {
            addCriterion("SDLTTR <>", value, "sdlttr");
            return (Criteria) this;
        }

        public Criteria andSdlttrGreaterThan(Integer value) {
            addCriterion("SDLTTR >", value, "sdlttr");
            return (Criteria) this;
        }

        public Criteria andSdlttrGreaterThanOrEqualTo(Integer value) {
            addCriterion("SDLTTR >=", value, "sdlttr");
            return (Criteria) this;
        }

        public Criteria andSdlttrLessThan(Integer value) {
            addCriterion("SDLTTR <", value, "sdlttr");
            return (Criteria) this;
        }

        public Criteria andSdlttrLessThanOrEqualTo(Integer value) {
            addCriterion("SDLTTR <=", value, "sdlttr");
            return (Criteria) this;
        }

        public Criteria andSdlttrIn(List<Integer> values) {
            addCriterion("SDLTTR in", values, "sdlttr");
            return (Criteria) this;
        }

        public Criteria andSdlttrNotIn(List<Integer> values) {
            addCriterion("SDLTTR not in", values, "sdlttr");
            return (Criteria) this;
        }

        public Criteria andSdlttrBetween(Integer value1, Integer value2) {
            addCriterion("SDLTTR between", value1, value2, "sdlttr");
            return (Criteria) this;
        }

        public Criteria andSdlttrNotBetween(Integer value1, Integer value2) {
            addCriterion("SDLTTR not between", value1, value2, "sdlttr");
            return (Criteria) this;
        }

        public Criteria andSdemcuIsNull() {
            addCriterion("SDEMCU is null");
            return (Criteria) this;
        }

        public Criteria andSdemcuIsNotNull() {
            addCriterion("SDEMCU is not null");
            return (Criteria) this;
        }

        public Criteria andSdemcuEqualTo(String value) {
            addCriterion("SDEMCU =", value, "sdemcu");
            return (Criteria) this;
        }

        public Criteria andSdemcuNotEqualTo(String value) {
            addCriterion("SDEMCU <>", value, "sdemcu");
            return (Criteria) this;
        }

        public Criteria andSdemcuGreaterThan(String value) {
            addCriterion("SDEMCU >", value, "sdemcu");
            return (Criteria) this;
        }

        public Criteria andSdemcuGreaterThanOrEqualTo(String value) {
            addCriterion("SDEMCU >=", value, "sdemcu");
            return (Criteria) this;
        }

        public Criteria andSdemcuLessThan(String value) {
            addCriterion("SDEMCU <", value, "sdemcu");
            return (Criteria) this;
        }

        public Criteria andSdemcuLessThanOrEqualTo(String value) {
            addCriterion("SDEMCU <=", value, "sdemcu");
            return (Criteria) this;
        }

        public Criteria andSdemcuLike(String value) {
            addCriterion("SDEMCU like", value, "sdemcu");
            return (Criteria) this;
        }

        public Criteria andSdemcuNotLike(String value) {
            addCriterion("SDEMCU not like", value, "sdemcu");
            return (Criteria) this;
        }

        public Criteria andSdemcuIn(List<String> values) {
            addCriterion("SDEMCU in", values, "sdemcu");
            return (Criteria) this;
        }

        public Criteria andSdemcuNotIn(List<String> values) {
            addCriterion("SDEMCU not in", values, "sdemcu");
            return (Criteria) this;
        }

        public Criteria andSdemcuBetween(String value1, String value2) {
            addCriterion("SDEMCU between", value1, value2, "sdemcu");
            return (Criteria) this;
        }

        public Criteria andSdemcuNotBetween(String value1, String value2) {
            addCriterion("SDEMCU not between", value1, value2, "sdemcu");
            return (Criteria) this;
        }

        public Criteria andSdrlitIsNull() {
            addCriterion("SDRLIT is null");
            return (Criteria) this;
        }

        public Criteria andSdrlitIsNotNull() {
            addCriterion("SDRLIT is not null");
            return (Criteria) this;
        }

        public Criteria andSdrlitEqualTo(String value) {
            addCriterion("SDRLIT =", value, "sdrlit");
            return (Criteria) this;
        }

        public Criteria andSdrlitNotEqualTo(String value) {
            addCriterion("SDRLIT <>", value, "sdrlit");
            return (Criteria) this;
        }

        public Criteria andSdrlitGreaterThan(String value) {
            addCriterion("SDRLIT >", value, "sdrlit");
            return (Criteria) this;
        }

        public Criteria andSdrlitGreaterThanOrEqualTo(String value) {
            addCriterion("SDRLIT >=", value, "sdrlit");
            return (Criteria) this;
        }

        public Criteria andSdrlitLessThan(String value) {
            addCriterion("SDRLIT <", value, "sdrlit");
            return (Criteria) this;
        }

        public Criteria andSdrlitLessThanOrEqualTo(String value) {
            addCriterion("SDRLIT <=", value, "sdrlit");
            return (Criteria) this;
        }

        public Criteria andSdrlitLike(String value) {
            addCriterion("SDRLIT like", value, "sdrlit");
            return (Criteria) this;
        }

        public Criteria andSdrlitNotLike(String value) {
            addCriterion("SDRLIT not like", value, "sdrlit");
            return (Criteria) this;
        }

        public Criteria andSdrlitIn(List<String> values) {
            addCriterion("SDRLIT in", values, "sdrlit");
            return (Criteria) this;
        }

        public Criteria andSdrlitNotIn(List<String> values) {
            addCriterion("SDRLIT not in", values, "sdrlit");
            return (Criteria) this;
        }

        public Criteria andSdrlitBetween(String value1, String value2) {
            addCriterion("SDRLIT between", value1, value2, "sdrlit");
            return (Criteria) this;
        }

        public Criteria andSdrlitNotBetween(String value1, String value2) {
            addCriterion("SDRLIT not between", value1, value2, "sdrlit");
            return (Criteria) this;
        }

        public Criteria andSdktlnIsNull() {
            addCriterion("SDKTLN is null");
            return (Criteria) this;
        }

        public Criteria andSdktlnIsNotNull() {
            addCriterion("SDKTLN is not null");
            return (Criteria) this;
        }

        public Criteria andSdktlnEqualTo(String value) {
            addCriterion("SDKTLN =", value, "sdktln");
            return (Criteria) this;
        }

        public Criteria andSdktlnNotEqualTo(String value) {
            addCriterion("SDKTLN <>", value, "sdktln");
            return (Criteria) this;
        }

        public Criteria andSdktlnGreaterThan(String value) {
            addCriterion("SDKTLN >", value, "sdktln");
            return (Criteria) this;
        }

        public Criteria andSdktlnGreaterThanOrEqualTo(String value) {
            addCriterion("SDKTLN >=", value, "sdktln");
            return (Criteria) this;
        }

        public Criteria andSdktlnLessThan(String value) {
            addCriterion("SDKTLN <", value, "sdktln");
            return (Criteria) this;
        }

        public Criteria andSdktlnLessThanOrEqualTo(String value) {
            addCriterion("SDKTLN <=", value, "sdktln");
            return (Criteria) this;
        }

        public Criteria andSdktlnLike(String value) {
            addCriterion("SDKTLN like", value, "sdktln");
            return (Criteria) this;
        }

        public Criteria andSdktlnNotLike(String value) {
            addCriterion("SDKTLN not like", value, "sdktln");
            return (Criteria) this;
        }

        public Criteria andSdktlnIn(List<String> values) {
            addCriterion("SDKTLN in", values, "sdktln");
            return (Criteria) this;
        }

        public Criteria andSdktlnNotIn(List<String> values) {
            addCriterion("SDKTLN not in", values, "sdktln");
            return (Criteria) this;
        }

        public Criteria andSdktlnBetween(String value1, String value2) {
            addCriterion("SDKTLN between", value1, value2, "sdktln");
            return (Criteria) this;
        }

        public Criteria andSdktlnNotBetween(String value1, String value2) {
            addCriterion("SDKTLN not between", value1, value2, "sdktln");
            return (Criteria) this;
        }

        public Criteria andSdcpntIsNull() {
            addCriterion("SDCPNT is null");
            return (Criteria) this;
        }

        public Criteria andSdcpntIsNotNull() {
            addCriterion("SDCPNT is not null");
            return (Criteria) this;
        }

        public Criteria andSdcpntEqualTo(String value) {
            addCriterion("SDCPNT =", value, "sdcpnt");
            return (Criteria) this;
        }

        public Criteria andSdcpntNotEqualTo(String value) {
            addCriterion("SDCPNT <>", value, "sdcpnt");
            return (Criteria) this;
        }

        public Criteria andSdcpntGreaterThan(String value) {
            addCriterion("SDCPNT >", value, "sdcpnt");
            return (Criteria) this;
        }

        public Criteria andSdcpntGreaterThanOrEqualTo(String value) {
            addCriterion("SDCPNT >=", value, "sdcpnt");
            return (Criteria) this;
        }

        public Criteria andSdcpntLessThan(String value) {
            addCriterion("SDCPNT <", value, "sdcpnt");
            return (Criteria) this;
        }

        public Criteria andSdcpntLessThanOrEqualTo(String value) {
            addCriterion("SDCPNT <=", value, "sdcpnt");
            return (Criteria) this;
        }

        public Criteria andSdcpntLike(String value) {
            addCriterion("SDCPNT like", value, "sdcpnt");
            return (Criteria) this;
        }

        public Criteria andSdcpntNotLike(String value) {
            addCriterion("SDCPNT not like", value, "sdcpnt");
            return (Criteria) this;
        }

        public Criteria andSdcpntIn(List<String> values) {
            addCriterion("SDCPNT in", values, "sdcpnt");
            return (Criteria) this;
        }

        public Criteria andSdcpntNotIn(List<String> values) {
            addCriterion("SDCPNT not in", values, "sdcpnt");
            return (Criteria) this;
        }

        public Criteria andSdcpntBetween(String value1, String value2) {
            addCriterion("SDCPNT between", value1, value2, "sdcpnt");
            return (Criteria) this;
        }

        public Criteria andSdcpntNotBetween(String value1, String value2) {
            addCriterion("SDCPNT not between", value1, value2, "sdcpnt");
            return (Criteria) this;
        }

        public Criteria andSdrkitIsNull() {
            addCriterion("SDRKIT is null");
            return (Criteria) this;
        }

        public Criteria andSdrkitIsNotNull() {
            addCriterion("SDRKIT is not null");
            return (Criteria) this;
        }

        public Criteria andSdrkitEqualTo(String value) {
            addCriterion("SDRKIT =", value, "sdrkit");
            return (Criteria) this;
        }

        public Criteria andSdrkitNotEqualTo(String value) {
            addCriterion("SDRKIT <>", value, "sdrkit");
            return (Criteria) this;
        }

        public Criteria andSdrkitGreaterThan(String value) {
            addCriterion("SDRKIT >", value, "sdrkit");
            return (Criteria) this;
        }

        public Criteria andSdrkitGreaterThanOrEqualTo(String value) {
            addCriterion("SDRKIT >=", value, "sdrkit");
            return (Criteria) this;
        }

        public Criteria andSdrkitLessThan(String value) {
            addCriterion("SDRKIT <", value, "sdrkit");
            return (Criteria) this;
        }

        public Criteria andSdrkitLessThanOrEqualTo(String value) {
            addCriterion("SDRKIT <=", value, "sdrkit");
            return (Criteria) this;
        }

        public Criteria andSdrkitLike(String value) {
            addCriterion("SDRKIT like", value, "sdrkit");
            return (Criteria) this;
        }

        public Criteria andSdrkitNotLike(String value) {
            addCriterion("SDRKIT not like", value, "sdrkit");
            return (Criteria) this;
        }

        public Criteria andSdrkitIn(List<String> values) {
            addCriterion("SDRKIT in", values, "sdrkit");
            return (Criteria) this;
        }

        public Criteria andSdrkitNotIn(List<String> values) {
            addCriterion("SDRKIT not in", values, "sdrkit");
            return (Criteria) this;
        }

        public Criteria andSdrkitBetween(String value1, String value2) {
            addCriterion("SDRKIT between", value1, value2, "sdrkit");
            return (Criteria) this;
        }

        public Criteria andSdrkitNotBetween(String value1, String value2) {
            addCriterion("SDRKIT not between", value1, value2, "sdrkit");
            return (Criteria) this;
        }

        public Criteria andSdktpIsNull() {
            addCriterion("SDKTP is null");
            return (Criteria) this;
        }

        public Criteria andSdktpIsNotNull() {
            addCriterion("SDKTP is not null");
            return (Criteria) this;
        }

        public Criteria andSdktpEqualTo(String value) {
            addCriterion("SDKTP =", value, "sdktp");
            return (Criteria) this;
        }

        public Criteria andSdktpNotEqualTo(String value) {
            addCriterion("SDKTP <>", value, "sdktp");
            return (Criteria) this;
        }

        public Criteria andSdktpGreaterThan(String value) {
            addCriterion("SDKTP >", value, "sdktp");
            return (Criteria) this;
        }

        public Criteria andSdktpGreaterThanOrEqualTo(String value) {
            addCriterion("SDKTP >=", value, "sdktp");
            return (Criteria) this;
        }

        public Criteria andSdktpLessThan(String value) {
            addCriterion("SDKTP <", value, "sdktp");
            return (Criteria) this;
        }

        public Criteria andSdktpLessThanOrEqualTo(String value) {
            addCriterion("SDKTP <=", value, "sdktp");
            return (Criteria) this;
        }

        public Criteria andSdktpLike(String value) {
            addCriterion("SDKTP like", value, "sdktp");
            return (Criteria) this;
        }

        public Criteria andSdktpNotLike(String value) {
            addCriterion("SDKTP not like", value, "sdktp");
            return (Criteria) this;
        }

        public Criteria andSdktpIn(List<String> values) {
            addCriterion("SDKTP in", values, "sdktp");
            return (Criteria) this;
        }

        public Criteria andSdktpNotIn(List<String> values) {
            addCriterion("SDKTP not in", values, "sdktp");
            return (Criteria) this;
        }

        public Criteria andSdktpBetween(String value1, String value2) {
            addCriterion("SDKTP between", value1, value2, "sdktp");
            return (Criteria) this;
        }

        public Criteria andSdktpNotBetween(String value1, String value2) {
            addCriterion("SDKTP not between", value1, value2, "sdktp");
            return (Criteria) this;
        }

        public Criteria andSdsrp1IsNull() {
            addCriterion("SDSRP1 is null");
            return (Criteria) this;
        }

        public Criteria andSdsrp1IsNotNull() {
            addCriterion("SDSRP1 is not null");
            return (Criteria) this;
        }

        public Criteria andSdsrp1EqualTo(String value) {
            addCriterion("SDSRP1 =", value, "sdsrp1");
            return (Criteria) this;
        }

        public Criteria andSdsrp1NotEqualTo(String value) {
            addCriterion("SDSRP1 <>", value, "sdsrp1");
            return (Criteria) this;
        }

        public Criteria andSdsrp1GreaterThan(String value) {
            addCriterion("SDSRP1 >", value, "sdsrp1");
            return (Criteria) this;
        }

        public Criteria andSdsrp1GreaterThanOrEqualTo(String value) {
            addCriterion("SDSRP1 >=", value, "sdsrp1");
            return (Criteria) this;
        }

        public Criteria andSdsrp1LessThan(String value) {
            addCriterion("SDSRP1 <", value, "sdsrp1");
            return (Criteria) this;
        }

        public Criteria andSdsrp1LessThanOrEqualTo(String value) {
            addCriterion("SDSRP1 <=", value, "sdsrp1");
            return (Criteria) this;
        }

        public Criteria andSdsrp1Like(String value) {
            addCriterion("SDSRP1 like", value, "sdsrp1");
            return (Criteria) this;
        }

        public Criteria andSdsrp1NotLike(String value) {
            addCriterion("SDSRP1 not like", value, "sdsrp1");
            return (Criteria) this;
        }

        public Criteria andSdsrp1In(List<String> values) {
            addCriterion("SDSRP1 in", values, "sdsrp1");
            return (Criteria) this;
        }

        public Criteria andSdsrp1NotIn(List<String> values) {
            addCriterion("SDSRP1 not in", values, "sdsrp1");
            return (Criteria) this;
        }

        public Criteria andSdsrp1Between(String value1, String value2) {
            addCriterion("SDSRP1 between", value1, value2, "sdsrp1");
            return (Criteria) this;
        }

        public Criteria andSdsrp1NotBetween(String value1, String value2) {
            addCriterion("SDSRP1 not between", value1, value2, "sdsrp1");
            return (Criteria) this;
        }

        public Criteria andSdsrp2IsNull() {
            addCriterion("SDSRP2 is null");
            return (Criteria) this;
        }

        public Criteria andSdsrp2IsNotNull() {
            addCriterion("SDSRP2 is not null");
            return (Criteria) this;
        }

        public Criteria andSdsrp2EqualTo(String value) {
            addCriterion("SDSRP2 =", value, "sdsrp2");
            return (Criteria) this;
        }

        public Criteria andSdsrp2NotEqualTo(String value) {
            addCriterion("SDSRP2 <>", value, "sdsrp2");
            return (Criteria) this;
        }

        public Criteria andSdsrp2GreaterThan(String value) {
            addCriterion("SDSRP2 >", value, "sdsrp2");
            return (Criteria) this;
        }

        public Criteria andSdsrp2GreaterThanOrEqualTo(String value) {
            addCriterion("SDSRP2 >=", value, "sdsrp2");
            return (Criteria) this;
        }

        public Criteria andSdsrp2LessThan(String value) {
            addCriterion("SDSRP2 <", value, "sdsrp2");
            return (Criteria) this;
        }

        public Criteria andSdsrp2LessThanOrEqualTo(String value) {
            addCriterion("SDSRP2 <=", value, "sdsrp2");
            return (Criteria) this;
        }

        public Criteria andSdsrp2Like(String value) {
            addCriterion("SDSRP2 like", value, "sdsrp2");
            return (Criteria) this;
        }

        public Criteria andSdsrp2NotLike(String value) {
            addCriterion("SDSRP2 not like", value, "sdsrp2");
            return (Criteria) this;
        }

        public Criteria andSdsrp2In(List<String> values) {
            addCriterion("SDSRP2 in", values, "sdsrp2");
            return (Criteria) this;
        }

        public Criteria andSdsrp2NotIn(List<String> values) {
            addCriterion("SDSRP2 not in", values, "sdsrp2");
            return (Criteria) this;
        }

        public Criteria andSdsrp2Between(String value1, String value2) {
            addCriterion("SDSRP2 between", value1, value2, "sdsrp2");
            return (Criteria) this;
        }

        public Criteria andSdsrp2NotBetween(String value1, String value2) {
            addCriterion("SDSRP2 not between", value1, value2, "sdsrp2");
            return (Criteria) this;
        }

        public Criteria andSdsrp3IsNull() {
            addCriterion("SDSRP3 is null");
            return (Criteria) this;
        }

        public Criteria andSdsrp3IsNotNull() {
            addCriterion("SDSRP3 is not null");
            return (Criteria) this;
        }

        public Criteria andSdsrp3EqualTo(String value) {
            addCriterion("SDSRP3 =", value, "sdsrp3");
            return (Criteria) this;
        }

        public Criteria andSdsrp3NotEqualTo(String value) {
            addCriterion("SDSRP3 <>", value, "sdsrp3");
            return (Criteria) this;
        }

        public Criteria andSdsrp3GreaterThan(String value) {
            addCriterion("SDSRP3 >", value, "sdsrp3");
            return (Criteria) this;
        }

        public Criteria andSdsrp3GreaterThanOrEqualTo(String value) {
            addCriterion("SDSRP3 >=", value, "sdsrp3");
            return (Criteria) this;
        }

        public Criteria andSdsrp3LessThan(String value) {
            addCriterion("SDSRP3 <", value, "sdsrp3");
            return (Criteria) this;
        }

        public Criteria andSdsrp3LessThanOrEqualTo(String value) {
            addCriterion("SDSRP3 <=", value, "sdsrp3");
            return (Criteria) this;
        }

        public Criteria andSdsrp3Like(String value) {
            addCriterion("SDSRP3 like", value, "sdsrp3");
            return (Criteria) this;
        }

        public Criteria andSdsrp3NotLike(String value) {
            addCriterion("SDSRP3 not like", value, "sdsrp3");
            return (Criteria) this;
        }

        public Criteria andSdsrp3In(List<String> values) {
            addCriterion("SDSRP3 in", values, "sdsrp3");
            return (Criteria) this;
        }

        public Criteria andSdsrp3NotIn(List<String> values) {
            addCriterion("SDSRP3 not in", values, "sdsrp3");
            return (Criteria) this;
        }

        public Criteria andSdsrp3Between(String value1, String value2) {
            addCriterion("SDSRP3 between", value1, value2, "sdsrp3");
            return (Criteria) this;
        }

        public Criteria andSdsrp3NotBetween(String value1, String value2) {
            addCriterion("SDSRP3 not between", value1, value2, "sdsrp3");
            return (Criteria) this;
        }

        public Criteria andSdsrp4IsNull() {
            addCriterion("SDSRP4 is null");
            return (Criteria) this;
        }

        public Criteria andSdsrp4IsNotNull() {
            addCriterion("SDSRP4 is not null");
            return (Criteria) this;
        }

        public Criteria andSdsrp4EqualTo(String value) {
            addCriterion("SDSRP4 =", value, "sdsrp4");
            return (Criteria) this;
        }

        public Criteria andSdsrp4NotEqualTo(String value) {
            addCriterion("SDSRP4 <>", value, "sdsrp4");
            return (Criteria) this;
        }

        public Criteria andSdsrp4GreaterThan(String value) {
            addCriterion("SDSRP4 >", value, "sdsrp4");
            return (Criteria) this;
        }

        public Criteria andSdsrp4GreaterThanOrEqualTo(String value) {
            addCriterion("SDSRP4 >=", value, "sdsrp4");
            return (Criteria) this;
        }

        public Criteria andSdsrp4LessThan(String value) {
            addCriterion("SDSRP4 <", value, "sdsrp4");
            return (Criteria) this;
        }

        public Criteria andSdsrp4LessThanOrEqualTo(String value) {
            addCriterion("SDSRP4 <=", value, "sdsrp4");
            return (Criteria) this;
        }

        public Criteria andSdsrp4Like(String value) {
            addCriterion("SDSRP4 like", value, "sdsrp4");
            return (Criteria) this;
        }

        public Criteria andSdsrp4NotLike(String value) {
            addCriterion("SDSRP4 not like", value, "sdsrp4");
            return (Criteria) this;
        }

        public Criteria andSdsrp4In(List<String> values) {
            addCriterion("SDSRP4 in", values, "sdsrp4");
            return (Criteria) this;
        }

        public Criteria andSdsrp4NotIn(List<String> values) {
            addCriterion("SDSRP4 not in", values, "sdsrp4");
            return (Criteria) this;
        }

        public Criteria andSdsrp4Between(String value1, String value2) {
            addCriterion("SDSRP4 between", value1, value2, "sdsrp4");
            return (Criteria) this;
        }

        public Criteria andSdsrp4NotBetween(String value1, String value2) {
            addCriterion("SDSRP4 not between", value1, value2, "sdsrp4");
            return (Criteria) this;
        }

        public Criteria andSdsrp5IsNull() {
            addCriterion("SDSRP5 is null");
            return (Criteria) this;
        }

        public Criteria andSdsrp5IsNotNull() {
            addCriterion("SDSRP5 is not null");
            return (Criteria) this;
        }

        public Criteria andSdsrp5EqualTo(String value) {
            addCriterion("SDSRP5 =", value, "sdsrp5");
            return (Criteria) this;
        }

        public Criteria andSdsrp5NotEqualTo(String value) {
            addCriterion("SDSRP5 <>", value, "sdsrp5");
            return (Criteria) this;
        }

        public Criteria andSdsrp5GreaterThan(String value) {
            addCriterion("SDSRP5 >", value, "sdsrp5");
            return (Criteria) this;
        }

        public Criteria andSdsrp5GreaterThanOrEqualTo(String value) {
            addCriterion("SDSRP5 >=", value, "sdsrp5");
            return (Criteria) this;
        }

        public Criteria andSdsrp5LessThan(String value) {
            addCriterion("SDSRP5 <", value, "sdsrp5");
            return (Criteria) this;
        }

        public Criteria andSdsrp5LessThanOrEqualTo(String value) {
            addCriterion("SDSRP5 <=", value, "sdsrp5");
            return (Criteria) this;
        }

        public Criteria andSdsrp5Like(String value) {
            addCriterion("SDSRP5 like", value, "sdsrp5");
            return (Criteria) this;
        }

        public Criteria andSdsrp5NotLike(String value) {
            addCriterion("SDSRP5 not like", value, "sdsrp5");
            return (Criteria) this;
        }

        public Criteria andSdsrp5In(List<String> values) {
            addCriterion("SDSRP5 in", values, "sdsrp5");
            return (Criteria) this;
        }

        public Criteria andSdsrp5NotIn(List<String> values) {
            addCriterion("SDSRP5 not in", values, "sdsrp5");
            return (Criteria) this;
        }

        public Criteria andSdsrp5Between(String value1, String value2) {
            addCriterion("SDSRP5 between", value1, value2, "sdsrp5");
            return (Criteria) this;
        }

        public Criteria andSdsrp5NotBetween(String value1, String value2) {
            addCriterion("SDSRP5 not between", value1, value2, "sdsrp5");
            return (Criteria) this;
        }

        public Criteria andSdprp1IsNull() {
            addCriterion("SDPRP1 is null");
            return (Criteria) this;
        }

        public Criteria andSdprp1IsNotNull() {
            addCriterion("SDPRP1 is not null");
            return (Criteria) this;
        }

        public Criteria andSdprp1EqualTo(String value) {
            addCriterion("SDPRP1 =", value, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1NotEqualTo(String value) {
            addCriterion("SDPRP1 <>", value, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1GreaterThan(String value) {
            addCriterion("SDPRP1 >", value, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1GreaterThanOrEqualTo(String value) {
            addCriterion("SDPRP1 >=", value, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1LessThan(String value) {
            addCriterion("SDPRP1 <", value, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1LessThanOrEqualTo(String value) {
            addCriterion("SDPRP1 <=", value, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1Like(String value) {
            addCriterion("SDPRP1 like", value, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1NotLike(String value) {
            addCriterion("SDPRP1 not like", value, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1In(List<String> values) {
            addCriterion("SDPRP1 in", values, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1NotIn(List<String> values) {
            addCriterion("SDPRP1 not in", values, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1Between(String value1, String value2) {
            addCriterion("SDPRP1 between", value1, value2, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1NotBetween(String value1, String value2) {
            addCriterion("SDPRP1 not between", value1, value2, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp2IsNull() {
            addCriterion("SDPRP2 is null");
            return (Criteria) this;
        }

        public Criteria andSdprp2IsNotNull() {
            addCriterion("SDPRP2 is not null");
            return (Criteria) this;
        }

        public Criteria andSdprp2EqualTo(String value) {
            addCriterion("SDPRP2 =", value, "sdprp2");
            return (Criteria) this;
        }

        public Criteria andSdprp2NotEqualTo(String value) {
            addCriterion("SDPRP2 <>", value, "sdprp2");
            return (Criteria) this;
        }

        public Criteria andSdprp2GreaterThan(String value) {
            addCriterion("SDPRP2 >", value, "sdprp2");
            return (Criteria) this;
        }

        public Criteria andSdprp2GreaterThanOrEqualTo(String value) {
            addCriterion("SDPRP2 >=", value, "sdprp2");
            return (Criteria) this;
        }

        public Criteria andSdprp2LessThan(String value) {
            addCriterion("SDPRP2 <", value, "sdprp2");
            return (Criteria) this;
        }

        public Criteria andSdprp2LessThanOrEqualTo(String value) {
            addCriterion("SDPRP2 <=", value, "sdprp2");
            return (Criteria) this;
        }

        public Criteria andSdprp2Like(String value) {
            addCriterion("SDPRP2 like", value, "sdprp2");
            return (Criteria) this;
        }

        public Criteria andSdprp2NotLike(String value) {
            addCriterion("SDPRP2 not like", value, "sdprp2");
            return (Criteria) this;
        }

        public Criteria andSdprp2In(List<String> values) {
            addCriterion("SDPRP2 in", values, "sdprp2");
            return (Criteria) this;
        }

        public Criteria andSdprp2NotIn(List<String> values) {
            addCriterion("SDPRP2 not in", values, "sdprp2");
            return (Criteria) this;
        }

        public Criteria andSdprp2Between(String value1, String value2) {
            addCriterion("SDPRP2 between", value1, value2, "sdprp2");
            return (Criteria) this;
        }

        public Criteria andSdprp2NotBetween(String value1, String value2) {
            addCriterion("SDPRP2 not between", value1, value2, "sdprp2");
            return (Criteria) this;
        }

        public Criteria andSdprp3IsNull() {
            addCriterion("SDPRP3 is null");
            return (Criteria) this;
        }

        public Criteria andSdprp3IsNotNull() {
            addCriterion("SDPRP3 is not null");
            return (Criteria) this;
        }

        public Criteria andSdprp3EqualTo(String value) {
            addCriterion("SDPRP3 =", value, "sdprp3");
            return (Criteria) this;
        }

        public Criteria andSdprp3NotEqualTo(String value) {
            addCriterion("SDPRP3 <>", value, "sdprp3");
            return (Criteria) this;
        }

        public Criteria andSdprp3GreaterThan(String value) {
            addCriterion("SDPRP3 >", value, "sdprp3");
            return (Criteria) this;
        }

        public Criteria andSdprp3GreaterThanOrEqualTo(String value) {
            addCriterion("SDPRP3 >=", value, "sdprp3");
            return (Criteria) this;
        }

        public Criteria andSdprp3LessThan(String value) {
            addCriterion("SDPRP3 <", value, "sdprp3");
            return (Criteria) this;
        }

        public Criteria andSdprp3LessThanOrEqualTo(String value) {
            addCriterion("SDPRP3 <=", value, "sdprp3");
            return (Criteria) this;
        }

        public Criteria andSdprp3Like(String value) {
            addCriterion("SDPRP3 like", value, "sdprp3");
            return (Criteria) this;
        }

        public Criteria andSdprp3NotLike(String value) {
            addCriterion("SDPRP3 not like", value, "sdprp3");
            return (Criteria) this;
        }

        public Criteria andSdprp3In(List<String> values) {
            addCriterion("SDPRP3 in", values, "sdprp3");
            return (Criteria) this;
        }

        public Criteria andSdprp3NotIn(List<String> values) {
            addCriterion("SDPRP3 not in", values, "sdprp3");
            return (Criteria) this;
        }

        public Criteria andSdprp3Between(String value1, String value2) {
            addCriterion("SDPRP3 between", value1, value2, "sdprp3");
            return (Criteria) this;
        }

        public Criteria andSdprp3NotBetween(String value1, String value2) {
            addCriterion("SDPRP3 not between", value1, value2, "sdprp3");
            return (Criteria) this;
        }

        public Criteria andSdprp4IsNull() {
            addCriterion("SDPRP4 is null");
            return (Criteria) this;
        }

        public Criteria andSdprp4IsNotNull() {
            addCriterion("SDPRP4 is not null");
            return (Criteria) this;
        }

        public Criteria andSdprp4EqualTo(String value) {
            addCriterion("SDPRP4 =", value, "sdprp4");
            return (Criteria) this;
        }

        public Criteria andSdprp4NotEqualTo(String value) {
            addCriterion("SDPRP4 <>", value, "sdprp4");
            return (Criteria) this;
        }

        public Criteria andSdprp4GreaterThan(String value) {
            addCriterion("SDPRP4 >", value, "sdprp4");
            return (Criteria) this;
        }

        public Criteria andSdprp4GreaterThanOrEqualTo(String value) {
            addCriterion("SDPRP4 >=", value, "sdprp4");
            return (Criteria) this;
        }

        public Criteria andSdprp4LessThan(String value) {
            addCriterion("SDPRP4 <", value, "sdprp4");
            return (Criteria) this;
        }

        public Criteria andSdprp4LessThanOrEqualTo(String value) {
            addCriterion("SDPRP4 <=", value, "sdprp4");
            return (Criteria) this;
        }

        public Criteria andSdprp4Like(String value) {
            addCriterion("SDPRP4 like", value, "sdprp4");
            return (Criteria) this;
        }

        public Criteria andSdprp4NotLike(String value) {
            addCriterion("SDPRP4 not like", value, "sdprp4");
            return (Criteria) this;
        }

        public Criteria andSdprp4In(List<String> values) {
            addCriterion("SDPRP4 in", values, "sdprp4");
            return (Criteria) this;
        }

        public Criteria andSdprp4NotIn(List<String> values) {
            addCriterion("SDPRP4 not in", values, "sdprp4");
            return (Criteria) this;
        }

        public Criteria andSdprp4Between(String value1, String value2) {
            addCriterion("SDPRP4 between", value1, value2, "sdprp4");
            return (Criteria) this;
        }

        public Criteria andSdprp4NotBetween(String value1, String value2) {
            addCriterion("SDPRP4 not between", value1, value2, "sdprp4");
            return (Criteria) this;
        }

        public Criteria andSdprp5IsNull() {
            addCriterion("SDPRP5 is null");
            return (Criteria) this;
        }

        public Criteria andSdprp5IsNotNull() {
            addCriterion("SDPRP5 is not null");
            return (Criteria) this;
        }

        public Criteria andSdprp5EqualTo(String value) {
            addCriterion("SDPRP5 =", value, "sdprp5");
            return (Criteria) this;
        }

        public Criteria andSdprp5NotEqualTo(String value) {
            addCriterion("SDPRP5 <>", value, "sdprp5");
            return (Criteria) this;
        }

        public Criteria andSdprp5GreaterThan(String value) {
            addCriterion("SDPRP5 >", value, "sdprp5");
            return (Criteria) this;
        }

        public Criteria andSdprp5GreaterThanOrEqualTo(String value) {
            addCriterion("SDPRP5 >=", value, "sdprp5");
            return (Criteria) this;
        }

        public Criteria andSdprp5LessThan(String value) {
            addCriterion("SDPRP5 <", value, "sdprp5");
            return (Criteria) this;
        }

        public Criteria andSdprp5LessThanOrEqualTo(String value) {
            addCriterion("SDPRP5 <=", value, "sdprp5");
            return (Criteria) this;
        }

        public Criteria andSdprp5Like(String value) {
            addCriterion("SDPRP5 like", value, "sdprp5");
            return (Criteria) this;
        }

        public Criteria andSdprp5NotLike(String value) {
            addCriterion("SDPRP5 not like", value, "sdprp5");
            return (Criteria) this;
        }

        public Criteria andSdprp5In(List<String> values) {
            addCriterion("SDPRP5 in", values, "sdprp5");
            return (Criteria) this;
        }

        public Criteria andSdprp5NotIn(List<String> values) {
            addCriterion("SDPRP5 not in", values, "sdprp5");
            return (Criteria) this;
        }

        public Criteria andSdprp5Between(String value1, String value2) {
            addCriterion("SDPRP5 between", value1, value2, "sdprp5");
            return (Criteria) this;
        }

        public Criteria andSdprp5NotBetween(String value1, String value2) {
            addCriterion("SDPRP5 not between", value1, value2, "sdprp5");
            return (Criteria) this;
        }

        public Criteria andSduomIsNull() {
            addCriterion("SDUOM is null");
            return (Criteria) this;
        }

        public Criteria andSduomIsNotNull() {
            addCriterion("SDUOM is not null");
            return (Criteria) this;
        }

        public Criteria andSduomEqualTo(String value) {
            addCriterion("SDUOM =", value, "sduom");
            return (Criteria) this;
        }

        public Criteria andSduomNotEqualTo(String value) {
            addCriterion("SDUOM <>", value, "sduom");
            return (Criteria) this;
        }

        public Criteria andSduomGreaterThan(String value) {
            addCriterion("SDUOM >", value, "sduom");
            return (Criteria) this;
        }

        public Criteria andSduomGreaterThanOrEqualTo(String value) {
            addCriterion("SDUOM >=", value, "sduom");
            return (Criteria) this;
        }

        public Criteria andSduomLessThan(String value) {
            addCriterion("SDUOM <", value, "sduom");
            return (Criteria) this;
        }

        public Criteria andSduomLessThanOrEqualTo(String value) {
            addCriterion("SDUOM <=", value, "sduom");
            return (Criteria) this;
        }

        public Criteria andSduomLike(String value) {
            addCriterion("SDUOM like", value, "sduom");
            return (Criteria) this;
        }

        public Criteria andSduomNotLike(String value) {
            addCriterion("SDUOM not like", value, "sduom");
            return (Criteria) this;
        }

        public Criteria andSduomIn(List<String> values) {
            addCriterion("SDUOM in", values, "sduom");
            return (Criteria) this;
        }

        public Criteria andSduomNotIn(List<String> values) {
            addCriterion("SDUOM not in", values, "sduom");
            return (Criteria) this;
        }

        public Criteria andSduomBetween(String value1, String value2) {
            addCriterion("SDUOM between", value1, value2, "sduom");
            return (Criteria) this;
        }

        public Criteria andSduomNotBetween(String value1, String value2) {
            addCriterion("SDUOM not between", value1, value2, "sduom");
            return (Criteria) this;
        }

        public Criteria andSduorgIsNull() {
            addCriterion("SDUORG is null");
            return (Criteria) this;
        }

        public Criteria andSduorgIsNotNull() {
            addCriterion("SDUORG is not null");
            return (Criteria) this;
        }

        public Criteria andSduorgEqualTo(Long value) {
            addCriterion("SDUORG =", value, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgNotEqualTo(Long value) {
            addCriterion("SDUORG <>", value, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgGreaterThan(Long value) {
            addCriterion("SDUORG >", value, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgGreaterThanOrEqualTo(Long value) {
            addCriterion("SDUORG >=", value, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgLessThan(Long value) {
            addCriterion("SDUORG <", value, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgLessThanOrEqualTo(Long value) {
            addCriterion("SDUORG <=", value, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgIn(List<Long> values) {
            addCriterion("SDUORG in", values, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgNotIn(List<Long> values) {
            addCriterion("SDUORG not in", values, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgBetween(Long value1, Long value2) {
            addCriterion("SDUORG between", value1, value2, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgNotBetween(Long value1, Long value2) {
            addCriterion("SDUORG not between", value1, value2, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSdsoqsIsNull() {
            addCriterion("SDSOQS is null");
            return (Criteria) this;
        }

        public Criteria andSdsoqsIsNotNull() {
            addCriterion("SDSOQS is not null");
            return (Criteria) this;
        }

        public Criteria andSdsoqsEqualTo(Long value) {
            addCriterion("SDSOQS =", value, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsNotEqualTo(Long value) {
            addCriterion("SDSOQS <>", value, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsGreaterThan(Long value) {
            addCriterion("SDSOQS >", value, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsGreaterThanOrEqualTo(Long value) {
            addCriterion("SDSOQS >=", value, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsLessThan(Long value) {
            addCriterion("SDSOQS <", value, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsLessThanOrEqualTo(Long value) {
            addCriterion("SDSOQS <=", value, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsIn(List<Long> values) {
            addCriterion("SDSOQS in", values, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsNotIn(List<Long> values) {
            addCriterion("SDSOQS not in", values, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsBetween(Long value1, Long value2) {
            addCriterion("SDSOQS between", value1, value2, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsNotBetween(Long value1, Long value2) {
            addCriterion("SDSOQS not between", value1, value2, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsobkIsNull() {
            addCriterion("SDSOBK is null");
            return (Criteria) this;
        }

        public Criteria andSdsobkIsNotNull() {
            addCriterion("SDSOBK is not null");
            return (Criteria) this;
        }

        public Criteria andSdsobkEqualTo(Long value) {
            addCriterion("SDSOBK =", value, "sdsobk");
            return (Criteria) this;
        }

        public Criteria andSdsobkNotEqualTo(Long value) {
            addCriterion("SDSOBK <>", value, "sdsobk");
            return (Criteria) this;
        }

        public Criteria andSdsobkGreaterThan(Long value) {
            addCriterion("SDSOBK >", value, "sdsobk");
            return (Criteria) this;
        }

        public Criteria andSdsobkGreaterThanOrEqualTo(Long value) {
            addCriterion("SDSOBK >=", value, "sdsobk");
            return (Criteria) this;
        }

        public Criteria andSdsobkLessThan(Long value) {
            addCriterion("SDSOBK <", value, "sdsobk");
            return (Criteria) this;
        }

        public Criteria andSdsobkLessThanOrEqualTo(Long value) {
            addCriterion("SDSOBK <=", value, "sdsobk");
            return (Criteria) this;
        }

        public Criteria andSdsobkIn(List<Long> values) {
            addCriterion("SDSOBK in", values, "sdsobk");
            return (Criteria) this;
        }

        public Criteria andSdsobkNotIn(List<Long> values) {
            addCriterion("SDSOBK not in", values, "sdsobk");
            return (Criteria) this;
        }

        public Criteria andSdsobkBetween(Long value1, Long value2) {
            addCriterion("SDSOBK between", value1, value2, "sdsobk");
            return (Criteria) this;
        }

        public Criteria andSdsobkNotBetween(Long value1, Long value2) {
            addCriterion("SDSOBK not between", value1, value2, "sdsobk");
            return (Criteria) this;
        }

        public Criteria andSdsocnIsNull() {
            addCriterion("SDSOCN is null");
            return (Criteria) this;
        }

        public Criteria andSdsocnIsNotNull() {
            addCriterion("SDSOCN is not null");
            return (Criteria) this;
        }

        public Criteria andSdsocnEqualTo(Long value) {
            addCriterion("SDSOCN =", value, "sdsocn");
            return (Criteria) this;
        }

        public Criteria andSdsocnNotEqualTo(Long value) {
            addCriterion("SDSOCN <>", value, "sdsocn");
            return (Criteria) this;
        }

        public Criteria andSdsocnGreaterThan(Long value) {
            addCriterion("SDSOCN >", value, "sdsocn");
            return (Criteria) this;
        }

        public Criteria andSdsocnGreaterThanOrEqualTo(Long value) {
            addCriterion("SDSOCN >=", value, "sdsocn");
            return (Criteria) this;
        }

        public Criteria andSdsocnLessThan(Long value) {
            addCriterion("SDSOCN <", value, "sdsocn");
            return (Criteria) this;
        }

        public Criteria andSdsocnLessThanOrEqualTo(Long value) {
            addCriterion("SDSOCN <=", value, "sdsocn");
            return (Criteria) this;
        }

        public Criteria andSdsocnIn(List<Long> values) {
            addCriterion("SDSOCN in", values, "sdsocn");
            return (Criteria) this;
        }

        public Criteria andSdsocnNotIn(List<Long> values) {
            addCriterion("SDSOCN not in", values, "sdsocn");
            return (Criteria) this;
        }

        public Criteria andSdsocnBetween(Long value1, Long value2) {
            addCriterion("SDSOCN between", value1, value2, "sdsocn");
            return (Criteria) this;
        }

        public Criteria andSdsocnNotBetween(Long value1, Long value2) {
            addCriterion("SDSOCN not between", value1, value2, "sdsocn");
            return (Criteria) this;
        }

        public Criteria andSdcommIsNull() {
            addCriterion("SDCOMM is null");
            return (Criteria) this;
        }

        public Criteria andSdcommIsNotNull() {
            addCriterion("SDCOMM is not null");
            return (Criteria) this;
        }

        public Criteria andSdcommEqualTo(String value) {
            addCriterion("SDCOMM =", value, "sdcomm");
            return (Criteria) this;
        }

        public Criteria andSdcommNotEqualTo(String value) {
            addCriterion("SDCOMM <>", value, "sdcomm");
            return (Criteria) this;
        }

        public Criteria andSdcommGreaterThan(String value) {
            addCriterion("SDCOMM >", value, "sdcomm");
            return (Criteria) this;
        }

        public Criteria andSdcommGreaterThanOrEqualTo(String value) {
            addCriterion("SDCOMM >=", value, "sdcomm");
            return (Criteria) this;
        }

        public Criteria andSdcommLessThan(String value) {
            addCriterion("SDCOMM <", value, "sdcomm");
            return (Criteria) this;
        }

        public Criteria andSdcommLessThanOrEqualTo(String value) {
            addCriterion("SDCOMM <=", value, "sdcomm");
            return (Criteria) this;
        }

        public Criteria andSdcommLike(String value) {
            addCriterion("SDCOMM like", value, "sdcomm");
            return (Criteria) this;
        }

        public Criteria andSdcommNotLike(String value) {
            addCriterion("SDCOMM not like", value, "sdcomm");
            return (Criteria) this;
        }

        public Criteria andSdcommIn(List<String> values) {
            addCriterion("SDCOMM in", values, "sdcomm");
            return (Criteria) this;
        }

        public Criteria andSdcommNotIn(List<String> values) {
            addCriterion("SDCOMM not in", values, "sdcomm");
            return (Criteria) this;
        }

        public Criteria andSdcommBetween(String value1, String value2) {
            addCriterion("SDCOMM between", value1, value2, "sdcomm");
            return (Criteria) this;
        }

        public Criteria andSdcommNotBetween(String value1, String value2) {
            addCriterion("SDCOMM not between", value1, value2, "sdcomm");
            return (Criteria) this;
        }

        public Criteria andSduprcIsNull() {
            addCriterion("SDUPRC is null");
            return (Criteria) this;
        }

        public Criteria andSduprcIsNotNull() {
            addCriterion("SDUPRC is not null");
            return (Criteria) this;
        }

        public Criteria andSduprcEqualTo(BigDecimal value) {
            addCriterion("SDUPRC =", value, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcNotEqualTo(BigDecimal value) {
            addCriterion("SDUPRC <>", value, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcGreaterThan(BigDecimal value) {
            addCriterion("SDUPRC >", value, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDUPRC >=", value, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcLessThan(BigDecimal value) {
            addCriterion("SDUPRC <", value, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDUPRC <=", value, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcIn(List<BigDecimal> values) {
            addCriterion("SDUPRC in", values, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcNotIn(List<BigDecimal> values) {
            addCriterion("SDUPRC not in", values, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDUPRC between", value1, value2, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDUPRC not between", value1, value2, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSdaexpIsNull() {
            addCriterion("SDAEXP is null");
            return (Criteria) this;
        }

        public Criteria andSdaexpIsNotNull() {
            addCriterion("SDAEXP is not null");
            return (Criteria) this;
        }

        public Criteria andSdaexpEqualTo(BigDecimal value) {
            addCriterion("SDAEXP =", value, "sdaexp");
            return (Criteria) this;
        }

        public Criteria andSdaexpNotEqualTo(BigDecimal value) {
            addCriterion("SDAEXP <>", value, "sdaexp");
            return (Criteria) this;
        }

        public Criteria andSdaexpGreaterThan(BigDecimal value) {
            addCriterion("SDAEXP >", value, "sdaexp");
            return (Criteria) this;
        }

        public Criteria andSdaexpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDAEXP >=", value, "sdaexp");
            return (Criteria) this;
        }

        public Criteria andSdaexpLessThan(BigDecimal value) {
            addCriterion("SDAEXP <", value, "sdaexp");
            return (Criteria) this;
        }

        public Criteria andSdaexpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDAEXP <=", value, "sdaexp");
            return (Criteria) this;
        }

        public Criteria andSdaexpIn(List<BigDecimal> values) {
            addCriterion("SDAEXP in", values, "sdaexp");
            return (Criteria) this;
        }

        public Criteria andSdaexpNotIn(List<BigDecimal> values) {
            addCriterion("SDAEXP not in", values, "sdaexp");
            return (Criteria) this;
        }

        public Criteria andSdaexpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDAEXP between", value1, value2, "sdaexp");
            return (Criteria) this;
        }

        public Criteria andSdaexpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDAEXP not between", value1, value2, "sdaexp");
            return (Criteria) this;
        }

        public Criteria andSdpsnIsNull() {
            addCriterion("SDPSN is null");
            return (Criteria) this;
        }

        public Criteria andSdpsnIsNotNull() {
            addCriterion("SDPSN is not null");
            return (Criteria) this;
        }

        public Criteria andSdpsnEqualTo(Integer value) {
            addCriterion("SDPSN =", value, "sdpsn");
            return (Criteria) this;
        }

        public Criteria andSdpsnNotEqualTo(Integer value) {
            addCriterion("SDPSN <>", value, "sdpsn");
            return (Criteria) this;
        }

        public Criteria andSdpsnGreaterThan(Integer value) {
            addCriterion("SDPSN >", value, "sdpsn");
            return (Criteria) this;
        }

        public Criteria andSdpsnGreaterThanOrEqualTo(Integer value) {
            addCriterion("SDPSN >=", value, "sdpsn");
            return (Criteria) this;
        }

        public Criteria andSdpsnLessThan(Integer value) {
            addCriterion("SDPSN <", value, "sdpsn");
            return (Criteria) this;
        }

        public Criteria andSdpsnLessThanOrEqualTo(Integer value) {
            addCriterion("SDPSN <=", value, "sdpsn");
            return (Criteria) this;
        }

        public Criteria andSdpsnIn(List<Integer> values) {
            addCriterion("SDPSN in", values, "sdpsn");
            return (Criteria) this;
        }

        public Criteria andSdpsnNotIn(List<Integer> values) {
            addCriterion("SDPSN not in", values, "sdpsn");
            return (Criteria) this;
        }

        public Criteria andSdpsnBetween(Integer value1, Integer value2) {
            addCriterion("SDPSN between", value1, value2, "sdpsn");
            return (Criteria) this;
        }

        public Criteria andSdpsnNotBetween(Integer value1, Integer value2) {
            addCriterion("SDPSN not between", value1, value2, "sdpsn");
            return (Criteria) this;
        }

        public Criteria andSdbackIsNull() {
            addCriterion("SDBACK is null");
            return (Criteria) this;
        }

        public Criteria andSdbackIsNotNull() {
            addCriterion("SDBACK is not null");
            return (Criteria) this;
        }

        public Criteria andSdbackEqualTo(String value) {
            addCriterion("SDBACK =", value, "sdback");
            return (Criteria) this;
        }

        public Criteria andSdbackNotEqualTo(String value) {
            addCriterion("SDBACK <>", value, "sdback");
            return (Criteria) this;
        }

        public Criteria andSdbackGreaterThan(String value) {
            addCriterion("SDBACK >", value, "sdback");
            return (Criteria) this;
        }

        public Criteria andSdbackGreaterThanOrEqualTo(String value) {
            addCriterion("SDBACK >=", value, "sdback");
            return (Criteria) this;
        }

        public Criteria andSdbackLessThan(String value) {
            addCriterion("SDBACK <", value, "sdback");
            return (Criteria) this;
        }

        public Criteria andSdbackLessThanOrEqualTo(String value) {
            addCriterion("SDBACK <=", value, "sdback");
            return (Criteria) this;
        }

        public Criteria andSdbackLike(String value) {
            addCriterion("SDBACK like", value, "sdback");
            return (Criteria) this;
        }

        public Criteria andSdbackNotLike(String value) {
            addCriterion("SDBACK not like", value, "sdback");
            return (Criteria) this;
        }

        public Criteria andSdbackIn(List<String> values) {
            addCriterion("SDBACK in", values, "sdback");
            return (Criteria) this;
        }

        public Criteria andSdbackNotIn(List<String> values) {
            addCriterion("SDBACK not in", values, "sdback");
            return (Criteria) this;
        }

        public Criteria andSdbackBetween(String value1, String value2) {
            addCriterion("SDBACK between", value1, value2, "sdback");
            return (Criteria) this;
        }

        public Criteria andSdbackNotBetween(String value1, String value2) {
            addCriterion("SDBACK not between", value1, value2, "sdback");
            return (Criteria) this;
        }

        public Criteria andSdsbalIsNull() {
            addCriterion("SDSBAL is null");
            return (Criteria) this;
        }

        public Criteria andSdsbalIsNotNull() {
            addCriterion("SDSBAL is not null");
            return (Criteria) this;
        }

        public Criteria andSdsbalEqualTo(String value) {
            addCriterion("SDSBAL =", value, "sdsbal");
            return (Criteria) this;
        }

        public Criteria andSdsbalNotEqualTo(String value) {
            addCriterion("SDSBAL <>", value, "sdsbal");
            return (Criteria) this;
        }

        public Criteria andSdsbalGreaterThan(String value) {
            addCriterion("SDSBAL >", value, "sdsbal");
            return (Criteria) this;
        }

        public Criteria andSdsbalGreaterThanOrEqualTo(String value) {
            addCriterion("SDSBAL >=", value, "sdsbal");
            return (Criteria) this;
        }

        public Criteria andSdsbalLessThan(String value) {
            addCriterion("SDSBAL <", value, "sdsbal");
            return (Criteria) this;
        }

        public Criteria andSdsbalLessThanOrEqualTo(String value) {
            addCriterion("SDSBAL <=", value, "sdsbal");
            return (Criteria) this;
        }

        public Criteria andSdsbalLike(String value) {
            addCriterion("SDSBAL like", value, "sdsbal");
            return (Criteria) this;
        }

        public Criteria andSdsbalNotLike(String value) {
            addCriterion("SDSBAL not like", value, "sdsbal");
            return (Criteria) this;
        }

        public Criteria andSdsbalIn(List<String> values) {
            addCriterion("SDSBAL in", values, "sdsbal");
            return (Criteria) this;
        }

        public Criteria andSdsbalNotIn(List<String> values) {
            addCriterion("SDSBAL not in", values, "sdsbal");
            return (Criteria) this;
        }

        public Criteria andSdsbalBetween(String value1, String value2) {
            addCriterion("SDSBAL between", value1, value2, "sdsbal");
            return (Criteria) this;
        }

        public Criteria andSdsbalNotBetween(String value1, String value2) {
            addCriterion("SDSBAL not between", value1, value2, "sdsbal");
            return (Criteria) this;
        }

        public Criteria andSdaptsIsNull() {
            addCriterion("SDAPTS is null");
            return (Criteria) this;
        }

        public Criteria andSdaptsIsNotNull() {
            addCriterion("SDAPTS is not null");
            return (Criteria) this;
        }

        public Criteria andSdaptsEqualTo(String value) {
            addCriterion("SDAPTS =", value, "sdapts");
            return (Criteria) this;
        }

        public Criteria andSdaptsNotEqualTo(String value) {
            addCriterion("SDAPTS <>", value, "sdapts");
            return (Criteria) this;
        }

        public Criteria andSdaptsGreaterThan(String value) {
            addCriterion("SDAPTS >", value, "sdapts");
            return (Criteria) this;
        }

        public Criteria andSdaptsGreaterThanOrEqualTo(String value) {
            addCriterion("SDAPTS >=", value, "sdapts");
            return (Criteria) this;
        }

        public Criteria andSdaptsLessThan(String value) {
            addCriterion("SDAPTS <", value, "sdapts");
            return (Criteria) this;
        }

        public Criteria andSdaptsLessThanOrEqualTo(String value) {
            addCriterion("SDAPTS <=", value, "sdapts");
            return (Criteria) this;
        }

        public Criteria andSdaptsLike(String value) {
            addCriterion("SDAPTS like", value, "sdapts");
            return (Criteria) this;
        }

        public Criteria andSdaptsNotLike(String value) {
            addCriterion("SDAPTS not like", value, "sdapts");
            return (Criteria) this;
        }

        public Criteria andSdaptsIn(List<String> values) {
            addCriterion("SDAPTS in", values, "sdapts");
            return (Criteria) this;
        }

        public Criteria andSdaptsNotIn(List<String> values) {
            addCriterion("SDAPTS not in", values, "sdapts");
            return (Criteria) this;
        }

        public Criteria andSdaptsBetween(String value1, String value2) {
            addCriterion("SDAPTS between", value1, value2, "sdapts");
            return (Criteria) this;
        }

        public Criteria andSdaptsNotBetween(String value1, String value2) {
            addCriterion("SDAPTS not between", value1, value2, "sdapts");
            return (Criteria) this;
        }

        public Criteria andSduom1IsNull() {
            addCriterion("SDUOM1 is null");
            return (Criteria) this;
        }

        public Criteria andSduom1IsNotNull() {
            addCriterion("SDUOM1 is not null");
            return (Criteria) this;
        }

        public Criteria andSduom1EqualTo(String value) {
            addCriterion("SDUOM1 =", value, "sduom1");
            return (Criteria) this;
        }

        public Criteria andSduom1NotEqualTo(String value) {
            addCriterion("SDUOM1 <>", value, "sduom1");
            return (Criteria) this;
        }

        public Criteria andSduom1GreaterThan(String value) {
            addCriterion("SDUOM1 >", value, "sduom1");
            return (Criteria) this;
        }

        public Criteria andSduom1GreaterThanOrEqualTo(String value) {
            addCriterion("SDUOM1 >=", value, "sduom1");
            return (Criteria) this;
        }

        public Criteria andSduom1LessThan(String value) {
            addCriterion("SDUOM1 <", value, "sduom1");
            return (Criteria) this;
        }

        public Criteria andSduom1LessThanOrEqualTo(String value) {
            addCriterion("SDUOM1 <=", value, "sduom1");
            return (Criteria) this;
        }

        public Criteria andSduom1Like(String value) {
            addCriterion("SDUOM1 like", value, "sduom1");
            return (Criteria) this;
        }

        public Criteria andSduom1NotLike(String value) {
            addCriterion("SDUOM1 not like", value, "sduom1");
            return (Criteria) this;
        }

        public Criteria andSduom1In(List<String> values) {
            addCriterion("SDUOM1 in", values, "sduom1");
            return (Criteria) this;
        }

        public Criteria andSduom1NotIn(List<String> values) {
            addCriterion("SDUOM1 not in", values, "sduom1");
            return (Criteria) this;
        }

        public Criteria andSduom1Between(String value1, String value2) {
            addCriterion("SDUOM1 between", value1, value2, "sduom1");
            return (Criteria) this;
        }

        public Criteria andSduom1NotBetween(String value1, String value2) {
            addCriterion("SDUOM1 not between", value1, value2, "sduom1");
            return (Criteria) this;
        }

        public Criteria andSdpqorIsNull() {
            addCriterion("SDPQOR is null");
            return (Criteria) this;
        }

        public Criteria andSdpqorIsNotNull() {
            addCriterion("SDPQOR is not null");
            return (Criteria) this;
        }

        public Criteria andSdpqorEqualTo(Long value) {
            addCriterion("SDPQOR =", value, "sdpqor");
            return (Criteria) this;
        }

        public Criteria andSdpqorNotEqualTo(Long value) {
            addCriterion("SDPQOR <>", value, "sdpqor");
            return (Criteria) this;
        }

        public Criteria andSdpqorGreaterThan(Long value) {
            addCriterion("SDPQOR >", value, "sdpqor");
            return (Criteria) this;
        }

        public Criteria andSdpqorGreaterThanOrEqualTo(Long value) {
            addCriterion("SDPQOR >=", value, "sdpqor");
            return (Criteria) this;
        }

        public Criteria andSdpqorLessThan(Long value) {
            addCriterion("SDPQOR <", value, "sdpqor");
            return (Criteria) this;
        }

        public Criteria andSdpqorLessThanOrEqualTo(Long value) {
            addCriterion("SDPQOR <=", value, "sdpqor");
            return (Criteria) this;
        }

        public Criteria andSdpqorIn(List<Long> values) {
            addCriterion("SDPQOR in", values, "sdpqor");
            return (Criteria) this;
        }

        public Criteria andSdpqorNotIn(List<Long> values) {
            addCriterion("SDPQOR not in", values, "sdpqor");
            return (Criteria) this;
        }

        public Criteria andSdpqorBetween(Long value1, Long value2) {
            addCriterion("SDPQOR between", value1, value2, "sdpqor");
            return (Criteria) this;
        }

        public Criteria andSdpqorNotBetween(Long value1, Long value2) {
            addCriterion("SDPQOR not between", value1, value2, "sdpqor");
            return (Criteria) this;
        }

        public Criteria andSduom2IsNull() {
            addCriterion("SDUOM2 is null");
            return (Criteria) this;
        }

        public Criteria andSduom2IsNotNull() {
            addCriterion("SDUOM2 is not null");
            return (Criteria) this;
        }

        public Criteria andSduom2EqualTo(String value) {
            addCriterion("SDUOM2 =", value, "sduom2");
            return (Criteria) this;
        }

        public Criteria andSduom2NotEqualTo(String value) {
            addCriterion("SDUOM2 <>", value, "sduom2");
            return (Criteria) this;
        }

        public Criteria andSduom2GreaterThan(String value) {
            addCriterion("SDUOM2 >", value, "sduom2");
            return (Criteria) this;
        }

        public Criteria andSduom2GreaterThanOrEqualTo(String value) {
            addCriterion("SDUOM2 >=", value, "sduom2");
            return (Criteria) this;
        }

        public Criteria andSduom2LessThan(String value) {
            addCriterion("SDUOM2 <", value, "sduom2");
            return (Criteria) this;
        }

        public Criteria andSduom2LessThanOrEqualTo(String value) {
            addCriterion("SDUOM2 <=", value, "sduom2");
            return (Criteria) this;
        }

        public Criteria andSduom2Like(String value) {
            addCriterion("SDUOM2 like", value, "sduom2");
            return (Criteria) this;
        }

        public Criteria andSduom2NotLike(String value) {
            addCriterion("SDUOM2 not like", value, "sduom2");
            return (Criteria) this;
        }

        public Criteria andSduom2In(List<String> values) {
            addCriterion("SDUOM2 in", values, "sduom2");
            return (Criteria) this;
        }

        public Criteria andSduom2NotIn(List<String> values) {
            addCriterion("SDUOM2 not in", values, "sduom2");
            return (Criteria) this;
        }

        public Criteria andSduom2Between(String value1, String value2) {
            addCriterion("SDUOM2 between", value1, value2, "sduom2");
            return (Criteria) this;
        }

        public Criteria andSduom2NotBetween(String value1, String value2) {
            addCriterion("SDUOM2 not between", value1, value2, "sduom2");
            return (Criteria) this;
        }

        public Criteria andSdsqorIsNull() {
            addCriterion("SDSQOR is null");
            return (Criteria) this;
        }

        public Criteria andSdsqorIsNotNull() {
            addCriterion("SDSQOR is not null");
            return (Criteria) this;
        }

        public Criteria andSdsqorEqualTo(Long value) {
            addCriterion("SDSQOR =", value, "sdsqor");
            return (Criteria) this;
        }

        public Criteria andSdsqorNotEqualTo(Long value) {
            addCriterion("SDSQOR <>", value, "sdsqor");
            return (Criteria) this;
        }

        public Criteria andSdsqorGreaterThan(Long value) {
            addCriterion("SDSQOR >", value, "sdsqor");
            return (Criteria) this;
        }

        public Criteria andSdsqorGreaterThanOrEqualTo(Long value) {
            addCriterion("SDSQOR >=", value, "sdsqor");
            return (Criteria) this;
        }

        public Criteria andSdsqorLessThan(Long value) {
            addCriterion("SDSQOR <", value, "sdsqor");
            return (Criteria) this;
        }

        public Criteria andSdsqorLessThanOrEqualTo(Long value) {
            addCriterion("SDSQOR <=", value, "sdsqor");
            return (Criteria) this;
        }

        public Criteria andSdsqorIn(List<Long> values) {
            addCriterion("SDSQOR in", values, "sdsqor");
            return (Criteria) this;
        }

        public Criteria andSdsqorNotIn(List<Long> values) {
            addCriterion("SDSQOR not in", values, "sdsqor");
            return (Criteria) this;
        }

        public Criteria andSdsqorBetween(Long value1, Long value2) {
            addCriterion("SDSQOR between", value1, value2, "sdsqor");
            return (Criteria) this;
        }

        public Criteria andSdsqorNotBetween(Long value1, Long value2) {
            addCriterion("SDSQOR not between", value1, value2, "sdsqor");
            return (Criteria) this;
        }

        public Criteria andSdcarsIsNull() {
            addCriterion("SDCARS is null");
            return (Criteria) this;
        }

        public Criteria andSdcarsIsNotNull() {
            addCriterion("SDCARS is not null");
            return (Criteria) this;
        }

        public Criteria andSdcarsEqualTo(Integer value) {
            addCriterion("SDCARS =", value, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsNotEqualTo(Integer value) {
            addCriterion("SDCARS <>", value, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsGreaterThan(Integer value) {
            addCriterion("SDCARS >", value, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsGreaterThanOrEqualTo(Integer value) {
            addCriterion("SDCARS >=", value, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsLessThan(Integer value) {
            addCriterion("SDCARS <", value, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsLessThanOrEqualTo(Integer value) {
            addCriterion("SDCARS <=", value, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsIn(List<Integer> values) {
            addCriterion("SDCARS in", values, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsNotIn(List<Integer> values) {
            addCriterion("SDCARS not in", values, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsBetween(Integer value1, Integer value2) {
            addCriterion("SDCARS between", value1, value2, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsNotBetween(Integer value1, Integer value2) {
            addCriterion("SDCARS not between", value1, value2, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcnidIsNull() {
            addCriterion("SDCNID is null");
            return (Criteria) this;
        }

        public Criteria andSdcnidIsNotNull() {
            addCriterion("SDCNID is not null");
            return (Criteria) this;
        }

        public Criteria andSdcnidEqualTo(String value) {
            addCriterion("SDCNID =", value, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidNotEqualTo(String value) {
            addCriterion("SDCNID <>", value, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidGreaterThan(String value) {
            addCriterion("SDCNID >", value, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidGreaterThanOrEqualTo(String value) {
            addCriterion("SDCNID >=", value, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidLessThan(String value) {
            addCriterion("SDCNID <", value, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidLessThanOrEqualTo(String value) {
            addCriterion("SDCNID <=", value, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidLike(String value) {
            addCriterion("SDCNID like", value, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidNotLike(String value) {
            addCriterion("SDCNID not like", value, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidIn(List<String> values) {
            addCriterion("SDCNID in", values, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidNotIn(List<String> values) {
            addCriterion("SDCNID not in", values, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidBetween(String value1, String value2) {
            addCriterion("SDCNID between", value1, value2, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidNotBetween(String value1, String value2) {
            addCriterion("SDCNID not between", value1, value2, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSddelnIsNull() {
            addCriterion("SDDELN is null");
            return (Criteria) this;
        }

        public Criteria andSddelnIsNotNull() {
            addCriterion("SDDELN is not null");
            return (Criteria) this;
        }

        public Criteria andSddelnEqualTo(Integer value) {
            addCriterion("SDDELN =", value, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnNotEqualTo(Integer value) {
            addCriterion("SDDELN <>", value, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnGreaterThan(Integer value) {
            addCriterion("SDDELN >", value, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnGreaterThanOrEqualTo(Integer value) {
            addCriterion("SDDELN >=", value, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnLessThan(Integer value) {
            addCriterion("SDDELN <", value, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnLessThanOrEqualTo(Integer value) {
            addCriterion("SDDELN <=", value, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnIn(List<Integer> values) {
            addCriterion("SDDELN in", values, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnNotIn(List<Integer> values) {
            addCriterion("SDDELN not in", values, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnBetween(Integer value1, Integer value2) {
            addCriterion("SDDELN between", value1, value2, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnNotBetween(Integer value1, Integer value2) {
            addCriterion("SDDELN not between", value1, value2, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSdrcdIsNull() {
            addCriterion("SDRCD is null");
            return (Criteria) this;
        }

        public Criteria andSdrcdIsNotNull() {
            addCriterion("SDRCD is not null");
            return (Criteria) this;
        }

        public Criteria andSdrcdEqualTo(String value) {
            addCriterion("SDRCD =", value, "sdrcd");
            return (Criteria) this;
        }

        public Criteria andSdrcdNotEqualTo(String value) {
            addCriterion("SDRCD <>", value, "sdrcd");
            return (Criteria) this;
        }

        public Criteria andSdrcdGreaterThan(String value) {
            addCriterion("SDRCD >", value, "sdrcd");
            return (Criteria) this;
        }

        public Criteria andSdrcdGreaterThanOrEqualTo(String value) {
            addCriterion("SDRCD >=", value, "sdrcd");
            return (Criteria) this;
        }

        public Criteria andSdrcdLessThan(String value) {
            addCriterion("SDRCD <", value, "sdrcd");
            return (Criteria) this;
        }

        public Criteria andSdrcdLessThanOrEqualTo(String value) {
            addCriterion("SDRCD <=", value, "sdrcd");
            return (Criteria) this;
        }

        public Criteria andSdrcdLike(String value) {
            addCriterion("SDRCD like", value, "sdrcd");
            return (Criteria) this;
        }

        public Criteria andSdrcdNotLike(String value) {
            addCriterion("SDRCD not like", value, "sdrcd");
            return (Criteria) this;
        }

        public Criteria andSdrcdIn(List<String> values) {
            addCriterion("SDRCD in", values, "sdrcd");
            return (Criteria) this;
        }

        public Criteria andSdrcdNotIn(List<String> values) {
            addCriterion("SDRCD not in", values, "sdrcd");
            return (Criteria) this;
        }

        public Criteria andSdrcdBetween(String value1, String value2) {
            addCriterion("SDRCD between", value1, value2, "sdrcd");
            return (Criteria) this;
        }

        public Criteria andSdrcdNotBetween(String value1, String value2) {
            addCriterion("SDRCD not between", value1, value2, "sdrcd");
            return (Criteria) this;
        }

        public Criteria andSdgrwtIsNull() {
            addCriterion("SDGRWT is null");
            return (Criteria) this;
        }

        public Criteria andSdgrwtIsNotNull() {
            addCriterion("SDGRWT is not null");
            return (Criteria) this;
        }

        public Criteria andSdgrwtEqualTo(Long value) {
            addCriterion("SDGRWT =", value, "sdgrwt");
            return (Criteria) this;
        }

        public Criteria andSdgrwtNotEqualTo(Long value) {
            addCriterion("SDGRWT <>", value, "sdgrwt");
            return (Criteria) this;
        }

        public Criteria andSdgrwtGreaterThan(Long value) {
            addCriterion("SDGRWT >", value, "sdgrwt");
            return (Criteria) this;
        }

        public Criteria andSdgrwtGreaterThanOrEqualTo(Long value) {
            addCriterion("SDGRWT >=", value, "sdgrwt");
            return (Criteria) this;
        }

        public Criteria andSdgrwtLessThan(Long value) {
            addCriterion("SDGRWT <", value, "sdgrwt");
            return (Criteria) this;
        }

        public Criteria andSdgrwtLessThanOrEqualTo(Long value) {
            addCriterion("SDGRWT <=", value, "sdgrwt");
            return (Criteria) this;
        }

        public Criteria andSdgrwtIn(List<Long> values) {
            addCriterion("SDGRWT in", values, "sdgrwt");
            return (Criteria) this;
        }

        public Criteria andSdgrwtNotIn(List<Long> values) {
            addCriterion("SDGRWT not in", values, "sdgrwt");
            return (Criteria) this;
        }

        public Criteria andSdgrwtBetween(Long value1, Long value2) {
            addCriterion("SDGRWT between", value1, value2, "sdgrwt");
            return (Criteria) this;
        }

        public Criteria andSdgrwtNotBetween(Long value1, Long value2) {
            addCriterion("SDGRWT not between", value1, value2, "sdgrwt");
            return (Criteria) this;
        }

        public Criteria andSdglcIsNull() {
            addCriterion("SDGLC is null");
            return (Criteria) this;
        }

        public Criteria andSdglcIsNotNull() {
            addCriterion("SDGLC is not null");
            return (Criteria) this;
        }

        public Criteria andSdglcEqualTo(String value) {
            addCriterion("SDGLC =", value, "sdglc");
            return (Criteria) this;
        }

        public Criteria andSdglcNotEqualTo(String value) {
            addCriterion("SDGLC <>", value, "sdglc");
            return (Criteria) this;
        }

        public Criteria andSdglcGreaterThan(String value) {
            addCriterion("SDGLC >", value, "sdglc");
            return (Criteria) this;
        }

        public Criteria andSdglcGreaterThanOrEqualTo(String value) {
            addCriterion("SDGLC >=", value, "sdglc");
            return (Criteria) this;
        }

        public Criteria andSdglcLessThan(String value) {
            addCriterion("SDGLC <", value, "sdglc");
            return (Criteria) this;
        }

        public Criteria andSdglcLessThanOrEqualTo(String value) {
            addCriterion("SDGLC <=", value, "sdglc");
            return (Criteria) this;
        }

        public Criteria andSdglcLike(String value) {
            addCriterion("SDGLC like", value, "sdglc");
            return (Criteria) this;
        }

        public Criteria andSdglcNotLike(String value) {
            addCriterion("SDGLC not like", value, "sdglc");
            return (Criteria) this;
        }

        public Criteria andSdglcIn(List<String> values) {
            addCriterion("SDGLC in", values, "sdglc");
            return (Criteria) this;
        }

        public Criteria andSdglcNotIn(List<String> values) {
            addCriterion("SDGLC not in", values, "sdglc");
            return (Criteria) this;
        }

        public Criteria andSdglcBetween(String value1, String value2) {
            addCriterion("SDGLC between", value1, value2, "sdglc");
            return (Criteria) this;
        }

        public Criteria andSdglcNotBetween(String value1, String value2) {
            addCriterion("SDGLC not between", value1, value2, "sdglc");
            return (Criteria) this;
        }

        public Criteria andSdvr01IsNull() {
            addCriterion("SDVR01 is null");
            return (Criteria) this;
        }

        public Criteria andSdvr01IsNotNull() {
            addCriterion("SDVR01 is not null");
            return (Criteria) this;
        }

        public Criteria andSdvr01EqualTo(String value) {
            addCriterion("SDVR01 =", value, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01NotEqualTo(String value) {
            addCriterion("SDVR01 <>", value, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01GreaterThan(String value) {
            addCriterion("SDVR01 >", value, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01GreaterThanOrEqualTo(String value) {
            addCriterion("SDVR01 >=", value, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01LessThan(String value) {
            addCriterion("SDVR01 <", value, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01LessThanOrEqualTo(String value) {
            addCriterion("SDVR01 <=", value, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01Like(String value) {
            addCriterion("SDVR01 like", value, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01NotLike(String value) {
            addCriterion("SDVR01 not like", value, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01In(List<String> values) {
            addCriterion("SDVR01 in", values, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01NotIn(List<String> values) {
            addCriterion("SDVR01 not in", values, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01Between(String value1, String value2) {
            addCriterion("SDVR01 between", value1, value2, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01NotBetween(String value1, String value2) {
            addCriterion("SDVR01 not between", value1, value2, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSduserIsNull() {
            addCriterion("SDUSER is null");
            return (Criteria) this;
        }

        public Criteria andSduserIsNotNull() {
            addCriterion("SDUSER is not null");
            return (Criteria) this;
        }

        public Criteria andSduserEqualTo(String value) {
            addCriterion("SDUSER =", value, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserNotEqualTo(String value) {
            addCriterion("SDUSER <>", value, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserGreaterThan(String value) {
            addCriterion("SDUSER >", value, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserGreaterThanOrEqualTo(String value) {
            addCriterion("SDUSER >=", value, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserLessThan(String value) {
            addCriterion("SDUSER <", value, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserLessThanOrEqualTo(String value) {
            addCriterion("SDUSER <=", value, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserLike(String value) {
            addCriterion("SDUSER like", value, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserNotLike(String value) {
            addCriterion("SDUSER not like", value, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserIn(List<String> values) {
            addCriterion("SDUSER in", values, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserNotIn(List<String> values) {
            addCriterion("SDUSER not in", values, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserBetween(String value1, String value2) {
            addCriterion("SDUSER between", value1, value2, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserNotBetween(String value1, String value2) {
            addCriterion("SDUSER not between", value1, value2, "sduser");
            return (Criteria) this;
        }

        public Criteria andSdupmjIsNull() {
            addCriterion("SDUPMJ is null");
            return (Criteria) this;
        }

        public Criteria andSdupmjIsNotNull() {
            addCriterion("SDUPMJ is not null");
            return (Criteria) this;
        }

        public Criteria andSdupmjEqualTo(Date value) {
            addCriterion("SDUPMJ =", value, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjNotEqualTo(Date value) {
            addCriterion("SDUPMJ <>", value, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjGreaterThan(Date value) {
            addCriterion("SDUPMJ >", value, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjGreaterThanOrEqualTo(Date value) {
            addCriterion("SDUPMJ >=", value, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjLessThan(Date value) {
            addCriterion("SDUPMJ <", value, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjLessThanOrEqualTo(Date value) {
            addCriterion("SDUPMJ <=", value, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjIn(List<Date> values) {
            addCriterion("SDUPMJ in", values, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjNotIn(List<Date> values) {
            addCriterion("SDUPMJ not in", values, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjBetween(Date value1, Date value2) {
            addCriterion("SDUPMJ between", value1, value2, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjNotBetween(Date value1, Date value2) {
            addCriterion("SDUPMJ not between", value1, value2, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateIsNull() {
            addCriterion("JDE_UpdateDate is null");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateIsNotNull() {
            addCriterion("JDE_UpdateDate is not null");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateEqualTo(Date value) {
            addCriterion("JDE_UpdateDate =", value, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateNotEqualTo(Date value) {
            addCriterion("JDE_UpdateDate <>", value, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateGreaterThan(Date value) {
            addCriterion("JDE_UpdateDate >", value, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("JDE_UpdateDate >=", value, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateLessThan(Date value) {
            addCriterion("JDE_UpdateDate <", value, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("JDE_UpdateDate <=", value, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateIn(List<Date> values) {
            addCriterion("JDE_UpdateDate in", values, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateNotIn(List<Date> values) {
            addCriterion("JDE_UpdateDate not in", values, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateBetween(Date value1, Date value2) {
            addCriterion("JDE_UpdateDate between", value1, value2, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("JDE_UpdateDate not between", value1, value2, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateIsNull() {
            addCriterion("KT_ProcessDate is null");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateIsNotNull() {
            addCriterion("KT_ProcessDate is not null");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateEqualTo(Date value) {
            addCriterion("KT_ProcessDate =", value, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateNotEqualTo(Date value) {
            addCriterion("KT_ProcessDate <>", value, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateGreaterThan(Date value) {
            addCriterion("KT_ProcessDate >", value, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateGreaterThanOrEqualTo(Date value) {
            addCriterion("KT_ProcessDate >=", value, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateLessThan(Date value) {
            addCriterion("KT_ProcessDate <", value, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateLessThanOrEqualTo(Date value) {
            addCriterion("KT_ProcessDate <=", value, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateIn(List<Date> values) {
            addCriterion("KT_ProcessDate in", values, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateNotIn(List<Date> values) {
            addCriterion("KT_ProcessDate not in", values, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateBetween(Date value1, Date value2) {
            addCriterion("KT_ProcessDate between", value1, value2, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateNotBetween(Date value1, Date value2) {
            addCriterion("KT_ProcessDate not between", value1, value2, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateIsNull() {
            addCriterion("KT_FailDate is null");
            return (Criteria) this;
        }

        public Criteria andKtFaildateIsNotNull() {
            addCriterion("KT_FailDate is not null");
            return (Criteria) this;
        }

        public Criteria andKtFaildateEqualTo(Date value) {
            addCriterion("KT_FailDate =", value, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateNotEqualTo(Date value) {
            addCriterion("KT_FailDate <>", value, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateGreaterThan(Date value) {
            addCriterion("KT_FailDate >", value, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateGreaterThanOrEqualTo(Date value) {
            addCriterion("KT_FailDate >=", value, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateLessThan(Date value) {
            addCriterion("KT_FailDate <", value, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateLessThanOrEqualTo(Date value) {
            addCriterion("KT_FailDate <=", value, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateIn(List<Date> values) {
            addCriterion("KT_FailDate in", values, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateNotIn(List<Date> values) {
            addCriterion("KT_FailDate not in", values, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateBetween(Date value1, Date value2) {
            addCriterion("KT_FailDate between", value1, value2, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateNotBetween(Date value1, Date value2) {
            addCriterion("KT_FailDate not between", value1, value2, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesIsNull() {
            addCriterion("KT_RetryTimes is null");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesIsNotNull() {
            addCriterion("KT_RetryTimes is not null");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesEqualTo(Integer value) {
            addCriterion("KT_RetryTimes =", value, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesNotEqualTo(Integer value) {
            addCriterion("KT_RetryTimes <>", value, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesGreaterThan(Integer value) {
            addCriterion("KT_RetryTimes >", value, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("KT_RetryTimes >=", value, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesLessThan(Integer value) {
            addCriterion("KT_RetryTimes <", value, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesLessThanOrEqualTo(Integer value) {
            addCriterion("KT_RetryTimes <=", value, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesIn(List<Integer> values) {
            addCriterion("KT_RetryTimes in", values, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesNotIn(List<Integer> values) {
            addCriterion("KT_RetryTimes not in", values, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesBetween(Integer value1, Integer value2) {
            addCriterion("KT_RetryTimes between", value1, value2, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesNotBetween(Integer value1, Integer value2) {
            addCriterion("KT_RetryTimes not between", value1, value2, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogIsNull() {
            addCriterion("KT_ErrorLog is null");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogIsNotNull() {
            addCriterion("KT_ErrorLog is not null");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogEqualTo(String value) {
            addCriterion("KT_ErrorLog =", value, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogNotEqualTo(String value) {
            addCriterion("KT_ErrorLog <>", value, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogGreaterThan(String value) {
            addCriterion("KT_ErrorLog >", value, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogGreaterThanOrEqualTo(String value) {
            addCriterion("KT_ErrorLog >=", value, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogLessThan(String value) {
            addCriterion("KT_ErrorLog <", value, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogLessThanOrEqualTo(String value) {
            addCriterion("KT_ErrorLog <=", value, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogLike(String value) {
            addCriterion("KT_ErrorLog like", value, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogNotLike(String value) {
            addCriterion("KT_ErrorLog not like", value, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogIn(List<String> values) {
            addCriterion("KT_ErrorLog in", values, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogNotIn(List<String> values) {
            addCriterion("KT_ErrorLog not in", values, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogBetween(String value1, String value2) {
            addCriterion("KT_ErrorLog between", value1, value2, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogNotBetween(String value1, String value2) {
            addCriterion("KT_ErrorLog not between", value1, value2, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("IS_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("IS_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(String value) {
            addCriterion("IS_CHECK =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(String value) {
            addCriterion("IS_CHECK <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(String value) {
            addCriterion("IS_CHECK >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CHECK >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(String value) {
            addCriterion("IS_CHECK <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(String value) {
            addCriterion("IS_CHECK <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLike(String value) {
            addCriterion("IS_CHECK like", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotLike(String value) {
            addCriterion("IS_CHECK not like", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<String> values) {
            addCriterion("IS_CHECK in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<String> values) {
            addCriterion("IS_CHECK not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(String value1, String value2) {
            addCriterion("IS_CHECK between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(String value1, String value2) {
            addCriterion("IS_CHECK not between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateIsNull() {
            addCriterion("FMS_Process_Date is null");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateIsNotNull() {
            addCriterion("FMS_Process_Date is not null");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateEqualTo(Date value) {
            addCriterion("FMS_Process_Date =", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateNotEqualTo(Date value) {
            addCriterion("FMS_Process_Date <>", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateGreaterThan(Date value) {
            addCriterion("FMS_Process_Date >", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FMS_Process_Date >=", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateLessThan(Date value) {
            addCriterion("FMS_Process_Date <", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateLessThanOrEqualTo(Date value) {
            addCriterion("FMS_Process_Date <=", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateIn(List<Date> values) {
            addCriterion("FMS_Process_Date in", values, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateNotIn(List<Date> values) {
            addCriterion("FMS_Process_Date not in", values, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateBetween(Date value1, Date value2) {
            addCriterion("FMS_Process_Date between", value1, value2, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateNotBetween(Date value1, Date value2) {
            addCriterion("FMS_Process_Date not between", value1, value2, "fmsProcessDate");
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