package com.fastoo.sdk.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
/**
 * 获取上月发送记录返回类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class SmsExportReordReturn extends ReturnModel{
	/**
	 * 详细记录
	 */
	private List<SmsSendRecordBean> list;
	public SmsExportReordReturn(String jsonstr) {
		super(jsonstr);
		if(this.getCode().equals(0)){
			JSONArray arr=this.getObj().getJSONObject("data").getJSONArray("list");
			this.list=new ArrayList<SmsSendRecordBean>();
			for(int i=0;i<arr.length();i++){
				SmsSendRecordBean bean=new SmsSendRecordBean();
				bean.setApiKey(arr.getJSONObject(i).getString("apiKey"));
				bean.setCountryCode(arr.getJSONObject(i).getString("countryCode"));
				bean.setDestAddr(arr.getJSONObject(i).getString("destAddr"));
				bean.setDrStatus(arr.getJSONObject(i).getInt("drStatus"));
				bean.setFeeCount(arr.getJSONObject(i).getInt("feeCount"));
				bean.setMsgContent(arr.getJSONObject(i).getString("msgContent"));
				bean.setMtStatus(arr.getJSONObject(i).getInt("mtStatus"));
				bean.setPrice(arr.getJSONObject(i).getDouble("price"));
				bean.setSubmitTime(arr.getJSONObject(i).getDouble("submitTime"));
				this.list.add(bean);
			}
		}
	}
	public List<SmsSendRecordBean> getList() {
		return list;
	}
	public void setList(List<SmsSendRecordBean> list) {
		this.list = list;
	}
	

	
}
