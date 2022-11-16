package org.generation.italy;

public class ManageArrayFirst{

	public static void main(String[] args) {
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int minValue = 100;
		int maxValue = 0;
		int sum =0;
		for(int i = 0; i < arr.length;i++) {
			 if(arr[i]<minValue) {
			    	minValue= arr[i];
			    }
			    else if(maxValue <= arr[i]) {
			    	maxValue = arr[i];
			    }
			sum += arr[i];
			
	}
		
		int average = sum/arr.length;
		System.out.println("il valore totale è " + sum);
		System.out.println("il valore medio è " + average);
		System.out.println("il valore massimo è " + maxValue);
		System.out.println("il valore minimo è " + minValue);
	}
	
}
