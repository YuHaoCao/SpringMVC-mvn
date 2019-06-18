package wechat;

/**
 * @author Jade Hulk
 * @explain
 * @detail
 * @projct SpringMVC-mvn
 * @package wechat
 * @date 2019-06-18 22:10
 **/
public class SendWX {

    //发送消息的执行方法
    public void send(String tel, String sec) {
        WeChatMsgSend swx = new WeChatMsgSend();
        try {
            //这里的token获取待会会说从哪儿具体得到
            String token = swx.getToken("ww5dc039068265acfb", "hE6GIjYkogJIe451m4051Yr1o_oKgaGjWzRY7AN75hc");
            String postdata = swx.createpostdata("CaoYuHao", "text", 1000002, "content", "手机号：" + tel + "\n内容：" + sec);
            String resp = swx.post("utf-8", WeChatMsgSend.CONTENT_TYPE, (new WeChatUrlData()).getSendMessage_Url(), postdata, token);
            System.out.println("获取到的token======>" + token);
            System.out.println("请求数据======>" + postdata);
            System.out.println("发送微信的响应数据======>" + resp);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
