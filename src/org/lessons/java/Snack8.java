package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {
	public static void main(String[] args){
		
		Random random = new Random();
		
		Integer[] evenNumbers = new Integer[10]; 
	    Integer[] oddNumbers = new Integer[10]; 
	    int evenIndex = 0; 
        int oddIndex = 0; 
	        
		for (int i = 0; i < 10; i++) {
			
			 int randomNumber = random.nextInt(101);
	         System.out.println(randomNumber);
	         
	         if (randomNumber % 2 == 0) { 
	            evenNumbers[evenIndex++] = randomNumber; 
	         } else { 
	            oddNumbers[oddIndex++] = randomNumber; 
	         }
		}
		
		System.out.println(Arrays.asList(evenNumbers));
		System.out.println(Arrays.asList(oddNumbers));
		
	}
}
