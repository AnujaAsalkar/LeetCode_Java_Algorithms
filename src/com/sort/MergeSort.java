package com.sort;

public class MergeSort {
	
	public static void divide(int[] nums){
		int len=nums.length;
		if(len<2){
			return;
		}
		int mid=(len)/2;
		int [] right= new int[len-mid];
		int [] left = new int[mid];
		
		for(int i=0;i<mid;i++){
			left[i]=nums[i];
		}
		for(int j=mid;j<len;j++){
			right[j-mid]=nums[j];
		}
		divide(left);
		divide(right);
		merge(left,right,nums);
	
	}
		
	public static void merge(int[] left,int[] right,int[] original){
		int leftLen=left.length;
		int rightLen=right.length;
		int i=0,j=0,k=0;
		while(i<leftLen && j<rightLen){
			if(left[i]<right[j]){
				original[k++]=left[i];
				i++;
			}else{
				original[k++]=right[j];
				j++;
			}
		}
		while(i<leftLen)
			original[k++]=left[i++];
	
		while(j<rightLen)
			original[k++]=right[j++];	
	}
	
}
