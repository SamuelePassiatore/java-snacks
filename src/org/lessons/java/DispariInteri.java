package org.lessons.java;

public class DispariInteri {
	public static void main(String[] args){
		int[] numeri = {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;
		
		for (int i = 1; i < numeri.length; i += 2) {

		      sum += numeri[i];
		}
		System.out.println("La somma degli elementi in posizione dispari è: " + sum);
	}
}
