package com.fastoo.sdk.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

/**
 * 白名单返回类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class WhiteIPReturn  extends ReturnModel{
	/**
	 * 返回白名单对象
	 */
	private List<WhiteIPBean> userIplists;
	public WhiteIPReturn(String jsonstr) {
		super(jsonstr);
		if(this.getCode().equals(0)){
			//成功
			JSONArray arr=this.getObj().getJSONObject("data").getJSONArray("userIplists");
			this.userIplists=new ArrayList<WhiteIPBean>();
			for(int i=0;i<arr.length();i++){
				WhiteIPBean bean=new WhiteIPBean();
				bean.setCreateTime(arr.getJSONObject(i).getDouble("createTime"));
				bean.setId(arr.getJSONObject(i).getInt("id"));
				bean.setIp(arr.getJSONObject(i).getString("ip"));
				bean.setRemark(arr.getJSONObject(i).getString("remark"));
				this.userIplists.add(bean);
			}
		}
	}
	public List<WhiteIPBean> getUserIplists() {
		return userIplists;
	}
	public void setUserIplists(List<WhiteIPBean> userIplists) {
		this.userIplists = userIplists;
	}
	
}
