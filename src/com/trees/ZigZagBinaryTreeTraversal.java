package com.trees;

import java.util.Stack;

public class ZigZagBinaryTreeTraversal {
	public static void printZigZagTraversal(BinaryTreeNode root){
		boolean right=false;
		Stack<BinaryTreeNode> s1=new Stack<BinaryTreeNode>();
		Stack<BinaryTreeNode> s2=new Stack<BinaryTreeNode>();
		BinaryTreeNode temp;
		s1.push(root);
		while(!(s1.isEmpty()) || !(s2.isEmpty()))
		if(!right){
			while(!(s1.isEmpty())){
				temp=s1.pop();
				if(temp.leftNode!=null)
						s2.push(temp.leftNode);
				if(temp.rightNode!=null)
						s2.push(temp.rightNode);
				System.out.println(temp.data);
			}
			right=!right;
		}else{
			while(!(s2.isEmpty())){
				temp=s2.pop();
				if(temp.rightNode!=null)
						s1.push(temp.rightNode);
				if(temp.leftNode!=null)
						s1.push(temp.leftNode);
				System.out.println(temp.data);
			}
			right=!right;
		}
		
	}

	public static void main(String[] args) {
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
		BinaryTreeNode node7=new BinaryTreeNode(8);
		node3.leftNode=node7;
		BinaryTreeNode node8=new BinaryTreeNode(9);
		node3.rightNode=node8;
		BinaryTreeNode node9=new BinaryTreeNode(10);
		node6.rightNode=node9;
		printZigZagTraversal(root);

	}

}
