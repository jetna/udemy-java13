package fundamentos;

import java.util.Scanner;

public class TresUltimosSalarios {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o �ltimo sal�rio: ");
		String ultimosalario = entrada.nextLine();
		
		System.out.println("Digite o pen�ltimo sal�rio: ");
		String penultimo = entrada.nextLine();
		
		System.out.println("Digite antepenultimo sal�rio: ");
		String antep =entrada.nextLine();
		
		System.out.println("�ltimo Sal�rio: "+ultimosalario);
		System.out.println("Pen�ltio sal�rio: "+penultimo);
		System.out.println("Antipen�ltimo sal�rio: "+antep);
		
		//double media = Double.parseDouble(ultimosalario+penultimo+antep)/3;
		//System.out.println("M�dia dos �ltimos sal�rio: "+media);
		
		double usalario= Double.parseDouble(ultimosalario.replace(",","."));
		double psalario= Double.parseDouble(penultimo.replace(",","."));
		double asalario= Double.parseDouble(antep.replace(",","."));
		
		double mediasalarios =(usalario+psalario+asalario)/3;
		System.out.println("M�dia: "+mediasalarios);
		
		
		entrada.close();
	}
}
