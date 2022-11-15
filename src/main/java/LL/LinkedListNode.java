package LL;

public class LinkedListNode <T extends Comparable<T>> implements Comparable<T>{
	private T data;
	private LinkedListNode<T> previous;
	private LinkedListNode<T> next;

	public LinkedListNode(){}

	public LinkedListNode(T data, LinkedListNode<T> previous, LinkedListNode<T> next) {
		this.data = data;
		this.previous = previous;
		this.next = next;
	}

	public LinkedListNode(LinkedListNode<T> previous, LinkedListNode<T> next) {
		this.previous = previous;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public LinkedListNode<T> getPrevious() {
		return previous;
	}

	public void setPrevious(LinkedListNode<T> previous) {
		this.previous = previous;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}

	public void setNext(LinkedListNode<T> next) {
		this.next = next;
	}

	@Override
	public int compareTo(T t) {
		return data.compareTo(t);
	}

	public String toString() {
		return data.toString();
	}


}
