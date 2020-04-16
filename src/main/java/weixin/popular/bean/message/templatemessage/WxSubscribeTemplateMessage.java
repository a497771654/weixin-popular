package weixin.popular.bean.message.templatemessage;

import java.util.LinkedHashMap;

/**
 * 小程序订阅消息
 */
public class WxSubscribeTemplateMessage {

	private String touser;

	private String template_id;

	private String page;

	private String miniprogram_state;

	private String lang;

	private LinkedHashMap<String, TemplateMessageItem> data;

	public String getTouser() {
		return touser;
	}

	public void setTouser(String touser) {
		this.touser = touser;
	}

	public String getTemplate_id() {
		return template_id;
	}

	public void setTemplate_id(String template_id) {
		this.template_id = template_id;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getMiniprogram_state() {
		return miniprogram_state;
	}

	public void setMiniprogram_state(String miniprogram_state) {
		this.miniprogram_state = miniprogram_state;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public LinkedHashMap<String, TemplateMessageItem> getData() {
		return data;
	}

	public void setData(LinkedHashMap<String, TemplateMessageItem> data) {
		this.data = data;
	}

}
