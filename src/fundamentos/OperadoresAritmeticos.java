package fundamentos;

import java.util.Scanner;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite valor 1: ");
		double valor1= entrada.nextDouble();
		System.out.println("Digite valor 2: ");
		double valor2=entrada.nextDouble();
		
		System.out.println("Soma: "+(valor1+valor2));
		System.out.println("Subtra��o: "+(valor1-valor2));
		System.out.println("Multiplica��o: "+(valor1*valor2));
		System.out.println("Divis�o: "+(valor1/valor2));
	entrada.close();
	}

}
