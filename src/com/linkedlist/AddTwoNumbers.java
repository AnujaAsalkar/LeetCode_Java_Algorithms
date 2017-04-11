package com.linkedlist;

public class AddTwoNumbers {
	
	public static ListNode addNumbers(ListNode l1, ListNode l2){
		if(l1==null && l2==null)
			return null;
		ListNode current1=l1;
		ListNode current2=l2;
		ListNode head3=null,prev=null;
		int sum=0,carry=0;
		while(current1!=null && current2!=null){
			sum=current1.val+current2.val+carry;
			if(sum/10>=1){
				carry=sum/10;
				sum=sum%10;
			}
			else
				carry=0;
			ListNode newNode=new ListNode(sum);
			if(prev!=null){
				prev.next=newNode;
			}
			if(head3==null)
				head3=newNode;
			prev=newNode;
			current1=current1.next;
			current2=current2.next;
		}
		while(current1!=null){
			ListNode node;
			if(carry!=0){
				sum=carry+current1.val;
				if(sum/10>=1){
					carry=sum/10;
					sum=sum%10;
				}else
					carry=0;
				
				node=new ListNode(sum);
				
			}
			else{
				node=new ListNode(current1.val);	
			}
			prev.next=node;
			prev=node;	
			current1=current1.next;
		}
		while(current2!=null){
			ListNode node;
			if(carry!=0){
				sum=carry+current2.val;
				if(sum/10>=1){
					carry=sum/10;
					sum=sum%10;
				}else
					carry=0;
				node=new ListNode(sum);
				
			
			}
			else{
				node=new ListNode(current2.val);
			}
			prev.next=node;
			prev=node;
			current2=current2.next;
		}
		if(carry>0){
			prev.next=new ListNode(carry);
		}
		return head3;
	}
	
	public static ListNode addNumbers2(ListNode l1, ListNode l2){
		if(l1==null && l2==null)
			return null;
		ListNode current1=l1;
		ListNode current2=l2;
		ListNode head3=null,prev=null;
		int val1,val2,sum=0,carry=0;
		while(current1!=null || current2!=null){
			val1=(current1!=null) ? current1.val : 0;
			val2=(current2!=null) ? current2.val : 0;
			sum=val1+val2+carry;
			if(sum/10>=1){
				carry=sum/10;
				sum=sum%10;
			}
			else
				carry=0;
			ListNode newNode=new ListNode(sum);
			if(prev!=null){
				prev.next=newNode;
			}
			if(head3==null)
				head3=newNode;
			prev=newNode;
			if(current1!=null)
				current1=current1.next;
			if(current2!=null)
				current2=current2.next;
		}
		if(carry>0){
			prev.next=new ListNode(carry);
		}
		return head3;
	}

	public static void main(String[] args) {
		 ListNode head1=new ListNode(9);
		 ListNode node1=new ListNode(1);
		 head1.next=node1;
		 ListNode node2= new ListNode(6);
		 node1.next=node2;
		 ListNode head2=new ListNode(0);
		 ListNode current=head3;
		 while(current!=null){
			 System.out.print(current.val);
			 current=current.next;
			 if(current!=null)
				 System.out.print("->");
		 }

	}

}
