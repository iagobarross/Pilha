package br.edu.fateczl.Pilha;

public class Pilha<T> {

		No<T> topo;
		
		public Pilha() {
			topo = null;
		}
		
		public boolean isEmpty() {
			if(topo == null) {
				return true;
			}
			return false;
		}
		
		public void push(T valor) {
			No<T> elemento = new No<>();
			elemento.dado = valor;
			elemento.proximo = topo;
			topo = elemento;
		}
		
		public T pop() throws Exception{
			if(isEmpty()) {
				throw new Exception("Pilha Vazia");
			}
			
			T valor = topo.dado;
			topo = topo.proximo;
			return valor;
		}
		
		public T top() throws Exception{
			if(isEmpty()) {
				throw new Exception("Pilha Vazia");
			}
			
			T valor = topo.dado;
			return valor;
		}
		
		public int size() {
			int count = 0;
			if(!isEmpty()) {
				No<T> aux = topo;
				count = 1;
				while(aux.proximo != null) {
					count++;
					aux = aux.proximo;
				}
			}
			
			return count;
		}

}
