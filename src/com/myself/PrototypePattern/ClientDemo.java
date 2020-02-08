package com.myself.PrototypePattern;

import java.util.Random;

public class ClientDemo {
	private static int MAX_COUNT = 6;
	public static void main(String[] args) {
		//ģ�ⷢ���ʼ�
		int i =0;
		
		//����һ���ʼ�����
		Mail mail = new Mail("ĳ�̳���һ�齱�", "����ݡ���������������������");
		mail.setTail("����Ȩ��ĳ�̳�����");
		while(i<MAX_COUNT) {
			//��¡�ʼ�
			Mail clonMail = mail.clone();
			clonMail.setApplication(getRandString(5)+"����/Ůʿ");
			clonMail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
			//�����ʼ�
			sendMail(clonMail);
			i++;
		}
	}
	
	//�����ʼ�
	public static void sendMail(Mail mail) {
		System.out.println("���⣺"+mail.getSubject()
		+"\t�ռ��ˣ�"+mail.getReceiver()+"\t....���ͳɹ�");
	}
	
	//���ָ�����ȵ�����ַ���
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
