package com.myself.builderPattern;

public class X201Builder implements ComputerBuilder {
	private X201 computer = new X201();

	@Override
	public void buildCpu() {
		computer.setCpu("i3-350");

	}

	@Override
	public void buildRam() {
		computer.setRam("2GB 1333HMZ");

	}

	@Override
	public void buildHardDisk() {
		computer.setHardDisk("250GB 5400×ª");

	}

	@Override
	public void buildGraphicCard() {
		

	}

	@Override
	public void buildMonitor() {
		computer.setMonitor("12Ó¢´ç 1280*800");

	}

	@Override
	public void buildOs() {
		computer.setOs("Windows7 Home°æ");

	}

	@Override
	public Computer getResult() {
		// TODO Auto-generated method stub
		return computer;
	}

}
