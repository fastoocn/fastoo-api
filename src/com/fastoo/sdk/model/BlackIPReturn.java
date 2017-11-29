package com.fastoo.sdk.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

/**
 * 黑名单返回类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class BlackIPReturn  extends ReturnModel{
	/**
	 * 返回白名单对象
	 */
	private List<BlackIPBean> userIplists;
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
	public BlackIPReturn(String jsonstr) {
		super(jsonstr);
		if(this.getCode().equals(0)){
			//成功

			this.setSize(this.getObj().getJSONObject("data").getInt("size"));
			this.setTotalPages(this.getObj().getJSONObject("data").getInt("totalPages"));
			this.setTotalElements(this.getObj().getJSONObject("data").getInt("totalElements"));
			JSONArray arr=this.getObj().getJSONObject("data").getJSONArray("blackList");
			this.userIplists=new ArrayList<BlackIPBean>();
			for(int i=0;i<arr.length();i++){
				BlackIPBean bean=new BlackIPBean();
				bean.setCreateTime(arr.getJSONObject(i).getDouble("createTime"));
				bean.setId(arr.getJSONObject(i).getInt("id"));
				bean.setPhone(arr.getJSONObject(i).getString("phone"));
				bean.setUserName(arr.getJSONObject(i).getString("userName"));
				this.userIplists.add(bean);
			}
		}
	}
	public List<BlackIPBean> getUserIplists() {
		return userIplists;
	}
	public void setUserIplists(List<BlackIPBean> userIplists) {
		this.userIplists = userIplists;
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
