package cn.fastoo.sdk.model;
/**
 * 设置账号信息参数类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class UserInfoParm {
	/**
	 * 用户唯一标识
	 */
	private String apiKey;
	/**
	 * 开发者类型(1:公司，2:个人)
	 */
	private String userType;
	/**
	 * 公司名称（开发者类型为公司必传）
	 */
	private String company;
	/**
	 * 所属行业（开发者类型为公司必传）
	 */
	private String industry;
	/**
	 * 营业执照（开发者类型为公司必传）
	 */
	private String businessLicence;
	/**
	 * 营业执照照片名称（开发者类型为公司必传）
	 */
	private String businessLicenceImg;
	/**
	 * 真实姓名（开发者类型为个人必传）
	 */
	private String realName;
	/**
	 * 证件号码（开发者类型为个人必传）
	 */
	private String idcard;
	
	public UserInfoParm(String apiKey, String userType, String company, String industry, String businessLicence,
			String businessLicenceImg, String realName, String idcard) {
		super();
		this.apiKey = apiKey;
		this.userType = userType;
		this.company = company;
		this.industry = industry;
		this.businessLicence = businessLicence;
		this.businessLicenceImg = businessLicenceImg;
		this.realName = realName;
		this.idcard = idcard;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
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
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	
	
}
