package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHeterogeneo {
	public static void main(String[] args) {
		//Set<String> listaAprovados = new HashSet<String>(); //Obrigada a lista  a ter somente dados do tipo String; não garante nenhuma ordem de apresentação dos dados
		SortedSet<String> listaAprovados = new TreeSet<String>(); //Obedece a ordem de inserção
		//<> notação Generics
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
	for(String candidato: listaAprovados) {
		System.out.println(candidato);
	}
	
	Set<Integer> nums = new HashSet<>();
	nums.add(1);
	nums.add(2);
	nums.add(120);
	nums.add(170);
	
	for(int n:nums) {
		System.out.println(n);
	}
	
	
	
	
	
	}

}
