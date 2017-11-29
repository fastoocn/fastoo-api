package com.fastoo.sdk.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

/**
 * 获取用户信息返回类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class UserGetReturn extends ReturnModel{
	/**
	 * 登录账号
	 */
	private String loginName;
	/**
	 * 用户信息
	 */
	private List<String> apiKeyList;
	public UserGetReturn(String jsonstr) {
		super(jsonstr);
		if(this.getCode().equals(0)){
			//成功
			this.loginName=this.getObj().getJSONObject("data").getString("loginName");
			JSONArray arr=this.getObj().getJSONObject("data").getJSONArray("accounts");
			this.apiKeyList=new ArrayList<String>();
			for(int i=0;i<arr.length();i++){
				apiKeyList.add(arr.getJSONObject(i).getString("apiKey"));
			}
		}
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public List<String> getApiKeyList() {
		return apiKeyList;
	}
	public void setApiKeyList(List<String> apiKeyList) {
		this.apiKeyList = apiKeyList;
	}
	
	
}
