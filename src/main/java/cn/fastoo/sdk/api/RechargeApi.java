package cn.fastoo.sdk.api;

import cn.fastoo.sdk.client.HttpPostClient;
import cn.fastoo.sdk.model.RechargeAlipayReturn;
import cn.fastoo.sdk.model.RechargeReturn;

/**
 * 账户充值管理Api
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class RechargeApi {
	/**
	 * 账户充值
	 * @param apiKey 用户唯一标识
	 * @param money 充值金额
	 * @return
	 */
	public static RechargeAlipayReturn RechargeAlipay(String apiKey,String money){
		String parmstr="apiKey="+apiKey+"&money="+money;
		String str=HttpPostClient.sendPost(URLConfig.RechargeAlipayApiURL,parmstr);
		System.out.println(str);
		RechargeAlipayReturn bean=new RechargeAlipayReturn(str);
		return bean;
	}
	/**
	 * 获取充值记录
	 * @param apiKey 用户唯一标识
	 * @param pageNo 页码
	 * @return
	 */
	public static RechargeReturn RechargeSearch(String apiKey,String pageNo){
		String parmstr="apiKey="+apiKey+"&pageNo="+pageNo;
		RechargeReturn bean=new RechargeReturn(HttpPostClient.sendPost(URLConfig.RechargeSearchApiURL,parmstr));
		return bean;
	}
}
