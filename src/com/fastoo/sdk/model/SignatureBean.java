package com.fastoo.sdk.model;
/**
 * 设备报备基础类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class SignatureBean {
	/**
	 * 账号
	 */
	private String apiKey;
	/**
	 * 申请时间
	 */
	private Double signApplyTime;
	/**
	 * 审核时间
	 */
	private Double signAuditTime;
	/**
	 * 签名
	 */
	private String signName;
	/**
	 * 审核状态（0:未审核，1:通过）
	 */
	private Integer signStatus;
	
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public Double getSignApplyTime() {
		return signApplyTime;
	}
	public void setSignApplyTime(Double signApplyTime) {
		this.signApplyTime = signApplyTime;
	}
	public Double getSignAuditTime() {
		return signAuditTime;
	}
	public void setSignAuditTime(Double signAuditTime) {
		this.signAuditTime = signAuditTime;
	}
	public String getSignName() {
		return signName;
	}
	public void setSignName(String signName) {
		this.signName = signName;
	}
	public Integer getSignStatus() {
		return signStatus;
	}
	public void setSignStatus(Integer signStatus) {
		this.signStatus = signStatus;
	}
	
}
