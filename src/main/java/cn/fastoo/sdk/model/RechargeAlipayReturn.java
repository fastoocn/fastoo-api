package cn.fastoo.sdk.model;
/**
 * 账户充值返回基础类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class RechargeAlipayReturn extends ReturnModel{
	/**
	 * 返回的html
	 */
	private String textHtml;
	public RechargeAlipayReturn(String jsonstr) {
		super(jsonstr);
		if(this.getCode().equals(0)){
			//成功
			textHtml=this.getObj().getJSONObject("data").getString("textHtml");
		}
	}
	public String getTextHtml() {
		return textHtml;
	}
	public void setTextHtml(String textHtml) {
		this.textHtml = textHtml;
	}
	

}
