package controle.desafio;

import java.util.Scanner;

public class JogoAdivinhacao {
	public static void main(String[] args) {	
	int numCerto=24;
	int numDigitado=0;
	Scanner entrada = new Scanner(System.in);
		
	for (int i = 0; i <= 10; i++) {
		System.out.println("\nDigite o n�mero de 0 at� 100: ");
		numDigitado=entrada.nextInt();
		if(numDigitado<=100 && numDigitado>=0){
			
			if (numDigitado==numCerto) {
				System.out.println("---- PARAB�NS ----");
				break;	
			}else { System.out.println("\nTente novamente: ");}
			
		}else {
				System.out.println("\nEscolha um n�mero de 0 at� 100");
				}
		}
	entrada.close();}
}
