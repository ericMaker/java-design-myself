package com.myself.adapterPattern.objectAdapter;

public class Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== 对象适配器模式====");
		Phone phone = new Phone();
		phone.charging(new ChongDianAdaoter(new ChongDian220V()));
	}

}
