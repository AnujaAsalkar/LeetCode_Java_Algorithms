package com.miscellaneos;

/*
 * Problem Statement: Decode an encoded string
 * k[encoded_string] implies repeat the encoded_string k times
 * k is an integer 
 * */

import java.util.Stack;

public class DecodeString {
		
	public static String decodedString(String encodedString){
		Stack<String> chars=new Stack<String>();
		Stack<Integer> charsCount=new Stack<Integer>();
		int len=encodedString.length();
		char ch;
		String s;
		int temp,count;
		for(int i=0;i<len;i++){
			ch=encodedString.charAt(i);
			if(ch>='0'&& ch<='9')//integer push into count stack
			{
				//convert char to integer and push
				temp=Character.getNumericValue(ch);
				charsCount.push(temp);
				
			}
			else if(ch!=']'){
				chars.push(String.valueOf(ch));
			}else{
				StringBuilder str=new StringBuilder();
				count=charsCount.pop();
				while(!(chars.peek().charAt(0)==('['))){
					s=chars.pop();
					str.insert(0, s);	
				}
				chars.pop();
				String st=str.toString();
				for(int j=1;j<count;j++){
					str.append(st);
				}
				chars.push(str.toString());
			}
		
		}
		StringBuilder sb=new StringBuilder();
		while(!(chars.isEmpty())){
			sb.insert(0,chars.pop());
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String dString=decodedString("3[a2[ef]]");
		System.out.println(dString);
	}
}
