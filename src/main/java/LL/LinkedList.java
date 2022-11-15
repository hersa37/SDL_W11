package LL;

import java.util.NoSuchElementException;

public class LinkedList <T extends Comparable<T>> {

	private int size;
	private final LinkedListNode<T> head;

	public LinkedList() {
		size = 0;
		head = new LinkedListNode<T>();
		head.setNext(head);
		head.setPrevious(head);
	}

	public void addBefore(T data, LinkedListNode<T> pivot) {
		LinkedListNode<T> temp = new LinkedListNode<>(data, pivot.getPrevious(),pivot);
		pivot.getPrevious().setNext(temp);
		pivot.setPrevious(temp);
		size++;
	}

	public void addAfter(T data, LinkedListNode<T> pivot) {
		addBefore(data, pivot.getNext());
	}

	public void addFirst(T data) {
		addBefore(data, head.getNext());
	}

	public void addLast(T data) {
		addBefore(data, head);
	}

	public T remove(LinkedListNode<T> object) throws NoSuchElementException{
		if(size == 0) {
			throw new NoSuchElementException("Empty List");
		}
		object.getPrevious().setNext(object.getNext());
		object.getNext().setPrevious(object.getPrevious());
		size--;
		return object.getData();
	}

	public T removeFirst() {
		return remove(head.getNext());
	}

	public T removeLast() {
		return remove(head.getPrevious());
	}


	public LinkedListNode<T> search(T key) {
		LinkedListNode<T> temp = head.getNext();
		while(!temp.equals(head)) {
			if(temp.compareTo(key) == 0) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}
	public String toString(){
		StringBuilder output = new StringBuilder();
		LinkedListNode<T> temp = head.getNext();
		while(!temp.equals(head)){
			output.append(temp.getData());
			temp = temp.getNext();
		}
		return output.toString();
	}
}
