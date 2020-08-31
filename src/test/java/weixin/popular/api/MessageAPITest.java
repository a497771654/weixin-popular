package weixin.popular.api;


import org.junit.Test;
import weixin.popular.bean.BaseResult;
import weixin.popular.bean.message.templatemessage.*;

import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;

/**
 * @Author: lvliangjun
 * @Date: 2020/4/16 14:55
 */
public class MessageAPITest {

    @Test
    public void messageWxSubscribeTemplateSend() {
        WxSubscribeTemplateMessage wxSubscribeTemplateMessage=new WxSubscribeTemplateMessage();
        wxSubscribeTemplateMessage.setTemplate_id("");
        wxSubscribeTemplateMessage.setTouser("");
        wxSubscribeTemplateMessage.setMiniprogram_state("developer");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        LinkedHashMap<String, TemplateMessageItem> data = new LinkedHashMap<>();
        TemplateMessageItem templateMessageItem1 = new TemplateMessageItem("DB761572571180166313");
        TemplateMessageItem templateMessageItem3 = new TemplateMessageItem("蒙阿妹");
        TemplateMessageItem templateMessageItem4 = new TemplateMessageItem("18888888888");
        TemplateMessageItem templateMessageItem5 = new TemplateMessageItem("xxx区xxx路xxx号xxx栋xxx号");
        TemplateMessageItem templateMessageItem6 = new TemplateMessageItem("18888888888");
        data.put("character_string6", templateMessageItem1);
        data.put("name2", templateMessageItem3);
        data.put("phone_number3", templateMessageItem4);
        data.put("thing10", templateMessageItem5);
        data.put("phone_number13", templateMessageItem6);

        wxSubscribeTemplateMessage.setData(data);


        BaseResult res = MessageAPI.messageWxSubscribeTemplateSend("",wxSubscribeTemplateMessage);
        System.out.println(res);
    }
    @Test
    public void messageWxUniformSend() {
        WxUniformMessage wxUniformMessage=new WxUniformMessage();

        wxUniformMessage.setTouser("oJ6ZI40zI7s81NtWcL0spGoqTCwM");

        TemplateMessageItem first=new TemplateMessageItem("你有一个新的订单");
        LinkedHashMap<String, TemplateMessageItem> data = new LinkedHashMap<>();
        TemplateMessageItem templateMessageItem1 = new TemplateMessageItem("987456321");
        TemplateMessageItem templateMessageItem2 = new TemplateMessageItem("2018-08-01 19:00");
        TemplateMessageItem templateMessageItem3 = new TemplateMessageItem("TMB 001奶茶");
        TemplateMessageItem templateMessageItem4 = new TemplateMessageItem("广州市珠江新城猎德新村详细订单信息请点击进入个人中心");

        data.put("first", first);
        data.put("keyword1", templateMessageItem1);
        data.put("keyword2", templateMessageItem2);
        data.put("keyword3", templateMessageItem3);
        data.put("keyword4", templateMessageItem4);
        MpTemplateMsgBean mpTemplateMsgBean = new MpTemplateMsgBean();
        mpTemplateMsgBean.setData(data);


        TemplateMessageMiniProgram templateMessageMiniProgram = new TemplateMessageMiniProgram();
        templateMessageMiniProgram.setAppid("wxac7dc375296437ac");
        templateMessageMiniProgram.setPagepath("index?foo=bar");
        mpTemplateMsgBean.setTemplateMessageMiniProgram(templateMessageMiniProgram);
        mpTemplateMsgBean.setAppid("wxbf106a706c54f731");
        mpTemplateMsgBean.setTemplate_id("GJrpghhyOuD2jZSJvKV9VPocX1-aMhEDWe6nv9za5uA");


        wxUniformMessage.setMp_template_msg(mpTemplateMsgBean);


        BaseResult res = MessageAPI.messageWxUniformSend("36_uPU4Ep49KTsWgPJRJaWzLChRNKf-5VqFY7g8IZgYgbaXqWn_FskBTSc7q9NxlaYuUuDsDJN6ag--dWUSEdKe3N-n5tIbIpp2f3bz9X-YjVXJwO_vNQxNQH_jp8t20igUFFAUeFWhXRE7hDwuFRNiABAPBX",wxUniformMessage);
        System.out.println(res);
    }
}