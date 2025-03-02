package com.edu.epam.les;

public class Zad03Les03 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double x1 = 5;
		double x2 = 4;
		double y1 = 3;
		double y2 = 6;
		double x3 = 3;
		double y3 = 7;
		
		a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		b = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		c = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		
		System.out.print(a + b + c);

	}

}
