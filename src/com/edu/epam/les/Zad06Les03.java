package com.edu.epam.les;

public class Zad06Les03 {

	public static void main(String[] args) {
		int four = 3456;
		int res = 1;
		
		while (four > 0) {
			int div = four % 10;
			res *= div;
			four = four /10;
			
		}
		
		System.out.println(res);

	}

}
