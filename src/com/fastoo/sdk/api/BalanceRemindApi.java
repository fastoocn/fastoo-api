package com.fastoo.sdk.api;

import com.fastoo.sdk.client.HttpPostClient;
import com.fastoo.sdk.model.BalanceRemindInfoReturn;
import com.fastoo.sdk.model.ReturnModel;
/**
 * 余额提醒Api
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class BalanceRemindApi {
	
	/**
	 * 获取余额提醒
	 * @param apiKey 用户唯一标识
	 * @return
	 */
	public static BalanceRemindInfoReturn GetBalanceRemindInfo(String apiKey){
		String parmstr="apiKey="+apiKey;
		BalanceRemindInfoReturn bean=new BalanceRemindInfoReturn(HttpPostClient.sendPost(URLConfig.GetBalanceRemindInfoApiURL,parmstr));
		return bean;
	}
	/**
	 * 设置余额提醒
	 * @param apiKey 用户唯一标识
	 * @param remindBalance 提醒金额
	 * @param startTime 提醒开始时间
	 * @param endTime 提醒结束时间
	 * @return
	 */
	public static ReturnModel SetBalanceRemind(String apiKey,String remindBalance,String startTime,String endTime){
		String parmstr="apiKey="+apiKey+"&remindBalance="+remindBalance+"&startTime="+startTime+"&endTime="+endTime;
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.SetBalanceRemindApiURL,parmstr));
		return bean;
	}
}
