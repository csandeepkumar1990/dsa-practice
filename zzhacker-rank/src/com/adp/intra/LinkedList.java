package com.adp.intra;

public class LinkedList {
	
	Node head;
	
	class Node {
		String value;
		Node next;
		
		public Node(String str) {
			this.value = str;
		}
	}
	
	
	private void add(LinkedList list, String data) {
		Node newNode = new Node(data);
		
		if(list.head == null) {
			list.head = newNode;
		} else {
			Node currentNode = list.head;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
		}
	}
	
	public static void main(String[] args) {
	}

}
