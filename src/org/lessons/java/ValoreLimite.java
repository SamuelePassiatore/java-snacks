package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class ValoreLimite {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un numero intero positivo LIMITE: ");
		int number = sc.nextInt();
		
		sc.close();
		
		Random random = new Random();

	    int sum = 0;
	    int count = 0;

	    while (sum <= number) {
	    	
	        int randomNumber = random.nextInt(101);
	        System.out.println(randomNumber);
	        sum += randomNumber;
	        count++;
	    }

	    System.out.println("Estratti " + count + " numeri casuali.");
		
	}
}
