package fundamentos;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		String altura;
		String peso;
		double imc=0;
		
		Scanner digite = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		altura = digite.next().replace(",", ".");
		double alt= Double.parseDouble(altura); 
		
		System.out.println("Digite seu peso: ");
		peso = digite.next().replace(",", ".");
		double pes0= Double.parseDouble(peso); 
		
		
		System.out.println("ALTURA: "+alt);
		System.out.println("ALTURA: "+pes0);
		
		imc=Math.pow(alt, 2)/pes0;
		System.out.println("Seu IMC é: "+imc);
	}
}
