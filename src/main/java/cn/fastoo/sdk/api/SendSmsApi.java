package cn.fastoo.sdk.api;

import cn.fastoo.sdk.client.HttpPostClient;
import cn.fastoo.sdk.model.SendSingleSmsParm;
import cn.fastoo.sdk.model.ReturnModel;
import cn.fastoo.sdk.model.SendBatchSmsParm;

/**
 * 发送短信Api
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class SendSmsApi {
	/**
	 * 单条发送短信
	 * @param parm 参数
	 * @return
	 */
	public  static ReturnModel QuickSendSingleSms(SendSingleSmsParm parm){
		String parmstr="apiKey="+parm.getApiKey()+"&countryEn="+parm.getCountryEn()+"&mobile="+parm.getMobile()+"&"
				+ "isDomestic="+parm.getIsDomestic()+"&smscontent="+parm.getSmscontent();
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.QuickSendSingleSmsApiURL,parmstr));
		return bean;
	}
	/**
	 * 发送短信
	 * @param parm 参数
	 * @return
	 */
	public  static ReturnModel Submit(String apiKey, String da,String msg){
		String parmstr="apikey="+apiKey+"&da="+da+"&msg="+msg;
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.SubmitApiURL,parmstr));
		return bean;
	}
	/**
	 * 平台批量发送短信
	 * @param parm 参数
	 * @return
	 */
	public  static ReturnModel QuickSendBatchSms(SendBatchSmsParm parm){
		String parmstr="apiKey="+parm.getApiKey()+"&selectApiKey="+parm.getSelectApiKey()+"&batchName="+parm.getBatchName()+"&"
				+ "das="+parm.getDas()+"&msg="+parm.getMsg()+"&timing="+parm.getTiming();
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.QuickSendBatchSmsApiURL,parmstr));
		return bean;
	}
	/**
	 * 发送记录状态设置
	 * @param apiKey 用户唯一标识
	 * @param id  发送记录唯一标识
	 * @param status 发送状态(-1:取消，0:暂停，1:启动，2:已发送)
	 * @return
	 */
	public  static ReturnModel BatchStatus(String apiKey,String id,String status){
		String parmstr="apiKey="+apiKey+"&id="+id+"&status="+status;
		ReturnModel bean=new ReturnModel(HttpPostClient.sendPost(URLConfig.SmsBatchStatusApiURL,parmstr));
		return bean;
	}
}
