package com.collectors.interview;

public class AddEvenIndexes {

	static int addEvenIndexes(int[] intArr) {
		int sum = 0;
		for(int i=0; i<intArr.length; i+=2) {
			sum +=intArr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(addEvenIndexes(new int[]{2,1,3,4,6,7,8}));
	}

}
