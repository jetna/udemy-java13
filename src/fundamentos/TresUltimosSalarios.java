package fundamentos;

import java.util.Scanner;

public class TresUltimosSalarios {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o último salário: ");
		String ultimosalario = entrada.nextLine();
		
		System.out.println("Digite o penúltimo salário: ");
		String penultimo = entrada.nextLine();
		
		System.out.println("Digite antepenultimo salário: ");
		String antep =entrada.nextLine();
		
		System.out.println("Último Salário: "+ultimosalario);
		System.out.println("Penúltio salário: "+penultimo);
		System.out.println("Antipenúltimo salário: "+antep);
		
		//double media = Double.parseDouble(ultimosalario+penultimo+antep)/3;
		//System.out.println("Média dos últimos salário: "+media);
		
		double usalario= Double.parseDouble(ultimosalario.replace(",","."));
		double psalario= Double.parseDouble(penultimo.replace(",","."));
		double asalario= Double.parseDouble(antep.replace(",","."));
		
		double mediasalarios =(usalario+psalario+asalario)/3;
		System.out.println("Média: "+mediasalarios);
		
		
		entrada.close();
	}
}
