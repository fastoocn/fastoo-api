package cn.fastoo.sdk.api;

import cn.fastoo.sdk.client.HttpPostClient;
import cn.fastoo.sdk.model.ReturnModel;
import cn.fastoo.sdk.model.UserAccountsReturn;
import cn.fastoo.sdk.model.UserBalanceReturn;
import cn.fastoo.sdk.model.UserGetReturn;
import cn.fastoo.sdk.model.UserInfoParm;
import cn.fastoo.sdk.model.UserInfoReturn;
import cn.fastoo.sdk.util.StringUtil;

/**
 * 获取账号Api
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class UserManageApi {
	/**
	 * 用户-获取用户信息Api
	 * @param apiKey 用户唯一标识
	 * @return UserAccountsReturn 返回账号
	 */
	public static UserGetReturn GetUser(String loginName,String password){
		String parmstr="loginName="+loginName+"&password="+password;
		UserGetReturn bean=new UserGetReturn(HttpPostClient.sendPost(URLConfig.GetUserApiURL,parmstr));
		return bean;
	}
	/**
	 * 调用获取账号Api
	 * @param apiKey 用户唯一标识
	 * @return UserAccountsReturn 返回账号
	 */
	public static UserAccountsReturn GetUserAccounts(String apiKey){
		UserAccountsReturn bean=new UserAccountsReturn(HttpPostClient.sendPost(URLConfig.GetUserAccountsApiURL, "apiKey="+apiKey));
		return bean;
	}
	/**
	 *  查询余额Api
	 * @param apiKey 用户唯一标识
	 * @return UserBalanceReturn 返回账号
	 */
	public static UserBalanceReturn GetUserBalance(String apiKey){
		UserBalanceReturn bean=new UserBalanceReturn(HttpPostClient.sendPost(URLConfig.GetUserBalanceApiURL, "apiKey="+apiKey));
		return bean;
	}
	/**
	 * 获取账号信息
	 * @param apiKey 用户唯一标识
	 * @return
	 */
	public static UserInfoReturn GetUserInfo(String apiKey){
		String parmstr="apiKey="+apiKey;
		UserInfoReturn bean=new UserInfoReturn(HttpPostClient.sendPost(URLConfig.GetUserInfoApiURL,parmstr));
		return bean;
	}
	/**
	 * 设置账号信息
	 * @param parm
	 * @return
	 */
	public static ReturnModel UpdateUserInfo(UserInfoParm parm){
		String parmstr="apiKey="+parm.getApiKey()+"&userType="+parm.getUserType();
		if(StringUtil.IsNotNull(parm.getCompany())){
			parmstr+="&company="+parm.getCompany();
		}
		if(StringUtil.IsNotNull(parm.getIndustry())){
			parmstr+="&industry="+parm.getIndustry();
		}
		if(StringUtil.IsNotNull(parm.getBusinessLicence())){
			parmstr+="&businessLicence="+parm.getBusinessLicence();
		}
		if(StringUtil.IsNotNull(parm.getBusinessLicenceImg())){
			parmstr+="&businessLicenceImg="+parm.getBusinessLicenceImg();
		}
		if(StringUtil.IsNotNull(parm.getRealName())){
			parmstr+="&realName="+parm.getRealName();
		}
		if(StringUtil.IsNotNull(parm.getIdcard())){
			parmstr+="&idcard="+parm.getIdcard();
		}
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.UpdateInfoApiURL,parmstr));
		return bean;
	}
	/**
	 * 修改密码
	 * @param apiKey 用户唯一标识
	 * @param oldpwd 原密码
	 * @param newpwd 新密码
	 * @return
	 */
	public static ReturnModel ChangePWD(String apiKey,String oldpwd,String newpwd){
		String parmstr="apiKey="+apiKey+"&oldpwd="+oldpwd+"&newpwd="+newpwd;
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.ChangePWDApiURL,parmstr));
		return bean;
	}
}
