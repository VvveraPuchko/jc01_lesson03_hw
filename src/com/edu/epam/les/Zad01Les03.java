package com.edu.epam.les;

public class Zad01Les03 {
	public static void main(String[] args) {
		double a;
		double b;
		double hyp;
		double s;
		double p;
		
		a = 3;
		b = 4;
		hyp = Math.sqrt(a * a + b * b);
		s = a * b /2;
		p = a + b + hyp;
		
		System.out.println("Hyp " + hyp + ", " + "s " + s + ", " + "p " + p);
		
	}

}
