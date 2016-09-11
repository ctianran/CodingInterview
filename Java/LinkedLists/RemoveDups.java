package com.company;

import java.util.HashSet;

/**
 * Created by Tianran on 9/11/2016.
 *
 * Question: Write code to remove duplicates from an unsorted linked list.
 * Follow up: How would you solve this problem if a temporary buffer is not allowed?
 *
 */
public class RemoveDups {
	//Time: O(n)
	public Node removeDupsI(Node head) {
		HashSet<Integer> set = new HashSet<Integer>();
		Node prev = null;
		Node cur = head;
		while(cur != null){
			if(set.contains(cur.data)){
				prev.next = cur.next;
			} else {
				set.add(cur.data);
				prev = cur;
			}
			cur = cur.next;
		}

		return head;
	}
	//Time: O(n^2).  Space: O(1)
	public Node removeDupsII(Node head){
		Node cur = head;
		while(cur != null){
			Node runner = cur;
			while(runner.next != null){
				if(runner.next.data == cur.data){
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			cur = cur.next;
		}
		return head;
	}

}
