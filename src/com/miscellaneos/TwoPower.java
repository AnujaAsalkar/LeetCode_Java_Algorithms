package com.miscellaneos;


/* 
 * Problem Statement: Determine whether a given integer is power of two or not
 * Hint: 
 * 1. Any integer which is power of 2 conatins only one '1' in binary form
 * using this to solve the problem 
 * By ANDing n and (n-1)
 * 2. Two's complement of a number & the number is equal to the number 
 * if the number is power of two
 * 
 */

public class TwoPower {

	public static boolean isPowerOfTwo1(int n){
		if(n<=0)
			return false;
		else	
			return (((n&(n-1))==0));
			
	}
	
	public static boolean isPowerOfTwo2(int n){
		if(n<=0)
			return false;
		else	
			return (((~n+1)&(n))==n);
	}
	
	
	public static boolean isPowerOfTwo3(int n) {
        int temp=n;
        boolean isPower=true;
        if(temp==1)
        {
        	return isPower;
        }
        else{
	        while(true){
	        	if(temp%2==0 && temp!=0){
	        		temp=temp/2;
	        	}
	        	else{
	        		if(temp==1){
	        			isPower=true;
	        			break;
	        		}
	        		else{
		        		isPower=false;
		        		break;
	        		}
	        	}
	        }
	        return isPower;
        }
    }
	
	public static void main(String[] args) {
		boolean isPower=isPowerOfTwo1(12);
		System.out.println(isPower);

	}
	
	
}
