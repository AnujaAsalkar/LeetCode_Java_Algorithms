package com.leetcode;

/*
 * Problem Statement: Given an array of n integers find the unique quadruplets in array 
 * such that a+b+c+d=target where a,b,c,d are inetegers in array
 * */

import java.util.*;

public class SumOfFour {
	
	 public static List<List<Integer>> fourSum(int[] nums, int target) {
		 	
		 	List<List<Integer>> quadrupletsList=new ArrayList<List<Integer>>();
		 	int tempTarget,left,right,tempSum;
		 	
		 	Arrays.sort(nums);
		 
		 	for(int i=0;i<nums.length;i++){
		 		for(int j=i+1;j<nums.length;j++){
		 			tempTarget=target-nums[i]-nums[j];
		 			left=j+1;
		 			right=nums.length-1;
		 			while(left<right){	
		 				tempSum=nums[left]+nums[right];
	 					if(tempSum==tempTarget){	 
	 						
	 						List<Integer> quadruplets =new ArrayList<Integer>();
	 						quadruplets.add(nums[i]);
	 						quadruplets.add(nums[j]);
	 						quadruplets.add(nums[left]);
	 						quadruplets.add(nums[right]);
	 						quadrupletsList.add(quadruplets);
	 						
	 						left++;
	 						right--;
	 						
	 						while(left<nums.length && nums[left]==nums[left-1])
	 							left++;
	 						
	 						while(right>j && nums[right]==nums[right+1])
	 							right--;
	 						
	 					}else if(tempSum>tempTarget){
	 						right--;
	 					}else
	 						left++;
		 			}
		 			while(j+1<nums.length && nums[j]==nums[j+1])
		 				j++;
		 		}
		 		while(i+1<nums.length && nums[i]==nums[i+1])
	 				i++;
		 	}
		 	System.out.println("output:");
		 	for(List<Integer> l : quadrupletsList){
		 		System.out.println(l);
		 	}
	        return quadrupletsList;
	   }

	public static void main(String[] args) {
		int [] nums={1, 0, -1, 0, -2, 2};
		int target=0;
		fourSum(nums, target);
	}

}
