package de.unistuttgart.dsass2017.ex04.p2;

public class CircularLinkedList<T extends Comparable<T>> implements
		ICircularLinkedList<T> {
	private ILinkedListNode<T> head; 
	private ILinkedListNode<T> end; 
	public int size;
	public int index;
	
	public CircularLinkedList(){
		head = null; end = null; size = 0; //head = new LinkedListNode<T>();
	}
	
	public boolean isEmpty() { 
		return head.getNext() == null; 
	}

	@Override
	public void append(T element) {
		LinkedListNode<T> node = new LinkedListNode<T>();
		if(head == null){
			head = node;
			end = head;
		} else {
			 node.setPrev(end);
	         node.setNext(node);
	         end = node;
		}
	}

	@Override
	public T get(int index) {
		T current = null;
		
		if (index == size()-1) {
			current = end.getElement();
		} else if (index == 0) {
		    current = head.getElement();
		} else {
		    ILinkedListNode<T> tempNode = head;
		    for (int i = 0; i < index; i++) {
		        tempNode = (LinkedListNode<T>) tempNode.getNext();
		    }

		    current = tempNode.getElement();

		}
		return current;
	}

	@Override
	public int size() {		
		  size = 0;
		  ILinkedListNode<T> n = head.getNext();   
	        while (n != head){
	            size ++;
	            n = n.getNext();
	        }
	        return size;		
	}

	@Override
	public ILinkedListNode<T> getHead() {		
		return head;
	}
	
	

}
