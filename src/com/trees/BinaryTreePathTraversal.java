package com.trees;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePathTraversal {
	
	
	public static List<String> binaryTreePaths(BinaryTreeNode root) {
		List<String> paths=new LinkedList<String>();
		if(root==null)
			return paths;
		findPaths(root,"",paths);
		return paths;        
	}
	

	private static void findPaths(BinaryTreeNode root, String currentPath, List<String> paths) {
		if(root.getLeftNode()==null && root.getRightNode()==null){
			paths.add(currentPath+root.getData());
		}
		if(root.getLeftNode()!=null){
			findPaths(root.getLeftNode(), currentPath+root.getData()+"->", paths);
		}
		if(root.getRightNode()!=null){
			findPaths(root.getRightNode(), currentPath+root.getData()+"->", paths);
		}
		
	}


	public static void main(String[] args) {
		// create binary tree
		BinaryTreeNode root=new BinaryTreeNode(1);
		BinaryTreeNode node1=new BinaryTreeNode(2);
		root.leftNode=node1;
		BinaryTreeNode node2=new BinaryTreeNode(3);
		root.rightNode=node2;
		BinaryTreeNode node3=new BinaryTreeNode(4);
		node1.leftNode=node3;
		BinaryTreeNode node4=new BinaryTreeNode(5);
		node1.rightNode=node4;
		BinaryTreeNode node5=new BinaryTreeNode(6);
		node2.leftNode=node5;
		BinaryTreeNode node6=new BinaryTreeNode(7);
		node2.rightNode=node6;
		List<String> paths=binaryTreePaths(root);
		System.out.println("Paths from root to leaves:");
		for(String s: paths){
			System.out.println(s);
		}
	}

}
