package com.trees;

import java.util.Stack;

public class CheckIfBST {
	
	public static boolean isBST(BinaryTreeNode root){
		int min=Integer.MIN_VALUE;
		BinaryTreeNode node, current=root;
		Stack<BinaryTreeNode> s=new Stack<BinaryTreeNode>();
		while(true){
			if(current!=null){
				s.push(current);
				current=current.leftNode;
			}else{
				if(s.isEmpty())
					break;
				node=s.pop();
				if(node.data<min)
					return false;
				min=node.data;
				current=node.rightNode;	
			}
		}
		return true;
	}

	public static void main(String[] args) {
		BinaryTreeNode root=new BinaryTreeNode(12);
		BinaryTreeNode node1=new BinaryTreeNode(5);
		root.leftNode=node1;
		BinaryTreeNode node2=new BinaryTreeNode(15);
		root.rightNode=node2;
		BinaryTreeNode node3=new BinaryTreeNode(3);
		node1.leftNode=node3;
		BinaryTreeNode node4=new BinaryTreeNode(7);
		node1.rightNode=node4;
		BinaryTreeNode node5=new BinaryTreeNode(13);
		node2.leftNode=node5;
		BinaryTreeNode node6=new BinaryTreeNode(17);
		node2.rightNode=node6;
		BinaryTreeNode node7=new BinaryTreeNode(1);
		node3.leftNode=node7;
		BinaryTreeNode node8=new BinaryTreeNode(9);
		node4.rightNode=node8;
		BinaryTreeNode node9=new BinaryTreeNode(14);
		node5.rightNode=node9;
		BinaryTreeNode node10=new BinaryTreeNode(20);
		node6.rightNode=node10;
		BinaryTreeNode node11=new BinaryTreeNode(18);
		node10.leftNode=node11;
		BinaryTreeNode node12=new BinaryTreeNode(25);
		node10.rightNode=node12;
		boolean bst=isBST(root);
		System.out.println(bst);
	

	}

}
