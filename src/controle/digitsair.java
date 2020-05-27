package controle;

import java.util.Scanner;


public class digitsair {
	public static void main(String[] args) {
		String digite="";
		Scanner entrada = new Scanner(System.in);
		
		while(!digite.equalsIgnoreCase("sair")) {
			
			System.out.println("Digitesair");
			digite = entrada.next();
		}
		entrada.close();
	}

}
