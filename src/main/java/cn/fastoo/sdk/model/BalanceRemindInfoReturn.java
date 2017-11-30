package cn.fastoo.sdk.model;
/**
 * 获取余额提醒返回类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class BalanceRemindInfoReturn extends ReturnModel {
	/**
	 * 账号
	 */
	private String loginName;
	/**
	 * 提醒开始时间
	 */
	private String startTime;
	/**
	 * 提醒金额
	 */
	private Double remindBalance;
	/**
	 * 提醒结束时间
	 */
	private String endTime;
	public BalanceRemindInfoReturn(String jsonstr) {
		super(jsonstr);
		if(this.getCode().equals(0)){
			//成功
			this.loginName=this.getObj().getJSONObject("data").getString("loginName");
			this.startTime=this.getObj().getJSONObject("data").getString("startTime");
			this.remindBalance=this.getObj().getJSONObject("data").getDouble("remindBalance");
			this.endTime=this.getObj().getJSONObject("data").getString("endTime");
		}
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public Double getRemindBalance() {
		return remindBalance;
	}
	public void setRemindBalance(Double remindBalance) {
		this.remindBalance = remindBalance;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	

}
