package com.leetcode;

/*
 * Problem Statement: For a given matrix m*n, if an element is 0, 
 * set its entire row and column to 0
 */


import java.util.*;

public class MatrixSetZeros {
	
	 public static void setZeroes(int[][] matrix) {
		 int i,j,k;
		 int iIndex =-1,jIndex=-1;
		 List<Integer> iIndices=new LinkedList<Integer>();
		 List<Integer> jIndices=new LinkedList<Integer>();
		 for(i=0;i<matrix.length;i++){
			 for( j=0;j<matrix[i].length;j++){
				 if(matrix[i][j]==0){
					 iIndices.add(i);
					 jIndices.add(j);
				 }
			 }
		}
		if(iIndices.size()!=0){
			for(k=0;k<iIndices.size();k++)
			{
				iIndex=iIndices.get(k);
				for(i=0;i<matrix[iIndex].length;i++){
						matrix[iIndex][i]=0;	
				}
			}
		}
		if(jIndices.size()!=0){
			for(k=0;k<jIndices.size();k++)
			{
				jIndex=jIndices.get(k);
				for(j=0;j<matrix.length;j++){
					matrix[j][jIndex]=0;
						
				}
			}
		}
		System.out.println("output:");
		for(i=0;i<matrix.length;i++){
			 for( j=0;j<matrix[i].length;j++){
				 System.out.print(matrix[i][j]);
			 }
			 System.out.println("");
		}
		
	 }
		 
	         
	public static void main(String[] args) {
		int [][] matrix={{0,0,1},{2,1,3},{4,5,6}};
		setZeroes(matrix);

	}

}
