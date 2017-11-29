package com.fastoo.sdk.model;

/**
 * 查询余额接口返回类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class UserBalanceReturn extends ReturnModel {
	/**
	 * 余额
	 */
	private Double balance;
	/**
	 * 初始化
	 * @param jsonstr
	 */
	public UserBalanceReturn(String jsonstr) {
		super(jsonstr);
		if(this.getCode().equals(0)){
			//成功
			balance=this.getObj().getJSONObject("data").getDouble("balance");
		}
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	

}
