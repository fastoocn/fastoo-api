package com.fastoo.sdk.model;
/**
 * 黑名单基础类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class BlackIPBean {
	/**
	 * 添加时间
	 */
	private Double createTime;
	/**
	 * 黑名单唯一标识
	 */
	private Integer id;
	/**
	 * 手机号码
	 */
	private String phone;
	/**
	 *用户名
	 */
	private String userName;
	public Double getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Double createTime) {
		this.createTime = createTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
