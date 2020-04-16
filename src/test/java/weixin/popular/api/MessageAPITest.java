package weixin.popular.api;


import org.junit.Test;
import weixin.popular.bean.BaseResult;
import weixin.popular.bean.message.templatemessage.TemplateMessageItem;
import weixin.popular.bean.message.templatemessage.WxSubscribeTemplateMessage;

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
}