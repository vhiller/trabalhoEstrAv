package br.com.unisinos.estrav.dicionario.collections;

import static br.com.unisinos.estrav.dicionario.utils.FileHandler.SEPARADOR;

/**
 * 
 * @author Leonardo Fait�o
 * @author Vinicius Hiller
 * 
 */
public class LinkedList<T> {
	private static final String MENSAGEM_ERRO = "Ocorreu uma falha na opera��o devido a lista estar nula.";

	private LinkedListNode<T> head; // nodo cabe�a da lista
	private LinkedListNode<T> tail; // nodo cauda da lista
	private long size; // n�mero de nodos da lista

	/**
	 * M�todo que retorna se a lista est� vazio se baseando pelo atributo head
	 * da mesma.
	 * 
	 * @return boolean (lista = vazia)
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * M�todo que retorna o primeiro elemento da lista.
	 * 
	 * @return Node nodo contendo o primeiro elemento.
	 */
	public LinkedListNode<T> getFirst() {
		if (isEmpty())
			throw new RuntimeException(MENSAGEM_ERRO);
		return head;
	}

	/**
	 * M�todo que retorna o �ltimo elemento da lista.
	 * 
	 * @return Node nodo contendo o �ltimo elemento.
	 */
	public LinkedListNode<T> getLast() {
		if (isEmpty())
			throw new RuntimeException(MENSAGEM_ERRO);
		return tail;
	}

	/**
	 * M�todo que adiciona um elemento na primeira posi��o da lista.
	 * 
	 * @param element
	 *            - elemento gen�rico a ser adicionado.
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
	 * M�todo que adiciona um elemento na �ltima posi��o da lista.
	 * 
	 * @param element
	 *            - elemento gen�rico a ser adicionado.
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
	 * M�todo que remove o primeiro elemento da lista.
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
	 * M�todo que remove o �ltimo elemento da lista.
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
	 * M�todo que gera uma String contendo todos elementos da lista.
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
