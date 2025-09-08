package singly_linked_list;

public class SinglyLinkedList<Z> implements SinglyLinkedListInterface<Z> {
	
	private Node<Z> head;
	private Node<Z> tail;
	private int size;
	
	public SinglyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public void addFirst(Z item) {
		Node<Z> newNode = new Node<>(item);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	
	public void addLast(Z item) {
		Node<Z> newNode = new Node<>(item);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public void add(int index, Z item) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		
		if (index == 0) {
			addFirst(item);
			return;
		}
		
		if (index == size) {
			addLast(item);
			return;
		}
		
		Node<Z> newNode = new Node<>(item);
		Node<Z> current = head;
		
		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}
		
		newNode.next = current.next;
		current.next = newNode;
		
		size++;
	}
	
	public Z removeFirst() {
		if (isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		
		Z removedData = head.data;
		
		if (head == tail) { // only one element
			head = null;
			tail = null;
		} else {
			head = head.next;
		}
		
		size--;
		
		return removedData;
	}

	@Override
	public Z removeLast() {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Z remove(int index, Z item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeItem(Z item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Z getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Z getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Z get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Z item) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
