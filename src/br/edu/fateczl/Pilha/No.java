package br.edu.fateczl.Pilha;

public class No<T> {
	
	T dado;
	No<T> proximo;
	
	
	@Override
	public String toString() {
		return "" + dado;
	}
	
}
