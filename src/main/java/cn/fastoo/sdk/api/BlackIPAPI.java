package cn.fastoo.sdk.api;

import cn.fastoo.sdk.client.HttpPostClient;
import cn.fastoo.sdk.model.ReturnModel;
import cn.fastoo.sdk.model.BlackIPReturn;

/**
 * 黑名单
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class BlackIPAPI {
	/**
	 * 获取黑名单
	 * @param apiKey 用户唯一标识
	 * @param keyword 用户名或手机号码
	 * @return
	 */
	public static BlackIPReturn BlackIPSearch(String apiKey,String keyword){
		String parmstr="apiKey="+apiKey+"&keyword="+keyword;
		BlackIPReturn bean=new BlackIPReturn(HttpPostClient.sendPost(URLConfig.BlackIPSearchApiURL,parmstr));
		return bean;
	}
	/**
	 * 添加/修改黑名单
	 * @param apiKey 用户唯一标识
	 * @param phone 手机号码
	 * @param userName 用户名
	 * @param blacklistId 黑名单唯一标识（若值为空，为添加操作，否则就是修改操作）
	 * @return
	 */
	public  static ReturnModel BlackIPSave(String apiKey,String phone,String userName,String blacklistId){
		String parmstr="apiKey="+apiKey+"&phone="+phone+"&userName="+userName+"&blacklistId="+blacklistId;
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.BlackIPSaveApiURL,parmstr));
		return bean;
	}
	/**
	 *  删除黑名单
	 * @param apiKey 用户唯一标识
	 * @param blacklistId 黑名单唯一标识
	 * @return
	 */
	public  static ReturnModel BlackIPDel(String apiKey,String blacklistId){
		String parmstr="apiKey="+apiKey+"&blacklistId="+blacklistId;
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.BlackIPDelApiURL,parmstr));
		return bean;
	}
}
