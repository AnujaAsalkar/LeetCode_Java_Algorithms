package com.miscellaneos;

public class ReverseWordsInString {
	
	public static String reverseWords(String s){
	
		s=s.trim();
		String [] words=s.split("\\s+");
		String reverse="";
		for(int i=words.length-1;i>0;i--){
			reverse=reverse+words[i]+" ";
		}
		return reverse+words[0];
	}

	public static void main(String[] args) {
		String str="  how are you";
		String reversedStr=reverseWords(str);
		System.out.println(reversedStr);
		

	}

}
