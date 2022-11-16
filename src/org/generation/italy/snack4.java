package org.generation.italy;

import java.util.Random;

public class snack4 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[]FirstArray = new int[8];
		int[]SecondArray = new int[22];
		
		int FirstArrayLength = FirstArray.length;
		int SecondArrayLength = SecondArray.length;
		
		
		
		for(int i =0;i< SecondArrayLength - FirstArrayLength;i++ ) {
			int number = rnd.nextInt(1001);
			System.out.println(number);
		}
	
}}
