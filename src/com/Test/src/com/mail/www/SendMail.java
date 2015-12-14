package com.mail.www;
import com.mail.www.Mail;
public class SendMail {
	public static void main(String[] args) {
		String smtp = "smtp.163.com";// smtp服务器
		String port = "25";// smtp服务器端口
		String from = "331337390@qq.com";// 邮件显示名称
		String to = "chinawphuang@163.com";// 收件人的邮件地址，必须是真实地址
		String copyto = "";// 抄送人邮件地址
		String subject = "测试邮件";// 邮件标题
		String content = "你好！";// 邮件内容
		String username = "331337390@qq.com";// 发件人真实的账户名
		String password = "kqxzlqjg1986";// 发件人密码
		Mail.sendAndCc(smtp,port, from, to, copyto, subject, content, username, password);
		System.out.print("test successfully!!!");
	}
}

