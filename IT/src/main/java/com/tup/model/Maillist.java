package com.tup.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;
/**
 * <p>
 * 
 * </p>
 *
 * @author patrick.wang
 * @since 2017-05-27
 */
public class Maillist extends Model<Maillist> {

    private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;
	/**
	 * 
	 */
	private String subject;
	/**
	 * 
	 */
	private String content;
	/**
	 * 
	 */
	private String type;
	/**
	 * 
	 */
	private String emailto;
	/**
	 * 
	 */
	private String emailcc;
	/**
	 * 
	 */
	private String emailbc;
	/**
	 * 
	 */
	private String attpath;
	/**
	 * 
	 */
	private Integer status;
	/**
	 * 
	 */
	private java.util.Date execdate;
	/**
	 * 
	 */
	private java.util.Date lastexecdate;
	/**
	 * 
	 */
	private Integer retrytimes;
	/**
	 * 
	 */
	private java.util.Date createtime;
	/**
	 * 
	 */
	private java.util.Date updatetime;
	/**
	 * 
	 */
	private Integer deleteflag;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmailto() {
		return emailto;
	}

	public void setEmailto(String emailto) {
		this.emailto = emailto;
	}

	public String getEmailcc() {
		return emailcc;
	}

	public void setEmailcc(String emailcc) {
		this.emailcc = emailcc;
	}

	public String getEmailbc() {
		return emailbc;
	}

	public void setEmailbc(String emailbc) {
		this.emailbc = emailbc;
	}

	public String getAttpath() {
		return attpath;
	}

	public void setAttpath(String attpath) {
		this.attpath = attpath;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public java.util.Date getExecdate() {
		return execdate;
	}

	public void setExecdate(java.util.Date execdate) {
		this.execdate = execdate;
	}

	public java.util.Date getLastexecdate() {
		return lastexecdate;
	}

	public void setLastexecdate(java.util.Date lastexecdate) {
		this.lastexecdate = lastexecdate;
	}

	public Integer getRetrytimes() {
		return retrytimes;
	}

	public void setRetrytimes(Integer retrytimes) {
		this.retrytimes = retrytimes;
	}

	public java.util.Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(java.util.Date createtime) {
		this.createtime = createtime;
	}

	public java.util.Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(java.util.Date updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getDeleteflag() {
		return deleteflag;
	}

	public void setDeleteflag(Integer deleteflag) {
		this.deleteflag = deleteflag;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Maillist [id=" + id + ", subject=" + subject + ", content=" + content + ", type=" + type + ", emailto="
				+ emailto + ", emailcc=" + emailcc + ", emailbc=" + emailbc + ", attpath=" + attpath + ", status="
				+ status + ", execdate=" + execdate + ", lastexecdate=" + lastexecdate + ", retrytimes=" + retrytimes
				+ ", createtime=" + createtime + ", updatetime=" + updatetime + ", deleteflag=" + deleteflag + "]";
	}

}
