package com.tup.model;

public class Outletstock {
    private Integer id;

    private Integer year;

    private Integer month;

    private String outletno;

    private String area;

    private String rental;

    private String salary;

    private String filename;

    private String itemno;

    private String itemname;

    private String unit;

    private String price;

    private String shopamount;

    private String warehouse1amount;

    private String warehouse2amount;

    private String totalamount;

    private String total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getOutletno() {
        return outletno;
    }

    public void setOutletno(String outletno) {
        this.outletno = outletno == null ? null : outletno.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getRental() {
        return rental;
    }

    public void setRental(String rental) {
        this.rental = rental == null ? null : rental.trim();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getItemno() {
        return itemno;
    }

    public void setItemno(String itemno) {
        this.itemno = itemno == null ? null : itemno.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getShopamount() {
        return shopamount;
    }

    public void setShopamount(String shopamount) {
        this.shopamount = shopamount == null ? null : shopamount.trim();
    }

    public String getWarehouse1amount() {
        return warehouse1amount;
    }

    public void setWarehouse1amount(String warehouse1amount) {
        this.warehouse1amount = warehouse1amount == null ? null : warehouse1amount.trim();
    }

    public String getWarehouse2amount() {
        return warehouse2amount;
    }

    public void setWarehouse2amount(String warehouse2amount) {
        this.warehouse2amount = warehouse2amount == null ? null : warehouse2amount.trim();
    }

    public String getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(String totalamount) {
        this.totalamount = totalamount == null ? null : totalamount.trim();
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total == null ? null : total.trim();
    }
}