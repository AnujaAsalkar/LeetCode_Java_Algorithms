package com.miscellaneos;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	
	public static List<List<Integer>> generatePascalTriangle(int numRows){
		
		List<List<Integer>> triangle=new ArrayList<List<Integer>>();
		List<Integer> innerList;
		if(numRows<=0)
			return triangle;
		
		if(numRows>0){
			innerList=new ArrayList<Integer>();
			innerList.add(1);
			triangle.add(innerList);
		}
		
		if(numRows>1){
			innerList=new ArrayList<Integer>();
			innerList.add(1);
			innerList.add(1);
			triangle.add(innerList);
		}
		
		if(numRows>2){
			int i=1;
			while(i<numRows-1){
				List<Integer> previousInnerList=triangle.get(i);
				List<Integer> temp=new ArrayList<Integer>();
				temp.add(1);
				for(int j=0;j<previousInnerList.size()-1;j++){
					temp.add(previousInnerList.get(j)+previousInnerList.get(j+1));
				}
				temp.add(1);
				triangle.add(temp);
				i++;
			}
		}
		return triangle;	
	}
	
	public static List<Integer> getRow(int rowIndex){
		List<Integer> row=new ArrayList<Integer>();
		List<List<Integer>> triangle=new ArrayList<List<Integer>>();
		List<Integer> innerList;
		if(rowIndex==0){
			row.add(1);
			triangle.add(row);
		}
		
		if(rowIndex>=1){
			innerList=new ArrayList<Integer>();
			innerList.add(1);
			triangle.add(innerList);
			innerList=new ArrayList<Integer>();
			innerList.add(1);
			innerList.add(1);
			triangle.add(innerList);
		}
		
		if(rowIndex>=2){
			int i=1;
			while(i<rowIndex){
				List<Integer> previousInnerList=triangle.get(i);
				List<Integer> temp=new ArrayList<Integer>();
				temp.add(1);
				for(int j=0;j<previousInnerList.size()-1;j++){
					temp.add(previousInnerList.get(j)+previousInnerList.get(j+1));
				}
				temp.add(1);
				triangle.add(temp);
				i++;
			}
		}
		return triangle.get(rowIndex);
	}

	public static void main(String[] args) {
		List<List<Integer>> triangle=generatePascalTriangle(5);
		for(List l: triangle){
			System.out.println(l);
		}
		List<Integer> triangleRow=getRow(3);
		System.out.println(triangleRow);

	}

}
