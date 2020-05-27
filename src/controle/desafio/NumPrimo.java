package controle.desafio;
import java.util.Scanner;
public class NumPrimo {
public static void main(String[] args) {
	int num=0;
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite um número: ");
	num = entrada.nextInt();
	int contadorDeDivisores=0;
	int decrement=num;
	//int controle=num;
	
	//while (controle<=num&&controle>2) {
		//System.out.println("Controle: "+controle);
		for(decrement=num-1;decrement<num && decrement>2;decrement--) {
		//System.out.println("\n---- Valor Num:"+num);
		System.out.println("\n---- Valor decrement: "+decrement);
		if (num%decrement==0) {
			System.out.println("TEste if");
			contadorDeDivisores=contadorDeDivisores+1;		
	}
	/*controle--;*/ }
	
	/*resolução anterior
	 if (num%2!=0 || num%3!=0 || num%5!=0 || num%7!=0 || num%11!=0  ) {
	 
		System.out.println("Não");
	}else {
		System.out.println("primo");
	}*/
	
	System.out.println("\nNúmero digitado: "+num);
	System.out.println("\nNúmero de divisores: "+contadorDeDivisores);
	if (contadorDeDivisores>0) {
		System.out.println(num+" Não é primo");
		
	}else {
		System.out.println(num+" É primo");
	}
	
entrada.close();}
}
