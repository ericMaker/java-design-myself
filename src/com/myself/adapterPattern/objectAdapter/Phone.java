package com.myself.adapterPattern.objectAdapter;

public class Phone {
	public void charging(ChongDianAdaoter adaoter) {
		if(adaoter.shuChu5V()==5) {
			System.out.println("��ѹ�������Գ��");
		}else {
			System.out.println("��ѹ�쳣�޷����");
		}
	}
}
