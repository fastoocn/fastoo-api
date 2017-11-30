package cn.fastoo.sdk;

import cn.fastoo.sdk.api.RechargeApi;
import cn.fastoo.sdk.model.RechargeAlipayReturn;
import cn.fastoo.sdk.model.RechargeReturn;

/**
 * 测试账户充值管理Api
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class RechargeApiTest {

	/**
	 *  账户充值Api
	 */
	public static void TestRechargeAlipay(){
		System.out.println("==========》访问成功：");
		RechargeAlipayReturn bean=RechargeApi.RechargeAlipay("a47dd09338834deda2e0e717a90e2cce", "100");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		System.out.println("textHtml："+bean.getTextHtml());
		System.out.println("==========》访问失败：");
		bean=RechargeApi.RechargeAlipay("111", "100");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 *  获取充值记录Api
	 */
	public static void TestRechargeSearch(){
		System.out.println("==========》访问成功：");
		RechargeReturn bean=RechargeApi.RechargeSearch("a47dd09338834deda2e0e717a90e2cce", "0");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
			System.out.println("size："+bean.getSize());
			System.out.println("totalPages："+bean.getTotalPages());
			System.out.println("totalElements："+bean.getTotalElements());
			for(int i=0;i<bean.getRecharges().size();i++){
				System.out.println("详细数据："+Integer.valueOf(i+1));
				System.out.println("createTime:"+bean.getRecharges().get(i).getCreateTime());
				System.out.println("id:"+bean.getRecharges().get(i).getId());
				System.out.println("rechargeNo:"+bean.getRecharges().get(i).getRechargeNo());
				System.out.println("status:"+bean.getRecharges().get(i).getStatus());
				System.out.println("totalPrice:"+bean.getRecharges().get(i).getTotalPrice());
				System.out.println("tradeNo:"+bean.getRecharges().get(i).getTradeNo());
			}
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=RechargeApi.RechargeSearch("111", "0");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	public static void main(String[] args) {
		RechargeApiTest.TestRechargeAlipay();
		RechargeApiTest.TestRechargeSearch();
	}

}
