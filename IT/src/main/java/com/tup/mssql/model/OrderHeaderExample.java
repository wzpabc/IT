package com.tup.mssql.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderHeaderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderHeaderExample() {
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

        public Criteria andShkcooIsNull() {
            addCriterion("SHKCOO is null");
            return (Criteria) this;
        }

        public Criteria andShkcooIsNotNull() {
            addCriterion("SHKCOO is not null");
            return (Criteria) this;
        }

        public Criteria andShkcooEqualTo(String value) {
            addCriterion("SHKCOO =", value, "shkcoo");
            return (Criteria) this;
        }

        public Criteria andShkcooNotEqualTo(String value) {
            addCriterion("SHKCOO <>", value, "shkcoo");
            return (Criteria) this;
        }

        public Criteria andShkcooGreaterThan(String value) {
            addCriterion("SHKCOO >", value, "shkcoo");
            return (Criteria) this;
        }

        public Criteria andShkcooGreaterThanOrEqualTo(String value) {
            addCriterion("SHKCOO >=", value, "shkcoo");
            return (Criteria) this;
        }

        public Criteria andShkcooLessThan(String value) {
            addCriterion("SHKCOO <", value, "shkcoo");
            return (Criteria) this;
        }

        public Criteria andShkcooLessThanOrEqualTo(String value) {
            addCriterion("SHKCOO <=", value, "shkcoo");
            return (Criteria) this;
        }

        public Criteria andShkcooLike(String value) {
            addCriterion("SHKCOO like", value, "shkcoo");
            return (Criteria) this;
        }

        public Criteria andShkcooNotLike(String value) {
            addCriterion("SHKCOO not like", value, "shkcoo");
            return (Criteria) this;
        }

        public Criteria andShkcooIn(List<String> values) {
            addCriterion("SHKCOO in", values, "shkcoo");
            return (Criteria) this;
        }

        public Criteria andShkcooNotIn(List<String> values) {
            addCriterion("SHKCOO not in", values, "shkcoo");
            return (Criteria) this;
        }

        public Criteria andShkcooBetween(String value1, String value2) {
            addCriterion("SHKCOO between", value1, value2, "shkcoo");
            return (Criteria) this;
        }

        public Criteria andShkcooNotBetween(String value1, String value2) {
            addCriterion("SHKCOO not between", value1, value2, "shkcoo");
            return (Criteria) this;
        }

        public Criteria andShdocoIsNull() {
            addCriterion("SHDOCO is null");
            return (Criteria) this;
        }

        public Criteria andShdocoIsNotNull() {
            addCriterion("SHDOCO is not null");
            return (Criteria) this;
        }

        public Criteria andShdocoEqualTo(Integer value) {
            addCriterion("SHDOCO =", value, "shdoco");
            return (Criteria) this;
        }

        public Criteria andShdocoNotEqualTo(Integer value) {
            addCriterion("SHDOCO <>", value, "shdoco");
            return (Criteria) this;
        }

        public Criteria andShdocoGreaterThan(Integer value) {
            addCriterion("SHDOCO >", value, "shdoco");
            return (Criteria) this;
        }

        public Criteria andShdocoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHDOCO >=", value, "shdoco");
            return (Criteria) this;
        }

        public Criteria andShdocoLessThan(Integer value) {
            addCriterion("SHDOCO <", value, "shdoco");
            return (Criteria) this;
        }

        public Criteria andShdocoLessThanOrEqualTo(Integer value) {
            addCriterion("SHDOCO <=", value, "shdoco");
            return (Criteria) this;
        }

        public Criteria andShdocoIn(List<Integer> values) {
            addCriterion("SHDOCO in", values, "shdoco");
            return (Criteria) this;
        }

        public Criteria andShdocoNotIn(List<Integer> values) {
            addCriterion("SHDOCO not in", values, "shdoco");
            return (Criteria) this;
        }

        public Criteria andShdocoBetween(Integer value1, Integer value2) {
            addCriterion("SHDOCO between", value1, value2, "shdoco");
            return (Criteria) this;
        }

        public Criteria andShdocoNotBetween(Integer value1, Integer value2) {
            addCriterion("SHDOCO not between", value1, value2, "shdoco");
            return (Criteria) this;
        }

        public Criteria andShdctoIsNull() {
            addCriterion("SHDCTO is null");
            return (Criteria) this;
        }

        public Criteria andShdctoIsNotNull() {
            addCriterion("SHDCTO is not null");
            return (Criteria) this;
        }

        public Criteria andShdctoEqualTo(String value) {
            addCriterion("SHDCTO =", value, "shdcto");
            return (Criteria) this;
        }

        public Criteria andShdctoNotEqualTo(String value) {
            addCriterion("SHDCTO <>", value, "shdcto");
            return (Criteria) this;
        }

        public Criteria andShdctoGreaterThan(String value) {
            addCriterion("SHDCTO >", value, "shdcto");
            return (Criteria) this;
        }

        public Criteria andShdctoGreaterThanOrEqualTo(String value) {
            addCriterion("SHDCTO >=", value, "shdcto");
            return (Criteria) this;
        }

        public Criteria andShdctoLessThan(String value) {
            addCriterion("SHDCTO <", value, "shdcto");
            return (Criteria) this;
        }

        public Criteria andShdctoLessThanOrEqualTo(String value) {
            addCriterion("SHDCTO <=", value, "shdcto");
            return (Criteria) this;
        }

        public Criteria andShdctoLike(String value) {
            addCriterion("SHDCTO like", value, "shdcto");
            return (Criteria) this;
        }

        public Criteria andShdctoNotLike(String value) {
            addCriterion("SHDCTO not like", value, "shdcto");
            return (Criteria) this;
        }

        public Criteria andShdctoIn(List<String> values) {
            addCriterion("SHDCTO in", values, "shdcto");
            return (Criteria) this;
        }

        public Criteria andShdctoNotIn(List<String> values) {
            addCriterion("SHDCTO not in", values, "shdcto");
            return (Criteria) this;
        }

        public Criteria andShdctoBetween(String value1, String value2) {
            addCriterion("SHDCTO between", value1, value2, "shdcto");
            return (Criteria) this;
        }

        public Criteria andShdctoNotBetween(String value1, String value2) {
            addCriterion("SHDCTO not between", value1, value2, "shdcto");
            return (Criteria) this;
        }

        public Criteria andShmcuIsNull() {
            addCriterion("SHMCU is null");
            return (Criteria) this;
        }

        public Criteria andShmcuIsNotNull() {
            addCriterion("SHMCU is not null");
            return (Criteria) this;
        }

        public Criteria andShmcuEqualTo(String value) {
            addCriterion("SHMCU =", value, "shmcu");
            return (Criteria) this;
        }

        public Criteria andShmcuNotEqualTo(String value) {
            addCriterion("SHMCU <>", value, "shmcu");
            return (Criteria) this;
        }

        public Criteria andShmcuGreaterThan(String value) {
            addCriterion("SHMCU >", value, "shmcu");
            return (Criteria) this;
        }

        public Criteria andShmcuGreaterThanOrEqualTo(String value) {
            addCriterion("SHMCU >=", value, "shmcu");
            return (Criteria) this;
        }

        public Criteria andShmcuLessThan(String value) {
            addCriterion("SHMCU <", value, "shmcu");
            return (Criteria) this;
        }

        public Criteria andShmcuLessThanOrEqualTo(String value) {
            addCriterion("SHMCU <=", value, "shmcu");
            return (Criteria) this;
        }

        public Criteria andShmcuLike(String value) {
            addCriterion("SHMCU like", value, "shmcu");
            return (Criteria) this;
        }

        public Criteria andShmcuNotLike(String value) {
            addCriterion("SHMCU not like", value, "shmcu");
            return (Criteria) this;
        }

        public Criteria andShmcuIn(List<String> values) {
            addCriterion("SHMCU in", values, "shmcu");
            return (Criteria) this;
        }

        public Criteria andShmcuNotIn(List<String> values) {
            addCriterion("SHMCU not in", values, "shmcu");
            return (Criteria) this;
        }

        public Criteria andShmcuBetween(String value1, String value2) {
            addCriterion("SHMCU between", value1, value2, "shmcu");
            return (Criteria) this;
        }

        public Criteria andShmcuNotBetween(String value1, String value2) {
            addCriterion("SHMCU not between", value1, value2, "shmcu");
            return (Criteria) this;
        }

        public Criteria andShcoIsNull() {
            addCriterion("SHCO is null");
            return (Criteria) this;
        }

        public Criteria andShcoIsNotNull() {
            addCriterion("SHCO is not null");
            return (Criteria) this;
        }

        public Criteria andShcoEqualTo(String value) {
            addCriterion("SHCO =", value, "shco");
            return (Criteria) this;
        }

        public Criteria andShcoNotEqualTo(String value) {
            addCriterion("SHCO <>", value, "shco");
            return (Criteria) this;
        }

        public Criteria andShcoGreaterThan(String value) {
            addCriterion("SHCO >", value, "shco");
            return (Criteria) this;
        }

        public Criteria andShcoGreaterThanOrEqualTo(String value) {
            addCriterion("SHCO >=", value, "shco");
            return (Criteria) this;
        }

        public Criteria andShcoLessThan(String value) {
            addCriterion("SHCO <", value, "shco");
            return (Criteria) this;
        }

        public Criteria andShcoLessThanOrEqualTo(String value) {
            addCriterion("SHCO <=", value, "shco");
            return (Criteria) this;
        }

        public Criteria andShcoLike(String value) {
            addCriterion("SHCO like", value, "shco");
            return (Criteria) this;
        }

        public Criteria andShcoNotLike(String value) {
            addCriterion("SHCO not like", value, "shco");
            return (Criteria) this;
        }

        public Criteria andShcoIn(List<String> values) {
            addCriterion("SHCO in", values, "shco");
            return (Criteria) this;
        }

        public Criteria andShcoNotIn(List<String> values) {
            addCriterion("SHCO not in", values, "shco");
            return (Criteria) this;
        }

        public Criteria andShcoBetween(String value1, String value2) {
            addCriterion("SHCO between", value1, value2, "shco");
            return (Criteria) this;
        }

        public Criteria andShcoNotBetween(String value1, String value2) {
            addCriterion("SHCO not between", value1, value2, "shco");
            return (Criteria) this;
        }

        public Criteria andShan8IsNull() {
            addCriterion("SHAN8 is null");
            return (Criteria) this;
        }

        public Criteria andShan8IsNotNull() {
            addCriterion("SHAN8 is not null");
            return (Criteria) this;
        }

        public Criteria andShan8EqualTo(Integer value) {
            addCriterion("SHAN8 =", value, "shan8");
            return (Criteria) this;
        }

        public Criteria andShan8NotEqualTo(Integer value) {
            addCriterion("SHAN8 <>", value, "shan8");
            return (Criteria) this;
        }

        public Criteria andShan8GreaterThan(Integer value) {
            addCriterion("SHAN8 >", value, "shan8");
            return (Criteria) this;
        }

        public Criteria andShan8GreaterThanOrEqualTo(Integer value) {
            addCriterion("SHAN8 >=", value, "shan8");
            return (Criteria) this;
        }

        public Criteria andShan8LessThan(Integer value) {
            addCriterion("SHAN8 <", value, "shan8");
            return (Criteria) this;
        }

        public Criteria andShan8LessThanOrEqualTo(Integer value) {
            addCriterion("SHAN8 <=", value, "shan8");
            return (Criteria) this;
        }

        public Criteria andShan8In(List<Integer> values) {
            addCriterion("SHAN8 in", values, "shan8");
            return (Criteria) this;
        }

        public Criteria andShan8NotIn(List<Integer> values) {
            addCriterion("SHAN8 not in", values, "shan8");
            return (Criteria) this;
        }

        public Criteria andShan8Between(Integer value1, Integer value2) {
            addCriterion("SHAN8 between", value1, value2, "shan8");
            return (Criteria) this;
        }

        public Criteria andShan8NotBetween(Integer value1, Integer value2) {
            addCriterion("SHAN8 not between", value1, value2, "shan8");
            return (Criteria) this;
        }

        public Criteria andShshanIsNull() {
            addCriterion("SHSHAN is null");
            return (Criteria) this;
        }

        public Criteria andShshanIsNotNull() {
            addCriterion("SHSHAN is not null");
            return (Criteria) this;
        }

        public Criteria andShshanEqualTo(Integer value) {
            addCriterion("SHSHAN =", value, "shshan");
            return (Criteria) this;
        }

        public Criteria andShshanNotEqualTo(Integer value) {
            addCriterion("SHSHAN <>", value, "shshan");
            return (Criteria) this;
        }

        public Criteria andShshanGreaterThan(Integer value) {
            addCriterion("SHSHAN >", value, "shshan");
            return (Criteria) this;
        }

        public Criteria andShshanGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHSHAN >=", value, "shshan");
            return (Criteria) this;
        }

        public Criteria andShshanLessThan(Integer value) {
            addCriterion("SHSHAN <", value, "shshan");
            return (Criteria) this;
        }

        public Criteria andShshanLessThanOrEqualTo(Integer value) {
            addCriterion("SHSHAN <=", value, "shshan");
            return (Criteria) this;
        }

        public Criteria andShshanIn(List<Integer> values) {
            addCriterion("SHSHAN in", values, "shshan");
            return (Criteria) this;
        }

        public Criteria andShshanNotIn(List<Integer> values) {
            addCriterion("SHSHAN not in", values, "shshan");
            return (Criteria) this;
        }

        public Criteria andShshanBetween(Integer value1, Integer value2) {
            addCriterion("SHSHAN between", value1, value2, "shshan");
            return (Criteria) this;
        }

        public Criteria andShshanNotBetween(Integer value1, Integer value2) {
            addCriterion("SHSHAN not between", value1, value2, "shshan");
            return (Criteria) this;
        }

        public Criteria andShtrdjIsNull() {
            addCriterion("SHTRDJ is null");
            return (Criteria) this;
        }

        public Criteria andShtrdjIsNotNull() {
            addCriterion("SHTRDJ is not null");
            return (Criteria) this;
        }

        public Criteria andShtrdjEqualTo(Date value) {
            addCriterionForJDBCDate("SHTRDJ =", value, "shtrdj");
            return (Criteria) this;
        }

        public Criteria andShtrdjNotEqualTo(Date value) {
            addCriterionForJDBCDate("SHTRDJ <>", value, "shtrdj");
            return (Criteria) this;
        }

        public Criteria andShtrdjGreaterThan(Date value) {
            addCriterionForJDBCDate("SHTRDJ >", value, "shtrdj");
            return (Criteria) this;
        }

        public Criteria andShtrdjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SHTRDJ >=", value, "shtrdj");
            return (Criteria) this;
        }

        public Criteria andShtrdjLessThan(Date value) {
            addCriterionForJDBCDate("SHTRDJ <", value, "shtrdj");
            return (Criteria) this;
        }

        public Criteria andShtrdjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SHTRDJ <=", value, "shtrdj");
            return (Criteria) this;
        }

        public Criteria andShtrdjIn(List<Date> values) {
            addCriterionForJDBCDate("SHTRDJ in", values, "shtrdj");
            return (Criteria) this;
        }

        public Criteria andShtrdjNotIn(List<Date> values) {
            addCriterionForJDBCDate("SHTRDJ not in", values, "shtrdj");
            return (Criteria) this;
        }

        public Criteria andShtrdjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SHTRDJ between", value1, value2, "shtrdj");
            return (Criteria) this;
        }

        public Criteria andShtrdjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SHTRDJ not between", value1, value2, "shtrdj");
            return (Criteria) this;
        }

        public Criteria andShdrqjIsNull() {
            addCriterion("SHDRQJ is null");
            return (Criteria) this;
        }

        public Criteria andShdrqjIsNotNull() {
            addCriterion("SHDRQJ is not null");
            return (Criteria) this;
        }

        public Criteria andShdrqjEqualTo(Date value) {
            addCriterion("SHDRQJ =", value, "shdrqj");
            return (Criteria) this;
        }

        public Criteria andShdrqjNotEqualTo(Date value) {
            addCriterion("SHDRQJ <>", value, "shdrqj");
            return (Criteria) this;
        }

        public Criteria andShdrqjGreaterThan(Date value) {
            addCriterion("SHDRQJ >", value, "shdrqj");
            return (Criteria) this;
        }

        public Criteria andShdrqjGreaterThanOrEqualTo(Date value) {
            addCriterion("SHDRQJ >=", value, "shdrqj");
            return (Criteria) this;
        }

        public Criteria andShdrqjLessThan(Date value) {
            addCriterion("SHDRQJ <", value, "shdrqj");
            return (Criteria) this;
        }

        public Criteria andShdrqjLessThanOrEqualTo(Date value) {
            addCriterion("SHDRQJ <=", value, "shdrqj");
            return (Criteria) this;
        }

        public Criteria andShdrqjIn(List<Date> values) {
            addCriterion("SHDRQJ in", values, "shdrqj");
            return (Criteria) this;
        }

        public Criteria andShdrqjNotIn(List<Date> values) {
            addCriterion("SHDRQJ not in", values, "shdrqj");
            return (Criteria) this;
        }

        public Criteria andShdrqjBetween(Date value1, Date value2) {
            addCriterion("SHDRQJ between", value1, value2, "shdrqj");
            return (Criteria) this;
        }

        public Criteria andShdrqjNotBetween(Date value1, Date value2) {
            addCriterion("SHDRQJ not between", value1, value2, "shdrqj");
            return (Criteria) this;
        }

        public Criteria andShpddjIsNull() {
            addCriterion("SHPDDJ is null");
            return (Criteria) this;
        }

        public Criteria andShpddjIsNotNull() {
            addCriterion("SHPDDJ is not null");
            return (Criteria) this;
        }

        public Criteria andShpddjEqualTo(Date value) {
            addCriterionForJDBCDate("SHPDDJ =", value, "shpddj");
            return (Criteria) this;
        }

        public Criteria andShpddjNotEqualTo(Date value) {
            addCriterionForJDBCDate("SHPDDJ <>", value, "shpddj");
            return (Criteria) this;
        }

        public Criteria andShpddjGreaterThan(Date value) {
            addCriterionForJDBCDate("SHPDDJ >", value, "shpddj");
            return (Criteria) this;
        }

        public Criteria andShpddjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SHPDDJ >=", value, "shpddj");
            return (Criteria) this;
        }

        public Criteria andShpddjLessThan(Date value) {
            addCriterionForJDBCDate("SHPDDJ <", value, "shpddj");
            return (Criteria) this;
        }

        public Criteria andShpddjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SHPDDJ <=", value, "shpddj");
            return (Criteria) this;
        }

        public Criteria andShpddjIn(List<Date> values) {
            addCriterionForJDBCDate("SHPDDJ in", values, "shpddj");
            return (Criteria) this;
        }

        public Criteria andShpddjNotIn(List<Date> values) {
            addCriterionForJDBCDate("SHPDDJ not in", values, "shpddj");
            return (Criteria) this;
        }

        public Criteria andShpddjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SHPDDJ between", value1, value2, "shpddj");
            return (Criteria) this;
        }

        public Criteria andShpddjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SHPDDJ not between", value1, value2, "shpddj");
            return (Criteria) this;
        }

        public Criteria andShvr01IsNull() {
            addCriterion("SHVR01 is null");
            return (Criteria) this;
        }

        public Criteria andShvr01IsNotNull() {
            addCriterion("SHVR01 is not null");
            return (Criteria) this;
        }

        public Criteria andShvr01EqualTo(String value) {
            addCriterion("SHVR01 =", value, "shvr01");
            return (Criteria) this;
        }

        public Criteria andShvr01NotEqualTo(String value) {
            addCriterion("SHVR01 <>", value, "shvr01");
            return (Criteria) this;
        }

        public Criteria andShvr01GreaterThan(String value) {
            addCriterion("SHVR01 >", value, "shvr01");
            return (Criteria) this;
        }

        public Criteria andShvr01GreaterThanOrEqualTo(String value) {
            addCriterion("SHVR01 >=", value, "shvr01");
            return (Criteria) this;
        }

        public Criteria andShvr01LessThan(String value) {
            addCriterion("SHVR01 <", value, "shvr01");
            return (Criteria) this;
        }

        public Criteria andShvr01LessThanOrEqualTo(String value) {
            addCriterion("SHVR01 <=", value, "shvr01");
            return (Criteria) this;
        }

        public Criteria andShvr01Like(String value) {
            addCriterion("SHVR01 like", value, "shvr01");
            return (Criteria) this;
        }

        public Criteria andShvr01NotLike(String value) {
            addCriterion("SHVR01 not like", value, "shvr01");
            return (Criteria) this;
        }

        public Criteria andShvr01In(List<String> values) {
            addCriterion("SHVR01 in", values, "shvr01");
            return (Criteria) this;
        }

        public Criteria andShvr01NotIn(List<String> values) {
            addCriterion("SHVR01 not in", values, "shvr01");
            return (Criteria) this;
        }

        public Criteria andShvr01Between(String value1, String value2) {
            addCriterion("SHVR01 between", value1, value2, "shvr01");
            return (Criteria) this;
        }

        public Criteria andShvr01NotBetween(String value1, String value2) {
            addCriterion("SHVR01 not between", value1, value2, "shvr01");
            return (Criteria) this;
        }

        public Criteria andShdel1IsNull() {
            addCriterion("SHDEL1 is null");
            return (Criteria) this;
        }

        public Criteria andShdel1IsNotNull() {
            addCriterion("SHDEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andShdel1EqualTo(String value) {
            addCriterion("SHDEL1 =", value, "shdel1");
            return (Criteria) this;
        }

        public Criteria andShdel1NotEqualTo(String value) {
            addCriterion("SHDEL1 <>", value, "shdel1");
            return (Criteria) this;
        }

        public Criteria andShdel1GreaterThan(String value) {
            addCriterion("SHDEL1 >", value, "shdel1");
            return (Criteria) this;
        }

        public Criteria andShdel1GreaterThanOrEqualTo(String value) {
            addCriterion("SHDEL1 >=", value, "shdel1");
            return (Criteria) this;
        }

        public Criteria andShdel1LessThan(String value) {
            addCriterion("SHDEL1 <", value, "shdel1");
            return (Criteria) this;
        }

        public Criteria andShdel1LessThanOrEqualTo(String value) {
            addCriterion("SHDEL1 <=", value, "shdel1");
            return (Criteria) this;
        }

        public Criteria andShdel1Like(String value) {
            addCriterion("SHDEL1 like", value, "shdel1");
            return (Criteria) this;
        }

        public Criteria andShdel1NotLike(String value) {
            addCriterion("SHDEL1 not like", value, "shdel1");
            return (Criteria) this;
        }

        public Criteria andShdel1In(List<String> values) {
            addCriterion("SHDEL1 in", values, "shdel1");
            return (Criteria) this;
        }

        public Criteria andShdel1NotIn(List<String> values) {
            addCriterion("SHDEL1 not in", values, "shdel1");
            return (Criteria) this;
        }

        public Criteria andShdel1Between(String value1, String value2) {
            addCriterion("SHDEL1 between", value1, value2, "shdel1");
            return (Criteria) this;
        }

        public Criteria andShdel1NotBetween(String value1, String value2) {
            addCriterion("SHDEL1 not between", value1, value2, "shdel1");
            return (Criteria) this;
        }

        public Criteria andShdel2IsNull() {
            addCriterion("SHDEL2 is null");
            return (Criteria) this;
        }

        public Criteria andShdel2IsNotNull() {
            addCriterion("SHDEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andShdel2EqualTo(String value) {
            addCriterion("SHDEL2 =", value, "shdel2");
            return (Criteria) this;
        }

        public Criteria andShdel2NotEqualTo(String value) {
            addCriterion("SHDEL2 <>", value, "shdel2");
            return (Criteria) this;
        }

        public Criteria andShdel2GreaterThan(String value) {
            addCriterion("SHDEL2 >", value, "shdel2");
            return (Criteria) this;
        }

        public Criteria andShdel2GreaterThanOrEqualTo(String value) {
            addCriterion("SHDEL2 >=", value, "shdel2");
            return (Criteria) this;
        }

        public Criteria andShdel2LessThan(String value) {
            addCriterion("SHDEL2 <", value, "shdel2");
            return (Criteria) this;
        }

        public Criteria andShdel2LessThanOrEqualTo(String value) {
            addCriterion("SHDEL2 <=", value, "shdel2");
            return (Criteria) this;
        }

        public Criteria andShdel2Like(String value) {
            addCriterion("SHDEL2 like", value, "shdel2");
            return (Criteria) this;
        }

        public Criteria andShdel2NotLike(String value) {
            addCriterion("SHDEL2 not like", value, "shdel2");
            return (Criteria) this;
        }

        public Criteria andShdel2In(List<String> values) {
            addCriterion("SHDEL2 in", values, "shdel2");
            return (Criteria) this;
        }

        public Criteria andShdel2NotIn(List<String> values) {
            addCriterion("SHDEL2 not in", values, "shdel2");
            return (Criteria) this;
        }

        public Criteria andShdel2Between(String value1, String value2) {
            addCriterion("SHDEL2 between", value1, value2, "shdel2");
            return (Criteria) this;
        }

        public Criteria andShdel2NotBetween(String value1, String value2) {
            addCriterion("SHDEL2 not between", value1, value2, "shdel2");
            return (Criteria) this;
        }

        public Criteria andShurcdIsNull() {
            addCriterion("SHURCD is null");
            return (Criteria) this;
        }

        public Criteria andShurcdIsNotNull() {
            addCriterion("SHURCD is not null");
            return (Criteria) this;
        }

        public Criteria andShurcdEqualTo(String value) {
            addCriterion("SHURCD =", value, "shurcd");
            return (Criteria) this;
        }

        public Criteria andShurcdNotEqualTo(String value) {
            addCriterion("SHURCD <>", value, "shurcd");
            return (Criteria) this;
        }

        public Criteria andShurcdGreaterThan(String value) {
            addCriterion("SHURCD >", value, "shurcd");
            return (Criteria) this;
        }

        public Criteria andShurcdGreaterThanOrEqualTo(String value) {
            addCriterion("SHURCD >=", value, "shurcd");
            return (Criteria) this;
        }

        public Criteria andShurcdLessThan(String value) {
            addCriterion("SHURCD <", value, "shurcd");
            return (Criteria) this;
        }

        public Criteria andShurcdLessThanOrEqualTo(String value) {
            addCriterion("SHURCD <=", value, "shurcd");
            return (Criteria) this;
        }

        public Criteria andShurcdLike(String value) {
            addCriterion("SHURCD like", value, "shurcd");
            return (Criteria) this;
        }

        public Criteria andShurcdNotLike(String value) {
            addCriterion("SHURCD not like", value, "shurcd");
            return (Criteria) this;
        }

        public Criteria andShurcdIn(List<String> values) {
            addCriterion("SHURCD in", values, "shurcd");
            return (Criteria) this;
        }

        public Criteria andShurcdNotIn(List<String> values) {
            addCriterion("SHURCD not in", values, "shurcd");
            return (Criteria) this;
        }

        public Criteria andShurcdBetween(String value1, String value2) {
            addCriterion("SHURCD between", value1, value2, "shurcd");
            return (Criteria) this;
        }

        public Criteria andShurcdNotBetween(String value1, String value2) {
            addCriterion("SHURCD not between", value1, value2, "shurcd");
            return (Criteria) this;
        }

        public Criteria andShurdtIsNull() {
            addCriterion("SHURDT is null");
            return (Criteria) this;
        }

        public Criteria andShurdtIsNotNull() {
            addCriterion("SHURDT is not null");
            return (Criteria) this;
        }

        public Criteria andShurdtEqualTo(Date value) {
            addCriterionForJDBCDate("SHURDT =", value, "shurdt");
            return (Criteria) this;
        }

        public Criteria andShurdtNotEqualTo(Date value) {
            addCriterionForJDBCDate("SHURDT <>", value, "shurdt");
            return (Criteria) this;
        }

        public Criteria andShurdtGreaterThan(Date value) {
            addCriterionForJDBCDate("SHURDT >", value, "shurdt");
            return (Criteria) this;
        }

        public Criteria andShurdtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SHURDT >=", value, "shurdt");
            return (Criteria) this;
        }

        public Criteria andShurdtLessThan(Date value) {
            addCriterionForJDBCDate("SHURDT <", value, "shurdt");
            return (Criteria) this;
        }

        public Criteria andShurdtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SHURDT <=", value, "shurdt");
            return (Criteria) this;
        }

        public Criteria andShurdtIn(List<Date> values) {
            addCriterionForJDBCDate("SHURDT in", values, "shurdt");
            return (Criteria) this;
        }

        public Criteria andShurdtNotIn(List<Date> values) {
            addCriterionForJDBCDate("SHURDT not in", values, "shurdt");
            return (Criteria) this;
        }

        public Criteria andShurdtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SHURDT between", value1, value2, "shurdt");
            return (Criteria) this;
        }

        public Criteria andShurdtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SHURDT not between", value1, value2, "shurdt");
            return (Criteria) this;
        }

        public Criteria andShuratIsNull() {
            addCriterion("SHURAT is null");
            return (Criteria) this;
        }

        public Criteria andShuratIsNotNull() {
            addCriterion("SHURAT is not null");
            return (Criteria) this;
        }

        public Criteria andShuratEqualTo(BigDecimal value) {
            addCriterion("SHURAT =", value, "shurat");
            return (Criteria) this;
        }

        public Criteria andShuratNotEqualTo(BigDecimal value) {
            addCriterion("SHURAT <>", value, "shurat");
            return (Criteria) this;
        }

        public Criteria andShuratGreaterThan(BigDecimal value) {
            addCriterion("SHURAT >", value, "shurat");
            return (Criteria) this;
        }

        public Criteria andShuratGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHURAT >=", value, "shurat");
            return (Criteria) this;
        }

        public Criteria andShuratLessThan(BigDecimal value) {
            addCriterion("SHURAT <", value, "shurat");
            return (Criteria) this;
        }

        public Criteria andShuratLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHURAT <=", value, "shurat");
            return (Criteria) this;
        }

        public Criteria andShuratIn(List<BigDecimal> values) {
            addCriterion("SHURAT in", values, "shurat");
            return (Criteria) this;
        }

        public Criteria andShuratNotIn(List<BigDecimal> values) {
            addCriterion("SHURAT not in", values, "shurat");
            return (Criteria) this;
        }

        public Criteria andShuratBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHURAT between", value1, value2, "shurat");
            return (Criteria) this;
        }

        public Criteria andShuratNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHURAT not between", value1, value2, "shurat");
            return (Criteria) this;
        }

        public Criteria andShurabIsNull() {
            addCriterion("SHURAB is null");
            return (Criteria) this;
        }

        public Criteria andShurabIsNotNull() {
            addCriterion("SHURAB is not null");
            return (Criteria) this;
        }

        public Criteria andShurabEqualTo(BigDecimal value) {
            addCriterion("SHURAB =", value, "shurab");
            return (Criteria) this;
        }

        public Criteria andShurabNotEqualTo(BigDecimal value) {
            addCriterion("SHURAB <>", value, "shurab");
            return (Criteria) this;
        }

        public Criteria andShurabGreaterThan(BigDecimal value) {
            addCriterion("SHURAB >", value, "shurab");
            return (Criteria) this;
        }

        public Criteria andShurabGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHURAB >=", value, "shurab");
            return (Criteria) this;
        }

        public Criteria andShurabLessThan(BigDecimal value) {
            addCriterion("SHURAB <", value, "shurab");
            return (Criteria) this;
        }

        public Criteria andShurabLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHURAB <=", value, "shurab");
            return (Criteria) this;
        }

        public Criteria andShurabIn(List<BigDecimal> values) {
            addCriterion("SHURAB in", values, "shurab");
            return (Criteria) this;
        }

        public Criteria andShurabNotIn(List<BigDecimal> values) {
            addCriterion("SHURAB not in", values, "shurab");
            return (Criteria) this;
        }

        public Criteria andShurabBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHURAB between", value1, value2, "shurab");
            return (Criteria) this;
        }

        public Criteria andShurabNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHURAB not between", value1, value2, "shurab");
            return (Criteria) this;
        }

        public Criteria andShurrfIsNull() {
            addCriterion("SHURRF is null");
            return (Criteria) this;
        }

        public Criteria andShurrfIsNotNull() {
            addCriterion("SHURRF is not null");
            return (Criteria) this;
        }

        public Criteria andShurrfEqualTo(String value) {
            addCriterion("SHURRF =", value, "shurrf");
            return (Criteria) this;
        }

        public Criteria andShurrfNotEqualTo(String value) {
            addCriterion("SHURRF <>", value, "shurrf");
            return (Criteria) this;
        }

        public Criteria andShurrfGreaterThan(String value) {
            addCriterion("SHURRF >", value, "shurrf");
            return (Criteria) this;
        }

        public Criteria andShurrfGreaterThanOrEqualTo(String value) {
            addCriterion("SHURRF >=", value, "shurrf");
            return (Criteria) this;
        }

        public Criteria andShurrfLessThan(String value) {
            addCriterion("SHURRF <", value, "shurrf");
            return (Criteria) this;
        }

        public Criteria andShurrfLessThanOrEqualTo(String value) {
            addCriterion("SHURRF <=", value, "shurrf");
            return (Criteria) this;
        }

        public Criteria andShurrfLike(String value) {
            addCriterion("SHURRF like", value, "shurrf");
            return (Criteria) this;
        }

        public Criteria andShurrfNotLike(String value) {
            addCriterion("SHURRF not like", value, "shurrf");
            return (Criteria) this;
        }

        public Criteria andShurrfIn(List<String> values) {
            addCriterion("SHURRF in", values, "shurrf");
            return (Criteria) this;
        }

        public Criteria andShurrfNotIn(List<String> values) {
            addCriterion("SHURRF not in", values, "shurrf");
            return (Criteria) this;
        }

        public Criteria andShurrfBetween(String value1, String value2) {
            addCriterion("SHURRF between", value1, value2, "shurrf");
            return (Criteria) this;
        }

        public Criteria andShurrfNotBetween(String value1, String value2) {
            addCriterion("SHURRF not between", value1, value2, "shurrf");
            return (Criteria) this;
        }

        public Criteria andShupmjIsNull() {
            addCriterion("SHUPMJ is null");
            return (Criteria) this;
        }

        public Criteria andShupmjIsNotNull() {
            addCriterion("SHUPMJ is not null");
            return (Criteria) this;
        }

        public Criteria andShupmjEqualTo(Date value) {
            addCriterion("SHUPMJ =", value, "shupmj");
            return (Criteria) this;
        }

        public Criteria andShupmjNotEqualTo(Date value) {
            addCriterion("SHUPMJ <>", value, "shupmj");
            return (Criteria) this;
        }

        public Criteria andShupmjGreaterThan(Date value) {
            addCriterion("SHUPMJ >", value, "shupmj");
            return (Criteria) this;
        }

        public Criteria andShupmjGreaterThanOrEqualTo(Date value) {
            addCriterion("SHUPMJ >=", value, "shupmj");
            return (Criteria) this;
        }

        public Criteria andShupmjLessThan(Date value) {
            addCriterion("SHUPMJ <", value, "shupmj");
            return (Criteria) this;
        }

        public Criteria andShupmjLessThanOrEqualTo(Date value) {
            addCriterion("SHUPMJ <=", value, "shupmj");
            return (Criteria) this;
        }

        public Criteria andShupmjIn(List<Date> values) {
            addCriterion("SHUPMJ in", values, "shupmj");
            return (Criteria) this;
        }

        public Criteria andShupmjNotIn(List<Date> values) {
            addCriterion("SHUPMJ not in", values, "shupmj");
            return (Criteria) this;
        }

        public Criteria andShupmjBetween(Date value1, Date value2) {
            addCriterion("SHUPMJ between", value1, value2, "shupmj");
            return (Criteria) this;
        }

        public Criteria andShupmjNotBetween(Date value1, Date value2) {
            addCriterion("SHUPMJ not between", value1, value2, "shupmj");
            return (Criteria) this;
        }

        public Criteria andSamlnmIsNull() {
            addCriterion("SAMLNM is null");
            return (Criteria) this;
        }

        public Criteria andSamlnmIsNotNull() {
            addCriterion("SAMLNM is not null");
            return (Criteria) this;
        }

        public Criteria andSamlnmEqualTo(String value) {
            addCriterion("SAMLNM =", value, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmNotEqualTo(String value) {
            addCriterion("SAMLNM <>", value, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmGreaterThan(String value) {
            addCriterion("SAMLNM >", value, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmGreaterThanOrEqualTo(String value) {
            addCriterion("SAMLNM >=", value, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmLessThan(String value) {
            addCriterion("SAMLNM <", value, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmLessThanOrEqualTo(String value) {
            addCriterion("SAMLNM <=", value, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmIn(List<String> values) {
            addCriterion("SAMLNM in", values, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmNotIn(List<String> values) {
            addCriterion("SAMLNM not in", values, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmBetween(String value1, String value2) {
            addCriterion("SAMLNM between", value1, value2, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmNotBetween(String value1, String value2) {
            addCriterion("SAMLNM not between", value1, value2, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSaadd1IsNull() {
            addCriterion("SAADD1 is null");
            return (Criteria) this;
        }

        public Criteria andSaadd1IsNotNull() {
            addCriterion("SAADD1 is not null");
            return (Criteria) this;
        }

        public Criteria andSaadd1EqualTo(String value) {
            addCriterion("SAADD1 =", value, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1NotEqualTo(String value) {
            addCriterion("SAADD1 <>", value, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1GreaterThan(String value) {
            addCriterion("SAADD1 >", value, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1GreaterThanOrEqualTo(String value) {
            addCriterion("SAADD1 >=", value, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1LessThan(String value) {
            addCriterion("SAADD1 <", value, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1LessThanOrEqualTo(String value) {
            addCriterion("SAADD1 <=", value, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1In(List<String> values) {
            addCriterion("SAADD1 in", values, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1NotIn(List<String> values) {
            addCriterion("SAADD1 not in", values, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1Between(String value1, String value2) {
            addCriterion("SAADD1 between", value1, value2, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1NotBetween(String value1, String value2) {
            addCriterion("SAADD1 not between", value1, value2, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd2IsNull() {
            addCriterion("SAADD2 is null");
            return (Criteria) this;
        }

        public Criteria andSaadd2IsNotNull() {
            addCriterion("SAADD2 is not null");
            return (Criteria) this;
        }

        public Criteria andSaadd2EqualTo(String value) {
            addCriterion("SAADD2 =", value, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2NotEqualTo(String value) {
            addCriterion("SAADD2 <>", value, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2GreaterThan(String value) {
            addCriterion("SAADD2 >", value, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2GreaterThanOrEqualTo(String value) {
            addCriterion("SAADD2 >=", value, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2LessThan(String value) {
            addCriterion("SAADD2 <", value, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2LessThanOrEqualTo(String value) {
            addCriterion("SAADD2 <=", value, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2In(List<String> values) {
            addCriterion("SAADD2 in", values, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2NotIn(List<String> values) {
            addCriterion("SAADD2 not in", values, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2Between(String value1, String value2) {
            addCriterion("SAADD2 between", value1, value2, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2NotBetween(String value1, String value2) {
            addCriterion("SAADD2 not between", value1, value2, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd3IsNull() {
            addCriterion("SAADD3 is null");
            return (Criteria) this;
        }

        public Criteria andSaadd3IsNotNull() {
            addCriterion("SAADD3 is not null");
            return (Criteria) this;
        }

        public Criteria andSaadd3EqualTo(String value) {
            addCriterion("SAADD3 =", value, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3NotEqualTo(String value) {
            addCriterion("SAADD3 <>", value, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3GreaterThan(String value) {
            addCriterion("SAADD3 >", value, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3GreaterThanOrEqualTo(String value) {
            addCriterion("SAADD3 >=", value, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3LessThan(String value) {
            addCriterion("SAADD3 <", value, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3LessThanOrEqualTo(String value) {
            addCriterion("SAADD3 <=", value, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3In(List<String> values) {
            addCriterion("SAADD3 in", values, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3NotIn(List<String> values) {
            addCriterion("SAADD3 not in", values, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3Between(String value1, String value2) {
            addCriterion("SAADD3 between", value1, value2, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3NotBetween(String value1, String value2) {
            addCriterion("SAADD3 not between", value1, value2, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd4IsNull() {
            addCriterion("SAADD4 is null");
            return (Criteria) this;
        }

        public Criteria andSaadd4IsNotNull() {
            addCriterion("SAADD4 is not null");
            return (Criteria) this;
        }

        public Criteria andSaadd4EqualTo(String value) {
            addCriterion("SAADD4 =", value, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4NotEqualTo(String value) {
            addCriterion("SAADD4 <>", value, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4GreaterThan(String value) {
            addCriterion("SAADD4 >", value, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4GreaterThanOrEqualTo(String value) {
            addCriterion("SAADD4 >=", value, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4LessThan(String value) {
            addCriterion("SAADD4 <", value, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4LessThanOrEqualTo(String value) {
            addCriterion("SAADD4 <=", value, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4In(List<String> values) {
            addCriterion("SAADD4 in", values, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4NotIn(List<String> values) {
            addCriterion("SAADD4 not in", values, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4Between(String value1, String value2) {
            addCriterion("SAADD4 between", value1, value2, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4NotBetween(String value1, String value2) {
            addCriterion("SAADD4 not between", value1, value2, "saadd4");
            return (Criteria) this;
        }

        public Criteria andShmlnmIsNull() {
            addCriterion("SHMLNM is null");
            return (Criteria) this;
        }

        public Criteria andShmlnmIsNotNull() {
            addCriterion("SHMLNM is not null");
            return (Criteria) this;
        }

        public Criteria andShmlnmEqualTo(String value) {
            addCriterion("SHMLNM =", value, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmNotEqualTo(String value) {
            addCriterion("SHMLNM <>", value, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmGreaterThan(String value) {
            addCriterion("SHMLNM >", value, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmGreaterThanOrEqualTo(String value) {
            addCriterion("SHMLNM >=", value, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmLessThan(String value) {
            addCriterion("SHMLNM <", value, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmLessThanOrEqualTo(String value) {
            addCriterion("SHMLNM <=", value, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmIn(List<String> values) {
            addCriterion("SHMLNM in", values, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmNotIn(List<String> values) {
            addCriterion("SHMLNM not in", values, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmBetween(String value1, String value2) {
            addCriterion("SHMLNM between", value1, value2, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmNotBetween(String value1, String value2) {
            addCriterion("SHMLNM not between", value1, value2, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShadd1IsNull() {
            addCriterion("SHADD1 is null");
            return (Criteria) this;
        }

        public Criteria andShadd1IsNotNull() {
            addCriterion("SHADD1 is not null");
            return (Criteria) this;
        }

        public Criteria andShadd1EqualTo(String value) {
            addCriterion("SHADD1 =", value, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1NotEqualTo(String value) {
            addCriterion("SHADD1 <>", value, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1GreaterThan(String value) {
            addCriterion("SHADD1 >", value, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1GreaterThanOrEqualTo(String value) {
            addCriterion("SHADD1 >=", value, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1LessThan(String value) {
            addCriterion("SHADD1 <", value, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1LessThanOrEqualTo(String value) {
            addCriterion("SHADD1 <=", value, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1In(List<String> values) {
            addCriterion("SHADD1 in", values, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1NotIn(List<String> values) {
            addCriterion("SHADD1 not in", values, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1Between(String value1, String value2) {
            addCriterion("SHADD1 between", value1, value2, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1NotBetween(String value1, String value2) {
            addCriterion("SHADD1 not between", value1, value2, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd2IsNull() {
            addCriterion("SHADD2 is null");
            return (Criteria) this;
        }

        public Criteria andShadd2IsNotNull() {
            addCriterion("SHADD2 is not null");
            return (Criteria) this;
        }

        public Criteria andShadd2EqualTo(String value) {
            addCriterion("SHADD2 =", value, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2NotEqualTo(String value) {
            addCriterion("SHADD2 <>", value, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2GreaterThan(String value) {
            addCriterion("SHADD2 >", value, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2GreaterThanOrEqualTo(String value) {
            addCriterion("SHADD2 >=", value, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2LessThan(String value) {
            addCriterion("SHADD2 <", value, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2LessThanOrEqualTo(String value) {
            addCriterion("SHADD2 <=", value, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2In(List<String> values) {
            addCriterion("SHADD2 in", values, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2NotIn(List<String> values) {
            addCriterion("SHADD2 not in", values, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2Between(String value1, String value2) {
            addCriterion("SHADD2 between", value1, value2, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2NotBetween(String value1, String value2) {
            addCriterion("SHADD2 not between", value1, value2, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd3IsNull() {
            addCriterion("SHADD3 is null");
            return (Criteria) this;
        }

        public Criteria andShadd3IsNotNull() {
            addCriterion("SHADD3 is not null");
            return (Criteria) this;
        }

        public Criteria andShadd3EqualTo(String value) {
            addCriterion("SHADD3 =", value, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3NotEqualTo(String value) {
            addCriterion("SHADD3 <>", value, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3GreaterThan(String value) {
            addCriterion("SHADD3 >", value, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3GreaterThanOrEqualTo(String value) {
            addCriterion("SHADD3 >=", value, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3LessThan(String value) {
            addCriterion("SHADD3 <", value, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3LessThanOrEqualTo(String value) {
            addCriterion("SHADD3 <=", value, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3In(List<String> values) {
            addCriterion("SHADD3 in", values, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3NotIn(List<String> values) {
            addCriterion("SHADD3 not in", values, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3Between(String value1, String value2) {
            addCriterion("SHADD3 between", value1, value2, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3NotBetween(String value1, String value2) {
            addCriterion("SHADD3 not between", value1, value2, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd4IsNull() {
            addCriterion("SHADD4 is null");
            return (Criteria) this;
        }

        public Criteria andShadd4IsNotNull() {
            addCriterion("SHADD4 is not null");
            return (Criteria) this;
        }

        public Criteria andShadd4EqualTo(String value) {
            addCriterion("SHADD4 =", value, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4NotEqualTo(String value) {
            addCriterion("SHADD4 <>", value, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4GreaterThan(String value) {
            addCriterion("SHADD4 >", value, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4GreaterThanOrEqualTo(String value) {
            addCriterion("SHADD4 >=", value, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4LessThan(String value) {
            addCriterion("SHADD4 <", value, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4LessThanOrEqualTo(String value) {
            addCriterion("SHADD4 <=", value, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4In(List<String> values) {
            addCriterion("SHADD4 in", values, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4NotIn(List<String> values) {
            addCriterion("SHADD4 not in", values, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4Between(String value1, String value2) {
            addCriterion("SHADD4 between", value1, value2, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4NotBetween(String value1, String value2) {
            addCriterion("SHADD4 not between", value1, value2, "shadd4");
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