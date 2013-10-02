package br.com.unisinos.estrav.dicionario.collections;

public class AvlNode<T> {
	protected T key;
	protected AvlNode<T> left, right;

	public AvlNode() {
		left = right = null;
	}

	public AvlNode(T num) {
		this(num, null, null);
	}

	public AvlNode(T num, AvlNode<T> lt, AvlNode<T> rt) {
		this.key = num;
		left = lt;
		right = rt;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public AvlNode<T> getLeft() {
		return left;
	}

	public void setLeft(AvlNode<T> left) {
		this.left = left;
	}

	public AvlNode<T> getRight() {
		return right;
	}

	public void setRight(AvlNode<T> right) {
		this.right = right;
	}
}
