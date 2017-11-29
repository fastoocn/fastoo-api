package com.fastoo.sdk.util;
/**
 * 字符串工具类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class StringUtil {
	/**
	 * 不为空
	 * @param str
	 * @return
	 */
	public static boolean IsNotNull(String str){
		boolean check=true;
		if(str==null){
			return false;
		}
		if("".equals(str.trim())){
			return false;
		}
		return check;
	}
}
