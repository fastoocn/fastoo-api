package cn.fastoo.sdk.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

/**
 * 批量发送记录返回类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class SmsBatchRecordReturn extends ReturnModel {
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
	private List<SmsBatchRecordBean> batchDtos;
	/**
	 * 初始化
	 * @param jsonstr
	 */
	public SmsBatchRecordReturn(String jsonstr) {
		super(jsonstr);
		if(this.getCode().equals(0)){
			//成功
			this.setSize(this.getObj().getJSONObject("data").getInt("size"));
			this.setTotalPages(this.getObj().getJSONObject("data").getInt("totalPages"));
			this.setTotalElements(this.getObj().getJSONObject("data").getInt("totalElements"));
			JSONArray arr=this.getObj().getJSONObject("data").getJSONArray("batchDtos");
			this.batchDtos=new ArrayList<SmsBatchRecordBean>();
			for(int i=0;i<arr.length();i++){
				SmsBatchRecordBean bean=new SmsBatchRecordBean();
				bean.setApiKey(arr.getJSONObject(i).getString("apiKey"));
				bean.setBatchName(arr.getJSONObject(i).getString("batchName"));
				bean.setContent(arr.getJSONObject(i).getString("content"));
				bean.setId(arr.getJSONObject(i).getInt("id"));
				if(arr.getJSONObject(i).has("sendFailNum")) {
					try {
						bean.setSendFailNum(arr.getJSONObject(i).getInt("sendFailNum"));
					}catch(Exception e){
						
					}
				}
				if(arr.getJSONObject(i).has("sendSuccessNum")) {
					try {
						bean.setSendSuccessNum(arr.getJSONObject(i).getInt("sendSuccessNum"));
					}catch(Exception e){
						
					}
				}
				bean.setStatus(arr.getJSONObject(i).getInt("status"));
				bean.setSubmitTime(arr.getJSONObject(i).getDouble("submitTime"));
				bean.setSubmitTimeDt(arr.getJSONObject(i).getDouble("submitTimeDt"));
				if(arr.getJSONObject(i).has("timing")) {
					try {
						bean.setTiming(arr.getJSONObject(i).getDouble("timing"));
					}catch(Exception e){
						
					}
				}
				bean.setTotalNum(arr.getJSONObject(i).getInt("totalNum"));
				if(arr.getJSONObject(i).has("unSendNum")) {
					try {
						bean.setUnSendNum(arr.getJSONObject(i).getInt("unSendNum"));
					}catch(Exception e){
						
					}
				}
				bean.setTotalNum(arr.getJSONObject(i).getInt("userBaseId"));
				this.batchDtos.add(bean);
			}
		}
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
	public List<SmsBatchRecordBean> getBatchDtos() {
		return batchDtos;
	}
	public void setBatchDtos(List<SmsBatchRecordBean> batchDtos) {
		this.batchDtos = batchDtos;
	}
	

}
