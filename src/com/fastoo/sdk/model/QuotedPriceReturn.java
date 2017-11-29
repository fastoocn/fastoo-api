package com.fastoo.sdk.model;
/**
 *获取短信/语音价格基础类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class QuotedPriceReturn extends ReturnModel {
	/**
	 * 语音价格
	 */
	private Double vtprice;
	/**
	 * 短信价格
	 */
	private Double mtprice;
	public QuotedPriceReturn(String jsonstr) {
		super(jsonstr);
		if(this.getCode().equals(Integer.valueOf(0))){
			//成功
			try{
				this.vtprice=this.getObj().getJSONObject("data").getDouble("vtprice");
			}catch(Exception e){
				
			}
			try{
				this.mtprice=this.getObj().getJSONObject("data").getDouble("mtprice");
			}catch(Exception e){
				
			}
			
		}
	}
	public Double getVtprice() {
		return vtprice;
	}
	public void setVtprice(Double vtprice) {
		this.vtprice = vtprice;
	}
	public Double getMtprice() {
		return mtprice;
	}
	public void setMtprice(Double mtprice) {
		this.mtprice = mtprice;
	}
	

}
