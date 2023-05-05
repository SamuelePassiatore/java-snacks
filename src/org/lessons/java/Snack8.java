package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {
	public static void main(String[] args){
		
		Random random = new Random();
		
		int[] evenNumbers = new int[10]; 
	    int[] oddNumbers = new int[10]; 
	    int evenIndex = 0; 
        int oddIndex = 0; 
	        
		for (int i = 0; i < 10; i++) {
			
			 int randomNumber = random.nextInt(101);
	         System.out.println(randomNumber);
	         
	         if (randomNumber % 2 == 0) { 
	            evenNumbers[evenIndex] = randomNumber; 
	            evenIndex++; 
	         } else { 
	            oddNumbers[oddIndex] = randomNumber; 
	            oddIndex++; 
	         }
		}
		
		System.out.println(Arrays.toString(evenNumbers));
		System.out.println(Arrays.toString(oddNumbers));
		
	}
}
