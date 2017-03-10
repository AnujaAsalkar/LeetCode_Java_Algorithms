package com.trees;

public class BinaryTreeNode {
	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
	public BinaryTreeNode(int data) {
		this.data=data;
		this.leftNode=null;
		this.rightNode=null;	
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryTreeNode getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(BinaryTreeNode leftNode) {
		this.leftNode = leftNode;
	}
	public BinaryTreeNode getRightNode() {
		return rightNode;
	}
	public void setRightNode(BinaryTreeNode rightNode) {
		this.rightNode = rightNode;
	}
    
}
