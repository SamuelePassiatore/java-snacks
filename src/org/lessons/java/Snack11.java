package org.lessons.java;

import java.util.Scanner;

public class Snack11 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un valore: ");
		int num = sc.nextInt();
		
		sc.close();
		
        System.out.println("I divisori di " + num + " sono: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + " ");
            }
        }
		

	}
}
