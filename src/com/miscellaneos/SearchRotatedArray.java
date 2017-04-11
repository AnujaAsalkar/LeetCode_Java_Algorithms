package com.miscellaneos;
/*
 * Problem Statement: Search for an integer in a sorted array which is rotated at some point unknown beforehand
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * */
public class SearchRotatedArray {
	
	public static int searchElement(int [] nums,int target){
		int i=1,len=nums.length;
		int foundAtIndex=-1;
		if(len==0)
			return -1;
		if(len==1){
			if(nums[0]==target)
				return 0;
			else 
				return -1;
		}
		while(i<len){
			if(nums[i-1]<=nums[i])
				i++;
			else
				break;
			
		}
		if(i!=len){
			int [] sortedArray=constructSortedArray(nums,i);
			foundAtIndex=BinarySearch(sortedArray,target);
		}
		else{
			foundAtIndex=BinarySearch(nums,target);
		}	
		return foundAtIndex;
	}
	
	public static int[] constructSortedArray(int [] arr, int pivot){
		int [] sortedArray=new int [arr.length];
		int i=0,startIndex=pivot;
		for(int j=startIndex;j<arr.length;j++){
			sortedArray[i++]=arr[j];
		}
		for(int j=0;j<pivot;j++){
			sortedArray[i++]=arr[j];
		}
		return sortedArray;
	}
	
	
	public static int BinarySearch(int [] arr, int x){
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
		int [] arr={1,1,3,1,1};
		int found=searchElement(arr,3);
		System.out.println(found);
	}

}
