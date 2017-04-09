package com.linkedlist;

import java.util.List;

public class ReverseLinkList {
	
	public static ListNode reverseList(ListNode head){
		if(head==null)
			return head;
		ListNode currentNode=head;
		ListNode afterNode,beforeNode=null;
		while(currentNode!=null){
			afterNode=currentNode.next;
			currentNode.next=beforeNode;
			beforeNode=currentNode;
			currentNode=afterNode;
		}
		return beforeNode;
	}

	public static void main(String[] args) {
		 ListNode head=new ListNode(1);
		 ListNode node1=new ListNode(2);
		 head.next=node1;
		 ListNode node2= new ListNode(3);
		 node1.next=node2;
		 ListNode node3=new ListNode(4);
		 node2.next=node3;
		 ListNode node4=new ListNode(5);
		 node3.next=node4;
		 ListNode newHead=reverseList(head);
		 ListNode current=newHead;
		 System.out.println("Reversed Linked List:");
		 while(current!=null){
			 System.out.print(current.val);
			 current=current.next;
			 if(current!=null)
				 System.out.print("->");
		 }
		 
		 

	}

}
