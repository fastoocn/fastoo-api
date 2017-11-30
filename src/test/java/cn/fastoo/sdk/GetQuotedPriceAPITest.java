package cn.fastoo.sdk;

import cn.fastoo.sdk.api.GetQuotedPriceAPI;
import cn.fastoo.sdk.model.QuotedPriceReturn;

/**
 * 测试-获取短信/语音价格
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class GetQuotedPriceAPITest {

	public static void main(String[] args) {
		QuotedPriceReturn bean=GetQuotedPriceAPI.GetQuotedPrice("China");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
				System.out.println("vtprice:"+bean.getVtprice());
				System.out.println("mtprice:"+bean.getMtprice());
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=GetQuotedPriceAPI.GetQuotedPrice("China1");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		System.out.println("vtprice:"+bean.getVtprice());
		System.out.println("mtprice:"+bean.getMtprice());
	}

}
