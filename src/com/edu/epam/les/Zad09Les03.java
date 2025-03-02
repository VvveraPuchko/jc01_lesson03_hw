package com.edu.epam.les;

public class Zad09Les03 {

	public static void main(String[] args) {
		double a = 14;
		
		double s = (a * a * Math.sqrt(3))/4;
		double h = (a * Math.sqrt(3))/2;
		double rVpis = (a * Math.sqrt(3))/6;
		double rOpis = a/Math.sqrt(3);
		
		System.out.println("Площадь треугольника: " + s);
		System.out.println("Высота: " + h);
		System.out.println("Радиус вписанной окружности: " + rVpis);
		System.out.println("Радиус описанной окружности: " + rOpis);
		

	}

}
