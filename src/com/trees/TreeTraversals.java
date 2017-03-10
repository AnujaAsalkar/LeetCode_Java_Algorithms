package com.trees;

import java.util.Stack;

public class TreeTraversals {
	
	public static void PreOrderTraversal(BinaryTreeNode root){
		Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
		if(root==null)
			return; 
		BinaryTreeNode currentNode=root;
		stack.push(currentNode);
		while(!(stack.isEmpty())){
			currentNode=stack.pop();
			System.out.println(currentNode.data);
			if(currentNode.rightNode!=null)
				stack.push(currentNode.rightNode);
			if(currentNode.leftNode!=null)
				stack.push(currentNode.leftNode);
		}	
	}
	
	public static void InOrderTraversal(BinaryTreeNode root){
		Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
		if(root==null)
			return; 
		BinaryTreeNode currentNode=root;
		boolean done=false;
		while(true){
			if(currentNode!=null){
				stack.push(currentNode);
				currentNode=currentNode.leftNode;
			}else{
				if((stack.isEmpty())){
					break;
				}else{
						currentNode=stack.pop();
						System.out.println(currentNode.data);
						currentNode=currentNode.rightNode;	
				}
			}
		}
	}
	
	public static void PostOrderTraversal(BinaryTreeNode root){
		Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
		if(root==null)
			return; 
		stack.push(root);
		BinaryTreeNode previousNode=null;
		while(!(stack.empty())){
			BinaryTreeNode currentNode=stack.peek();
			if(previousNode==null || previousNode.leftNode==currentNode || previousNode.rightNode==currentNode){
				if(currentNode.leftNode!=null){
					stack.push(currentNode.leftNode);
				}else if(currentNode.rightNode!=null){
					stack.push(currentNode.rightNode);
				}
			}else if(currentNode.leftNode==previousNode){
				if(currentNode.rightNode!=null)
					stack.push(currentNode.rightNode);
			}else{
				BinaryTreeNode temp=stack.pop();
				System.out.println(temp.data);
				
			}
			previousNode=currentNode;
		}
	}
	
	public static void main(String[] args) {
		//create binary tree
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
		//PreOrderTraversal(root);
		//InOrderTraversal(root);
		PostOrderTraversal(root);
	}

}
