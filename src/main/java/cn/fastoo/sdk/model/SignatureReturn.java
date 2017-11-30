package cn.fastoo.sdk.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
/**
 * 获取设备报备返回类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class SignatureReturn extends ReturnModel {
	/**
	 * 返回签名报备列表
	 */
	public List<SignatureBean> SignatureList;
	/**
	 * 初始化
	 * @param jsonstr
	 */
	public SignatureReturn(String jsonstr) {
		super(jsonstr);
		if(this.getCode().equals(0)){
			//成功
			JSONArray arr=this.getObj().getJSONObject("data").getJSONArray("userSignatures");
			this.SignatureList=new ArrayList<SignatureBean>();
			for(int i=0;i<arr.length();i++){
				SignatureBean bean=new SignatureBean();
				bean.setApiKey(arr.getJSONObject(i).getString("apiKey"));
				if(!arr.getJSONObject(i).isNull("signApplyTime")){
					bean.setSignApplyTime(arr.getJSONObject(i).getDouble("signApplyTime"));
				}
				if(!arr.getJSONObject(i).isNull("signAuditTime")){
					bean.setSignAuditTime(arr.getJSONObject(i).getDouble("signAuditTime"));
				}
				bean.setSignName(arr.getJSONObject(i).getString("signName"));
				bean.setSignStatus(arr.getJSONObject(i).getInt("signStatus"));
				this.SignatureList.add(bean);
			}
		}
	}
	public List<SignatureBean> getSignatureList() {
		return SignatureList;
	}
	public void setSignatureList(List<SignatureBean> signatureList) {
		SignatureList = signatureList;
	}
	

}
