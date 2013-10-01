package br.com.unisinos.estrav.dicionario.collections;

/**
 * 
 * @author Leonardo Faitão
 * @author Vinicius Hiller
 * 
 */
public class Node<T> {
	private T element;
	private Node<T> next;

	/** Creates a node with null references to its element and next node. */
	public Node() {
		this(null, null);
	}

	/** Creates a node with the given element and next node. */
	public Node(T t) {
		this(t, null);
	}

	/** Creates a node with the given element and next node. */
	public Node(T t, Node<T> n) {
		element = t;
		next = n;
	}

	public T getElement() {
		return element;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setElement(T newElem) {
		element = newElem;
	}

	public void setNext(Node<T> newNext) {
		next = newNext;
	}
}
