package controle;

import java.util.Scanner;

public class SwitchSembreak {
	
	public static void main(String[] args) {
		/*
		
		String faixa ="branca";
		switch(faixa.toLowerCase()) {
		case "preta":
		System.out.println("Sei o BAssai-Dai");
		}*/
		
		
		Scanner entrada = new Scanner(System.in);
		String conceito="";
		int nota;
		System.out.println("Digite nota: ");
		nota=entrada.nextInt();
		switch (nota) {
		case 10: case 9: 		
			conceito ="A";
			break;
		case 8: case 7:
			conceito="B";
			break;
		case 6: case 5:
			conceito="C";
			break;
		case 4: case 3:
			conceito="D";
		break;
			default: conceito="Não informado";
		}
		System.out.println("Saída: "+conceito);
		entrada.close();
		}}
