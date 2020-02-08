package com.myself.adapterPattern.phone;

public class Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== ÀàÊÊÅäÆ÷Ä£Ê½====");
		Phone phone = new Phone();
		phone.charging(new ChongDianAdaoter());
	}

}
