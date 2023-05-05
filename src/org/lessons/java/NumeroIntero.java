package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class NumeroIntero {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un numero intero: ");
		int number = sc.nextInt();
	
		sc.close();
		
		Random random = new Random();
		
		int sumTotal = 0;
		int sumEven = 0;
		int sumOdd = 0;
		int evenNumbers = 0;
		int oddNumbers = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		 for (int i = 0; i < number; i++) {
			 int randomNumber = random.nextInt(0, 101);
			 System.out.println(randomNumber);
			 
			 //Sum
			 sumTotal += randomNumber;
			 
			 //Even and odd
			 if(randomNumber % 2 == 0) {
				 sumEven += randomNumber;
			 } else {
				 oddNumbers++;
				 sumOdd += randomNumber;
			 }
			 
			 if (randomNumber < min) {
	                min = randomNumber;
	            }
	         if (randomNumber > max) {
	                max = randomNumber;
	         }
		 }
		 
		 double media = sumTotal / number;
		 double mediaOdd = sumOdd / oddNumbers;
		
		 System.out.println("La somma dei valori è: " + sumTotal);
		 System.out.println("La somma dei valori pari è: " + sumEven);
		 System.out.println("La somma dei valori dispari è: " + sumOdd);
		 System.out.println("La media è: " + media);
		 System.out.println("La media dei numeri dispari è: " + mediaOdd);
		 System.out.println("Il numero massimo è: " + max);
		 System.out.println("Il numero minimo è: " + min);
	}
}
