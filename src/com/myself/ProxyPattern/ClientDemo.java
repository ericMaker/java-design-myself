package com.myself.ProxyPattern;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGamePlayer player = new GamePlayer("����ң");
		GamePlayProxy proxy = new GamePlayProxy(player);
		proxy.killBoss();
		proxy.upGrade();
	}

}
