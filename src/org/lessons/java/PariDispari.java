package org.lessons.java;

import java.util.Scanner;

public class PariDispari {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dimmi il tuo numero:");
		int val = sc.nextInt();
		
		sc.close();
		
		System.out.println(val % 2 == 0 ? val : (val + 1));
	}
}
