package com.trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static List<List<Integer>> levelOrder(BinaryTreeNode root) {
    	if(root==null)
    		return null;
    	List<List<Integer>> nodesAtAllLevels= new LinkedList<List<Integer>>();
    	List<Integer> nodesAtSameLevel = new LinkedList<Integer>();
    	Queue<BinaryTreeNode> q=new LinkedList<BinaryTreeNode>();
    	BinaryTreeNode current;
    	q.offer(root);
    	q.offer(null);
    	while(!q.isEmpty()){
    		current=q.poll();
    		if(current!=null){
    			nodesAtSameLevel.add(current.getData());
    			if(current.getLeftNode()!=null)
    				q.offer(current.leftNode);
    			if(current.getRightNode()!=null)
    				q.offer(current.rightNode);
    			
    		}else{
    		
				List<Integer> nodesAtSameLevelTemp = new LinkedList<Integer>(nodesAtSameLevel);
				nodesAtAllLevels.add(nodesAtSameLevelTemp);
				nodesAtSameLevel.clear();
				if(!q.isEmpty())
					q.add(null);
    			
    		}
    	}
    	return nodesAtAllLevels;
    }

	public static void main(String[] args) {
		//create binary tree
		BinaryTreeNode root=new BinaryTreeNode(3);
		BinaryTreeNode node1=new BinaryTreeNode(9);
		root.leftNode=node1;
		BinaryTreeNode node2=new BinaryTreeNode(20);
		root.rightNode=node2;
		BinaryTreeNode node5=new BinaryTreeNode(15);
		node2.leftNode=node5;
		BinaryTreeNode node6=new BinaryTreeNode(7);
		node2.rightNode=node6;
		List<List<Integer>> nodes= levelOrder(root);
		for(List l:nodes){
			System.out.println(l.toString());
		}

	}

}
