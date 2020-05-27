package controle.desafio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EsteAnoBissexto {
	public static void main(String[] args) {
		
	///// ----------- VERIFICANDO DATA DO SISTEMA ---------------- //
	int anoatual = Integer.parseInt((new SimpleDateFormat("yyyy")).format(new Date()));
	///// ------------------------------------------------- /////////
	
	///// ------------- VERIFICAR ANO DIGITADO PELO USUÁRIO --------- //////////
	/*int anoatual;
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite ano: ");
	anoatual=entrada.nextInt();*/
	///// ------------------------------------------------- /////////
	
	if (anoatual%4==0&&(anoatual%100!=0||anoatual%400==0)) {
		System.out.println(anoatual+ " é bissexto ");
	}else {
		System.out.println("Não é bissexto");
	}
	
	
	//////// Rascunho /////////////
	//System.out.println(esteano);
	///System.out.println(">>> "+esteano.getYear());
	//System.out.println("Variável calendário: "+calendario.get(Calendar.YEAR));
	
	}
	

}
