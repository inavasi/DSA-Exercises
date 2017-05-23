package de.unistuttgart.dsass2017.ex04.p2;

public class LinkedListNode<T extends Comparable<T>> implements ILinkedListNode<T>{
 T element; LinkedListNode<T> next; LinkedListNode<T> prev; 
 
	public LinkedListNode (){
	element = null; next = null; prev = null;
	}

	@Override
	public T getElement() {	
		return element;
	}

	@Override
	public void setElement(T element) {
		this.element = element;
		
	}

	@Override
	public ILinkedListNode<T> getNext() {
		return next;
	}

	@Override
	public void setNext(ILinkedListNode<T> next) {
		this.next = (LinkedListNode<T>) next;
		
	}

	@Override
	public ILinkedListNode<T> getPrev() {
		return prev;
	}

	@Override
	public void setPrev(ILinkedListNode<T> prev) {
		this.prev = (LinkedListNode<T>) prev;		
	}
	
}
