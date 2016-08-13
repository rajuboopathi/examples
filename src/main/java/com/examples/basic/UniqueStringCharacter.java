package com.examples.basic;

public class UniqueStringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueStringCharacter uniqueStringCharacter = new UniqueStringCharacter();
		System.out.println("isUnique :" + uniqueStringCharacter.isUniqueChars("abcdefghijklmnopqrstuvwxyz1234567890"));

	}

	public boolean isUniqueChars(String str) {

		if (str.length() > 256)
			return false;

		boolean[] charset = new boolean[256];

		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (charset[val]) {
				return false;
			}
			charset[val] = true;
		}
		return true;
	}

}
