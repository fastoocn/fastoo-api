package cn.fastoo.sdk;

import cn.fastoo.sdk.api.TemplateApi;
import cn.fastoo.sdk.model.ReturnModel;
import cn.fastoo.sdk.model.TemplateReturn;
/**
 * 测试--模板报备
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class TemplateApiTest {
	/**
	 * 获取模板报备
	 */
	public static void TestSearch(){
		System.out.println("===================测试查询========================");
		TemplateReturn bean=TemplateApi.TemplateSearch("a47dd09338834deda2e0e717a90e2cce", "",
				"", "0");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
			
			System.out.println("size："+bean.getSize());
			System.out.println("totalPages："+bean.getTotalPages());
			System.out.println("totalElements："+bean.getTotalElements());
			for(int i=0;i<bean.getTemplatelist().size();i++){
				System.out.println("详细数据："+Integer.valueOf(i+1));
				System.out.println("apiKey:"+bean.getTemplatelist().get(i).getApiKey());
				System.out.println("appUrl:"+bean.getTemplatelist().get(i).getAppUrl());
				System.out.println("applyTime:"+bean.getTemplatelist().get(i).getApplyTime());
				System.out.println("auditTime:"+bean.getTemplatelist().get(i).getAuditTime());
				System.out.println("id:"+bean.getTemplatelist().get(i).getId());
				System.out.println("reason:"+bean.getTemplatelist().get(i).getReason());
				System.out.println("state:"+bean.getTemplatelist().get(i).getState());
				System.out.println("templateContent:"+bean.getTemplatelist().get(i).getTemplateContent());
				System.out.println("templateType:"+bean.getTemplatelist().get(i).getTemplateType());
			}
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=TemplateApi.TemplateSearch("111", "a47dd09338834deda2e0e717a90e2cce","测试", "0");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 * 添加/修改模板报备
	 */
	public static void TestSave(){
		System.out.println("===================测试添加/修改模板报备========================");
		ReturnModel bean=TemplateApi.TemplateSave("a47dd09338834deda2e0e717a90e2cce", "1", "测试", 
				"7ae8a782847e49078a690df27e517fcf", "1", "http://service.blueorigintech.com/shs/wap/user/register");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=TemplateApi.TemplateSave("111", "1", "测试", 
				"7ae8a782847e49078a690df27e517fcf", "1", "http://service.blueorigintech.com/shs/wap/user/register");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());

	}
	/**
	 * 删除模板报备
	 */
	public static void TestDel(){
		System.out.println("===================测试删除模板报备========================");
		ReturnModel bean=TemplateApi.TemplateDel("a47dd09338834deda2e0e717a90e2cce", "442");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=TemplateApi.TemplateDel("111", "1");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());

	}
	public static void main(String[] args) {
		
		TemplateApiTest.TestSearch();
		TemplateApiTest.TestSave();
		TemplateApiTest.TestDel();
	}
}
