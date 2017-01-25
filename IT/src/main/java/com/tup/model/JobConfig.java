package com.tup.model;

import java.io.Serializable;
import java.util.Date;

public class JobConfig implements Serializable {
    private Integer id;

    private String configCode;

    private String configName;

    private Integer freq;

    private Integer retryTime;

    private String email;

    private String configStatus;

    private String ktrName;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String runStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConfigCode() {
        return configCode;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode == null ? null : configCode.trim();
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName == null ? null : configName.trim();
    }

    public Integer getFreq() {
        return freq;
    }

    public void setFreq(Integer freq) {
        this.freq = freq;
    }

    public Integer getRetryTime() {
        return retryTime;
    }

    public void setRetryTime(Integer retryTime) {
        this.retryTime = retryTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getConfigStatus() {
        return configStatus;
    }

    public void setConfigStatus(String configStatus) {
        this.configStatus = configStatus == null ? null : configStatus.trim();
    }

    public String getKtrName() {
        return ktrName;
    }

    public void setKtrName(String ktrName) {
        this.ktrName = ktrName == null ? null : ktrName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(String runStatus) {
        this.runStatus = runStatus == null ? null : runStatus.trim();
    }

	@Override
	public String toString() {
		return "JobConfig [id=" + id + ", configCode=" + configCode + ", configName=" + configName + ", freq=" + freq
				+ ", retryTime=" + retryTime + ", email=" + email + ", configStatus=" + configStatus + ", ktrName="
				+ ktrName + ", remark=" + remark + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", runStatus=" + runStatus + "]";
	}
}