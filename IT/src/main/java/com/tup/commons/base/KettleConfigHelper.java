package com.tup.commons.base;

import java.io.Serializable;

public class KettleConfigHelper implements Serializable {
	/**
	 * Kettle config data
	 */
	private static final long serialVersionUID = 9152762695128581143L;
	private String best_ip = "";
	private String best_dbname = "";
	private String best_port = "";
	private String best_username = "";
	private String best_password = "";
	private String great_ip = "";
	private String great_dbname = "";
	private String great_port = "";
	private String great_username = "";
	private String great_password = "";
	private String send_addr = "";
	private String smtp = "";
	private String receive_addr = "";

	public String getReceive_addr() {
		return receive_addr;
	}

	public void setReceive_addr(String receive_addr) {
		this.receive_addr = receive_addr;
	}

	public String getMax_times() {
		return max_times;
	}

	public void setMax_times(String max_times) {
		this.max_times = max_times;
	}

	private String port = "25";
	private String max_times = "0";

	public String getSend_addr() {
		return send_addr;
	}

	public void setSend_addr(String send_addr) {
		this.send_addr = send_addr;
	}

	public String getSmtp() {
		return smtp;
	}

	public void setSmtp(String smtp) {
		this.smtp = smtp;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getBest_ip() {
		return best_ip;
	}

	public void setBest_ip(String best_ip) {
		this.best_ip = best_ip;
	}

	public String getBest_dbname() {
		return best_dbname;
	}

	public void setBest_dbname(String best_dbname) {
		this.best_dbname = best_dbname;
	}

	public String getBest_port() {
		return best_port;
	}

	public void setBest_port(String best_port) {
		this.best_port = best_port;
	}

	public String getBest_username() {
		return best_username;
	}

	public void setBest_username(String best_username) {
		this.best_username = best_username;
	}

	public String getBest_password() {
		return best_password;
	}

	public void setBest_password(String best_password) {
		this.best_password = best_password;
	}

	public String getGreat_ip() {
		return great_ip;
	}

	public void setGreat_ip(String great_ip) {
		this.great_ip = great_ip;
	}

	public String getGreat_dbname() {
		return great_dbname;
	}

	public void setGreat_dbname(String great_dbname) {
		this.great_dbname = great_dbname;
	}

	public String getGreat_port() {
		return great_port;
	}

	public void setGreat_port(String great_port) {
		this.great_port = great_port;
	}

	public String getGreat_username() {
		return great_username;
	}

	public void setGreat_username(String great_username) {
		this.great_username = great_username;
	}

	public String getGreat_password() {
		return great_password;
	}

	public void setGreat_password(String great_password) {
		this.great_password = great_password;
	}

	@Override
	public String toString() {
		return "KettleConfigHelper [best_ip=" + best_ip + ", best_dbname=" + best_dbname + ", best_port=" + best_port
				+ ", best_username=" + best_username + ", best_password=" + best_password + ", great_ip=" + great_ip
				+ ", great_dbname=" + great_dbname + ", great_port=" + great_port + ", great_username=" + great_username
				+ ", great_password=" + great_password + "]";
	}

}
