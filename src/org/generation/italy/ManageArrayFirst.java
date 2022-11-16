package org.generation.italy;

public class ManageArrayFirst{

	public static void main(String[] args) {
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int minValue =1;
		int maxValue =87;
		int sum =0;
		for(int i = 0; i < arr.length;i++) {
			int min = arr[0 + i];
			int max = arr[arr.length - 1];
			if(minValue<=arr[i]){
			System.out.println("il valore minimo è " + minValue);
			}
			if(maxValue>=arr[i]){
				System.out.println("il valore massimo è " + maxValue);
			}
			sum += arr[i];
			
	}
		
		int average = sum/arr.length;
		System.out.println("il valore totale è " + sum);
		System.out.println("il valore medio è " + average);
	}
	
}
