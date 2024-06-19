package com.collectors.interview;

import java.util.*;
/**
 * @author Naveen K Wodeyar
 * @date 20/06/2024
 * @apiNote Find highest frequent character in a string,
 */
public class CharacterFrequency {

	static char charFreq(String st) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		
		for(char c: st.toLowerCase().toCharArray()) {
			hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
		}
		System.out.println(hashMap);
		char mostFreq = ' ';
		int freq=0;
		for(Map.Entry<Character, Integer> mp: hashMap.entrySet()) {
			if(mp.getValue() > freq) {
				mostFreq = mp.getKey();
			}
		}
		return mostFreq;
	}
	
	public static void main(String[] args) {
		System.out.println(charFreq("level"));
	}

}
