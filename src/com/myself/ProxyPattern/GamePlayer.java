package com.myself.ProxyPattern;

public class GamePlayer implements IGamePlayer {
	private String name;
	
	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void killBoss() {
		System.out.println(this.name+"�ڴ�֣�");

	}

	@Override
	public void upGrade() {
		System.out.println(this.name+"�ɹ�����һ����");

	}

}
