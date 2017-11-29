package com.fastoo.sdk.model;
/**
 * APIKey对象类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class ApiKeyBean {
	/**
	 * 账号
	 */
	private String apiKey;
	/**
	 * DR路径
	 */
	private String drUrl;
	/**
	 * apiKey唯一标识
	 */
	private Integer id;
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getDrUrl() {
		return drUrl;
	}
	public void setDrUrl(String drUrl) {
		this.drUrl = drUrl;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
