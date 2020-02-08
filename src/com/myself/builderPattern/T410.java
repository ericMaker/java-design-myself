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
		return "�ͺţ�\t"+this.getType()+"\nCPU: \t"+this.getCpu()+"\n �ڴ棺\t"
	           +this.getRam()+"\nӲ�̣�\t"+this.getHardDisk()+"\n�Կ���\t"+this.getGraphicCard()+"\n��ʾ����\t"
				+this.getMonitor()+"\n����ϵͳ��\t"+this.getOs();
	}
}
