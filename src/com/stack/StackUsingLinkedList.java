package com.stack;

import java.util.EmptyStackException;

public class StackUsingLinkedList {

	int length;
	ListNode top;

	public StackUsingLinkedList() {
		length = 0;
		top = null;
	}

	public void push(int data) {
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		length++;

	}

	public int pop() {
		if (isEmpty())
			throw new EmptyStackException();
		int data = top.getVal();
		top = top.next;
		length--;
		return data;
	}

	public boolean isEmpty() {
		if (top == null)
			return true;
		else
			return false;
	}

	public int peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return (top.val);
	}

	public int size() {
		return length;
	}

	public String toString() {
		String stack = "";
		ListNode current = top;
		while (current != null) {
			stack = stack + current.val + "\n";
			current = current.next;
		}
		return stack;
	}

	public static void main(String[] args) {

		StackUsingLinkedList st = new StackUsingLinkedList();
		st.push(1);
		st.push(2);
		int p = st.peek();
		System.out.println("after peek:" + p);
		st.pop();
		st.size();
		System.out.println(st);

	}

}
