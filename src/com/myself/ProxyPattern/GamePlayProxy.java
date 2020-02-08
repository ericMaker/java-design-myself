package com.myself.ProxyPattern;

import java.util.Date;

public class GamePlayProxy implements IGamePlayer {
	private IGamePlayer player = null;
	
	public GamePlayProxy(IGamePlayer player) {
		this.player = player;
	}
	
	//��¼���ʱ��
	private void log() {
		System.out.println("���ʱ��"+new Date().toString());
	}

	@Override
	public void killBoss() {
		this.log();
		player.killBoss();
		
	}

	@Override
	public void upGrade() {
		player.upGrade();
		this.count();
	}
	
	//������������ʱ��
	private void count() {
		System.out.println("��һ�� �ķ� 50Сʱ");
	}

}
