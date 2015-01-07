package ba.bitcamp.exercise;

public class LinkedListInt {

	private int size;
	private Node head;

	public LinkedListInt() {

		head = null;
		size = 0;
	}

	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			size++;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		size++;
	}

	public void add(LinkedListInt other) {
		if (head == null) {
			head = other.head;
			size = other.size;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = other.head;
		size = size + other.size;

	}

	public void printList() {

		Node current = head;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}

	}

	public void removeAt(int index) {

		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("size is not valid");
		}

		if (index == 0) {
			head = head.next;
			size--;
			return;
		}
		Node current = head.next;
		Node previous = head;
		int counter = 1;
		while (counter < index) {
			current = current.next;
			previous = previous.next;
			counter++;

		}
		previous.next = current.next;
		current.next = null;
	}

	private class Node {

		public int value;
		public Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;

		}
	}

}
