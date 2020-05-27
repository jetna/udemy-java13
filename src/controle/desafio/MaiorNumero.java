package controle.desafio;

import java.util.Scanner;

public class MaiorNumero {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int i=0;
	int NumArmazenado=0;
			for (; i <10; i++) {
			System.out.println("Digite um número: ");
			int numDig=entrada.nextInt();
			
						if (numDig>NumArmazenado) {
						NumArmazenado=numDig;
													}
										}
	System.out.println(" | Maior número: "+NumArmazenado);
	System.out.println("Quantidade de números digitados: "+i);
	entrada.close();}

	
}
