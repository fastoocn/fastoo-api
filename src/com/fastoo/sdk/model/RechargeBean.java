package com.fastoo.sdk.model;
/**
 * 充值记录基础类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class RechargeBean {
	/**
	 * 充值时间
	 */
	private Double createTime;
	/**
	 * 充值记录唯一标识
	 */
	private Integer id;
	/**
	 * 充值流水号
	 */
	private String rechargeNo;
	/**
	 * 充值状态
	 */
	private Integer status;
	/**
	 * 充值金额
	 */
	private Double totalPrice;
	/**
	 * 交易号
	 */
	private String tradeNo;
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
	public String getRechargeNo() {
		return rechargeNo;
	}
	public void setRechargeNo(String rechargeNo) {
		this.rechargeNo = rechargeNo;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	
}
