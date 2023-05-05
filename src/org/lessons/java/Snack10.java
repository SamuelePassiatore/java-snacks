package org.lessons.java;

import java.util.Scanner;

public class Snack10 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un valore per il raggio: ");
		double radius = sc.nextDouble();
		
        double area = (radius * radius) * Math.PI;
        double perimeter = (2 * radius) * Math.PI;
		
		sc.close();
		
	    System.out.println("Il raggio del cerchio è: " + radius);
        System.out.println("L'area del cerchio corrispondente è: " + area);
        System.out.println("Il perimetro del cerchio corrispondente è: " + perimeter);
	}
}
