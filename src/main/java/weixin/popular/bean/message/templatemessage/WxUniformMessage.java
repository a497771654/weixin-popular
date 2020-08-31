package weixin.popular.bean.message.templatemessage;

/**
 * @Author: lvliangjun
 * @Date: 2020/8/31 16:14
 */
public class WxUniformMessage {

    /**
     * touser : OPENID
     * weapp_template_msg : {"template_id":"TEMPLATE_ID","page":"page/page/index","form_id":"FORMID","data":{"keyword1":{"value":"339208499"},"keyword2":{"value":"2015年01月05日 12:30"},"keyword3":{"value":"腾讯微信总部"},"keyword4":{"value":"广州市海珠区新港中路397号"}},"emphasis_keyword":"keyword1.DATA"}
     * mp_template_msg : {"appid":"APPID ","template_id":"TEMPLATE_ID","url":"http://weixin.qq.com/download","miniprogram":{"appid":"xiaochengxuappid12345","pagepath":"index?foo=bar"},"data":{"first":{"value":"恭喜你购买成功！","color":"#173177"},"keyword1":{"value":"巧克力","color":"#173177"},"keyword2":{"value":"39.8元","color":"#173177"},"keyword3":{"value":"2014年9月22日","color":"#173177"},"remark":{"value":"欢迎再次购买！","color":"#173177"}}}
     */

    private String touser;

    private MpTemplateMsgBean mp_template_msg;



    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }



    public MpTemplateMsgBean getMp_template_msg() {
        return mp_template_msg;
    }

    public void setMp_template_msg(MpTemplateMsgBean mp_template_msg) {
        this.mp_template_msg = mp_template_msg;
    }
}
