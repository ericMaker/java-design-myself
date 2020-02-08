package com.myself.builderPattern;

public class T410Builder implements ComputerBuilder {
	private T410 computer = new T410();
	
	@Override
	public void buildCpu() {
		computer.setCpu("i5-450");
		
	}

	@Override
	public void buildRam() {
		computer.setRam("4GB 1333HMZ");

	}

	@Override
	public void buildHardDisk() {
		computer.setHardDisk("500GB 7200×ª");

	}

	@Override
	public void buildGraphicCard() {
		computer.setGraphicCrad("Nvidia NVS 3100M");

	}

	@Override
	public void buildMonitor() {
		computer.setMonitor("14Ó¢´ç 1280*800");

	}

	@Override
	public void buildOs() {
		computer.setOs("win7 Æì½¢°æ");

	}

	@Override
	public Computer getResult() {
		return computer;
	}

}
