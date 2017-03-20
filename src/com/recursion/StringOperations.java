package com.recursion;

public class StringOperations {
	
	public static int countCharacterOccurrence(char ch, String str){
		if(str==null || str.equals("")){
			return 0;
		}else if(ch==str.charAt(0)){
			return 1 + countCharacterOccurrence(ch, str.substring(1));
		}else
			return countCharacterOccurrence(ch, str.substring(1));
		
	}

	public static String removeVowels(String str){
		if(str==null || str.equals("")){
			return "";
		}else if(str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i'
				|| str.charAt(0)=='o' || str.charAt(0)=='u'){
			return removeVowels(str.substring(1));
		}else{
			return str.charAt(0)+removeVowels(str.substring(1));
		}
	}
	
	
	public static void main(String[] args) {
		
		int occurrence=countCharacterOccurrence('q',"helloeeooe");
		System.out.println(occurrence);
		
		String vowelString=removeVowels("anuja");
		System.out.println(vowelString);
	}

}
