package com.edu.epam.les;

public class Zad07Les03 {

	public static void main(String[] args) {
		double a = -5;
		double b = 8;
		
		double sredAR = (Math.pow(a, 3) + Math.pow(b, 3))/2;
		double sredGeo = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println(sredAR);
		System.out.println(sredGeo);
	}

}
