package com.myself.ProxyPattern;

import java.util.Date;

public class GamePlayProxy implements IGamePlayer {
	private IGamePlayer player = null;
	
	public GamePlayProxy(IGamePlayer player) {
		this.player = player;
	}
	
	//记录打怪时间
	private void log() {
		System.out.println("打怪时间"+new Date().toString());
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
	
	//计算升级所用时间
	private void count() {
		System.out.println("升一级 耗费 50小时");
	}

}
