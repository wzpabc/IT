package com.tup.model;

import java.util.Date;

public class Report {
    private Integer id;

    private String rptusername;

    private String rptsource;

    private String sourcename;

    private String rpttarget;

    private String targetname;

    private String areano;

    private String provinceno;

    private String year;

    private String quarter;

    private String month;

    private String week;

    private String rptcls;

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

    public String getRptusername() {
        return rptusername;
    }

    public void setRptusername(String rptusername) {
        this.rptusername = rptusername == null ? null : rptusername.trim();
    }

    public String getRptsource() {
        return rptsource;
    }

    public void setRptsource(String rptsource) {
        this.rptsource = rptsource == null ? null : rptsource.trim();
    }

    public String getSourcename() {
        return sourcename;
    }

    public void setSourcename(String sourcename) {
        this.sourcename = sourcename == null ? null : sourcename.trim();
    }

    public String getRpttarget() {
        return rpttarget;
    }

    public void setRpttarget(String rpttarget) {
        this.rpttarget = rpttarget == null ? null : rpttarget.trim();
    }

    public String getTargetname() {
        return targetname;
    }

    public void setTargetname(String targetname) {
        this.targetname = targetname == null ? null : targetname.trim();
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

    public String getRptcls() {
        return rptcls;
    }

    public void setRptcls(String rptcls) {
        this.rptcls = rptcls == null ? null : rptcls.trim();
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