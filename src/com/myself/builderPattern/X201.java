package com.myself.builderPattern;

public class X201 extends Computer{
	public X201() {
		this.setType("ThinkPad X201i");
	}
	
	@Override
	public String toString() {
		return "型号：\t"+this.getType()+"\nCPU: \t"+this.getCpu()+"\n 内存：\t"
		           +this.getRam()+"\n硬盘：\t"+this.getHardDisk()+"\n显示器：\t"
					+this.getMonitor()+"\n操作系统：\t"+this.getOs();
	}
}
