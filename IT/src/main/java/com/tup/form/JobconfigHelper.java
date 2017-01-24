package com.tup.form;

public class JobconfigHelper {
	private String id="";
	private String config_code="";
	private String config_name="";
	private String freq="";
	private String retry_time="";
	private String email="";
	private String config_status="";
	private String ktr_name="";
	private String remark="";
	private String create_time="";
	private String update_time="";
	private String run_status="";
	private String sort="";
	private String order="";
	private Integer page=1;
	private Integer rows=500;
	
	@Override
	public String toString() {
		return "RequestJobconfigParamHelper [id=" + id + ", config_code=" + config_code + ", config_name=" + config_name
				+ ", freq=" + freq + ", retry_time=" + retry_time + ", email=" + email + ", config_status="
				+ config_status + ", ktr_name=" + ktr_name + ", remark=" + remark + ", create_time=" + create_time
				+ ", update_time=" + update_time + ", run_status=" + run_status + ", sort=" + sort + ", order=" + order
				+ ", page=" + page + ", rows=" + rows + "]";
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getConfig_code() {
		return config_code;
	}
	public void setConfig_code(String config_code) {
		this.config_code = config_code;
	}
	public String getConfig_name() {
		return config_name;
	}
	public void setConfig_name(String config_name) {
		this.config_name = config_name;
	}
	public String getFreq() {
		return freq;
	}
	public void setFreq(String freq) {
		this.freq = freq;
	}
	public String getRetry_time() {
		return retry_time;
	}
	public void setRetry_time(String retry_time) {
		this.retry_time = retry_time;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfig_status() {
		return config_status;
	}
	public void setConfig_status(String config_status) {
		this.config_status = config_status;
	}
	public String getKtr_name() {
		return ktr_name;
	}
	public void setKtr_name(String ktr_name) {
		this.ktr_name = ktr_name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	public String getRun_status() {
		return run_status;
	}
	public void setRun_status(String run_status) {
		this.run_status = run_status;
	}
	
}
