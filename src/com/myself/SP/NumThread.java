package com.myself.SP;

public class NumThread extends Thread{
	private String threadName;
	public NumThread(String name) {
		threadName = name;
	}
	//重写run方法（线程任务）
	public void run() {
		GlobalNum gnObj = GlobalNum.getinstance();
		//在单例模式中给创建一个私有的构造方法，就可以避免自行创建对象
		//GlobalNum gnObj = new GlobalNum();
		
		//循环访问，输出访问次数
		for(int i=0;i<5;i++) {
			System.out.println(threadName +"第"+gnObj.getNum()+"次访问");
			
			try {
				this.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
