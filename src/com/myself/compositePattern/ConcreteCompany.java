package com.myself.compositePattern;

import java.util.ArrayList;

public class ConcreteCompany implements Company {

	private ArrayList<Company> companyList = new ArrayList<Company>();
	private String name;
	private String position;
	private int salary;
		
	public ConcreteCompany( String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public void add(Company company) {
		this.companyList.add(company);
	}
	
	public void remoce(Company company) {
		this.companyList.remove(company);
	}
	
	public ArrayList<Company> getChild(){
		return this.companyList;
	}

	@Override
	public String getInfo() {
		String info = null;
		info = "名称："+this.name;
		info +="\t职位："+this.position;
		info +="\t薪水"+this.salary;
		return info;
	}

}
