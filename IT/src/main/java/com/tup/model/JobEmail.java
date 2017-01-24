package com.tup.model;

import java.util.Date;

public class JobEmail {
    @Override
	public String toString() {
		return "JobEmail [id=" + id + ", mail=" + mail + ", execdate=" + execdate + ", nextexecdate=" + nextexecdate
				+ ", yearweek=" + yearweek + ", organno=" + organno + ", organname=" + organname + ", emailto="
				+ emailto + ", emailcc=" + emailcc + ", emailbc=" + emailbc + ", subject=" + subject + ", content="
				+ content + ", attpath=" + attpath + ", isactive=" + isactive + ", week=" + week + ", quarter="
				+ quarter + ", month=" + month + ", year=" + year + ", createtime=" + createtime + ", updatetime="
				+ updatetime + ", deleteflag=" + deleteflag + ", status=" + status + ", type=" + type + "]";
	}

	private Integer id;

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

    private String week;

    private String quarter;

    private String month;

    private String year;

    private Date createtime;

    private Date updatetime;

    private Integer deleteflag;

    private Byte status;

    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week == null ? null : week.trim();
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}