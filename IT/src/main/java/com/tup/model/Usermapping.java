package com.tup.model;

import java.util.Date;

public class Usermapping {
    private Integer id;

    private String accountno;

    private String username;

    private String rptaccountno;

    private String rptusername;

    private Date createtime;

    private Date updatetime;

    private Integer deleteflag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno == null ? null : accountno.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
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