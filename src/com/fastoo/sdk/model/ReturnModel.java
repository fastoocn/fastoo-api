package com.fastoo.sdk.model;


import org.json.JSONObject;

/**
 * 返回模型的基础类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class ReturnModel {
	/**
	 * 返回的json对象
	 */
	private JSONObject obj;
	/**
	 * 返回编码
	 */
	private Integer code;
	/**
	 * 返回信息
	 */
	private String msg;
	/**
	 * 返回的json
	 */
	private String jsonstr;
	
	
	public ReturnModel(String jsonstr) {
		super();
		this.jsonstr = jsonstr;
		try{
			this.obj=new JSONObject(jsonstr);
			this.code=obj.getInt("code");
			this.msg=obj.getString("msg");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getJsonstr() {
		return jsonstr;
	}
	public void setJsonstr(String jsonstr) {
		this.jsonstr = jsonstr;
	}
	public JSONObject getObj() {
		return obj;
	}
	public void setObj(JSONObject obj) {
		this.obj = obj;
	}
	
	
}
