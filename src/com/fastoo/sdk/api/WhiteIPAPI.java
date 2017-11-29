package com.fastoo.sdk.api;

import com.fastoo.sdk.client.HttpPostClient;
import com.fastoo.sdk.model.ReturnModel;
import com.fastoo.sdk.model.WhiteIPReturn;

/**
 * 白名单
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class WhiteIPAPI {
	/**
	 * 获取IP白名单
	 * @param apiKey 用户唯一标识
	 * @param ip ip地址
	 * @return
	 */
	public static WhiteIPReturn WhiteIPSearch(String apiKey,String ip){
		String parmstr="apiKey="+apiKey+"&ip="+ip;
		WhiteIPReturn bean=new WhiteIPReturn(HttpPostClient.sendPost(URLConfig.WhiteIPSearchApiURL,parmstr));
		return bean;
	}
	/**
	 * 添加/修改IP白名单
	 * @param apiKey 用户唯一标识
	 * @param ip ip地址（若该ip已存在，保存后会修改该ip对应的数据，并不会新增数据）
	 * @param remark 备注
	 * @return
	 */
	public  static ReturnModel WhiteIPSave(String apiKey,String ip,String remark){
		String parmstr="apiKey="+apiKey+"&ip="+ip+"&remark="+remark;
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.WhiteIPSaveApiURL,parmstr));
		return bean;
	}
	/**
	 *  删除IP白名单
	 * @param apiKey 用户唯一标识
	 * @param delid 白名单唯一标识
	 * @return
	 */
	public  static ReturnModel WhiteIPDel(String apiKey,String delid){
		String parmstr="apiKey="+apiKey+"&delid="+delid;
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.WhiteIPDelApiURL,parmstr));
		return bean;
	}
	/**
	 * 设置IP白名单保护
	 * @param apiKey 用户唯一标识
	 * @param on 关闭/开启白名单保护(0:关闭，1:开启)
	 * @return
	 */
	public  static ReturnModel WhiteIPSwitch(String apiKey,String on){
		String parmstr="apiKey="+apiKey+"&on="+on;
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.WhiteIPSwitchApiURL,parmstr));
		return bean;
	}
}
