//public class Linked {
//
//	private int size;
//	private LinkedListNode head;
//
//	public Linked(){
//		size = 0;
//		head = new LinkedListNode(head,head);
//	}
//
//	public void addAfter(int index, LinkedListNode node){
//		LinkedListNode temp = findAt(index);
//		node.setNext(temp.getNext());
//		node.setPrevious(temp);
//		temp.getNext().setPrevious(node);
//		temp.setNext(node);
//	}
//
//	public void addBefore(int index, LinkedListNode node) {
//		addAfter(index-1,node);
//	}
//
//	public void addFirst(LinkedListNode node) {
//		addAfter(0,node);
//	}
//
//	public void addLast(LinkedListNode node) {
//		addAfter((size - 1), node);
//	}
//
//	public void addBefore(LinkedListNode nodeRelative, int data) {
//		LinkedListNode newNode = new LinkedListNode(14,nodeRelative.getPrevious(),nodeRelative);
//		nodeRelative.getPrevious().setNext(newNode);
//		nodeRelative.setPrevious(newNode);
//	}
//
//	public void addAfter(LinkedListNode nodeRelative, int data) {
//		addBefore(nodeRelative.getNext(),data);
//	}
//
//	public void addFirst(int data) {
//		addBefore(head.getNext(),data);
//	}
//
//	public void addLast(int data) {
//		addBefore(head,data);
//	}
//
//	private LinkedListNode findAt(int index) {
//		LinkedListNode temp = head;
//		if(index < (size/2)) {
//			int counter = 0;
//			while(counter != index) {
//				temp = temp.getNext();
//				counter++;
//			}
//		} else {
//			int counter = size -1 ;
//			while(counter != index) {
//				temp = temp.getPrevious();
//				counter--;
//			}
//		}
//
//		return temp;
//	}
//
//}
