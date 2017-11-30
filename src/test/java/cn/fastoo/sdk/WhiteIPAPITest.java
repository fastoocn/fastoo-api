package cn.fastoo.sdk;

import cn.fastoo.sdk.api.WhiteIPAPI;
import cn.fastoo.sdk.model.ReturnModel;
import cn.fastoo.sdk.model.WhiteIPReturn;

/**
 * 测试-白名单WhiteIPAPI
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class WhiteIPAPITest {
	/**
	 * 获取IP白名单
	 */
	public static void TestWhiteIPSearch(){
		System.out.println("===================测试查询========================");
		WhiteIPReturn bean=WhiteIPAPI.WhiteIPSearch("a47dd09338834deda2e0e717a90e2cce", "127.0.0.1");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
			for(int i=0;i<bean.getUserIplists().size();i++){
				System.out.println("详细数据："+Integer.valueOf(i+1));
				System.out.println("createTime:"+bean.getUserIplists().get(i).getCreateTime());
				System.out.println("id:"+bean.getUserIplists().get(i).getId());
				System.out.println("ip:"+bean.getUserIplists().get(i).getIp());
				System.out.println("remark:"+bean.getUserIplists().get(i).getRemark());
			}
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=WhiteIPAPI.WhiteIPSearch("1111", "127.0.0.1");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 *  添加/修改IP白名单
	 */
	public static void TestWhiteIPSave(){
		System.out.println("===================测试添加/修改IP白名单========================");
		ReturnModel bean=WhiteIPAPI.WhiteIPSave("a47dd09338834deda2e0e717a90e2cce","123.123.32.24","测试服务器");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=WhiteIPAPI.WhiteIPSave("1111","123.123.32.24","测试服务器");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 * 删除IP白名单
	 */
	public static void TestWhiteIPDel(){
		System.out.println("===================测试删除IP白名单========================");
		ReturnModel bean=WhiteIPAPI.WhiteIPDel("a47dd09338834deda2e0e717a90e2cce", "1");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=WhiteIPAPI.WhiteIPDel("111", "1");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 * 设置IP白名单保护
	 */
	public static void TestWhiteIPSwitch(){
		System.out.println("===================测试设置IP白名单保护========================");
		ReturnModel bean=WhiteIPAPI.WhiteIPSwitch("a47dd09338834deda2e0e717a90e2cce","1");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=WhiteIPAPI.WhiteIPSwitch("a47dd09338834deda2e0e717a90e2cce","1");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	public static void main(String[] args) {

		WhiteIPAPITest.TestWhiteIPSearch();
		WhiteIPAPITest.TestWhiteIPSave();
		WhiteIPAPITest.TestWhiteIPDel();
		WhiteIPAPITest.TestWhiteIPSwitch();
	}
}
