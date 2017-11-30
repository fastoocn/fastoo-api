package cn.fastoo.sdk.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
/**
 * 获取账号接口返回类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class UserAccountsReturn extends ReturnModel{
	/**
	 * 所有账号信息
	 */
	private List<String> userAccounts;
	public UserAccountsReturn(String jsonstr) {
		super(jsonstr);
		if(this.getCode().equals(0)){
			//成功
			JSONArray arr=this.getObj().getJSONObject("data").getJSONArray("userAccounts");
			this.userAccounts=new ArrayList<String>();
			for(int i=0;i<arr.length();i++){
				this.userAccounts.add(arr.getJSONObject(i).getString("apiKey"));
			}
		}
	}

	public List<String> getUserAccounts() {
		return userAccounts;
	}

	public void setUserAccounts(List<String> userAccounts) {
		this.userAccounts = userAccounts;
	}
	
}
