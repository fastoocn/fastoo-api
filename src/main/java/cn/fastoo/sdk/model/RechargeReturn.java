package cn.fastoo.sdk.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

/**
 * 账户充值返回类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class RechargeReturn extends ReturnModel {
	/**
	 * 每页数据条数
	 */
	private Integer size;
	/**
	 * 总共有几页
	 */
	private Integer totalPages;
	/**
	 * 总共有几条
	 */
	private Integer totalElements;
	/**
	 * 返回记录
	 */
	private List<RechargeBean> recharges;
	public RechargeReturn(String jsonstr) {
		super(jsonstr);
		if(this.getCode().equals(0)){
			//成功
			JSONArray arr=this.getObj().getJSONObject("data").getJSONArray("recharges");
			this.setSize(this.getObj().getJSONObject("data").getInt("size"));
			this.setTotalPages(this.getObj().getJSONObject("data").getInt("totalPages"));
			this.setTotalElements(this.getObj().getJSONObject("data").getInt("totalElements"));
			this.recharges=new ArrayList<RechargeBean>();
			for(int i=0;i<arr.length();i++){
				RechargeBean bean=new RechargeBean();
				bean.setCreateTime(arr.getJSONObject(i).getDouble("createTime"));
				bean.setId(arr.getJSONObject(i).getInt("id"));
				bean.setRechargeNo(arr.getJSONObject(i).getString("rechargeNo"));
				bean.setStatus(arr.getJSONObject(i).getInt("status"));
				bean.setTotalPrice(arr.getJSONObject(i).getDouble("totalPrice"));
				bean.setTradeNo(arr.getJSONObject(i).getString("tradeNo"));
				this.recharges.add(bean);
			}
		}
	}
	public List<RechargeBean> getRecharges() {
		return recharges;
	}
	public void setRecharges(List<RechargeBean> recharges) {
		this.recharges = recharges;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	public Integer getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}
	

}
