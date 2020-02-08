package com.myself.facadePattern;

public class Secretary {
	private Chauffeur chauffeur = new Chauffeur();
	private Hotel hotel = new Hotel();
	private Restaurant restaurant = new Restaurant();
	private Aiport aiport = new Aiport();
	
	//安排出差
	public void trip(String to,int days) {
		aiport.bookTicket("青岛", to);
		hotel.reserve(days);
		chauffeur.drive("机场");
	}
	
	//安排饭局
	public void repast(int num) {
		restaurant.reserv(num);
		chauffeur.drive("酒店");
	}
}
