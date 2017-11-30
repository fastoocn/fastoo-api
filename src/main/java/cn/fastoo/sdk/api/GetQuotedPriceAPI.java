package cn.fastoo.sdk.api;

import cn.fastoo.sdk.client.HttpPostClient;
import cn.fastoo.sdk.model.QuotedPriceReturn;

/**
 * 获取短信/语音价格
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class GetQuotedPriceAPI {
	/**
	 * 获取短信/语音价格
	 * @param country 国家唯一标识
	 * @return
	 */
	public static QuotedPriceReturn GetQuotedPrice(String country){
		String parmstr="country="+country;
		QuotedPriceReturn bean=new QuotedPriceReturn(HttpPostClient.sendPost(URLConfig.GetQuotedPriceApiURL,parmstr));
		return bean;
	}
}
