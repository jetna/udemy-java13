package controle.desafio;

import java.util.Scanner;

public class Par0a10 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número entre 0 e 10: ");
		int num=entrada.nextInt();
		
		if(num<=10 && num>=0) {
		
		//Verificando se o número é par
		if (num % 2 ==0) {
			System.out.println("É par!\n");
		}else {
			System.out.println("É ímpar\n");
		}
		//fim verificando se é par
		
		}else {
			System.out.println("-----Número "+num+ " inválido-----");
		}
	entrada.close();}

}
