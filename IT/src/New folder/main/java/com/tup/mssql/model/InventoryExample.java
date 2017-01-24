package com.tup.mssql.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InventoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InventoryExample() {
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

        public Criteria andLiitmIsNull() {
            addCriterion("LIITM is null");
            return (Criteria) this;
        }

        public Criteria andLiitmIsNotNull() {
            addCriterion("LIITM is not null");
            return (Criteria) this;
        }

        public Criteria andLiitmEqualTo(String value) {
            addCriterion("LIITM =", value, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmNotEqualTo(String value) {
            addCriterion("LIITM <>", value, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmGreaterThan(String value) {
            addCriterion("LIITM >", value, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmGreaterThanOrEqualTo(String value) {
            addCriterion("LIITM >=", value, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmLessThan(String value) {
            addCriterion("LIITM <", value, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmLessThanOrEqualTo(String value) {
            addCriterion("LIITM <=", value, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmLike(String value) {
            addCriterion("LIITM like", value, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmNotLike(String value) {
            addCriterion("LIITM not like", value, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmIn(List<String> values) {
            addCriterion("LIITM in", values, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmNotIn(List<String> values) {
            addCriterion("LIITM not in", values, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmBetween(String value1, String value2) {
            addCriterion("LIITM between", value1, value2, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmNotBetween(String value1, String value2) {
            addCriterion("LIITM not between", value1, value2, "liitm");
            return (Criteria) this;
        }

        public Criteria andLimcuIsNull() {
            addCriterion("LIMCU is null");
            return (Criteria) this;
        }

        public Criteria andLimcuIsNotNull() {
            addCriterion("LIMCU is not null");
            return (Criteria) this;
        }

        public Criteria andLimcuEqualTo(String value) {
            addCriterion("LIMCU =", value, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuNotEqualTo(String value) {
            addCriterion("LIMCU <>", value, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuGreaterThan(String value) {
            addCriterion("LIMCU >", value, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuGreaterThanOrEqualTo(String value) {
            addCriterion("LIMCU >=", value, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuLessThan(String value) {
            addCriterion("LIMCU <", value, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuLessThanOrEqualTo(String value) {
            addCriterion("LIMCU <=", value, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuLike(String value) {
            addCriterion("LIMCU like", value, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuNotLike(String value) {
            addCriterion("LIMCU not like", value, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuIn(List<String> values) {
            addCriterion("LIMCU in", values, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuNotIn(List<String> values) {
            addCriterion("LIMCU not in", values, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuBetween(String value1, String value2) {
            addCriterion("LIMCU between", value1, value2, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuNotBetween(String value1, String value2) {
            addCriterion("LIMCU not between", value1, value2, "limcu");
            return (Criteria) this;
        }

        public Criteria andLilocnIsNull() {
            addCriterion("LILOCN is null");
            return (Criteria) this;
        }

        public Criteria andLilocnIsNotNull() {
            addCriterion("LILOCN is not null");
            return (Criteria) this;
        }

        public Criteria andLilocnEqualTo(String value) {
            addCriterion("LILOCN =", value, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnNotEqualTo(String value) {
            addCriterion("LILOCN <>", value, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnGreaterThan(String value) {
            addCriterion("LILOCN >", value, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnGreaterThanOrEqualTo(String value) {
            addCriterion("LILOCN >=", value, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnLessThan(String value) {
            addCriterion("LILOCN <", value, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnLessThanOrEqualTo(String value) {
            addCriterion("LILOCN <=", value, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnLike(String value) {
            addCriterion("LILOCN like", value, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnNotLike(String value) {
            addCriterion("LILOCN not like", value, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnIn(List<String> values) {
            addCriterion("LILOCN in", values, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnNotIn(List<String> values) {
            addCriterion("LILOCN not in", values, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnBetween(String value1, String value2) {
            addCriterion("LILOCN between", value1, value2, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnNotBetween(String value1, String value2) {
            addCriterion("LILOCN not between", value1, value2, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilotnIsNull() {
            addCriterion("LILOTN is null");
            return (Criteria) this;
        }

        public Criteria andLilotnIsNotNull() {
            addCriterion("LILOTN is not null");
            return (Criteria) this;
        }

        public Criteria andLilotnEqualTo(String value) {
            addCriterion("LILOTN =", value, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnNotEqualTo(String value) {
            addCriterion("LILOTN <>", value, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnGreaterThan(String value) {
            addCriterion("LILOTN >", value, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnGreaterThanOrEqualTo(String value) {
            addCriterion("LILOTN >=", value, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnLessThan(String value) {
            addCriterion("LILOTN <", value, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnLessThanOrEqualTo(String value) {
            addCriterion("LILOTN <=", value, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnLike(String value) {
            addCriterion("LILOTN like", value, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnNotLike(String value) {
            addCriterion("LILOTN not like", value, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnIn(List<String> values) {
            addCriterion("LILOTN in", values, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnNotIn(List<String> values) {
            addCriterion("LILOTN not in", values, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnBetween(String value1, String value2) {
            addCriterion("LILOTN between", value1, value2, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnNotBetween(String value1, String value2) {
            addCriterion("LILOTN not between", value1, value2, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLipbinIsNull() {
            addCriterion("LIPBIN is null");
            return (Criteria) this;
        }

        public Criteria andLipbinIsNotNull() {
            addCriterion("LIPBIN is not null");
            return (Criteria) this;
        }

        public Criteria andLipbinEqualTo(String value) {
            addCriterion("LIPBIN =", value, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinNotEqualTo(String value) {
            addCriterion("LIPBIN <>", value, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinGreaterThan(String value) {
            addCriterion("LIPBIN >", value, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinGreaterThanOrEqualTo(String value) {
            addCriterion("LIPBIN >=", value, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinLessThan(String value) {
            addCriterion("LIPBIN <", value, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinLessThanOrEqualTo(String value) {
            addCriterion("LIPBIN <=", value, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinLike(String value) {
            addCriterion("LIPBIN like", value, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinNotLike(String value) {
            addCriterion("LIPBIN not like", value, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinIn(List<String> values) {
            addCriterion("LIPBIN in", values, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinNotIn(List<String> values) {
            addCriterion("LIPBIN not in", values, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinBetween(String value1, String value2) {
            addCriterion("LIPBIN between", value1, value2, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinNotBetween(String value1, String value2) {
            addCriterion("LIPBIN not between", value1, value2, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLiglptIsNull() {
            addCriterion("LIGLPT is null");
            return (Criteria) this;
        }

        public Criteria andLiglptIsNotNull() {
            addCriterion("LIGLPT is not null");
            return (Criteria) this;
        }

        public Criteria andLiglptEqualTo(String value) {
            addCriterion("LIGLPT =", value, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptNotEqualTo(String value) {
            addCriterion("LIGLPT <>", value, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptGreaterThan(String value) {
            addCriterion("LIGLPT >", value, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptGreaterThanOrEqualTo(String value) {
            addCriterion("LIGLPT >=", value, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptLessThan(String value) {
            addCriterion("LIGLPT <", value, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptLessThanOrEqualTo(String value) {
            addCriterion("LIGLPT <=", value, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptLike(String value) {
            addCriterion("LIGLPT like", value, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptNotLike(String value) {
            addCriterion("LIGLPT not like", value, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptIn(List<String> values) {
            addCriterion("LIGLPT in", values, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptNotIn(List<String> values) {
            addCriterion("LIGLPT not in", values, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptBetween(String value1, String value2) {
            addCriterion("LIGLPT between", value1, value2, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptNotBetween(String value1, String value2) {
            addCriterion("LIGLPT not between", value1, value2, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLipqohIsNull() {
            addCriterion("LIPQOH is null");
            return (Criteria) this;
        }

        public Criteria andLipqohIsNotNull() {
            addCriterion("LIPQOH is not null");
            return (Criteria) this;
        }

        public Criteria andLipqohEqualTo(BigDecimal value) {
            addCriterion("LIPQOH =", value, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohNotEqualTo(BigDecimal value) {
            addCriterion("LIPQOH <>", value, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohGreaterThan(BigDecimal value) {
            addCriterion("LIPQOH >", value, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIPQOH >=", value, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohLessThan(BigDecimal value) {
            addCriterion("LIPQOH <", value, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIPQOH <=", value, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohIn(List<BigDecimal> values) {
            addCriterion("LIPQOH in", values, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohNotIn(List<BigDecimal> values) {
            addCriterion("LIPQOH not in", values, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIPQOH between", value1, value2, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIPQOH not between", value1, value2, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipbckIsNull() {
            addCriterion("LIPBCK is null");
            return (Criteria) this;
        }

        public Criteria andLipbckIsNotNull() {
            addCriterion("LIPBCK is not null");
            return (Criteria) this;
        }

        public Criteria andLipbckEqualTo(BigDecimal value) {
            addCriterion("LIPBCK =", value, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckNotEqualTo(BigDecimal value) {
            addCriterion("LIPBCK <>", value, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckGreaterThan(BigDecimal value) {
            addCriterion("LIPBCK >", value, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIPBCK >=", value, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckLessThan(BigDecimal value) {
            addCriterion("LIPBCK <", value, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIPBCK <=", value, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckIn(List<BigDecimal> values) {
            addCriterion("LIPBCK in", values, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckNotIn(List<BigDecimal> values) {
            addCriterion("LIPBCK not in", values, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIPBCK between", value1, value2, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIPBCK not between", value1, value2, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipreqIsNull() {
            addCriterion("LIPREQ is null");
            return (Criteria) this;
        }

        public Criteria andLipreqIsNotNull() {
            addCriterion("LIPREQ is not null");
            return (Criteria) this;
        }

        public Criteria andLipreqEqualTo(BigDecimal value) {
            addCriterion("LIPREQ =", value, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqNotEqualTo(BigDecimal value) {
            addCriterion("LIPREQ <>", value, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqGreaterThan(BigDecimal value) {
            addCriterion("LIPREQ >", value, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIPREQ >=", value, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqLessThan(BigDecimal value) {
            addCriterion("LIPREQ <", value, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIPREQ <=", value, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqIn(List<BigDecimal> values) {
            addCriterion("LIPREQ in", values, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqNotIn(List<BigDecimal> values) {
            addCriterion("LIPREQ not in", values, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIPREQ between", value1, value2, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIPREQ not between", value1, value2, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLiqwboIsNull() {
            addCriterion("LIQWBO is null");
            return (Criteria) this;
        }

        public Criteria andLiqwboIsNotNull() {
            addCriterion("LIQWBO is not null");
            return (Criteria) this;
        }

        public Criteria andLiqwboEqualTo(BigDecimal value) {
            addCriterion("LIQWBO =", value, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboNotEqualTo(BigDecimal value) {
            addCriterion("LIQWBO <>", value, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboGreaterThan(BigDecimal value) {
            addCriterion("LIQWBO >", value, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQWBO >=", value, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboLessThan(BigDecimal value) {
            addCriterion("LIQWBO <", value, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQWBO <=", value, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboIn(List<BigDecimal> values) {
            addCriterion("LIQWBO in", values, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboNotIn(List<BigDecimal> values) {
            addCriterion("LIQWBO not in", values, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQWBO between", value1, value2, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQWBO not between", value1, value2, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLihcomIsNull() {
            addCriterion("LIHCOM is null");
            return (Criteria) this;
        }

        public Criteria andLihcomIsNotNull() {
            addCriterion("LIHCOM is not null");
            return (Criteria) this;
        }

        public Criteria andLihcomEqualTo(BigDecimal value) {
            addCriterion("LIHCOM =", value, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomNotEqualTo(BigDecimal value) {
            addCriterion("LIHCOM <>", value, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomGreaterThan(BigDecimal value) {
            addCriterion("LIHCOM >", value, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIHCOM >=", value, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomLessThan(BigDecimal value) {
            addCriterion("LIHCOM <", value, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIHCOM <=", value, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomIn(List<BigDecimal> values) {
            addCriterion("LIHCOM in", values, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomNotIn(List<BigDecimal> values) {
            addCriterion("LIHCOM not in", values, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIHCOM between", value1, value2, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIHCOM not between", value1, value2, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLipcomIsNull() {
            addCriterion("LIPCOM is null");
            return (Criteria) this;
        }

        public Criteria andLipcomIsNotNull() {
            addCriterion("LIPCOM is not null");
            return (Criteria) this;
        }

        public Criteria andLipcomEqualTo(BigDecimal value) {
            addCriterion("LIPCOM =", value, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomNotEqualTo(BigDecimal value) {
            addCriterion("LIPCOM <>", value, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomGreaterThan(BigDecimal value) {
            addCriterion("LIPCOM >", value, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIPCOM >=", value, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomLessThan(BigDecimal value) {
            addCriterion("LIPCOM <", value, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIPCOM <=", value, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomIn(List<BigDecimal> values) {
            addCriterion("LIPCOM in", values, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomNotIn(List<BigDecimal> values) {
            addCriterion("LIPCOM not in", values, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIPCOM between", value1, value2, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIPCOM not between", value1, value2, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLifcomIsNull() {
            addCriterion("LIFCOM is null");
            return (Criteria) this;
        }

        public Criteria andLifcomIsNotNull() {
            addCriterion("LIFCOM is not null");
            return (Criteria) this;
        }

        public Criteria andLifcomEqualTo(BigDecimal value) {
            addCriterion("LIFCOM =", value, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomNotEqualTo(BigDecimal value) {
            addCriterion("LIFCOM <>", value, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomGreaterThan(BigDecimal value) {
            addCriterion("LIFCOM >", value, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIFCOM >=", value, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomLessThan(BigDecimal value) {
            addCriterion("LIFCOM <", value, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIFCOM <=", value, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomIn(List<BigDecimal> values) {
            addCriterion("LIFCOM in", values, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomNotIn(List<BigDecimal> values) {
            addCriterion("LIFCOM not in", values, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIFCOM between", value1, value2, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIFCOM not between", value1, value2, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifun1IsNull() {
            addCriterion("LIFUN1 is null");
            return (Criteria) this;
        }

        public Criteria andLifun1IsNotNull() {
            addCriterion("LIFUN1 is not null");
            return (Criteria) this;
        }

        public Criteria andLifun1EqualTo(BigDecimal value) {
            addCriterion("LIFUN1 =", value, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1NotEqualTo(BigDecimal value) {
            addCriterion("LIFUN1 <>", value, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1GreaterThan(BigDecimal value) {
            addCriterion("LIFUN1 >", value, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIFUN1 >=", value, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1LessThan(BigDecimal value) {
            addCriterion("LIFUN1 <", value, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIFUN1 <=", value, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1In(List<BigDecimal> values) {
            addCriterion("LIFUN1 in", values, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1NotIn(List<BigDecimal> values) {
            addCriterion("LIFUN1 not in", values, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIFUN1 between", value1, value2, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIFUN1 not between", value1, value2, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLiqowoIsNull() {
            addCriterion("LIQOWO is null");
            return (Criteria) this;
        }

        public Criteria andLiqowoIsNotNull() {
            addCriterion("LIQOWO is not null");
            return (Criteria) this;
        }

        public Criteria andLiqowoEqualTo(BigDecimal value) {
            addCriterion("LIQOWO =", value, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoNotEqualTo(BigDecimal value) {
            addCriterion("LIQOWO <>", value, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoGreaterThan(BigDecimal value) {
            addCriterion("LIQOWO >", value, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQOWO >=", value, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoLessThan(BigDecimal value) {
            addCriterion("LIQOWO <", value, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQOWO <=", value, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoIn(List<BigDecimal> values) {
            addCriterion("LIQOWO in", values, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoNotIn(List<BigDecimal> values) {
            addCriterion("LIQOWO not in", values, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQOWO between", value1, value2, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQOWO not between", value1, value2, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqttrIsNull() {
            addCriterion("LIQTTR is null");
            return (Criteria) this;
        }

        public Criteria andLiqttrIsNotNull() {
            addCriterion("LIQTTR is not null");
            return (Criteria) this;
        }

        public Criteria andLiqttrEqualTo(BigDecimal value) {
            addCriterion("LIQTTR =", value, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrNotEqualTo(BigDecimal value) {
            addCriterion("LIQTTR <>", value, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrGreaterThan(BigDecimal value) {
            addCriterion("LIQTTR >", value, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQTTR >=", value, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrLessThan(BigDecimal value) {
            addCriterion("LIQTTR <", value, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQTTR <=", value, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrIn(List<BigDecimal> values) {
            addCriterion("LIQTTR in", values, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrNotIn(List<BigDecimal> values) {
            addCriterion("LIQTTR not in", values, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQTTR between", value1, value2, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQTTR not between", value1, value2, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLilotsIsNull() {
            addCriterion("LILOTS is null");
            return (Criteria) this;
        }

        public Criteria andLilotsIsNotNull() {
            addCriterion("LILOTS is not null");
            return (Criteria) this;
        }

        public Criteria andLilotsEqualTo(String value) {
            addCriterion("LILOTS =", value, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsNotEqualTo(String value) {
            addCriterion("LILOTS <>", value, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsGreaterThan(String value) {
            addCriterion("LILOTS >", value, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsGreaterThanOrEqualTo(String value) {
            addCriterion("LILOTS >=", value, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsLessThan(String value) {
            addCriterion("LILOTS <", value, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsLessThanOrEqualTo(String value) {
            addCriterion("LILOTS <=", value, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsLike(String value) {
            addCriterion("LILOTS like", value, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsNotLike(String value) {
            addCriterion("LILOTS not like", value, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsIn(List<String> values) {
            addCriterion("LILOTS in", values, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsNotIn(List<String> values) {
            addCriterion("LILOTS not in", values, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsBetween(String value1, String value2) {
            addCriterion("LILOTS between", value1, value2, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsNotBetween(String value1, String value2) {
            addCriterion("LILOTS not between", value1, value2, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilrcjIsNull() {
            addCriterion("LILRCJ is null");
            return (Criteria) this;
        }

        public Criteria andLilrcjIsNotNull() {
            addCriterion("LILRCJ is not null");
            return (Criteria) this;
        }

        public Criteria andLilrcjEqualTo(Date value) {
            addCriterionForJDBCDate("LILRCJ =", value, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjNotEqualTo(Date value) {
            addCriterionForJDBCDate("LILRCJ <>", value, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjGreaterThan(Date value) {
            addCriterionForJDBCDate("LILRCJ >", value, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LILRCJ >=", value, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjLessThan(Date value) {
            addCriterionForJDBCDate("LILRCJ <", value, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LILRCJ <=", value, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjIn(List<Date> values) {
            addCriterionForJDBCDate("LILRCJ in", values, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjNotIn(List<Date> values) {
            addCriterionForJDBCDate("LILRCJ not in", values, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LILRCJ between", value1, value2, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LILRCJ not between", value1, value2, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLiot1pIsNull() {
            addCriterion("LIOT1P is null");
            return (Criteria) this;
        }

        public Criteria andLiot1pIsNotNull() {
            addCriterion("LIOT1P is not null");
            return (Criteria) this;
        }

        public Criteria andLiot1pEqualTo(BigDecimal value) {
            addCriterion("LIOT1P =", value, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pNotEqualTo(BigDecimal value) {
            addCriterion("LIOT1P <>", value, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pGreaterThan(BigDecimal value) {
            addCriterion("LIOT1P >", value, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIOT1P >=", value, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pLessThan(BigDecimal value) {
            addCriterion("LIOT1P <", value, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIOT1P <=", value, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pIn(List<BigDecimal> values) {
            addCriterion("LIOT1P in", values, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pNotIn(List<BigDecimal> values) {
            addCriterion("LIOT1P not in", values, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIOT1P between", value1, value2, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIOT1P not between", value1, value2, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot2pIsNull() {
            addCriterion("LIOT2P is null");
            return (Criteria) this;
        }

        public Criteria andLiot2pIsNotNull() {
            addCriterion("LIOT2P is not null");
            return (Criteria) this;
        }

        public Criteria andLiot2pEqualTo(BigDecimal value) {
            addCriterion("LIOT2P =", value, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pNotEqualTo(BigDecimal value) {
            addCriterion("LIOT2P <>", value, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pGreaterThan(BigDecimal value) {
            addCriterion("LIOT2P >", value, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIOT2P >=", value, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pLessThan(BigDecimal value) {
            addCriterion("LIOT2P <", value, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIOT2P <=", value, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pIn(List<BigDecimal> values) {
            addCriterion("LIOT2P in", values, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pNotIn(List<BigDecimal> values) {
            addCriterion("LIOT2P not in", values, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIOT2P between", value1, value2, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIOT2P not between", value1, value2, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot1aIsNull() {
            addCriterion("LIOT1A is null");
            return (Criteria) this;
        }

        public Criteria andLiot1aIsNotNull() {
            addCriterion("LIOT1A is not null");
            return (Criteria) this;
        }

        public Criteria andLiot1aEqualTo(BigDecimal value) {
            addCriterion("LIOT1A =", value, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aNotEqualTo(BigDecimal value) {
            addCriterion("LIOT1A <>", value, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aGreaterThan(BigDecimal value) {
            addCriterion("LIOT1A >", value, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIOT1A >=", value, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aLessThan(BigDecimal value) {
            addCriterion("LIOT1A <", value, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIOT1A <=", value, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aIn(List<BigDecimal> values) {
            addCriterion("LIOT1A in", values, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aNotIn(List<BigDecimal> values) {
            addCriterion("LIOT1A not in", values, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIOT1A between", value1, value2, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIOT1A not between", value1, value2, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiqtinIsNull() {
            addCriterion("LIQTIN is null");
            return (Criteria) this;
        }

        public Criteria andLiqtinIsNotNull() {
            addCriterion("LIQTIN is not null");
            return (Criteria) this;
        }

        public Criteria andLiqtinEqualTo(BigDecimal value) {
            addCriterion("LIQTIN =", value, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinNotEqualTo(BigDecimal value) {
            addCriterion("LIQTIN <>", value, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinGreaterThan(BigDecimal value) {
            addCriterion("LIQTIN >", value, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQTIN >=", value, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinLessThan(BigDecimal value) {
            addCriterion("LIQTIN <", value, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQTIN <=", value, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinIn(List<BigDecimal> values) {
            addCriterion("LIQTIN in", values, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinNotIn(List<BigDecimal> values) {
            addCriterion("LIQTIN not in", values, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQTIN between", value1, value2, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQTIN not between", value1, value2, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqto1IsNull() {
            addCriterion("LIQTO1 is null");
            return (Criteria) this;
        }

        public Criteria andLiqto1IsNotNull() {
            addCriterion("LIQTO1 is not null");
            return (Criteria) this;
        }

        public Criteria andLiqto1EqualTo(BigDecimal value) {
            addCriterion("LIQTO1 =", value, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1NotEqualTo(BigDecimal value) {
            addCriterion("LIQTO1 <>", value, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1GreaterThan(BigDecimal value) {
            addCriterion("LIQTO1 >", value, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQTO1 >=", value, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1LessThan(BigDecimal value) {
            addCriterion("LIQTO1 <", value, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQTO1 <=", value, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1In(List<BigDecimal> values) {
            addCriterion("LIQTO1 in", values, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1NotIn(List<BigDecimal> values) {
            addCriterion("LIQTO1 not in", values, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQTO1 between", value1, value2, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQTO1 not between", value1, value2, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto2IsNull() {
            addCriterion("LIQTO2 is null");
            return (Criteria) this;
        }

        public Criteria andLiqto2IsNotNull() {
            addCriterion("LIQTO2 is not null");
            return (Criteria) this;
        }

        public Criteria andLiqto2EqualTo(BigDecimal value) {
            addCriterion("LIQTO2 =", value, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2NotEqualTo(BigDecimal value) {
            addCriterion("LIQTO2 <>", value, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2GreaterThan(BigDecimal value) {
            addCriterion("LIQTO2 >", value, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQTO2 >=", value, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2LessThan(BigDecimal value) {
            addCriterion("LIQTO2 <", value, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQTO2 <=", value, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2In(List<BigDecimal> values) {
            addCriterion("LIQTO2 in", values, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2NotIn(List<BigDecimal> values) {
            addCriterion("LIQTO2 not in", values, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQTO2 between", value1, value2, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQTO2 not between", value1, value2, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqonlIsNull() {
            addCriterion("LIQONL is null");
            return (Criteria) this;
        }

        public Criteria andLiqonlIsNotNull() {
            addCriterion("LIQONL is not null");
            return (Criteria) this;
        }

        public Criteria andLiqonlEqualTo(BigDecimal value) {
            addCriterion("LIQONL =", value, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlNotEqualTo(BigDecimal value) {
            addCriterion("LIQONL <>", value, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlGreaterThan(BigDecimal value) {
            addCriterion("LIQONL >", value, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQONL >=", value, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlLessThan(BigDecimal value) {
            addCriterion("LIQONL <", value, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQONL <=", value, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlIn(List<BigDecimal> values) {
            addCriterion("LIQONL in", values, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlNotIn(List<BigDecimal> values) {
            addCriterion("LIQONL not in", values, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQONL between", value1, value2, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQONL not between", value1, value2, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqtriIsNull() {
            addCriterion("LIQTRI is null");
            return (Criteria) this;
        }

        public Criteria andLiqtriIsNotNull() {
            addCriterion("LIQTRI is not null");
            return (Criteria) this;
        }

        public Criteria andLiqtriEqualTo(BigDecimal value) {
            addCriterion("LIQTRI =", value, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriNotEqualTo(BigDecimal value) {
            addCriterion("LIQTRI <>", value, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriGreaterThan(BigDecimal value) {
            addCriterion("LIQTRI >", value, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQTRI >=", value, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriLessThan(BigDecimal value) {
            addCriterion("LIQTRI <", value, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQTRI <=", value, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriIn(List<BigDecimal> values) {
            addCriterion("LIQTRI in", values, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriNotIn(List<BigDecimal> values) {
            addCriterion("LIQTRI not in", values, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQTRI between", value1, value2, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQTRI not between", value1, value2, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtroIsNull() {
            addCriterion("LIQTRO is null");
            return (Criteria) this;
        }

        public Criteria andLiqtroIsNotNull() {
            addCriterion("LIQTRO is not null");
            return (Criteria) this;
        }

        public Criteria andLiqtroEqualTo(BigDecimal value) {
            addCriterion("LIQTRO =", value, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroNotEqualTo(BigDecimal value) {
            addCriterion("LIQTRO <>", value, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroGreaterThan(BigDecimal value) {
            addCriterion("LIQTRO >", value, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQTRO >=", value, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroLessThan(BigDecimal value) {
            addCriterion("LIQTRO <", value, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQTRO <=", value, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroIn(List<BigDecimal> values) {
            addCriterion("LIQTRO in", values, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroNotIn(List<BigDecimal> values) {
            addCriterion("LIQTRO not in", values, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQTRO between", value1, value2, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQTRO not between", value1, value2, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLincdjIsNull() {
            addCriterion("LINCDJ is null");
            return (Criteria) this;
        }

        public Criteria andLincdjIsNotNull() {
            addCriterion("LINCDJ is not null");
            return (Criteria) this;
        }

        public Criteria andLincdjEqualTo(Date value) {
            addCriterion("LINCDJ =", value, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjNotEqualTo(Date value) {
            addCriterion("LINCDJ <>", value, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjGreaterThan(Date value) {
            addCriterion("LINCDJ >", value, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjGreaterThanOrEqualTo(Date value) {
            addCriterion("LINCDJ >=", value, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjLessThan(Date value) {
            addCriterion("LINCDJ <", value, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjLessThanOrEqualTo(Date value) {
            addCriterion("LINCDJ <=", value, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjIn(List<Date> values) {
            addCriterion("LINCDJ in", values, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjNotIn(List<Date> values) {
            addCriterion("LINCDJ not in", values, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjBetween(Date value1, Date value2) {
            addCriterion("LINCDJ between", value1, value2, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjNotBetween(Date value1, Date value2) {
            addCriterion("LINCDJ not between", value1, value2, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLiqty1IsNull() {
            addCriterion("LIQTY1 is null");
            return (Criteria) this;
        }

        public Criteria andLiqty1IsNotNull() {
            addCriterion("LIQTY1 is not null");
            return (Criteria) this;
        }

        public Criteria andLiqty1EqualTo(BigDecimal value) {
            addCriterion("LIQTY1 =", value, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1NotEqualTo(BigDecimal value) {
            addCriterion("LIQTY1 <>", value, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1GreaterThan(BigDecimal value) {
            addCriterion("LIQTY1 >", value, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQTY1 >=", value, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1LessThan(BigDecimal value) {
            addCriterion("LIQTY1 <", value, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQTY1 <=", value, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1In(List<BigDecimal> values) {
            addCriterion("LIQTY1 in", values, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1NotIn(List<BigDecimal> values) {
            addCriterion("LIQTY1 not in", values, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQTY1 between", value1, value2, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQTY1 not between", value1, value2, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty2IsNull() {
            addCriterion("LIQTY2 is null");
            return (Criteria) this;
        }

        public Criteria andLiqty2IsNotNull() {
            addCriterion("LIQTY2 is not null");
            return (Criteria) this;
        }

        public Criteria andLiqty2EqualTo(BigDecimal value) {
            addCriterion("LIQTY2 =", value, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2NotEqualTo(BigDecimal value) {
            addCriterion("LIQTY2 <>", value, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2GreaterThan(BigDecimal value) {
            addCriterion("LIQTY2 >", value, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQTY2 >=", value, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2LessThan(BigDecimal value) {
            addCriterion("LIQTY2 <", value, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIQTY2 <=", value, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2In(List<BigDecimal> values) {
            addCriterion("LIQTY2 in", values, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2NotIn(List<BigDecimal> values) {
            addCriterion("LIQTY2 not in", values, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQTY2 between", value1, value2, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIQTY2 not between", value1, value2, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLicsidIsNull() {
            addCriterion("LICSID is null");
            return (Criteria) this;
        }

        public Criteria andLicsidIsNotNull() {
            addCriterion("LICSID is not null");
            return (Criteria) this;
        }

        public Criteria andLicsidEqualTo(Long value) {
            addCriterion("LICSID =", value, "licsid");
            return (Criteria) this;
        }

        public Criteria andLicsidNotEqualTo(Long value) {
            addCriterion("LICSID <>", value, "licsid");
            return (Criteria) this;
        }

        public Criteria andLicsidGreaterThan(Long value) {
            addCriterion("LICSID >", value, "licsid");
            return (Criteria) this;
        }

        public Criteria andLicsidGreaterThanOrEqualTo(Long value) {
            addCriterion("LICSID >=", value, "licsid");
            return (Criteria) this;
        }

        public Criteria andLicsidLessThan(Long value) {
            addCriterion("LICSID <", value, "licsid");
            return (Criteria) this;
        }

        public Criteria andLicsidLessThanOrEqualTo(Long value) {
            addCriterion("LICSID <=", value, "licsid");
            return (Criteria) this;
        }

        public Criteria andLicsidIn(List<Long> values) {
            addCriterion("LICSID in", values, "licsid");
            return (Criteria) this;
        }

        public Criteria andLicsidNotIn(List<Long> values) {
            addCriterion("LICSID not in", values, "licsid");
            return (Criteria) this;
        }

        public Criteria andLicsidBetween(Long value1, Long value2) {
            addCriterion("LICSID between", value1, value2, "licsid");
            return (Criteria) this;
        }

        public Criteria andLicsidNotBetween(Long value1, Long value2) {
            addCriterion("LICSID not between", value1, value2, "licsid");
            return (Criteria) this;
        }

        public Criteria andLiurcdIsNull() {
            addCriterion("LIURCD is null");
            return (Criteria) this;
        }

        public Criteria andLiurcdIsNotNull() {
            addCriterion("LIURCD is not null");
            return (Criteria) this;
        }

        public Criteria andLiurcdEqualTo(String value) {
            addCriterion("LIURCD =", value, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdNotEqualTo(String value) {
            addCriterion("LIURCD <>", value, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdGreaterThan(String value) {
            addCriterion("LIURCD >", value, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdGreaterThanOrEqualTo(String value) {
            addCriterion("LIURCD >=", value, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdLessThan(String value) {
            addCriterion("LIURCD <", value, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdLessThanOrEqualTo(String value) {
            addCriterion("LIURCD <=", value, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdLike(String value) {
            addCriterion("LIURCD like", value, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdNotLike(String value) {
            addCriterion("LIURCD not like", value, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdIn(List<String> values) {
            addCriterion("LIURCD in", values, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdNotIn(List<String> values) {
            addCriterion("LIURCD not in", values, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdBetween(String value1, String value2) {
            addCriterion("LIURCD between", value1, value2, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdNotBetween(String value1, String value2) {
            addCriterion("LIURCD not between", value1, value2, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurdtIsNull() {
            addCriterion("LIURDT is null");
            return (Criteria) this;
        }

        public Criteria andLiurdtIsNotNull() {
            addCriterion("LIURDT is not null");
            return (Criteria) this;
        }

        public Criteria andLiurdtEqualTo(Date value) {
            addCriterionForJDBCDate("LIURDT =", value, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtNotEqualTo(Date value) {
            addCriterionForJDBCDate("LIURDT <>", value, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtGreaterThan(Date value) {
            addCriterionForJDBCDate("LIURDT >", value, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LIURDT >=", value, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtLessThan(Date value) {
            addCriterionForJDBCDate("LIURDT <", value, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LIURDT <=", value, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtIn(List<Date> values) {
            addCriterionForJDBCDate("LIURDT in", values, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtNotIn(List<Date> values) {
            addCriterionForJDBCDate("LIURDT not in", values, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LIURDT between", value1, value2, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LIURDT not between", value1, value2, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiuratIsNull() {
            addCriterion("LIURAT is null");
            return (Criteria) this;
        }

        public Criteria andLiuratIsNotNull() {
            addCriterion("LIURAT is not null");
            return (Criteria) this;
        }

        public Criteria andLiuratEqualTo(BigDecimal value) {
            addCriterion("LIURAT =", value, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratNotEqualTo(BigDecimal value) {
            addCriterion("LIURAT <>", value, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratGreaterThan(BigDecimal value) {
            addCriterion("LIURAT >", value, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIURAT >=", value, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratLessThan(BigDecimal value) {
            addCriterion("LIURAT <", value, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIURAT <=", value, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratIn(List<BigDecimal> values) {
            addCriterion("LIURAT in", values, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratNotIn(List<BigDecimal> values) {
            addCriterion("LIURAT not in", values, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIURAT between", value1, value2, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIURAT not between", value1, value2, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiurabIsNull() {
            addCriterion("LIURAB is null");
            return (Criteria) this;
        }

        public Criteria andLiurabIsNotNull() {
            addCriterion("LIURAB is not null");
            return (Criteria) this;
        }

        public Criteria andLiurabEqualTo(Long value) {
            addCriterion("LIURAB =", value, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabNotEqualTo(Long value) {
            addCriterion("LIURAB <>", value, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabGreaterThan(Long value) {
            addCriterion("LIURAB >", value, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabGreaterThanOrEqualTo(Long value) {
            addCriterion("LIURAB >=", value, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabLessThan(Long value) {
            addCriterion("LIURAB <", value, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabLessThanOrEqualTo(Long value) {
            addCriterion("LIURAB <=", value, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabIn(List<Long> values) {
            addCriterion("LIURAB in", values, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabNotIn(List<Long> values) {
            addCriterion("LIURAB not in", values, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabBetween(Long value1, Long value2) {
            addCriterion("LIURAB between", value1, value2, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabNotBetween(Long value1, Long value2) {
            addCriterion("LIURAB not between", value1, value2, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurrfIsNull() {
            addCriterion("LIURRF is null");
            return (Criteria) this;
        }

        public Criteria andLiurrfIsNotNull() {
            addCriterion("LIURRF is not null");
            return (Criteria) this;
        }

        public Criteria andLiurrfEqualTo(String value) {
            addCriterion("LIURRF =", value, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfNotEqualTo(String value) {
            addCriterion("LIURRF <>", value, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfGreaterThan(String value) {
            addCriterion("LIURRF >", value, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfGreaterThanOrEqualTo(String value) {
            addCriterion("LIURRF >=", value, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfLessThan(String value) {
            addCriterion("LIURRF <", value, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfLessThanOrEqualTo(String value) {
            addCriterion("LIURRF <=", value, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfLike(String value) {
            addCriterion("LIURRF like", value, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfNotLike(String value) {
            addCriterion("LIURRF not like", value, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfIn(List<String> values) {
            addCriterion("LIURRF in", values, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfNotIn(List<String> values) {
            addCriterion("LIURRF not in", values, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfBetween(String value1, String value2) {
            addCriterion("LIURRF between", value1, value2, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfNotBetween(String value1, String value2) {
            addCriterion("LIURRF not between", value1, value2, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiuserIsNull() {
            addCriterion("LIUSER is null");
            return (Criteria) this;
        }

        public Criteria andLiuserIsNotNull() {
            addCriterion("LIUSER is not null");
            return (Criteria) this;
        }

        public Criteria andLiuserEqualTo(String value) {
            addCriterion("LIUSER =", value, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserNotEqualTo(String value) {
            addCriterion("LIUSER <>", value, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserGreaterThan(String value) {
            addCriterion("LIUSER >", value, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserGreaterThanOrEqualTo(String value) {
            addCriterion("LIUSER >=", value, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserLessThan(String value) {
            addCriterion("LIUSER <", value, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserLessThanOrEqualTo(String value) {
            addCriterion("LIUSER <=", value, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserLike(String value) {
            addCriterion("LIUSER like", value, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserNotLike(String value) {
            addCriterion("LIUSER not like", value, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserIn(List<String> values) {
            addCriterion("LIUSER in", values, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserNotIn(List<String> values) {
            addCriterion("LIUSER not in", values, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserBetween(String value1, String value2) {
            addCriterion("LIUSER between", value1, value2, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserNotBetween(String value1, String value2) {
            addCriterion("LIUSER not between", value1, value2, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiupmjIsNull() {
            addCriterion("LIUPMJ is null");
            return (Criteria) this;
        }

        public Criteria andLiupmjIsNotNull() {
            addCriterion("LIUPMJ is not null");
            return (Criteria) this;
        }

        public Criteria andLiupmjEqualTo(Date value) {
            addCriterion("LIUPMJ =", value, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjNotEqualTo(Date value) {
            addCriterion("LIUPMJ <>", value, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjGreaterThan(Date value) {
            addCriterion("LIUPMJ >", value, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjGreaterThanOrEqualTo(Date value) {
            addCriterion("LIUPMJ >=", value, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjLessThan(Date value) {
            addCriterion("LIUPMJ <", value, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjLessThanOrEqualTo(Date value) {
            addCriterion("LIUPMJ <=", value, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjIn(List<Date> values) {
            addCriterion("LIUPMJ in", values, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjNotIn(List<Date> values) {
            addCriterion("LIUPMJ not in", values, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjBetween(Date value1, Date value2) {
            addCriterion("LIUPMJ between", value1, value2, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjNotBetween(Date value1, Date value2) {
            addCriterion("LIUPMJ not between", value1, value2, "liupmj");
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