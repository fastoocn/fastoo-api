package cn.fastoo.sdk.model;
/**
 * 批量发送短信的参数类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class SendBatchSmsParm {
	/**
	 * 用户唯一标识
	 */
	private String apiKey;
	/**
	 * 发送账号
	 */
	private String selectApiKey;
	/**
	 * 批次名称
	 */
	private String batchName;
	/**
	 * 号码（多个号码之间用逗号隔开）
	 */
	private String das;
	/**
	 * 短信内容
	 */
	private String msg;
	/**
	 * 发送时间（若为空则立即发送）
	 */
	private String timing;
	
	public SendBatchSmsParm(String apiKey, String selectApiKey, String batchName, String das, String msg,
			String timing) {
		super();
		this.apiKey = apiKey;
		this.selectApiKey = selectApiKey;
		this.batchName = batchName;
		this.das = das;
		this.msg = msg;
		this.timing = timing;
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
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getDas() {
		return das;
	}
	public void setDas(String das) {
		this.das = das;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	
	
}
