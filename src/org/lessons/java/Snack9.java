package org.lessons.java;

import java.util.Arrays;
import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un valore per la base: ");
		int base = sc.nextInt();
		
		System.out.println("Inserisci un valore per l'altezza: ");
		int height = sc.nextInt();
		
		sc.close();
		
		int area = base * height;
		int perimeter = (2 * base) + (2 * height);
		
		System.out.println("Area: " + area);
		System.out.println("Perimetro " + perimeter);
	}
	
	
}
