package com.myself.facadePattern;

public class Boss {

	public static void main(String[] args) {
		Secretary secretary = new Secretary();
		System.out.println("�ϰ��������Ҫ���Ϻ�����10��");
		secretary.trip("�Ϻ�", 10);
		System.out.println("-------------------------");
		System.out.println("�ϰ����������8���˳Է�");
		secretary.repast(8);
	}

}
