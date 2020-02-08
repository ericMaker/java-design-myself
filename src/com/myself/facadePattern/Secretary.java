package com.myself.facadePattern;

public class Secretary {
	private Chauffeur chauffeur = new Chauffeur();
	private Hotel hotel = new Hotel();
	private Restaurant restaurant = new Restaurant();
	private Aiport aiport = new Aiport();
	
	//���ų���
	public void trip(String to,int days) {
		aiport.bookTicket("�ൺ", to);
		hotel.reserve(days);
		chauffeur.drive("����");
	}
	
	//���ŷ���
	public void repast(int num) {
		restaurant.reserv(num);
		chauffeur.drive("�Ƶ�");
	}
}
