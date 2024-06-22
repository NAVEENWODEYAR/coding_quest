package com.collectors.interview;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Naveen K Wodeyar
 * @date 22/06/2024
 * @apiNote 
 *
 */
public class AnagramTest {

	static boolean anagramTest(String s1, String s2) {
		String[] split = s1.toLowerCase().split("");
		String[] split2 = s2.toLowerCase().split("");
		Arrays.sort(split);
		Arrays.sort(split2);
		
		return Arrays.equals(split, split2);
	}

	static boolean anagramTestJ8(String s1, String s2) {
		return Stream.of(s1.split("")).sorted().collect(Collectors.joining()).equals(Stream.of(s2.split("")).sorted().collect(Collectors.joining()));
		
	}
	
	static boolean anagramTestLoop(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		for(int i=0; i<s1.length()-1; i++) {
			if(a1[i] != a2[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(anagramTest("silenT", "Listen")?"Anagrams":"Not anagrams");
		System.out.println(anagramTestJ8("the classroom", "school master")?"Anagrams":"Not anagrams");
		System.out.println(anagramTestLoop("the classroom", "school master")?"Anagrams":"Not anagrams");
	}

}
