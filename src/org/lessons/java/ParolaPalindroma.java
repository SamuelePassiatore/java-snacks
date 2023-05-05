package org.lessons.java;

import java.util.Scanner;

public class ParolaPalindroma {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci una parola");
		String userWord = sc.nextLine();
		
		sc.close();
		
		String reverseWord = new StringBuilder(userWord).reverse().toString();
		
		String result = userWord.equals(reverseWord) ? "La parola è palindroma" : "La parola non è palindroma";

		System.out.println(result);
	}
}
