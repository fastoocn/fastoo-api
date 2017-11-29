package com.fastoo.test;

import com.fastoo.sdk.api.ApiKeysApi;
import com.fastoo.sdk.model.ApiKeyReturn;
import com.fastoo.sdk.model.ReturnModel;
/**
 * 测试-ApiKeys
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class ApiKeysApiTest {
	/**
	 * 查询APIKey
	 */
	public static void TestApiKeysSearch(){
		System.out.println("===================测试查询========================");
		ApiKeyReturn bean=ApiKeysApi.ApiKeysSearch("a47dd09338834deda2e0e717a90e2cce", "");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
			for(int i=0;i<bean.getAPIKeyList().size();i++){
				System.out.println("详细数据："+Integer.valueOf(i+1));
				System.out.println("apiKey:"+bean.getAPIKeyList().get(i).getApiKey());
				System.out.println("drUrl:"+bean.getAPIKeyList().get(i).getDrUrl());
				System.out.println("id:"+bean.getAPIKeyList().get(i).getId());
			}
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=ApiKeysApi.ApiKeysSearch("1111", "测试");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	};
	/**
	 * 增加APIKey
	 */
	public static void TestApiKeysAdd(){
		System.out.println("===================测试添加ApiKeys========================");
		ReturnModel bean=ApiKeysApi.ApiKeysAdd("a47dd09338834deda2e0e717a90e2cce");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=ApiKeysApi.ApiKeysAdd("111");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	};
	/**
	 * 修改APIKey
	 */
	public static void TestApiKeysSaveDr(){
		System.out.println("===================测试修改ApiKeys========================");
		ReturnModel bean=ApiKeysApi.ApiKeysSaveDr("a47dd09338834deda2e0e717a90e2cce", "1", "http://test.heysky.com/dr");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=ApiKeysApi.ApiKeysSaveDr("111", "1", "http://test.heysky.com/dr");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	};
	/**
	 * 删除APIKey
	 */
	public static void TestApiKeysDel(){
		System.out.println("===================测试删除ApiKeys========================");
		ReturnModel bean=ApiKeysApi.ApiKeysDel("a47dd09338834deda2e0e717a90e2cce", "1");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=ApiKeysApi.ApiKeysDel("111", "1");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	};
	public static void main(String[] args) {
		ApiKeysApiTest.TestApiKeysSearch();
		ApiKeysApiTest.TestApiKeysAdd();
		ApiKeysApiTest.TestApiKeysSaveDr();
		ApiKeysApiTest.TestApiKeysDel();

	}

}
