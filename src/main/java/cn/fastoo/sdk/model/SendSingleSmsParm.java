package cn.fastoo.sdk.model;
/**
 * 发送短信的参数类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class SendSingleSmsParm {
	/**
	 *  用户唯一标识
	 */
	private String apiKey;
	/**
	 * 国家唯一标识
	 */
	private String countryEn;
	/**
	 * 号码
	 */
	private String mobile;
	/**
	 * 国内/国际短信标识（domestic表示国内，其他值表示国际）
	 */
	private String isDomestic;
	/**
	 * 短信内容（若标识是domestic，默认短信内容只能是【Fastoo】您的验证码是1824，该字段填写的内容无效果）
	 */
	private String smscontent;
	
	public SendSingleSmsParm(String apiKey, String countryEn, String mobile, String isDomestic,
			String smscontent) {
		super();
		this.apiKey = apiKey;
		this.countryEn = countryEn;
		this.mobile = mobile;
		this.isDomestic = isDomestic;
		this.smscontent = smscontent;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getCountryEn() {
		return countryEn;
	}
	public void setCountryEn(String countryEn) {
		this.countryEn = countryEn;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getIsDomestic() {
		return isDomestic;
	}
	public void setIsDomestic(String isDomestic) {
		this.isDomestic = isDomestic;
	}
	public String getSmscontent() {
		return smscontent;
	}
	public void setSmscontent(String smscontent) {
		this.smscontent = smscontent;
	}
	
}
