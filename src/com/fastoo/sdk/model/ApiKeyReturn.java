package com.fastoo.sdk.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
/**
 * APIKey返回类类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class ApiKeyReturn extends ReturnModel {
	

	/**
	 * 返回API Key列表
	 */
	private List<ApiKeyBean> APIKeyList;
	/**
	 * 初始化
	 * @param jsonstr
	 */
	public ApiKeyReturn(String jsonstr) {
		super(jsonstr);
		if(this.getCode().equals(0)){
			//成功
			JSONArray arr=this.getObj().getJSONObject("data").getJSONArray("userApiKeys");
			this.APIKeyList=new ArrayList<ApiKeyBean>();
			for(int i=0;i<arr.length();i++){
				ApiKeyBean bean=new ApiKeyBean();
				bean.setApiKey(arr.getJSONObject(i).getString("apiKey"));
				bean.setDrUrl(arr.getJSONObject(i).getString("drUrl"));
				bean.setId(arr.getJSONObject(i).getInt("id"));
				this.APIKeyList.add(bean);
			}
		}
	}
	public List<ApiKeyBean> getAPIKeyList() {
		return APIKeyList;
	}
	public void setAPIKeyList(List<ApiKeyBean> aPIKeyList) {
		APIKeyList = aPIKeyList;
	}
	
}
