package controle.desafio;

import java.util.Scanner;

public class MaiorNumero {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int i=0;
	int NumArmazenado=0;
			for (; i <10; i++) {
			System.out.println("Digite um n�mero: ");
			int numDig=entrada.nextInt();
			
						if (numDig>NumArmazenado) {
						NumArmazenado=numDig;
													}
										}
	System.out.println(" | Maior n�mero: "+NumArmazenado);
	System.out.println("Quantidade de n�meros digitados: "+i);
	entrada.close();}

	
}
