package org.lessons.java;

import java.util.Random;

public class NomiCognomi {
	public static void main(String[] args){
		  String[] nomi = {"Bianca", "Lisa", "Barbara", "Lino", "Andrea", "Samuele"};
		  String[] cognomi = {"Rossi", "Verdi", "Blu", "Marroni", "Bianchi", "Grigi"};
		  
		  Random random = new Random();
		  
		  for(int i = 0; i < 10; i++) {
			  String nome = nomi[random.nextInt(nomi.length)];
			  String cognome = cognomi[random.nextInt(cognomi.length)];
			  
			  System.out.println(nome + " " + cognome);
		  }
		 
	}
}
