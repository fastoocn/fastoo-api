package com.fastoo.sdk.api;

import com.fastoo.sdk.client.HttpPostClient;
import com.fastoo.sdk.model.ReturnModel;
import com.fastoo.sdk.model.TemplateReturn;
/**
 * 模板报备接口Api
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class TemplateApi {
	/**
	 * 获取模板报备
	 * @param apiKey 用户唯一标识
	 * @param searchApiKey 账号
	 * @param keyword 模板内容
	 * @param pageNo 第几页（0表示第一页，以此类推）
	 * @return
	 */
	public  static TemplateReturn TemplateSearch(String apiKey,String searchApiKey,String keyword,String pageNo ){
		String parmstr="apiKey="+apiKey+"&searchApiKey="+searchApiKey+"&keyword="+keyword+"&pageNo="+pageNo;
		TemplateReturn bean=new TemplateReturn(HttpPostClient.sendPost(URLConfig.TemplateSearchURL,parmstr));
		return bean;
	}
	/**
	 * 添加/修改模板报备
	 * @param apiKey 用户唯一标识
	 * @param templateType 模板类型（1:验证码类，2:通知类，3:营销类）
	 * @param templateContent 模板内容
	 * @param selectApiKey 账号
	 * @param templateId 模板唯一标识（若值为空，为添加操作，否则就是修改操作）
	 * @param appUrl app地址（若模板类型为验证码类，值不能为空）
	 * @return
	 */
	public  static ReturnModel TemplateSave(String apiKey,String templateType,String templateContent,String selectApiKey,
			String templateId,String appUrl){
		String parmstr="apiKey="+apiKey+"&templateType="+templateType+"&templateContent="+templateContent
				+"&selectApiKey="+selectApiKey+"&templateId="+templateId+"&appUrl="+appUrl;
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.TemplateSaveURL,parmstr));
		return bean;
	}
	/**
	 * 删除模板报备
	 * @param apiKey 用户唯一标识
	 * @param templateId 模板唯一标识
	 * @return
	 */
	public  static ReturnModel TemplateDel(String apiKey,String templateId){
		String parmstr="apiKey="+apiKey+"&templateId="+templateId;
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.TemplateDelURL,parmstr));
		return bean;
	}
}
