package controle.desafio;
import java.util.Scanner;
public class NumPrimo {
public static void main(String[] args) {
	int num=0;
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite um n�mero: ");
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
	
	/*resolu��o anterior
	 if (num%2!=0 || num%3!=0 || num%5!=0 || num%7!=0 || num%11!=0  ) {
	 
		System.out.println("N�o");
	}else {
		System.out.println("primo");
	}*/
	
	System.out.println("\nN�mero digitado: "+num);
	System.out.println("\nN�mero de divisores: "+contadorDeDivisores);
	if (contadorDeDivisores>0) {
		System.out.println(num+" N�o � primo");
		
	}else {
		System.out.println(num+" � primo");
	}
	
entrada.close();}
}
