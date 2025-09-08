package singly_linked_list;

public class Node<E> {
	
	E data;
	Node<E> next;
	
	Node(E d) {
		this.data = d;
	}
	
	public String toString() {
		return "[" + data + "]";
	}
	
}
