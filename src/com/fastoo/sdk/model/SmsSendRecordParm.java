package com.fastoo.sdk.model;
/**
 * 发送记录参数类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class SmsSendRecordParm {
	/**
	 * 用户唯一标识
	 */
	private String apiKey;
	/**
	 * 账号
	 */
	private String selectApiKey;
	/**
	 * 发送开始时间
	 */
	private String createTimeStart;
	/**
	 * 发送结束时间
	 */
	private String createTimeEnd;
	/**
	 * 手机号码
	 */
	private String destAddr;
	/**
	 * 第几页（0表示第一页，以此类推）
	 */
	private String pageNo;
	
	public SmsSendRecordParm(String apiKey, String selectApiKey, String createTimeStart, String createTimeEnd,
			String destAddr, String pageNo) {
		super();
		this.apiKey = apiKey;
		this.selectApiKey = selectApiKey;
		this.createTimeStart = createTimeStart;
		this.createTimeEnd = createTimeEnd;
		this.destAddr = destAddr;
		this.pageNo = pageNo;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getSelectApiKey() {
		return selectApiKey;
	}
	public void setSelectApiKey(String selectApiKey) {
		this.selectApiKey = selectApiKey;
	}
	public String getCreateTimeStart() {
		return createTimeStart;
	}
	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
	}
	public String getCreateTimeEnd() {
		return createTimeEnd;
	}
	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}
	public String getDestAddr() {
		return destAddr;
	}
	public void setDestAddr(String destAddr) {
		this.destAddr = destAddr;
	}
	public String getPageNo() {
		return pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	
	
}
