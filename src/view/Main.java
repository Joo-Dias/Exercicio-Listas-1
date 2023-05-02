package view;

import java.util.Iterator;

import javax.swing.JOptionPane;

import br.edu.fateczl.lista.listaint.Lista;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Lista lista = new Lista();
		
		int valor = 0;
		lista.addFirst(valor);
		
		for(int i = 0; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a lista:"));
			
			lista.add(valor, i);
			
		}
		
		System.out.println("A lista na ordem normal:");
		
		for(int i = lista.size() - 1; i <= 11; i++) {
			System.out.print(lista.get(i)+" ");
		}
		
		System.out.println("");
		
		System.out.println("A lista em ordem invertida: ");
		
		for( int i = lista.size() - 1; i >=0; i--) {
			System.out.print(lista.get(i)+" ");
		}

	}

}
