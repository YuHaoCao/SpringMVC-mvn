package wechat;

public class Test {

	public static void main(String[] args) {
		System.out.println("发送");
		SendWX sendWX = new SendWX();
		sendWX.send("15195891670", "测试内容是的是大赛");
		System.out.println("完成");
	}
}
