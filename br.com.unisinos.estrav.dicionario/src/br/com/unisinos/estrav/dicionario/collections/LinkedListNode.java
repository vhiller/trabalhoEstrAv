package br.com.unisinos.estrav.dicionario.collections;

/**
 * 
 * @author Leonardo Faitão
 * @author Vinicius Hiller
 * 
 */
public class LinkedListNode<T> {
	private T element;
	private LinkedListNode<T> next;

	/** Creates a node with null references to its element and next node. */
	public LinkedListNode() {
		this(null, null);
	}

	/** Creates a node with the given element and next node. */
	public LinkedListNode(T t) {
		this(t, null);
	}

	/** Creates a node with the given element and next node. */
	public LinkedListNode(T t, LinkedListNode<T> n) {
		element = t;
		next = n;
	}

	public T getElement() {
		return element;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}

	public void setElement(T newElem) {
		element = newElem;
	}

	public void setNext(LinkedListNode<T> newNext) {
		next = newNext;
	}
}
