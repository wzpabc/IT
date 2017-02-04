package com.tup.model;

import java.util.ArrayList;
import java.util.List;

public class OutletstockExample {
    protected String orderByClause;

    protected boolean distinct;
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
    protected List<Criteria> oredCriteria;

    public OutletstockExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("Year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("Year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("Year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("Year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("Year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("Year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("Year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("Year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("Year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("Year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("Year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("Year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("Month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("Month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("Month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("Month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("Month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("Month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("Month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("Month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("Month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("Month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("Month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("Month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andOutletnoIsNull() {
            addCriterion("OutletNo is null");
            return (Criteria) this;
        }

        public Criteria andOutletnoIsNotNull() {
            addCriterion("OutletNo is not null");
            return (Criteria) this;
        }

        public Criteria andOutletnoEqualTo(String value) {
            addCriterion("OutletNo =", value, "outletno");
            return (Criteria) this;
        }

        public Criteria andOutletnoNotEqualTo(String value) {
            addCriterion("OutletNo <>", value, "outletno");
            return (Criteria) this;
        }

        public Criteria andOutletnoGreaterThan(String value) {
            addCriterion("OutletNo >", value, "outletno");
            return (Criteria) this;
        }

        public Criteria andOutletnoGreaterThanOrEqualTo(String value) {
            addCriterion("OutletNo >=", value, "outletno");
            return (Criteria) this;
        }

        public Criteria andOutletnoLessThan(String value) {
            addCriterion("OutletNo <", value, "outletno");
            return (Criteria) this;
        }

        public Criteria andOutletnoLessThanOrEqualTo(String value) {
            addCriterion("OutletNo <=", value, "outletno");
            return (Criteria) this;
        }

        public Criteria andOutletnoLike(String value) {
            addCriterion("OutletNo like", value, "outletno");
            return (Criteria) this;
        }

        public Criteria andOutletnoNotLike(String value) {
            addCriterion("OutletNo not like", value, "outletno");
            return (Criteria) this;
        }

        public Criteria andOutletnoIn(List<String> values) {
            addCriterion("OutletNo in", values, "outletno");
            return (Criteria) this;
        }

        public Criteria andOutletnoNotIn(List<String> values) {
            addCriterion("OutletNo not in", values, "outletno");
            return (Criteria) this;
        }

        public Criteria andOutletnoBetween(String value1, String value2) {
            addCriterion("OutletNo between", value1, value2, "outletno");
            return (Criteria) this;
        }

        public Criteria andOutletnoNotBetween(String value1, String value2) {
            addCriterion("OutletNo not between", value1, value2, "outletno");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("Area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("Area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("Area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("Area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("Area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("Area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("Area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("Area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("Area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("Area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("Area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("Area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("Area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("Area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andRentalIsNull() {
            addCriterion("Rental is null");
            return (Criteria) this;
        }

        public Criteria andRentalIsNotNull() {
            addCriterion("Rental is not null");
            return (Criteria) this;
        }

        public Criteria andRentalEqualTo(String value) {
            addCriterion("Rental =", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalNotEqualTo(String value) {
            addCriterion("Rental <>", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalGreaterThan(String value) {
            addCriterion("Rental >", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalGreaterThanOrEqualTo(String value) {
            addCriterion("Rental >=", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalLessThan(String value) {
            addCriterion("Rental <", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalLessThanOrEqualTo(String value) {
            addCriterion("Rental <=", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalLike(String value) {
            addCriterion("Rental like", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalNotLike(String value) {
            addCriterion("Rental not like", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalIn(List<String> values) {
            addCriterion("Rental in", values, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalNotIn(List<String> values) {
            addCriterion("Rental not in", values, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalBetween(String value1, String value2) {
            addCriterion("Rental between", value1, value2, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalNotBetween(String value1, String value2) {
            addCriterion("Rental not between", value1, value2, "rental");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("Salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("Salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(String value) {
            addCriterion("Salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(String value) {
            addCriterion("Salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(String value) {
            addCriterion("Salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("Salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(String value) {
            addCriterion("Salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(String value) {
            addCriterion("Salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLike(String value) {
            addCriterion("Salary like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotLike(String value) {
            addCriterion("Salary not like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<String> values) {
            addCriterion("Salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<String> values) {
            addCriterion("Salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(String value1, String value2) {
            addCriterion("Salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(String value1, String value2) {
            addCriterion("Salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("FileName is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("FileName is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("FileName =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("FileName <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("FileName >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FileName >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("FileName <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("FileName <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("FileName like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("FileName not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("FileName in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("FileName not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("FileName between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("FileName not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andItemnoIsNull() {
            addCriterion("ItemNo is null");
            return (Criteria) this;
        }

        public Criteria andItemnoIsNotNull() {
            addCriterion("ItemNo is not null");
            return (Criteria) this;
        }

        public Criteria andItemnoEqualTo(String value) {
            addCriterion("ItemNo =", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoNotEqualTo(String value) {
            addCriterion("ItemNo <>", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoGreaterThan(String value) {
            addCriterion("ItemNo >", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoGreaterThanOrEqualTo(String value) {
            addCriterion("ItemNo >=", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoLessThan(String value) {
            addCriterion("ItemNo <", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoLessThanOrEqualTo(String value) {
            addCriterion("ItemNo <=", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoLike(String value) {
            addCriterion("ItemNo like", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoNotLike(String value) {
            addCriterion("ItemNo not like", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoIn(List<String> values) {
            addCriterion("ItemNo in", values, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoNotIn(List<String> values) {
            addCriterion("ItemNo not in", values, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoBetween(String value1, String value2) {
            addCriterion("ItemNo between", value1, value2, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoNotBetween(String value1, String value2) {
            addCriterion("ItemNo not between", value1, value2, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNull() {
            addCriterion("ItemName is null");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNotNull() {
            addCriterion("ItemName is not null");
            return (Criteria) this;
        }

        public Criteria andItemnameEqualTo(String value) {
            addCriterion("ItemName =", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotEqualTo(String value) {
            addCriterion("ItemName <>", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThan(String value) {
            addCriterion("ItemName >", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("ItemName >=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThan(String value) {
            addCriterion("ItemName <", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThanOrEqualTo(String value) {
            addCriterion("ItemName <=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLike(String value) {
            addCriterion("ItemName like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotLike(String value) {
            addCriterion("ItemName not like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameIn(List<String> values) {
            addCriterion("ItemName in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotIn(List<String> values) {
            addCriterion("ItemName not in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameBetween(String value1, String value2) {
            addCriterion("ItemName between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotBetween(String value1, String value2) {
            addCriterion("ItemName not between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("Unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("Unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("Unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("Unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("Unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("Price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("Price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andShopamountIsNull() {
            addCriterion("ShopAmount is null");
            return (Criteria) this;
        }

        public Criteria andShopamountIsNotNull() {
            addCriterion("ShopAmount is not null");
            return (Criteria) this;
        }

        public Criteria andShopamountEqualTo(String value) {
            addCriterion("ShopAmount =", value, "shopamount");
            return (Criteria) this;
        }

        public Criteria andShopamountNotEqualTo(String value) {
            addCriterion("ShopAmount <>", value, "shopamount");
            return (Criteria) this;
        }

        public Criteria andShopamountGreaterThan(String value) {
            addCriterion("ShopAmount >", value, "shopamount");
            return (Criteria) this;
        }

        public Criteria andShopamountGreaterThanOrEqualTo(String value) {
            addCriterion("ShopAmount >=", value, "shopamount");
            return (Criteria) this;
        }

        public Criteria andShopamountLessThan(String value) {
            addCriterion("ShopAmount <", value, "shopamount");
            return (Criteria) this;
        }

        public Criteria andShopamountLessThanOrEqualTo(String value) {
            addCriterion("ShopAmount <=", value, "shopamount");
            return (Criteria) this;
        }

        public Criteria andShopamountLike(String value) {
            addCriterion("ShopAmount like", value, "shopamount");
            return (Criteria) this;
        }

        public Criteria andShopamountNotLike(String value) {
            addCriterion("ShopAmount not like", value, "shopamount");
            return (Criteria) this;
        }

        public Criteria andShopamountIn(List<String> values) {
            addCriterion("ShopAmount in", values, "shopamount");
            return (Criteria) this;
        }

        public Criteria andShopamountNotIn(List<String> values) {
            addCriterion("ShopAmount not in", values, "shopamount");
            return (Criteria) this;
        }

        public Criteria andShopamountBetween(String value1, String value2) {
            addCriterion("ShopAmount between", value1, value2, "shopamount");
            return (Criteria) this;
        }

        public Criteria andShopamountNotBetween(String value1, String value2) {
            addCriterion("ShopAmount not between", value1, value2, "shopamount");
            return (Criteria) this;
        }

        public Criteria andWarehouse1amountIsNull() {
            addCriterion("WareHouse1Amount is null");
            return (Criteria) this;
        }

        public Criteria andWarehouse1amountIsNotNull() {
            addCriterion("WareHouse1Amount is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouse1amountEqualTo(String value) {
            addCriterion("WareHouse1Amount =", value, "warehouse1amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse1amountNotEqualTo(String value) {
            addCriterion("WareHouse1Amount <>", value, "warehouse1amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse1amountGreaterThan(String value) {
            addCriterion("WareHouse1Amount >", value, "warehouse1amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse1amountGreaterThanOrEqualTo(String value) {
            addCriterion("WareHouse1Amount >=", value, "warehouse1amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse1amountLessThan(String value) {
            addCriterion("WareHouse1Amount <", value, "warehouse1amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse1amountLessThanOrEqualTo(String value) {
            addCriterion("WareHouse1Amount <=", value, "warehouse1amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse1amountLike(String value) {
            addCriterion("WareHouse1Amount like", value, "warehouse1amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse1amountNotLike(String value) {
            addCriterion("WareHouse1Amount not like", value, "warehouse1amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse1amountIn(List<String> values) {
            addCriterion("WareHouse1Amount in", values, "warehouse1amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse1amountNotIn(List<String> values) {
            addCriterion("WareHouse1Amount not in", values, "warehouse1amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse1amountBetween(String value1, String value2) {
            addCriterion("WareHouse1Amount between", value1, value2, "warehouse1amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse1amountNotBetween(String value1, String value2) {
            addCriterion("WareHouse1Amount not between", value1, value2, "warehouse1amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse2amountIsNull() {
            addCriterion("WareHouse2Amount is null");
            return (Criteria) this;
        }

        public Criteria andWarehouse2amountIsNotNull() {
            addCriterion("WareHouse2Amount is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouse2amountEqualTo(String value) {
            addCriterion("WareHouse2Amount =", value, "warehouse2amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse2amountNotEqualTo(String value) {
            addCriterion("WareHouse2Amount <>", value, "warehouse2amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse2amountGreaterThan(String value) {
            addCriterion("WareHouse2Amount >", value, "warehouse2amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse2amountGreaterThanOrEqualTo(String value) {
            addCriterion("WareHouse2Amount >=", value, "warehouse2amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse2amountLessThan(String value) {
            addCriterion("WareHouse2Amount <", value, "warehouse2amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse2amountLessThanOrEqualTo(String value) {
            addCriterion("WareHouse2Amount <=", value, "warehouse2amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse2amountLike(String value) {
            addCriterion("WareHouse2Amount like", value, "warehouse2amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse2amountNotLike(String value) {
            addCriterion("WareHouse2Amount not like", value, "warehouse2amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse2amountIn(List<String> values) {
            addCriterion("WareHouse2Amount in", values, "warehouse2amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse2amountNotIn(List<String> values) {
            addCriterion("WareHouse2Amount not in", values, "warehouse2amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse2amountBetween(String value1, String value2) {
            addCriterion("WareHouse2Amount between", value1, value2, "warehouse2amount");
            return (Criteria) this;
        }

        public Criteria andWarehouse2amountNotBetween(String value1, String value2) {
            addCriterion("WareHouse2Amount not between", value1, value2, "warehouse2amount");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNull() {
            addCriterion("TotalAmount is null");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNotNull() {
            addCriterion("TotalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalamountEqualTo(String value) {
            addCriterion("TotalAmount =", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotEqualTo(String value) {
            addCriterion("TotalAmount <>", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThan(String value) {
            addCriterion("TotalAmount >", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThanOrEqualTo(String value) {
            addCriterion("TotalAmount >=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThan(String value) {
            addCriterion("TotalAmount <", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThanOrEqualTo(String value) {
            addCriterion("TotalAmount <=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLike(String value) {
            addCriterion("TotalAmount like", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotLike(String value) {
            addCriterion("TotalAmount not like", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountIn(List<String> values) {
            addCriterion("TotalAmount in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotIn(List<String> values) {
            addCriterion("TotalAmount not in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountBetween(String value1, String value2) {
            addCriterion("TotalAmount between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotBetween(String value1, String value2) {
            addCriterion("TotalAmount not between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("Total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("Total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(String value) {
            addCriterion("Total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(String value) {
            addCriterion("Total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(String value) {
            addCriterion("Total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(String value) {
            addCriterion("Total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(String value) {
            addCriterion("Total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(String value) {
            addCriterion("Total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLike(String value) {
            addCriterion("Total like", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotLike(String value) {
            addCriterion("Total not like", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<String> values) {
            addCriterion("Total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<String> values) {
            addCriterion("Total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(String value1, String value2) {
            addCriterion("Total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(String value1, String value2) {
            addCriterion("Total not between", value1, value2, "total");
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