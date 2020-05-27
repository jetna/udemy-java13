package controle.desafio;

import java.util.Scanner;

public class CalculandoNumPositivos {
	public static void main(String[] args) {	
	int numDigitado=0;
	int soma=0;
	Scanner entrada = new Scanner (System.in);
	
			while (numDigitado>=0) {
			System.out.println("Digite um número para a soma: ");
			numDigitado=entrada.nextInt();
					if (numDigitado>=0) {
					soma=numDigitado+soma;
					System.out.println("Resultado: "+soma);		
				}
				
		}		
	System.out.println("\n\nTotal: "+soma);
	entrada.close();}
}