package com.fastoo.sdk.api;

import com.fastoo.sdk.client.HttpPostClient;
import com.fastoo.sdk.model.ApiKeyReturn;
import com.fastoo.sdk.model.ReturnModel;

/**
 * APIKey--Api
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class ApiKeysApi {
	/**
	 * 获取APIKey
	 * @param apiKey 用户唯一标识
	 * @param searchApiKey 账号
	 * @return
	 */
	public static ApiKeyReturn ApiKeysSearch(String apiKey,String searchApiKey){
		String parmstr="apiKey="+apiKey+"&searchApiKey="+searchApiKey;
		ApiKeyReturn bean=new ApiKeyReturn(HttpPostClient.sendPost(URLConfig.APIKeySearchURL,parmstr));
		return bean;
	}
	/**
	 * 添加APIKey
	 * @param apiKey 用户唯一标识
	 * @return
	 */
	public  static ReturnModel ApiKeysAdd(String apiKey){
		String parmstr="apiKey="+apiKey;
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.APIKeyAddURL,parmstr));
		return bean;
	}
	/**
	 * 修改APIKey
	 * @param apiKey 用户唯一标识
	 * @param userAccountId apiKey唯一标识
	 * @param drUrl DR路径
	 * @return
	 */
	public  static ReturnModel ApiKeysSaveDr(String apiKey,String userAccountId,String drUrl){
		String parmstr="apiKey="+apiKey+"&userAccountId="+userAccountId+"&drUrl="+drUrl;
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.APIKeyUpdateURL,parmstr));
		return bean;
	}
	/**
	 * 删除 APIKey
	 * @param apiKey 用户唯一标识
	 * @param userAccountId apiKey唯一标识
	 * @return
	 */
	public  static ReturnModel ApiKeysDel(String apiKey,String userAccountId){
		String parmstr="apiKey="+apiKey+"&userAccountId="+userAccountId;
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.APIKeyDelURL,parmstr));
		return bean;
	}
}
