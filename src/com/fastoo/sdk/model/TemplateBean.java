package com.fastoo.sdk.model;
/**
 * 模板基础类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class TemplateBean {
	/**
	 * 账号
	 */
	private String apiKey;
	/**
	 * app地址
	 */
	private String appUrl;
	/**
	 * 申请时间
	 */
	private Double applyTime;
	/**
	 * 审核时间
	 */
	private Double auditTime;
	/**
	 * 模板唯一标识
	 */
	private String id;
	/**
	 * 原因
	 */
	private String reason;
	/**
	 * 状态（0:未审核，1;通过）
	 */
	private Integer state;
	/**
	 * 模板内容
	 */
	private String templateContent;
	/**
	 * 模板类型（1:验证码类，2:通知类，3:营销类）
	 */	
	private Integer templateType;
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getAppUrl() {
		return appUrl;
	}
	public void setAppUrl(String appUrl) {
		this.appUrl = appUrl;
	}
	public Double getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Double applyTime) {
		this.applyTime = applyTime;
	}
	public Double getAuditTime() {
		return auditTime;
	}
	public void setAuditTime(Double auditTime) {
		this.auditTime = auditTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getTemplateContent() {
		return templateContent;
	}
	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}
	public Integer getTemplateType() {
		return templateType;
	}
	public void setTemplateType(Integer templateType) {
		this.templateType = templateType;
	}
	
}
