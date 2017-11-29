package com.fastoo.sdk.model;
/**
 * 发送记录基础类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class SmsBatchRecordBean {
	/**
	 * apiKey
	 */
	private String apiKey;
	/**
	 * 
	 */
	private String batchName;
	/**
	 * 
	 */
	private String content;
	/**
	 * 
	 */
	private Integer id;
	/**
	 * 
	 */
	private Integer sendFailNum;
	/**
	 * 
	 */
	private Integer sendSuccessNum;
	/**
	 * 状态(1:启动,0:暂停,-1:取消,2:已发送)
	 */
	private Integer status;
	/**
	 * 
	 */
	private Double submitTime;
	/**
	 * 
	 */
	private Double submitTimeDt;
	/**
	 * 
	 */
	private Double timing;
	/**
	 * 
	 */
	private Integer totalNum;
	/**
	 * 
	 */
	private Integer unSendNum;
	/**
	 * 
	 */
	private Integer userBaseId;
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSendFailNum() {
		return sendFailNum;
	}
	public void setSendFailNum(Integer sendFailNum) {
		this.sendFailNum = sendFailNum;
	}
	public Integer getSendSuccessNum() {
		return sendSuccessNum;
	}
	public void setSendSuccessNum(Integer sendSuccessNum) {
		this.sendSuccessNum = sendSuccessNum;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Double getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(Double submitTime) {
		this.submitTime = submitTime;
	}
	public Double getSubmitTimeDt() {
		return submitTimeDt;
	}
	public void setSubmitTimeDt(Double submitTimeDt) {
		this.submitTimeDt = submitTimeDt;
	}
	public Double getTiming() {
		return timing;
	}
	public void setTiming(Double timing) {
		this.timing = timing;
	}
	public Integer getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}
	
	public Integer getUnSendNum() {
		return unSendNum;
	}
	public void setUnSendNum(Integer unSendNum) {
		this.unSendNum = unSendNum;
	}
	public Integer getUserBaseId() {
		return userBaseId;
	}
	public void setUserBaseId(Integer userBaseId) {
		this.userBaseId = userBaseId;
	}
	
}
