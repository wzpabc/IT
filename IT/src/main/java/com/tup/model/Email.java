package com.tup.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;

public class Email implements Serializable  {
	@TableField(exist = false)
	private static final long serialVersionUID = 1L;
    private String mail;

    private Date execdate;

    private Date nextexecdate;

    private String yearweek;

    private String organno;

    private String organname;

    private String emailto;

    private String emailcc;

    private String emailbc;

    private String subject;

    private String content;

    private String attpath;

    private Integer isactive;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public Date getExecdate() {
        return execdate;
    }

    public void setExecdate(Date execdate) {
        this.execdate = execdate;
    }

    public Date getNextexecdate() {
        return nextexecdate;
    }

    public void setNextexecdate(Date nextexecdate) {
        this.nextexecdate = nextexecdate;
    }

    public String getYearweek() {
        return yearweek;
    }

    public void setYearweek(String yearweek) {
        this.yearweek = yearweek == null ? null : yearweek.trim();
    }

    public String getOrganno() {
        return organno;
    }

    public void setOrganno(String organno) {
        this.organno = organno == null ? null : organno.trim();
    }

    public String getOrganname() {
        return organname;
    }

    public void setOrganname(String organname) {
        this.organname = organname == null ? null : organname.trim();
    }

    public String getEmailto() {
        return emailto;
    }

    public void setEmailto(String emailto) {
        this.emailto = emailto == null ? null : emailto.trim();
    }

    public String getEmailcc() {
        return emailcc;
    }

    public void setEmailcc(String emailcc) {
        this.emailcc = emailcc == null ? null : emailcc.trim();
    }

    public String getEmailbc() {
        return emailbc;
    }

    public void setEmailbc(String emailbc) {
        this.emailbc = emailbc == null ? null : emailbc.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAttpath() {
        return attpath;
    }

    public void setAttpath(String attpath) {
        this.attpath = attpath == null ? null : attpath.trim();
    }

    public Integer getIsactive() {
        return isactive;
    }

    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }
}