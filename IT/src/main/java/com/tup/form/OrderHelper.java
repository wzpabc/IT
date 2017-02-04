package com.tup.form;

public class OrderHelper {
	private Integer page=1;
	private Integer rows=500;
	private String orderno="";
	private String organno="";
	private String ordertype="ALL";
	private String jdestatus="";
	private String createdateStart="";
	private String createdateEnd="";
	
	public String getJdestatus() {
		return jdestatus;
	}
	public void setJdestatus(String jdestatus) {
		this.jdestatus = jdestatus;
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
	public String getOrderno() {
		return orderno.trim();
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	public String getOrganno() {
		return organno.trim();
	}
	public void setOrganno(String organno) {
		this.organno = organno;
	}
	public String getOrdertype() {
		return ordertype;
	}
	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}
	public String getCreatedateStart() {
		return createdateStart;
	}
	public void setCreatedateStart(String createdateStart) {
		this.createdateStart = createdateStart;
	}
	public String getCreatedateEnd() {
		return createdateEnd;
	}
	public void setCreatedateEnd(String createdateEnd) {
		this.createdateEnd = createdateEnd;
	}
	@Override
	public String toString() {
		return "RequestOrderParamHelper [page=" + page + ", rows=" + rows + ", orderno=" + orderno + ", organno="
				+ organno + ", ordertype=" + ordertype + ", createdateStart=" + createdateStart + ", createdateEnd="
				+ createdateEnd + "]";
	}
	public OrderHelper() {
		super();
	}
 

}
