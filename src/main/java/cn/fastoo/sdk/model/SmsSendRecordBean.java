package cn.fastoo.sdk.model;
/**
 * 批量发送记录基础类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class SmsSendRecordBean {
	/**
	 * apiKey
	 */
	private String apiKey;
	/**
	 * 
	 */
	private String countryCode;
	/**
	 * 
	 */
	private String destAddr;
	/**
	 * 
	 */
	private String drErrorcode;
	/**
	 * 报告状态（0:无报告，1:成功，2:失败）
	 */
	private Integer drStatus;
	/**
	 * 
	 */
	private String drStatuscode;
	/**
	 * 
	 */
	private Integer feeCount;
	/**
	 * 
	 */
	private String localMsgid;
	/**
	 * 
	 */
	private String loginName;
	/**
	 * 
	 */
	private String msgContent;
	/**
	 * 
	 */
	private String mtErrorcode;
	/**
	 * 发送状态（0:未发送，1:成功，2:失败）
	 */
	private Integer mtStatus;
	/**
	 * 
	 */
	private String mtStatuscode;
	/**
	 * 
	 */
	private Double price;
	/**
	 * 
	 */
	private Double submitTime;
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDestAddr() {
		return destAddr;
	}
	public void setDestAddr(String destAddr) {
		this.destAddr = destAddr;
	}
	public String getDrErrorcode() {
		return drErrorcode;
	}
	public void setDrErrorcode(String drErrorcode) {
		this.drErrorcode = drErrorcode;
	}
	public Integer getDrStatus() {
		return drStatus;
	}
	public void setDrStatus(Integer drStatus) {
		this.drStatus = drStatus;
	}
	public String getDrStatuscode() {
		return drStatuscode;
	}
	public void setDrStatuscode(String drStatuscode) {
		this.drStatuscode = drStatuscode;
	}
	public Integer getFeeCount() {
		return feeCount;
	}
	public void setFeeCount(Integer feeCount) {
		this.feeCount = feeCount;
	}
	public String getLocalMsgid() {
		return localMsgid;
	}
	public void setLocalMsgid(String localMsgid) {
		this.localMsgid = localMsgid;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
	public String getMtErrorcode() {
		return mtErrorcode;
	}
	public void setMtErrorcode(String mtErrorcode) {
		this.mtErrorcode = mtErrorcode;
	}
	public Integer getMtStatus() {
		return mtStatus;
	}
	public void setMtStatus(Integer mtStatus) {
		this.mtStatus = mtStatus;
	}
	public String getMtStatuscode() {
		return mtStatuscode;
	}
	public void setMtStatuscode(String mtStatuscode) {
		this.mtStatuscode = mtStatuscode;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(Double submitTime) {
		this.submitTime = submitTime;
	}
	
}
