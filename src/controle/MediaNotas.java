package controle;

import java.util.Scanner;

public class MediaNotas {
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	int contador=0;
	float soma=0;
	float media;
	float nota;
	
	
	do{
		System.out.println("Digite nota: ");
		contador++;
		nota=entrada.nextFloat();
		soma=soma+nota;
		media=soma/contador;
		System.out.println("contador: "+contador+"\nNota: "+nota+"  |  soma: "+soma+"  |  Média Turma: "+media);
		
		/*System.out.println("A média é: "+"\n\n\n");
		System.out.println("Digite -1 para sair");*/
		
	}while(!entrada.equals(nota<=10 && nota>=0));
      System.out.println("Término");	
	

}}
