package com.myself.adapterPattern.phone;

public class Phone {
	public void charging(ChongDianAdaoter adaoter) {
		if(adaoter.shuChu5V()==5) {
			System.out.println("电压正常可以充电");
		}else {
			System.out.println("电压异常无法充电");
		}
	}
}
