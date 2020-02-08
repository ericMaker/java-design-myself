package com.myself.SP;

public class GlobalNum {
	private static GlobalNum gnGlobalNum = new GlobalNum();
	private int num =0;
	private GlobalNum() {}
	public static GlobalNum getinstance() {
		return gnGlobalNum;
	}
	public synchronized int getNum() {
		return num++;
	}
}
