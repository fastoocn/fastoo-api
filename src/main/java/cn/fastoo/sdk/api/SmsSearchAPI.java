package cn.fastoo.sdk.api;

import cn.fastoo.sdk.client.HttpPostClient;
import cn.fastoo.sdk.model.SmsBatchRecordReturn;
import cn.fastoo.sdk.model.SmsExportReordReturn;
import cn.fastoo.sdk.model.SmsSendRecordParm;
import cn.fastoo.sdk.model.SmsSendRecordReturn;
import cn.fastoo.sdk.util.StringUtil;

/**
 * 发送记录
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class SmsSearchAPI {
	/**
	 * 获取发送记录
	 * @param parm
	 * @return
	 */
	public static SmsSendRecordReturn records(SmsSendRecordParm parm){
		String parmstr="apiKey="+parm.getApiKey()+"&pageNo="+parm.getPageNo();
		if(StringUtil.IsNotNull(parm.getSelectApiKey())){
			parmstr+="&selectApiKey="+parm.getSelectApiKey();
		}
		if(StringUtil.IsNotNull(parm.getCreateTimeStart())){
			parmstr+="&createTimeStart="+parm.getCreateTimeStart();
		}
		if(StringUtil.IsNotNull(parm.getCreateTimeEnd())){
			parmstr+="&createTimeEnd="+parm.getCreateTimeEnd();
		}
		if(StringUtil.IsNotNull(parm.getDestAddr())){
			parmstr+="&destAddr="+parm.getDestAddr();
		}
		SmsSendRecordReturn bean=new SmsSendRecordReturn(HttpPostClient.sendPost(URLConfig.SmsRecordsApiURL,parmstr));
		return bean;
	}
	/**
	 * 获取批量发送记录
	 * @param apiKey 用户唯一标识
	 * @param batchName 批次名称
	 * @param submitTime 提交时间
	 * @return
	 */
	public static SmsBatchRecordReturn batchRecords(String apiKey,String batchName ,String submitTime){
		String parmstr="apiKey="+apiKey;
		if(StringUtil.IsNotNull(batchName)){
			parmstr+="&batchName="+batchName;
		}
		if(StringUtil.IsNotNull(submitTime)){
			parmstr+="&submitTime="+submitTime;
		}
		SmsBatchRecordReturn bean=new SmsBatchRecordReturn(HttpPostClient.sendPost(URLConfig.SmsBatchRecordsApiURL,parmstr));
		return bean;
	}
	/**
	 * 获取上月发送记录
	 * @param apiKey 用户唯一标识
	 * @return
	 */
	public static SmsExportReordReturn RecordEexport(String apiKey){
		String parmstr="apiKey="+apiKey;
		SmsExportReordReturn bean=new SmsExportReordReturn(HttpPostClient.sendPost(URLConfig.SmsExportRecordsApiURL,parmstr));
		return bean;
	}
}
