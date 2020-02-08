package com.myself.compositePattern;

public class Employee implements Company {
	
	private String name;
	private String position;
	private int salary;
	
	
	public Employee(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	@Override
	public String getInfo() {
		String info = null;
		info = "���ƣ�"+this.name;
		info +="\tְλ��"+this.position;
		info +="\tнˮ"+this.salary;
		return info;
	}

}
