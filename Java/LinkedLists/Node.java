package com.company;

/**
 * Created by Tianran on 9/10/2016.
 */
public class Node {
	int data;
	Node next = null;

	public Node(int data){
		this.data = data;
	}

	public void appendToTail(int data){
		Node end = new Node(0);
		Node n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}

	public Node deleteNode(Node head, int data){
		Node n = head;

		if(n.data == data){
			return head.next;
		}

		while(n.next != null){
			if(n.next.data == data){
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
}
