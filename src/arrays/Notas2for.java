package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Notas2for {
	public static void main(String[] args) {
	//usuário digita quantidade de notas que quer armazenar;
	System.out.println("Informe a quantidade de notas que você deseja armazenar: ");	
	Scanner digita= new Scanner(System.in);
	int qtdNota;
	qtdNota=digita.nextInt();
	
	//montar array com quantidade  de notas;
	double notas[]=new double [qtdNota];
	
	//montar o for pedindo ao usuário as notas do aluao 
	for (int i = 0; i < notas.length; i++) {
		System.out.println("Digite a nota "+(i+1)+":");
		//usuário informa:
		notas[i]=digita.nextDouble();
	}
	//fazendo a soma das notas
	double soma=0;
	for(double calc:notas) {
		soma+=calc;
	}

	
	//calcular a média
	////////////////////////////////////////
	double media=soma/notas.length;
		
	//---------testes--------
	
	System.out.println("Qtd: "+qtdNota);
	System.out.println("Array: "+Array.getLength(notas));
	System.out.println("Notas informadas: "+Arrays.toString(notas));
	System.out.println("Soma: "+soma);
	System.out.println("Média: "+media);
	
	digita.close();}// main
}//classe
