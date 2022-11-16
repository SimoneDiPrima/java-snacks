package org.generation.italy;

public class ManageArrayFirst{

	public static void main(String[] args) {
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		for(int i = 0; i < arr.length;i++) {
			int min = arr[0 + i];
			int max = arr[arr.length - 1];
			if(min<i){
			System.out.println("il valore minimo è " + min);
			}
			if(arr[arr.length - 1] > arr[i]){
				System.out.println("il valore massimo è " + max);
			}
			
	}
		int total = arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]+arr[6]+arr[7]+arr[8]+arr[9];
		int average = total/arr.length;
		System.out.println("il valore totale è " + total);
		System.out.println("il valore medio è " + average);
	}
	
}
