package cn.fastoo.sdk.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

/**
 * 模板返回类
 * @author lb
 * @version 1.0
 * @date 2017-08-31
 */
public class TemplateReturn extends ReturnModel {
	/**
	 * 模板数据
	 */
	private List<TemplateBean> templatelist;
	/**
	 * 每页数据条数
	 */
	private Integer size;
	/**
	 * 总共有几页
	 */
	private Integer totalPages;
	/**
	 * 总共有几条
	 */
	private Integer totalElements;
	public TemplateReturn(String jsonstr) {
		super(jsonstr);
		if(this.getCode().equals(0)){
			//成功
			JSONArray arr=this.getObj().getJSONObject("data").getJSONArray("userSmstemplates");
			this.setSize(this.getObj().getJSONObject("data").getInt("size"));
			this.setTotalPages(this.getObj().getJSONObject("data").getInt("totalPages"));
			this.setTotalElements(this.getObj().getJSONObject("data").getInt("totalElements"));
			this.templatelist=new ArrayList<TemplateBean>();
			for(int i=0;i<arr.length();i++){
				TemplateBean bean=new TemplateBean();
				bean.setApiKey(arr.getJSONObject(i).getString("apiKey"));
				bean.setAppUrl(arr.getJSONObject(i).getString("appUrl"));
				if(!arr.getJSONObject(i).isNull("applyTime")){
					bean.setApplyTime(arr.getJSONObject(i).getDouble("applyTime"));
				}
				if(!arr.getJSONObject(i).isNull("auditTime")){
					bean.setAuditTime(arr.getJSONObject(i).getDouble("auditTime"));
				}
				bean.setId(String.valueOf(arr.getJSONObject(i).getInt("id")));
				bean.setReason(arr.getJSONObject(i).getString("reason"));
				bean.setState(arr.getJSONObject(i).getInt("state"));
				bean.setTemplateContent(arr.getJSONObject(i).getString("templateContent"));
				bean.setTemplateType(arr.getJSONObject(i).getInt("templateType"));
				this.templatelist.add(bean);
			}
		}
	}
	public List<TemplateBean> getTemplatelist() {
		return templatelist;
	}
	public void setTemplatelist(List<TemplateBean> templatelist) {
		this.templatelist = templatelist;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	public Integer getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}
	

}
