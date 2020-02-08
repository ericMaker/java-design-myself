package com.myself.builderPattern;

public class ComputerDirector {
	ComputerBuilder builder;
	
	//构造T410型加算计
	public T410 constructT410() {
		builder = new T410Builder();
		builder.buildCpu();
		builder.buildGraphicCard();
		builder.buildHardDisk();
		builder.buildMonitor();
		builder.buildOs();
		builder.buildRam();
		return (T410)builder.getResult();
	}
	
	//构造X201型计算机
	public X201 constructX210() {
		builder = new X201Builder();
		builder.buildCpu();
		builder.buildHardDisk();
		builder.buildMonitor();
		builder.buildMonitor();
		builder.buildOs();
		builder.buildRam();
		return (X201)builder.getResult();
	}
}
