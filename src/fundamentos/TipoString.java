package fundamentos;

import java.util.Scanner;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Vila-Valqueire".charAt(4));
		String s = "Bairro";
		System.out.println(s.concat(" ZO\n\n"));
		
		var nome="Pedro ";
		var sobrenome="Santos";
		var idade=27;
		var salario=5578.90;
		System.out.printf("Nome: %s %s \nIdade: %d \nSalário: %.2f. \n\n",
				nome, sobrenome, idade, salario); //printf = f de format
		System.out.println(nome.isBlank());
		
		
	//IMPORTANTE ----------------------
		Scanner entrada = new Scanner(System.in);
		//-------------------------
		
		System.out.println("Digite: ");
		String nomeReg = entrada.nextLine();
		System.out.println("Nome: "+nomeReg);
		
		salario = entrada.nextDouble();
		System.out.println("SAlário é: "+salario);
		entrada.close();
	}

}
