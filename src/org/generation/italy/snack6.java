package org.generation.italy;
import java.util.*;

public class snack6 {

	public static void main(String[] args) {
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		int[] arr3 = new int[arr1.length];
		int sum=0;
		int minValue = 100;
		int maxValue = 0;
		
		
		for (int i = 0; i < arr1.length; ++i) {
		    arr3[i] = arr1[i] + arr2[i];
		    System.out.println(arr3[i]);
		    sum += (arr1[i] + arr2[i]);
		    if(arr1[i]<minValue) {
		    	minValue= arr1[i];
		    }
		    else if(maxValue <= arr2[i]) {
		    	maxValue = arr2[i];
		    }
		}
		
		 System.out.println("il valore totale è: "+sum );
		 System.out.println("il valore massimo è: "+maxValue );
		 System.out.println("il valore minimo è: "+minValue );
		
	}
	
}
