package com.fastoo.test;

import com.fastoo.sdk.api.SmsSearchAPI;
import com.fastoo.sdk.model.SmsBatchRecordReturn;
import com.fastoo.sdk.model.SmsExportReordReturn;
import com.fastoo.sdk.model.SmsSendRecordParm;
import com.fastoo.sdk.model.SmsSendRecordReturn;

/**
 * 测试-发送记录
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class SmsSearchAPITest {
	/**
	 * 测试-获取发送记录
	 */
	public static void Testrecords(){
		System.out.println("===================测试查询========================");
		SmsSendRecordParm parm=new SmsSendRecordParm("a47dd09338834deda2e0e717a90e2cce", "",
				"", "", "", "0");
		SmsSendRecordReturn bean=SmsSearchAPI.records(parm);
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
			System.out.println("selectApiKey："+bean.getSelectApiKey());
			System.out.println("createTimeEnd："+bean.getCreateTimeEnd());
			System.out.println("createTimeStart："+bean.getCreateTimeStart());
			System.out.println("destAddr："+bean.getDestAddr());
			System.out.println("size："+bean.getSize());
			System.out.println("totalPages："+bean.getTotalPages());
			System.out.println("totalElements："+bean.getTotalElements());
			for(int i=0;i<bean.getSmsrecords().size();i++){
				System.out.println("详细数据："+Integer.valueOf(i+1));
				System.out.println("apiKey:"+bean.getSmsrecords().get(i).getApiKey());
				System.out.println("countryCode:"+bean.getSmsrecords().get(i).getCountryCode());
				System.out.println("destAddr:"+bean.getSmsrecords().get(i).getDestAddr());
				System.out.println("drErrorcode:"+bean.getSmsrecords().get(i).getDrErrorcode());
				System.out.println("drStatus:"+bean.getSmsrecords().get(i).getDrStatus());
				System.out.println("drStatuscode:"+bean.getSmsrecords().get(i).getDrStatuscode());
				System.out.println("feeCount:"+bean.getSmsrecords().get(i).getFeeCount());
				System.out.println("localMsgid:"+bean.getSmsrecords().get(i).getLocalMsgid());
				System.out.println("loginName:"+bean.getSmsrecords().get(i).getLoginName());
				System.out.println("msgContent:"+bean.getSmsrecords().get(i).getMsgContent());
				System.out.println("mtErrorcode:"+bean.getSmsrecords().get(i).getMtErrorcode());
				System.out.println("mtStatus:"+bean.getSmsrecords().get(i).getMtStatus());
				System.out.println("mtStatuscode:"+bean.getSmsrecords().get(i).getMtStatuscode());
				System.out.println("price:"+bean.getSmsrecords().get(i).getPrice());
				System.out.println("submitTime:"+bean.getSmsrecords().get(i).getSubmitTime());
			}
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		parm=new SmsSendRecordParm("111", "a47dd09338834deda2e0e717a90e2cce","2017-08-22 00:00:00", "2017-08-28 23:59:59", "13045377878", "0");
		bean=SmsSearchAPI.records(parm);
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 * 测试-获取批量发送记录
	 */
	public static void TestbatchRecords(){
		System.out.println("===================测试查询========================");
		SmsBatchRecordReturn bean=SmsSearchAPI.batchRecords("a47dd09338834deda2e0e717a90e2cce", "", "");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
			System.out.println("size："+bean.getSize());
			System.out.println("totalPages："+bean.getTotalPages());
			System.out.println("totalElements："+bean.getTotalElements());
			for(int i=0;i<bean.getBatchDtos().size();i++){
				System.out.println("详细数据："+Integer.valueOf(i+1));
				System.out.println("apiKey:"+bean.getBatchDtos().get(i).getApiKey());
				System.out.println("batchName:"+bean.getBatchDtos().get(i).getBatchName());
				System.out.println("content:"+bean.getBatchDtos().get(i).getContent());
				System.out.println("id:"+bean.getBatchDtos().get(i).getId());
				System.out.println("sendFailNum:"+bean.getBatchDtos().get(i).getSendFailNum());
				System.out.println("sendSuccessNum:"+bean.getBatchDtos().get(i).getSendSuccessNum());
				System.out.println("status:"+bean.getBatchDtos().get(i).getStatus());
				System.out.println("submitTime:"+bean.getBatchDtos().get(i).getSubmitTime());
				System.out.println("submitTimeDt:"+bean.getBatchDtos().get(i).getSubmitTimeDt());
				System.out.println("timing:"+bean.getBatchDtos().get(i).getTiming());
				System.out.println("totalNum:"+bean.getBatchDtos().get(i).getTotalNum());
				System.out.println("unSendNum:"+bean.getBatchDtos().get(i).getUnSendNum());
				System.out.println("userBaseId:"+bean.getBatchDtos().get(i).getUserBaseId());
			}
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=SmsSearchAPI.batchRecords("111", "", "2017-08-22");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 * 测试-获取上月发送记录
	 */
	public static void TestRecordEexport(){
		System.out.println("===================测试查询========================");
		SmsExportReordReturn bean=SmsSearchAPI.RecordEexport("a47dd09338834deda2e0e717a90e2cce");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
			for(int i=0;i<bean.getList().size();i++){
				System.out.println("详细数据："+Integer.valueOf(i+1));
				System.out.println("apiKey:"+bean.getList().get(i).getApiKey());
				System.out.println("countryCode:"+bean.getList().get(i).getCountryCode());
				System.out.println("destAddr:"+bean.getList().get(i).getDestAddr());
				System.out.println("drStatus:"+bean.getList().get(i).getDrStatus());
				System.out.println("feeCount:"+bean.getList().get(i).getFeeCount());
				System.out.println("msgContent:"+bean.getList().get(i).getMsgContent());
				System.out.println("mtStatus:"+bean.getList().get(i).getMtStatus());
				System.out.println("price:"+bean.getList().get(i).getPrice());
				System.out.println("submitTime:"+bean.getList().get(i).getSubmitTime());
			}
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=SmsSearchAPI.RecordEexport("111");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SmsSearchAPITest.Testrecords();
		SmsSearchAPITest.TestbatchRecords();
		SmsSearchAPITest.TestRecordEexport();

	}

}
