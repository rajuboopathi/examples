package com.examples.basic;

public class ReplaceSpaceWithEncodingCharater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "te st ";
		char[] strArray = new char[256];
		for (int i = 0; i < str.length(); i++) {
			strArray[i] = str.charAt(i);;
		}
		ReplaceSpaceWithEncodingCharater replaceSpaceWithEncodingCharater = new ReplaceSpaceWithEncodingCharater();
		replaceSpaceWithEncodingCharater.replaceSpace(strArray, 6);
		System.out.println("strArray :"+String.copyValueOf(strArray));

	}
	
	public void replaceSpace(char[] str, int length) {
		int count =0; 
		for (int i=0; i < length ; i++) {
			 if(str[i] == ' ') {
				 count++;
			 }
		}
		int newLength = length + count * 2;
		str[newLength] ='\0';
		for (int j=length-1; j>=0 ; j--) {
			if(str[j] == ' ') {
				str[newLength-1] = '0';
				str[newLength-2] = '2';
				str[newLength-3] = '%';
				newLength = newLength-3;
			} else {
				str[newLength-1] = str[j];
				newLength--;
			}
		}
		
	}

}
