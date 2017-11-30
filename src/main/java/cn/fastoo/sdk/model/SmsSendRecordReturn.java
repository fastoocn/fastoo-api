package cn.fastoo.sdk.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

/**
 * 发送记录返回类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class SmsSendRecordReturn extends ReturnModel {
	/**
	 * 查询的用户
	 */
	private String selectApiKey;
	/**
	 * 查询的发送开始时间
	 */
	private String createTimeEnd;
	/**
	 * 查询的发送结束时间
	 */
	private String createTimeStart;
	/**
	 * 查询的手机号码
	 */
	private String destAddr;
	/**
	 * 每页数据条数
	 */
	private Integer size;
	/**
	 * 总共有几页
	 */
	private Integer totalPages;
	/**
	 * 总共有几条
	 */
	private Integer totalElements;
	/**
	 * 详细记录
	 */
	private List<SmsSendRecordBean> smsrecords;
	
	public SmsSendRecordReturn(String jsonstr) {
		super(jsonstr);
		if(this.getCode().equals(0)){
			//成功
			System.out.println(jsonstr);
			if(this.getObj().getJSONObject("data").has("selectApiKey")) {
				this.setSelectApiKey(this.getObj().getJSONObject("data").getString("selectApiKey"));
			}
			this.setCreateTimeEnd(this.getObj().getJSONObject("data").getString("createTimeEnd"));
			this.setCreateTimeStart(this.getObj().getJSONObject("data").getString("createTimeStart"));
			if(this.getObj().getJSONObject("data").has("destAddr")) {
				this.setDestAddr(this.getObj().getJSONObject("data").getString("destAddr"));
			}
			this.setSize(this.getObj().getJSONObject("data").getInt("size"));
			this.setTotalPages(this.getObj().getJSONObject("data").getInt("totalPages"));
			this.setTotalElements(this.getObj().getJSONObject("data").getInt("totalElements"));
			JSONArray arr=this.getObj().getJSONObject("data").getJSONArray("smsrecords");
			this.smsrecords=new ArrayList<SmsSendRecordBean>();
			for(int i=0;i<arr.length();i++){
				SmsSendRecordBean bean=new SmsSendRecordBean();
				bean.setApiKey(arr.getJSONObject(i).getString("apiKey"));
				bean.setCountryCode(arr.getJSONObject(i).getString("countryCode"));
				bean.setDestAddr(arr.getJSONObject(i).getString("destAddr"));
				bean.setDrErrorcode(arr.getJSONObject(i).getString("drErrorcode"));
				bean.setDrStatus(arr.getJSONObject(i).getInt("drStatus"));
				bean.setDrStatuscode(arr.getJSONObject(i).getString("drStatuscode"));
				bean.setFeeCount(arr.getJSONObject(i).getInt("feeCount"));
				if(this.getObj().getJSONObject("data").has("localMsgid")) {
					bean.setLocalMsgid(arr.getJSONObject(i).getString("localMsgid"));
				}
				bean.setLoginName(arr.getJSONObject(i).getString("loginName"));
				bean.setMsgContent(arr.getJSONObject(i).getString("msgContent"));
				bean.setMtErrorcode(arr.getJSONObject(i).getString("mtErrorcode"));
				bean.setMtStatus(arr.getJSONObject(i).getInt("mtStatus"));
				bean.setMtStatuscode(arr.getJSONObject(i).getString("mtStatuscode"));
				bean.setPrice(arr.getJSONObject(i).getDouble("price"));
				bean.setSubmitTime(arr.getJSONObject(i).getDouble("submitTime"));
				this.smsrecords.add(bean);
			}
		}
	}

	public String getSelectApiKey() {
		return selectApiKey;
	}

	public void setSelectApiKey(String selectApiKey) {
		this.selectApiKey = selectApiKey;
	}

	public String getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public String getCreateTimeStart() {
		return createTimeStart;
	}

	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
	}

	public String getDestAddr() {
		return destAddr;
	}

	public void setDestAddr(String destAddr) {
		this.destAddr = destAddr;
	}

	public List<SmsSendRecordBean> getSmsrecords() {
		return smsrecords;
	}

	public void setSmsrecords(List<SmsSendRecordBean> smsrecords) {
		this.smsrecords = smsrecords;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}
	

}
