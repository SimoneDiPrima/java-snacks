package org.generation.italy;
import java.util.*;

public class snack6 {

	public static void main(String[] args) {
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		int[] arr3 = new int[arr1.length];
		
		
		
		for (int i = 0; i < arr1.length; ++i) {
		    arr3[i] = arr1[i] + arr2[i];
			System.out.println(arr3[i]);
			int min = arr1[0 + i];
			int max = arr2[5];
			if(min<i){
			System.out.println("il valore minimo è " + min);
			}
			
		}
		}
		
	
}
