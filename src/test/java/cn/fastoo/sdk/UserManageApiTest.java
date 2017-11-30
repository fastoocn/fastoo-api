package cn.fastoo.sdk;

import cn.fastoo.sdk.api.UserManageApi;
import cn.fastoo.sdk.model.ReturnModel;
import cn.fastoo.sdk.model.UserAccountsReturn;
import cn.fastoo.sdk.model.UserBalanceReturn;
import cn.fastoo.sdk.model.UserGetReturn;
import cn.fastoo.sdk.model.UserInfoParm;
import cn.fastoo.sdk.model.UserInfoReturn;
/**
 * 测试--获取账号Api
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class UserManageApiTest {
	/**
	 * 用户-获取用户信息Api
	 */
	public static void TestGetUser(){
		System.out.println("==========》访问成功：");
		UserGetReturn bean=UserManageApi.GetUser("13023813552","123456");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		System.out.println("返回数据：");
		if(bean.getCode().equals(0)){
			for(int i=0;i<bean.getApiKeyList().size();i++){
				System.out.println("apiKey："+bean.getApiKeyList().get(i));
			}
		}
		System.out.println("==========》访问失败：");
		bean=UserManageApi.GetUser("13023813552","1234567");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		System.out.println("返回数据：");
	}
	/**
	 * 调用获取账号Api
	 */
	public static void TestGetUserAccounts(){
		System.out.println("==========》访问成功：");
		UserAccountsReturn bean=UserManageApi.GetUserAccounts("a47dd09338834deda2e0e717a90e2cce");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		System.out.println("返回数据：");
		for(int i=0;i<bean.getUserAccounts().size();i++){
			System.out.println("apiKey："+bean.getUserAccounts().get(i));
		}
		System.out.println("==========》访问失败：");
		bean=UserManageApi.GetUserAccounts("111");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 *  查询余额Api
	 */
	public static void TestGetUserBalance(){
		System.out.println("==========》访问成功：");
		UserBalanceReturn bean=UserManageApi.GetUserBalance("a47dd09338834deda2e0e717a90e2cce");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		System.out.println("返回数据：");
		System.out.println("余额："+bean.getBalance());
		System.out.println("==========》访问失败：");
		bean=UserManageApi.GetUserBalance("111");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	
	/**
	 * 获取账号信息Api
	 */
	public static void TestGetUserInfo(){
		System.out.println("==========》访问成功：");
		UserInfoReturn bean=UserManageApi.GetUserInfo("a47dd09338834deda2e0e717a90e2cce");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		System.out.println("返回数据：");
		System.out.println("balance："+bean.getBalance());
		System.out.println("businessLicence："+bean.getBusinessLicence());
		System.out.println("businessLicenceImg："+bean.getBusinessLicenceImg());
		System.out.println("company："+bean.getCompany());
		System.out.println("idcard："+bean.getIdcard());
		System.out.println("industry："+bean.getIndustry());
		System.out.println("ipEnable："+bean.getIpEnable());
		System.out.println("loginName："+bean.getLoginName());
		System.out.println("realName："+bean.getRealName());
		System.out.println("userType："+bean.getUserType());
		System.out.println("==========》访问失败：");
		bean=UserManageApi.GetUserInfo("111");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 * 设置账号信息
	 */
	public static void TestUpdateUserInfo(){
		System.out.println("==========》访问成功：");
		UserInfoParm parm=new UserInfoParm("a47dd09338834deda2e0e717a90e2cce", "1", "daniel.company", "edu", "445381600190918",
				"ba781dc817a8cb3092c57b1e9201ad8a5ca89a57.png", "张三", "34759837573322");
		ReturnModel bean=UserManageApi.UpdateUserInfo(parm);
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		System.out.println("==========》访问失败：");
		parm=new UserInfoParm("1111", "1", "daniel.company", "edu", "445381600190918",
			"ba781dc817a8cb3092c57b1e9201ad8a5ca89a57.png", "张三", "34759837573322");
		bean=UserManageApi.UpdateUserInfo(parm);
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 *修改密码
	 */
	public static void TestChangePWD(){
		System.out.println("==========》访问成功：");
		ReturnModel bean=UserManageApi.ChangePWD("a47dd09338834deda2e0e717a90e2cce","123456", "asdfgh");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		System.out.println("==========》访问失败：");
		bean=UserManageApi.ChangePWD("1111","123456", "asdfgh");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	
	public static void main(String[] args) {
		UserManageApiTest.TestGetUser();
		UserManageApiTest.TestGetUserAccounts();
		UserManageApiTest.TestGetUserBalance();
		UserManageApiTest.TestChangePWD();
		UserManageApiTest.TestUpdateUserInfo();
		UserManageApiTest.TestGetUserInfo();
		
	}

}
