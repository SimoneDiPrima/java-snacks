package org.generation.italy;

public class ManageArrayFirst{

	public static void main(String[] args) {
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int sum =0;
		for(int i = 0; i < arr.length;i++) {
			int min = arr[0 + i];
			int max = arr[arr.length - 1];
			if(min<i){
			System.out.println("il valore minimo è " + min);
			}
			if(arr[arr.length - 1] > arr[i]){
				System.out.println("il valore massimo è " + max);
			}
			sum += arr[i];
			
	}
		
		int average = sum/arr.length;
		System.out.println("il valore totale è " + sum);
		System.out.println("il valore medio è " + average);
	}
	
}
