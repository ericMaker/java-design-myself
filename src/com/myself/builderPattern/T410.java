package com.myself.builderPattern;

public class T410 extends Computer{
	private String graphicCard;
	
	public T410() {
		this.setType("ThinkPad T410i");
	}
	
	public String getGraphicCard() {
		return graphicCard;
	}
	
	public  void setGraphicCrad(String graphicCard) {
		this.graphicCard = graphicCard;
	}
	
	@Override
	public String toString() {
		return "型号：\t"+this.getType()+"\nCPU: \t"+this.getCpu()+"\n 内存：\t"
	           +this.getRam()+"\n硬盘：\t"+this.getHardDisk()+"\n显卡：\t"+this.getGraphicCard()+"\n显示器：\t"
				+this.getMonitor()+"\n操作系统：\t"+this.getOs();
	}
}
