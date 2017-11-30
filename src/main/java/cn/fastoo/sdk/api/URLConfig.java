package cn.fastoo.sdk.api;
/**
 * 访问路径统一配置
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class URLConfig {
	/**
	 * 用户-获取用户信息
	 */
	public  static String GetUserApiURL="http://api.fastoo.cn/v1/user/get.json";
	/**
	 * 获取短信/语音价格
	 */
	public  static String GetQuotedPriceApiURL="http://api.fastoo.cn/v1/sys/getQuotedPrice.json";
	/**
	 * 获取账号ApiURL
	 */
	public  static String GetUserAccountsApiURL="http://api.fastoo.cn/v1/admin/getUserAccounts.json";
	/**
	 * 查询金额ApiURL
	 */
	public  static String GetUserBalanceApiURL="http://api.fastoo.cn/v1/admin/getUserBalance.json";
	/**
	 * 发送短信（单条）
	 */
	public  static String QuickSendSingleSmsApiURL="http://api.fastoo.cn/v1/admin/quickSendSingleSms.json";
	/**
	 * 发送短信
	 */
	public  static String SubmitApiURL="http://api.fastoo.cn/v1/submit.json";
	/**
	 *DR报告接口
	 */
	public  static String DRURL="***";
	/**
	 *获取签名报备接口
	 */
	public  static String SignatureSearchURL="http://api.fastoo.cn/v1/admin/signature.json";
	/**
	 *添加/修改签名报备接口
	 */
	public  static String SignatureSaveURL="http://api.fastoo.cn/v1/admin/signature/save.json";
	/**
	 *添加/修改签名报备接口
	 */
	public  static String SignatureDelURL="http://api.fastoo.cn/v1/admin/signature/del.json";
	/**
	 *获取模板报备接口
	 */
	public  static String TemplateSearchURL="http://api.fastoo.cn/v1/admin/template.json";
	/**
	 *添加/修改模板报备接口
	 */
	public  static String TemplateSaveURL="http://api.fastoo.cn/v1/admin/template/save.json";
	/**
	 *删除模板报备接口
	 */
	public  static String TemplateDelURL="http://api.fastoo.cn/v1/admin/template/del.json";
	/**
	 *获取APIKey接口
	 */
	public  static String APIKeySearchURL="http://api.fastoo.cn/v1/admin/apiKeys.json";
	/**
	 *添加APIKey接口
	 */
	public  static String APIKeyAddURL="http://api.fastoo.cn/v1/admin/apiKeys/save.json";
	/**
	 *修改APIKey接口
	 */
	public  static String APIKeyUpdateURL="http://api.fastoo.cn/v1/admin/apiKeys/saveDr.json";
	
	/**
	 *删除APIKey接口
	 */
	public  static String APIKeyDelURL="http://api.fastoo.cn/v1/admin/apiKeys/del.json";
	/**
	 * 批量发送短信ApiURL
	 */
	public  static String QuickSendBatchSmsApiURL="http://api.fastoo.cn/v1/admin/batch/submit.json";
	/**
	 *获取获取发送记录ApiURL
	 */
	public  static String SmsRecordsApiURL="http://api.fastoo.cn/v1/admin/records.json";
	/**
	 * 批量发送短信ApiURL
	 */
	public  static String SmsBatchRecordsApiURL="http://api.fastoo.cn/v1/admin/batch.json";
	/**
	 * 发送记录状态设置ApiURL
	 */
	public  static String SmsBatchStatusApiURL="http://api.fastoo.cn/v1/admin/batch/status.json";
	/**
	 * 发送记录状态设置ApiURL
	 */
	public  static String SmsExportRecordsApiURL="http://api.fastoo.cn/v1/admin/records/export.json";
	/**
	 *账户充值 ApiURL
	 */
	public  static String RechargeAlipayApiURL="http://api.fastoo.cn/v1/admin/recharge/alipay.json";
	/**
	 *获取充值记录ApiURL
	 */
	public  static String RechargeSearchApiURL="http://api.fastoo.cn/v1/admin/recharge.json";
	/**
	 *获取余额提醒ApiURL
	 */
	public  static String GetBalanceRemindInfoApiURL="http://api.fastoo.cn/v1/admin/getBalanceRemindInfo.json";
	/**
	 *获取余额提醒ApiURL
	 */
	public  static String SetBalanceRemindApiURL="http://api.fastoo.cn/v1/admin/setBalanceRemind.json";
	/**
	 * 获取IP白名单ApiURL
	 */
	public  static String WhiteIPSearchApiURL="http://api.fastoo.cn/v1/admin/iplist.json";
	/**
	 * 添加/修改IP白名单ApiURL
	 */
	public  static String WhiteIPSaveApiURL="http://api.fastoo.cn/v1/admin/iplist/save.json";

	/**
	 * 删除IP白名单ApiURL
	 */
	public  static String WhiteIPDelApiURL="http://api.fastoo.cn/v1/admin/iplist/del.json";
	/**
	 * 设置IP白名单保护ApiURL
	 */
	public  static String WhiteIPSwitchApiURL="http://api.fastoo.cn/v1/admin/iplist/switch.json";
	/**
	 * 获取IP白名单ApiURL
	 */
	public  static String BlackIPSearchApiURL="http://api.fastoo.cn/v1/admin/blacklist.json";
	/**
	 * 添加/修改黑名单ApiURL
	 */
	public  static String BlackIPSaveApiURL="http://api.fastoo.cn/v1/admin/blacklist/save.json";

	/**
	 * 删除IP黑名单ApiURL
	 */
	public  static String BlackIPDelApiURL="http://api.fastoo.cn/v1/admin/blacklist/del.json";
	/**
	 * 获取账号信息ApiURL
	 */
	public  static String GetUserInfoApiURL="http://api.fastoo.cn/v1/admin/getUserInfo.json";
	/**
	 * 设置账号信息ApiURL
	 */
	public  static String UpdateInfoApiURL="http://api.fastoo.cn/v1/admin/user/updateinfo.json";
	/**
	 * 修改密码ApiURL
	 */
	public  static String ChangePWDApiURL="http://api.fastoo.cn/v1/admin/user/changepwd.json";


}
