package com.mail.test;

public class SendEmailDemo {

    public static void main(String[] args) {
        SendEmail sm=new SendEmail("smtp.126.com");
        sm.setNamePass("zangbangxian@126.com","abcd19880120");
        sm.setSubject("测试,测试");
        sm.setFrom("zangbangxian@126.com");
        sm.setTo("331337390@qq.com");
        //sm.addFileAffix("f:/adsl.txt");
        StringBuffer bs=new StringBuffer();
        bs.append("裴德万:\n");
        bs.append("       测试度奇珍异宝埼地在檌!!!!!!!!!!!");
        sm.setBody("DFSAAAAAAAAAAAAAAAAA");
        sm.setNeedAuth(true);
        boolean b=sm.setOut();
        if(b){
            System.out.println("\n邮件发送成功!!!!!");
        }
        else{
            System.out.println("邮件发送失败!!!!");
        }
    }
}
