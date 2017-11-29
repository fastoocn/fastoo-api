package com.fastoo.sdk.model;

import org.json.JSONObject;

/**
 * 获取账号信息返回类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class UserInfoReturn extends ReturnModel {
	/**
	 * 账户余额
	 */
	private Double balance;
	/**
	 * /营业执照
	 */
	private String businessLicence;
	/**
	 * 营业执照照片名称
	 */
	private String businessLicenceImg;
	/**
	 * 公司名称
	 */
	private String company;
	/**
	 * 证件号码
	 */
	private String idcard;
	/**
	 * 所属行业
	 */
	private String industry;
	/**
	 * IP白名单保护(0:关闭，1:开启)
	 */
	private Integer ipEnable;
	/**
	 * 账号
	 */
	private String loginName;
	/**
	 * 真实姓名
	 */
	private String realName;
	/**
	 *开发者类型(1:公司，2:个人)
	 */
	private Integer userType;
	public UserInfoReturn(String jsonstr) {
		super(jsonstr);
		if(this.getCode().equals(0)){
			//成功
			JSONObject obj=this.getObj().getJSONObject("data").getJSONObject("userInfo");
			this.setBalance(obj.getDouble("balance"));
			this.setBusinessLicence(obj.getString("businessLicence"));
			this.setBusinessLicenceImg(obj.getString("businessLicenceImg"));
			this.setCompany(obj.getString("company"));
			this.setIdcard(obj.getString("idcard"));
			this.setIndustry(obj.getString("industry"));
			this.setIpEnable(obj.getInt("ipEnable"));
			this.setLoginName(obj.getString("loginName"));
			this.setRealName(obj.getString("realName"));
			this.setUserType(obj.getInt("userType"));
		}
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getBusinessLicence() {
		return businessLicence;
	}
	public void setBusinessLicence(String businessLicence) {
		this.businessLicence = businessLicence;
	}
	public String getBusinessLicenceImg() {
		return businessLicenceImg;
	}
	public void setBusinessLicenceImg(String businessLicenceImg) {
		this.businessLicenceImg = businessLicenceImg;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public Integer getIpEnable() {
		return ipEnable;
	}
	public void setIpEnable(Integer ipEnable) {
		this.ipEnable = ipEnable;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	
}
