package controle.desafio;

import java.util.Scanner;

public class Par0a10 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero entre 0 e 10: ");
		int num=entrada.nextInt();
		
		if(num<=10 && num>=0) {
		
		//Verificando se o n�mero � par
		if (num % 2 ==0) {
			System.out.println("� par!\n");
		}else {
			System.out.println("� �mpar\n");
		}
		//fim verificando se � par
		
		}else {
			System.out.println("-----N�mero "+num+ " inv�lido-----");
		}
	entrada.close();}

}
