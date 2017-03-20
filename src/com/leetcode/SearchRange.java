package com.leetcode;

/*
 * Problem Statement: In a ascending sorted integer array(array contains repeated integers)
 * find the starting and ending position of a given target value. 
 * */

public class SearchRange {
	
	public static int[] searchRange(int[] nums, int target) {
		int [] range={0,0};
		
		if(nums.length==1 && nums[0]==target)
			return range;
		int found=binarySearch(nums,target);
		range[0]=-1;
		range[1]=-1;
		System.out.println(found);
		if(found==-1){
			System.out.println(-1);
			return range;
		}
		range[0]=0;
		range[1]=0;
		if(found>=1 && nums[found-1]==target){
			System.out.println(found-1);
			range[0]=found-1;
			range[1]=found;
		}
	
		if(found<nums.length-1 && nums[found+1]==target){
			range[0]=found;
			range[1]=found+1;
		}
		
		return range;
        
    }
	
	public static int binarySearch(int [] arr, int x){
		int low=0,high=arr.length-1;
		int mid;
		while(low<=high){
			mid=low+(high-low)/2;
			if(x==arr[mid]){
				return mid;
			}else if(x < arr[mid]){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int [] nums=new int [] {1,4};
		int [] range=searchRange(nums, 4);
		System.out.println(range[0]+" "+range[1]);
		

	}

}
