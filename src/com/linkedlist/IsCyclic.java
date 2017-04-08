package com.linkedlist;

public class IsCyclic {
	
	 public static boolean hasCycle(ListNode head) {
		 if(head==null)
			 return false;
		 ListNode slow,fast;
		 fast=slow=head;
		 while(fast!=null && fast.next!=null){
			 fast=fast.next.next;
			 slow=slow.next;
			 if(slow==fast)
				 return true;
		 }
		return false;
	        
	 }
	 
	 public static void main(String args[]){
		 ListNode head=new ListNode(1);
		 ListNode node1=new ListNode(2);
		 head.next=node1;
		 ListNode node2= new ListNode(3);
		 node1.next=node2;
		 ListNode node3=new ListNode(4);
		 node2.next=node3;
		 ListNode node4=new ListNode(5);
		 node3.next=node4;
		 node4.next=node2;
		 boolean cycle=hasCycle(head);
		 System.out.println(cycle);
	 }

}
