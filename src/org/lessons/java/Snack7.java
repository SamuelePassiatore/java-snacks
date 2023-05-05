package org.lessons.java;

import java.util.Random;

public class Snack7 {
	public static void main(String[] args){
	
		Random random = new Random();
		int randomNumber = 100;
    
		while (randomNumber % 3 != 0 || randomNumber % 5 != 0) {
			randomNumber = random.nextInt(101);
			System.out.println(randomNumber);
		}
		
	}
}
