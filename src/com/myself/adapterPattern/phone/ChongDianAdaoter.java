package com.myself.adapterPattern.phone;

public class ChongDianAdaoter extends ChongDian220V implements ChongDian5V {

	@Override
	public int shuChu5V() {
		// TODO Auto-generated method stub
		int srcV = shuChu220V();
		int desV = srcV/44;
		System.out.println("�����"+desV+"V");
		return desV;
	}

}
