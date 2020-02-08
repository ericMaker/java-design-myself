package com.myself.builderPattern;

public interface ComputerBuilder {
	void buildCpu();
	void buildRam();
	void buildHardDisk();
	void buildGraphicCard();
	void buildMonitor();
	void buildOs();
	
	Computer getResult();//得到建造好的计算机
}
