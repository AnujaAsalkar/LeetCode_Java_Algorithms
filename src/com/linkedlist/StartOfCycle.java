package com.linkedlist;

public class StartOfCycle {
	
	public static ListNode detectCycle(ListNode head) {
		 if(head==null)
			 return null;
		 ListNode slow,fast;
		 boolean cycle=false;
		 fast=slow=head;
		 while(fast!=null && fast.next!=null){
			 fast=fast.next.next;
			 slow=slow.next;
			 if(slow.next==fast.next){
				 cycle=true;
				 break;
			 }	
		}
		if(cycle){
			 slow=head;
			 while(slow!=fast){
				 slow=slow.next;
				 fast=fast.next;
			 }
			 return fast;
		}
		else
			return null;     
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
		 ListNode cycleAt=detectCycle(head);
		 if(cycleAt!=null)
			 System.out.println(cycleAt.val);
		 else
			 System.out.println("null");
	 }

}
