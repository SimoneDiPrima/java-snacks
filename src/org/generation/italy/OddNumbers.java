package org.generation.italy;


public class OddNumbers {

	public static void main(String[] args){
		int[]numbers = {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i =1;i<numbers.length;i++) {
		if(i%2!=0) {
		sum +=i;
		}
		}
		System.out.println(sum);
	}
}
