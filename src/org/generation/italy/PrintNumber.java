package org.generation.italy;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("dimmi un numero da 1 a 100:");
		 int num = sc.nextInt();
		 if(num%2 == 0) {
			 System.out.print("il numero scelto è pari");
		 }
		 else {
		 
			 System.out.print(num+1);

	}

}}




