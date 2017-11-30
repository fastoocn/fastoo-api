package cn.fastoo.sdk;

import cn.fastoo.sdk.api.BlackIPAPI;
import cn.fastoo.sdk.model.ReturnModel;
import cn.fastoo.sdk.model.BlackIPReturn;

/**
 * 测试-黑名单BlackIPAPI
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class BlackIPAPITest {
	/**
	 * 获取黑名单
	 */
	public static void TestBlackIPSearch(){
		System.out.println("===================测试查询========================");
		BlackIPReturn bean=BlackIPAPI.BlackIPSearch("a47dd09338834deda2e0e717a90e2cce", "");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
			for(int i=0;i<bean.getUserIplists().size();i++){
				System.out.println("详细数据："+Integer.valueOf(i+1));
				System.out.println("createTime:"+bean.getUserIplists().get(i).getCreateTime());
				System.out.println("id:"+bean.getUserIplists().get(i).getId());
				System.out.println("phone:"+bean.getUserIplists().get(i).getPhone());
				System.out.println("userName:"+bean.getUserIplists().get(i).getUserName());
			}
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=BlackIPAPI.BlackIPSearch("1111", "张三");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 *  添加/修改黑名单
	 */
	public static void TestBlackIPSave(){
		System.out.println("===================测试添加/修改IP黑名单========================");
		ReturnModel bean=BlackIPAPI.BlackIPSave("a47dd09338834deda2e0e717a90e2cce","13023815549","张三","1");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=BlackIPAPI.BlackIPSave("1111","13023815549","张三","1");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	/**
	 * 删除黑名单
	 */
	public static void TestBlackIPDel(){
		System.out.println("===================测试删除IP黑名单========================");
		ReturnModel bean=BlackIPAPI.BlackIPDel("a47dd09338834deda2e0e717a90e2cce", "1");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
		if(bean.getCode().equals(0)){
			System.out.println("访问成功==========》发送成功");
		}else{
			System.out.println("访问成功==========》发送失败：");
		}
		System.out.println("==========》访问失败：");
		bean=BlackIPAPI.BlackIPDel("111", "1");
		System.out.println("返回字符串："+bean.getJsonstr());
		System.out.println("code："+bean.getCode());
		System.out.println("msg："+bean.getMsg());
	}
	public static void main(String[] args) {

		BlackIPAPITest.TestBlackIPSearch();
		BlackIPAPITest.TestBlackIPSave();
		BlackIPAPITest.TestBlackIPDel();
	}
}
