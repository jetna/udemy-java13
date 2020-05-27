package controle.desafio;

import java.util.Scanner;

public class Imprimircadaletra {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite uma palavra: ");
	String palavra = entrada.next();
	int qtdLetra;
	qtdLetra=palavra.length()-1;
	
	
	System.out.println("Palavra: "+palavra);
	System.out.println("Qtd letras: "+(qtdLetra+1));
	int i=0;
	while (qtdLetra>=0){
		
		System.out.println(palavra.charAt(i));
		qtdLetra--;
		i++;
		}
System.out.println("----  FIM ----");
entrada.close();}
}
