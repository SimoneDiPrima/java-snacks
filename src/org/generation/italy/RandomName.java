package org.generation.italy;

import java.util.Random;

public class RandomName {

	public static void main(String[] args) {
		String[]names = {"Marco","Maria","Simone"};
		String[]surnames = {"Rossi","Gialli","Verdi"};
		for(int i=0;i<names.length;i++) {
			Random rnd = new Random();
			int randomNames = rnd.nextInt(names.length);
			int randomSurnames = rnd.nextInt(surnames.length);
			
			System.out.print(names[randomNames] + " " + surnames[randomSurnames]+ "\n");
		}
		
		
}
}
