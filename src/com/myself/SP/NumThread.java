package com.myself.SP;

public class NumThread extends Thread{
	private String threadName;
	public NumThread(String name) {
		threadName = name;
	}
	//��дrun�������߳�����
	public void run() {
		GlobalNum gnObj = GlobalNum.getinstance();
		//�ڵ���ģʽ�и�����һ��˽�еĹ��췽�����Ϳ��Ա������д�������
		//GlobalNum gnObj = new GlobalNum();
		
		//ѭ�����ʣ�������ʴ���
		for(int i=0;i<5;i++) {
			System.out.println(threadName +"��"+gnObj.getNum()+"�η���");
			
			try {
				this.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
