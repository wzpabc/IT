package com.tup.model;

import java.util.Date;

public class Reportcls {
    private Integer id;

    private String rptcls;

    private String rptclsdesc;

    private Date createdate;

    private Date createtime;

    private Date updatetime;

    private Integer deleteflag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRptcls() {
        return rptcls;
    }

    public void setRptcls(String rptcls) {
        this.rptcls = rptcls == null ? null : rptcls.trim();
    }

    public String getRptclsdesc() {
        return rptclsdesc;
    }

    public void setRptclsdesc(String rptclsdesc) {
        this.rptclsdesc = rptclsdesc == null ? null : rptclsdesc.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
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