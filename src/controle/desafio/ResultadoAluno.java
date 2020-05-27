package controle.desafio;

import java.util.Scanner;

public class ResultadoAluno {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite nota AV1: ");
		float nota1=entrada.nextFloat();
		System.out.println("Digite nota AV2: ");
		float nota2=entrada.nextFloat();
		float media=(nota1+nota2)/2;
		
		if (media>=7.0) {
			System.out.println(media+ "\nAprovado");
				}
		if (media>=4.0 && media<7.0) {
			System.out.println(media+"\nRecuperação");
			}
		
		if(media<4) {
				System.out.println(media+"\nReprovado");
			}
		entrada.close();	}
		
	

}
