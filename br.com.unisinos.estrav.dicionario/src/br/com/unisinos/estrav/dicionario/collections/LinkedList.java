package br.com.unisinos.estrav.dicionario.collections;

import static br.com.unisinos.estrav.dicionario.utils.FileHandler.SEPARADOR;

/**
 * 
 * @author Leonardo Faitão
 * @author Vinicius Hiller
 * 
 */
public class LinkedList<T> {
	private static final String MENSAGEM_ERRO = "Ocorreu uma falha na operação devido a lista estar nula.";

	private LinkedListNode<T> head; // nodo cabeça da lista
	private LinkedListNode<T> tail; // nodo cauda da lista
	private long size; // número de nodos da lista

	/**
	 * Método que retorna se a lista está vazio se baseando pelo atributo head
	 * da mesma.
	 * 
	 * @return boolean (lista = vazia)
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * Método que retorna o primeiro elemento da lista.
	 * 
	 * @return Node nodo contendo o primeiro elemento.
	 */
	public LinkedListNode<T> getFirst() {
		if (isEmpty())
			throw new RuntimeException(MENSAGEM_ERRO);
		return head;
	}

	/**
	 * Método que retorna o último elemento da lista.
	 * 
	 * @return Node nodo contendo o último elemento.
	 */
	public LinkedListNode<T> getLast() {
		if (isEmpty())
			throw new RuntimeException(MENSAGEM_ERRO);
		return tail;
	}

	/**
	 * Método que adiciona um elemento na primeira posição da lista.
	 * 
	 * @param element
	 *            - elemento genérico a ser adicionado.
	 */
	public void addFirst(T element) {
		LinkedListNode<T> novoNodo = new LinkedListNode<T>(element);
		novoNodo.setNext(head);
		head = novoNodo;
		size++;
		if (size == 1)
			tail = head;
	}

	/**
	 * Método que adiciona um elemento na última posição da lista.
	 * 
	 * @param element
	 *            - elemento genérico a ser adicionado.
	 */
	public void addLast(T element) {
		if (isEmpty())
			addFirst(element);
		else {
			LinkedListNode<T> novoNodo = new LinkedListNode<T>(element);
			novoNodo.setNext(null);
			tail.setNext(novoNodo);
			tail = novoNodo;
			size++;
		}
	}

	/**
	 * Método que remove o primeiro elemento da lista.
	 * 
	 * @return T elemento removido.
	 */
	public T removeFirst() {
		if (isEmpty())
			throw new RuntimeException(MENSAGEM_ERRO);
		LinkedListNode<T> removedItem = head;
		if (head == tail) {
			head = tail = null;
		} else {
			head = head.getNext();
		}
		size--;
		return removedItem.getElement();
	}

	/**
	 * Método que remove o último elemento da lista.
	 * 
	 * @return T elemento removido.
	 */
	public T removeLast() {
		if (isEmpty())
			throw new RuntimeException(MENSAGEM_ERRO);
		LinkedListNode<T> removedItem = tail;
		if (head == tail) {
			head = tail = null;
		} else {
			LinkedListNode<T> current = head;
			while (current.getNext() != tail) {
				current = current.getNext();
			}
			tail = current;
			current.setNext(null);
		}
		size--;
		return removedItem.getElement();
	}

	/**
	 * Método que gera uma String contendo todos elementos da lista.
	 * 
	 * @return String representando a lista.
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();
		if (!isEmpty()) {
			LinkedListNode<T> current = head;
			while (current != null) {
				str.append(current.getElement().toString() + " ");
				current = current.getNext();
			}
		}
		return str.toString();
	}

}
