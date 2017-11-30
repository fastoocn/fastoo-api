package cn.fastoo.sdk.model;
/**
 * 白名单基础类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class WhiteIPBean {
	/**
	 * 添加时间
	 */
	private Double createTime;
	/**
	 * 白名单唯一标识
	 */
	private Integer id;
	/**
	 * ip地址
	 */
	private String ip;
	/**
	 * 备注
	 */
	private String remark;
	public Double getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Double createTime) {
		this.createTime = createTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
