package br.com.unisinos.estrav.dicionario.collections;

import br.com.unisinos.estrav.dicionario.dictionary.Dictionary;

/**
 * 
 * @author Leonardo Faitão
 * @author Vinicius Hiller
 * 
 */
public class AvlTree {

	private AvlNode<Dictionary> root = null;

	public AvlTree() {
	}

	public void clear() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public AvlNode<Dictionary> getRootNode() {
		return root;
	}

	public AvlNode<Dictionary> search(String el) {
		return search(root, el);
	}

	private AvlNode<Dictionary> search(AvlNode<Dictionary> p, String el) {
		while (p != null) {
			Dictionary key = p.key;
			if (el.equals(key.getPalavra()))
				return p;
			else
				p = isKeyLesser(el, key) ? p.left : p.right;
		}
		return null;
	}

	private boolean isKeyLesser(String el, Dictionary key) {
		return el.compareTo(key.getPalavra()) < 0;
	}

	public boolean insert(Dictionary el) {
		AvlNode<Dictionary> p = root, prev = null;
		String palavra = el.getPalavra();
		if (search(palavra) != null)
			return false;
		while (p != null) {
			prev = p;
			p = isKeyLesser(palavra, p.key) ? p.left : p.right;
		}
		if (root == null)
			root = new AvlNode<Dictionary>(el);
		else if (isKeyLesser(prev.key.getPalavra(), el))
			prev.right = new AvlNode<Dictionary>(el);
		else
			prev.left = new AvlNode<Dictionary>(el);
		return true;
	}

	public void preorder() {
		preorder(root);
	}

	private void preorder(AvlNode<Dictionary> p) {
		if (p != null) {
			System.out.print(p.key + " ");
			preorder(p.left);
			preorder(p.right);
		}
	}

	public void postorder() {
		postorder(root);
	}

	private void postorder(AvlNode<Dictionary> p) {
		if (p != null) {
			postorder(p.left);
			postorder(p.right);
			System.out.print(p.key + " ");
		}
	}

	public void inorder() {
		inorder(root);
	}

	private void inorder(AvlNode<Dictionary> p) {
		if (p != null) {
			inorder(p.left);
			System.out.print(p.key + " ");
			inorder(p.right);
		}
	}

}
