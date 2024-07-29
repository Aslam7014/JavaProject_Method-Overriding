package com;

class MainClass {
	public static void main(String[] args) {
		
		FoodDeliveryApp s= new Swiggy();
		s.orderfood();
		
		System.out.println(":-)");
		
		FoodDeliveryApp z= new Zomato();
		z.orderfood();
		
	}

}
