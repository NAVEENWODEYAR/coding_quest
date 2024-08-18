package com.collectors.string;
/**
 * @author Naveen K Wodeyar
 * @date 12-Aug-2024
 */
public class StrCompare {

		 public static void main(String[] args) {
		 String s1 = "Hello";
		 String s2 = s1 + "World";
		 String s3 = "HelloWorld";
		 String s4 = "Hello" + "World";

//		 System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4);
		 System.out.println(s2+"="+s3+"\n");
		 System.out.println(s2 == s3);
		 System.out.println(s3 == s4);
		 }

}
