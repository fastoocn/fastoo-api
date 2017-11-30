package cn.fastoo.sdk.api;

import cn.fastoo.sdk.client.HttpPostClient;
import cn.fastoo.sdk.model.ReturnModel;
import cn.fastoo.sdk.model.SignatureReturn;
/**
 * 签名报备接口Api
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class SignatureApi {
	/**
	 * 获取签名报备查询
	 * @param apiKey  用户唯一标识
	 * @param signName 签名
	 * @return
	 */
	public  static SignatureReturn SignatureSearch(String apiKey,String signName ){
		String parmstr="apiKey="+apiKey+"&signName="+signName;
		if(signName==null||signName.equals("")){
			 parmstr="apiKey="+apiKey;
		}
		SignatureReturn bean=new SignatureReturn(HttpPostClient.sendPost(URLConfig.SignatureSearchURL,parmstr));
		return bean;
	}
	/**
	 * 添加/修改签名报备
	 * @param apiKey 用户唯一标识
	 * @param selectApiKey 账号（若该账号已存在，保存后会修改该账号对应的数据，并不会新增数据）
	 * @param signName 签名
	 * @return
	 */
	public  static ReturnModel SignatureSave(String apiKey,String selectApiKey,String signName ){
		String parmstr="apiKey="+apiKey+"&selectApiKey="+selectApiKey+"&signName="+signName;
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.SignatureSaveURL,parmstr));
		return bean;
	}
	/**
	 * 删除签名报备
	 * @param apiKey 用户唯一标识
	 * @param selectApiKey 账号（若该账号已存在，保存后会修改该账号对应的数据，并不会新增数据）
	 * @return
	 */
	public  static ReturnModel SignatureDel(String apiKey,String selectApiKey){
		String parmstr="apiKey="+apiKey+"&selectApiKey="+selectApiKey;
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.SignatureDelURL,parmstr));
		return bean;
	}
}
