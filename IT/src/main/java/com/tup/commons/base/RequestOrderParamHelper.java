package com.tup.commons.base;

import java.util.Date;

public class RequestOrderParamHelper {
	public String orderno;
	public String organno;
	public String ordertype;
	public String jdestatus;
	public Date createdateStart;
	public Date createdateEnd;

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public String getOrganno() {
		return organno;
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

	public String getJdestatus() {
		return jdestatus;
	}

	public void setJdestatus(String jdestatus) {
		this.jdestatus = jdestatus;
	}

	public Date getCreatedateStart() {
		return createdateStart;
	}

	public void setCreatedateStart(Date createdateStart) {
		this.createdateStart = createdateStart;
	}

	public Date getCreatedateEnd() {
		return createdateEnd;
	}

	public void setCreatedateEnd(Date createdateEnd) {
		this.createdateEnd = createdateEnd;
	}

}
