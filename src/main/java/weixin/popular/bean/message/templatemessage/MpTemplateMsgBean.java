package weixin.popular.bean.message.templatemessage;

import java.util.LinkedHashMap;

/**
 * @Author: lvliangjun
 * @Date: 2020/8/31 16:14
 */
public class MpTemplateMsgBean {
    /**
     * appid : APPID
     * template_id : TEMPLATE_ID
     * url : http://weixin.qq.com/download
     * miniprogram : {"appid":"xiaochengxuappid12345","pagepath":"index?foo=bar"}
     * data : {"first":{"value":"恭喜你购买成功！","color":"#173177"},"keyword1":{"value":"巧克力","color":"#173177"},"keyword2":{"value":"39.8元","color":"#173177"},"keyword3":{"value":"2014年9月22日","color":"#173177"},"remark":{"value":"欢迎再次购买！","color":"#173177"}}
     */

    private String appid;
    private String template_id;
    private String url;
    private TemplateMessageMiniProgram templateMessageMiniProgram;
    private LinkedHashMap<String, TemplateMessageItem> data;





    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TemplateMessageMiniProgram getTemplateMessageMiniProgram() {
        return templateMessageMiniProgram;
    }

    public void setTemplateMessageMiniProgram(TemplateMessageMiniProgram templateMessageMiniProgram) {
        this.templateMessageMiniProgram = templateMessageMiniProgram;
    }

    public LinkedHashMap<String, TemplateMessageItem> getData() {
        return data;
    }

    public void setData(LinkedHashMap<String, TemplateMessageItem> data) {
        this.data = data;
    }
}
