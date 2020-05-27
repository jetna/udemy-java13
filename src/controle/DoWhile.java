package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String texto="por favor";
		do{System.out.println("Você precisa falar "+"\n as palavras mágicas"
		+"\nQuer sair?");
		texto = entrada.nextLine();
	}while(!texto.equalsIgnoreCase("por favor"));
		System.out.println("\nObrigada");

entrada.close();}}
