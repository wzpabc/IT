package com.tup.model;

import java.util.Date;

public class Reportmapping {
    private Integer id;

    private String rptaccountno;

    private String rptusername;

    private String strurl;

    private String rptname;

    private String areano;

    private String provinceno;

    private String year;

    private String quarter;

    private String month;

    private String week;

    private String rplcls;

    private Integer isactive;

    private Integer status;

    private Date updatedate;

    private Date createtime;

    private Date updatetime;

    private Integer deleteflag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRptaccountno() {
        return rptaccountno;
    }

    public void setRptaccountno(String rptaccountno) {
        this.rptaccountno = rptaccountno == null ? null : rptaccountno.trim();
    }

    public String getRptusername() {
        return rptusername;
    }

    public void setRptusername(String rptusername) {
        this.rptusername = rptusername == null ? null : rptusername.trim();
    }

    public String getStrurl() {
        return strurl;
    }

    public void setStrurl(String strurl) {
        this.strurl = strurl == null ? null : strurl.trim();
    }

    public String getRptname() {
        return rptname;
    }

    public void setRptname(String rptname) {
        this.rptname = rptname == null ? null : rptname.trim();
    }

    public String getAreano() {
        return areano;
    }

    public void setAreano(String areano) {
        this.areano = areano == null ? null : areano.trim();
    }

    public String getProvinceno() {
        return provinceno;
    }

    public void setProvinceno(String provinceno) {
        this.provinceno = provinceno == null ? null : provinceno.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter == null ? null : quarter.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week == null ? null : week.trim();
    }

    public String getRplcls() {
        return rplcls;
    }

    public void setRplcls(String rplcls) {
        this.rplcls = rplcls == null ? null : rplcls.trim();
    }

    public Integer getIsactive() {
        return isactive;
    }

    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }
}