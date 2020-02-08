package com.myself.adapterPattern.objectAdapter;

public class ChongDianAdaoter implements ChongDian5V {
	
	private ChongDian220V chongDian220V;

	public ChongDianAdaoter(ChongDian220V chongDian220V) {
		this.chongDian220V = chongDian220V;
	}

	@Override
	public int shuChu5V() {
		// TODO Auto-generated method stub
		int srcV = chongDian220V.shuChu220V();
		int desV = srcV/44;
		System.out.println("Êä³ö£º"+desV+"V");
		return desV;
	}

}
