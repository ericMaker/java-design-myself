package com.myself.builderPattern;

public class X201 extends Computer{
	public X201() {
		this.setType("ThinkPad X201i");
	}
	
	@Override
	public String toString() {
		return "�ͺţ�\t"+this.getType()+"\nCPU: \t"+this.getCpu()+"\n �ڴ棺\t"
		           +this.getRam()+"\nӲ�̣�\t"+this.getHardDisk()+"\n��ʾ����\t"
					+this.getMonitor()+"\n����ϵͳ��\t"+this.getOs();
	}
}
