package com.collectors.exception;
/**
 * @author Naveen K Wodeyar
 * @date 22-Jul-2024
 */
public class StackOverFlowEx {

	static void stackOverflow() {
		stackOverflow();
	}
	public static void main(String[] args) {
		System.out.println("\nStackOverflowError");
		try {
			stackOverflow();
		} catch (StackOverflowError e) {
			System.err.println("StackOverFlowError caught,"+e);
		}
	}
}
