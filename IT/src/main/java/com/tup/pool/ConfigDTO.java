///**
// *JOB配置表
// */
//package cocom.tup.pool
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//
///**
// * @author hxf
// * @date 2015-9-27
// */
//@Entity
//@Table(name="JOB_CONFIG")
//public class ConfigDTO {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private Long id;
//	
//	/**
//	 * 配置名字
//	 */
//	@Column(name="CONFIG_NAME")
//	private String configName;
//	
//	/**
//	 * 配置编码
//	 */
//	@Column(name="CONFIG_CODE")
//	private String configCode;
//	
//	/**
//	 * job文件名称
//	 * 
//	 */
//	@Column(name="KTR_NAME")
//	private String ktrName;
//	
//	/**
//	 * 服务频率
//	 */
//	@Column(name="FREQ")
//	private int freq;
//	
//	/**
//	 * 重试次数
//	 */
//	@Column(name="RETRY_TIME")
//	private int retryTime;
//	
//	
//	/**
//	 * 邮件
//	 */
//	
//	//@Column(name="EMAIL")
//	@Column(name="EMAIL")
//	private String email;
//
//	/**
//	 * 服务状态
//	 */
//	@Column(name="CONFIG_STATUS")
//	private String configStatus;
//	
//	
//	/**
//	 * 备注
//	 */
//	@Column(name="REMARK")
//	private String remark;
//	
//	@Column(name="CREATE_TIME")
//	private Date createTime;
//	
//	@Column(name="UPDATE_TIME")
//	private Date updateTime;
//	
//	@Column(name="run_status")
//	private String runStatus;
//	
//	@Transient
//	private String currRunStatus;
//	
//	@Transient
//	private Date nearestRunTime;
//	
//	public String getRunStatus() {
//		return runStatus;
//	}
//
//	public void setRunStatus(String runStatus) {
//		this.runStatus = runStatus;
//	}
//
//	/**
//	 * @return the id
//	 */
//	public Long getId() {
//		return id;
//	}
//
//	/**
//	 * @param id
//	 *            the id to set
//	 */
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getConfigName() {
//		return configName;
//	}
//
//	public void setConfigName(String configName) {
//		this.configName = configName;
//	}
//
//	public String getConfigCode() {
//		return configCode;
//	}
//
//	public void setConfigCode(String configCode) {
//		this.configCode = configCode;
//	}
//
//	public int getFreq() {
//		return freq;
//	}
//
//	public void setFreq(int freq) {
//		this.freq = freq;
//	}
//
//	public int getRetryTime() {
//		return retryTime;
//	}
//
//	public void setRetryTime(int retryTime) {
//		this.retryTime = retryTime;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getConfigStatus() {
//		return configStatus;
//	}
//
//	public void setConfigStatus(String configStatus) {
//		this.configStatus = configStatus;
//	}
//
//	public String getRemark() {
//		return remark;
//	}
//
//	public void setRemark(String remark) {
//		this.remark = remark;
//	}
//
//	public String getKtrName() {
//		return ktrName;
//	}
//
//	public void setKtrName(String ktrName) {
//		this.ktrName = ktrName;
//	}
//
//	public Date getCreateTime() {
//		return createTime;
//	}
//
//	public void setCreateTime(Date createTime) {
//		this.createTime = createTime;
//	}
//
//	public Date getUpdateTime() {
//		return updateTime;
//	}
//
//	public void setUpdateTime(Date updateTime) {
//		this.updateTime = updateTime;
//	}
//
//	public String getCurrRunStatus() {
//		return currRunStatus;
//	}
//
//	public void setCurrRunStatus(String currRunStatus) {
//		this.currRunStatus = currRunStatus;
//	}
//
//	public Date getNearestRunTime() {
//		return nearestRunTime;
//	}
//
//	public void setNearestRunTime(Date nearestRunTime) {
//		this.nearestRunTime = nearestRunTime;
//	}
//
//}
