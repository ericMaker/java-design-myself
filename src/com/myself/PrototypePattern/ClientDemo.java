package com.myself.PrototypePattern;

import java.util.Random;

public class ClientDemo {
	private static int MAX_COUNT = 6;
	public static void main(String[] args) {
		//模拟发送邮件
		int i =0;
		
		//定义一个邮件对象
		Mail mail = new Mail("某商场五一抽奖活动", "活动内容。。。。。。。。。。。");
		mail.setTail("解释权归某商场所有");
		while(i<MAX_COUNT) {
			//克隆邮件
			Mail clonMail = mail.clone();
			clonMail.setApplication(getRandString(5)+"先生/女士");
			clonMail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
			//发送邮件
			sendMail(clonMail);
			i++;
		}
	}
	
	//发送邮件
	public static void sendMail(Mail mail) {
		System.out.println("标题："+mail.getSubject()
		+"\t收件人："+mail.getReceiver()+"\t....发送成功");
	}
	
	//获得指定长度的随机字符串
	public static String getRandString(int maxLength) {
		String source = "abcdefghiGUIUWIDHIH";
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for(int i=0;i<maxLength;i++) {
			sb.append(source.charAt(random.nextInt(source.length())));
		}
		return sb.toString();
	}
}
