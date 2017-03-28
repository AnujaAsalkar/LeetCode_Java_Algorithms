package com.trees;

public class AncestorsOfNode {
	
	public static boolean printAncestors(BinaryTreeNode root, BinaryTreeNode target){
		if(root==null)
			return false;
		if(root.data==target.data){
			System.out.println(root.data);
			return true;
		}
		if(printAncestors(root.getLeftNode(), target) || printAncestors(root.getRightNode(), target)){
			System.out.println(root.getData());
			return true;
		}
		return false;
	}
	
	public static void main(String args[]){
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
		printAncestors(root, node6);
	}
}
