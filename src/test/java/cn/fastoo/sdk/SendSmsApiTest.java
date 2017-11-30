package cn.fastoo.sdk;

import cn.fastoo.sdk.api.SendSmsApi;
import cn.fastoo.sdk.model.SendSingleSmsParm;
import cn.fastoo.sdk.model.ReturnModel;
import cn.fastoo.sdk.model.SendBatchSmsParm;
/**
 * 测试--发送短信Api
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class SendSmsApiTest {
	/**
	 * 单条发送短信
	 */
	public static void TestQuickSendSingleSms(){
		SendSingleSmsParm parm=new SendSingleSmsParm("a47dd09338834deda2e0e717a90e2cce", "China", "15711586282", "domestic", "");
		ReturnModel bean=SendSmsApi.QuickSendSingleSms(parm);
		
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功：");
		}else{
			System.out.println("访问成功==========》发送失败");
			
		}
		System.out.println("==========》访问失败：");
		 parm=new SendSingleSmsParm("111", "China", "15711586282", "domestic", "");
		bean=SendSmsApi.QuickSendSingleSms(parm);
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 * 发送短信
	 */
	public static void TestSubmit(){
		ReturnModel bean=SendSmsApi.Submit("a47dd09338834deda2e0e717a90e2cce", "8615711586282,8613037372345", "您的验证码是421542");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=SendSmsApi.Submit("111", "8615711586282", "hello");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 * 平台批量发送短信
	 */
	public static void TestQuickSendBatchSms(){
		SendBatchSmsParm parm=new SendBatchSmsParm("a47dd09338834deda2e0e717a90e2cce","a47dd09338834deda2e0e717a90e2cce", 
				"20170822_test", "13788853675,13037372345", "abc", "2017-08-28 00:00");
		ReturnModel bean=SendSmsApi.QuickSendBatchSms(parm);
		
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功：");
		}else{
			System.out.println("访问成功==========》发送失败");
			
		}
		System.out.println("==========》访问失败：");
		parm=new SendBatchSmsParm("111", "a47dd09338834deda2e0e717a90e2cce",
				 "20170822_test", "13788853675,13037372345", "abc", "2017-08-28 00:00");
		bean=SendSmsApi.QuickSendBatchSms(parm);
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 * 发送记录状态设置
	 */
	public static void TestBatchStatus(){
		ReturnModel bean=SendSmsApi.BatchStatus("a47dd09338834deda2e0e717a90e2cce", "2", "1");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功：");
		}else{
			System.out.println("访问成功==========》发送失败");
		}
		System.out.println("==========》访问失败：");
		bean=SendSmsApi.BatchStatus("111", "1", "1");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	public static void main(String[] args) {

//		SendSmsApiTest.TestQuickSendSingleSms();
		SendSmsApiTest.TestSubmit();
//		SendSmsApiTest.TestQuickSendBatchSms();
//		SendSmsApiTest.TestBatchStatus();

	}
}
