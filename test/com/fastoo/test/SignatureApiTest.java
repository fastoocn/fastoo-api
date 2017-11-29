package com.fastoo.test;

import com.fastoo.sdk.api.SignatureApi;
import com.fastoo.sdk.model.ReturnModel;
import com.fastoo.sdk.model.SignatureReturn;
/**
 * 测试--签名报备
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class SignatureApiTest {
	/**
	 * 获取签名报备
	 */
	public static void TestSearch(){
		System.out.println("===================测试查询========================");
		SignatureReturn bean=SignatureApi.SignatureSearch("a47dd09338834deda2e0e717a90e2cce", "");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
			for(int i=0;i<bean.getSignatureList().size();i++){
				System.out.println("详细数据："+Integer.valueOf(i+1));
				System.out.println("apiKey:"+bean.getSignatureList().get(i).getApiKey());
				System.out.println("signApplyTime:"+bean.getSignatureList().get(i).getSignApplyTime());
				System.out.println("signAuditTime:"+bean.getSignatureList().get(i).getSignAuditTime());
				System.out.println("signName:"+bean.getSignatureList().get(i).getSignName());
				System.out.println("signStatus:"+bean.getSignatureList().get(i).getSignStatus());
			}
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=SignatureApi.SignatureSearch("1111", "测试");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 * 添加/修改签名报备
	 */
	public static void TestSave(){
		System.out.println("===================测试添加/修改签名报备========================");
		ReturnModel bean=SignatureApi.SignatureSave("a47dd09338834deda2e0e717a90e2cce", "a47dd09338834deda2e0e717a90e2cce", "测试");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=SignatureApi.SignatureSave("111", "a47dd09338834deda2e0e717a90e2cce", "测试");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());

	}
	/**
	 * 删除签名报备
	 */
	public static void TestDel(){
		System.out.println("===================测试删除签名报备========================");
		ReturnModel bean=SignatureApi.SignatureDel("a47dd09338834deda2e0e717a90e2cce", "a47dd09338834deda2e0e717a90e2cce");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=SignatureApi.SignatureDel("111", "a47dd09338834deda2e0e717a90e2cce");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());

	}
	public static void main(String[] args) {
		
		SignatureApiTest.TestSearch();
//		SignatureApiTest.TestSave();
//		SignatureApiTest.TestDel();
	}
}
