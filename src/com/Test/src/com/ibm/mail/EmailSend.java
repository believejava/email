package com.ibm.mail;

import com.sendgrid.SendGrid;

public class EmailSend {
	public static void sendEmail() {
//		String username = "MW0xvY1uKA";
//		String password = "bOfXu6ZMBumc1026";
		String username = "BTXpTGv6NH";
		String password =  "EJjEzhFZQ0Gh0159";
		String emailAddress = "331337390@qq.com";
		String text = "xxxxxxxxxxxxxxxx";
		SendGrid sendgrid = new SendGrid(username, password);
		SendGrid.Email email = new SendGrid.Email();
		email.addTo(emailAddress);
		email.setFrom("chinawphuang@126.com");
		email.setFromName("HUANG WEI PENG");
		email.setSubject("WELCOME");
		email.setText(text);

		try {
			SendGrid.Response response = sendgrid.send(email);
			System.out.print("send email to " + emailAddress + ": "
					+ response.getMessage());
		} catch (Exception e) {
			System.out.print("send email to " + emailAddress + ": " + e);
			e.printStackTrace();
		}

	}
	public static void main(String args[]){
		sendEmail();
	}
}