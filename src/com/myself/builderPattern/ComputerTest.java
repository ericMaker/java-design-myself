package com.myself.builderPattern;

public class ComputerTest {

	public static void main(String[] args) {
		ComputerDirector director = new ComputerDirector();
		Computer t410 = director.constructT410();
		System.out.println(t410);
		
		System.out.println("-----------------");
		Computer x201 = director.constructX210();
		System.out.println(x201);
		
	}

}
