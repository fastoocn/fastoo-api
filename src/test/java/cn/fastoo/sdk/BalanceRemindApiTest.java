package cn.fastoo.sdk;

import cn.fastoo.sdk.api.BalanceRemindApi;
import cn.fastoo.sdk.model.BalanceRemindInfoReturn;
import cn.fastoo.sdk.model.ReturnModel;
/**
 * 测试-余额提醒
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class BalanceRemindApiTest {
	/**
	 * 获取余额提醒
	 */
	public static void TestGetBalanceRemindInfo(){
		System.out.println("==========》访问成功：");
		BalanceRemindInfoReturn bean=BalanceRemindApi.GetBalanceRemindInfo("a47dd09338834deda2e0e717a90e2cce");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
			System.out.println("loginName："+bean.getLoginName());
			System.out.println("startTime："+bean.getStartTime());
			System.out.println("remindBalance："+bean.getRemindBalance());
			System.out.println("endTime："+bean.getEndTime());
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=BalanceRemindApi.GetBalanceRemindInfo("111");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 *设置余额提醒
	 */
	public static void TestSetBalanceRemind(){
		System.out.println("==========》访问成功：");
		ReturnModel bean=BalanceRemindApi.SetBalanceRemind("a47dd09338834deda2e0e717a90e2cce",
				"100", "12:00", "20:00");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		System.out.println("==========》访问失败：");
		bean=BalanceRemindApi.SetBalanceRemind("111","100", "12:00", "20:00");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalanceRemindApiTest.TestGetBalanceRemindInfo();
		BalanceRemindApiTest.TestSetBalanceRemind();
	}

}
