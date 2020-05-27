package colecoes;

import java.util.ArrayList;

public class Lista {
public static void main(String[] args) {
	ArrayList<Usuario> lista = new ArrayList<>();
	Usuario u1 = new Usuario("Ana"); //instanciando um objeto 
		lista.add(u1); //adicionando este objeto a uma lista
	
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println("Imprindo por índice: "+lista.get(2).nome+"\n");
		
		
	//imprimindo os dados da lista 
		for (Usuario imprimir: lista) {
			System.out.println(imprimir);
		}
		
	
}
}
