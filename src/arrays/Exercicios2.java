package arrays;
import java.util.Arrays;
public class Exercicios2 {
	public static void main(String[] args) {
	double [] notasAlunoA = {7.9, 8.4, 6.7, 9.7};
	
	System.out.println("Imprimindo com array.toString: "+Arrays.toString(notasAlunoA)+"\n");
	
	System.out.println("\nImprimindo com FOREACH");
	for (double notasA: notasAlunoA) {
		System.out.print(notasA+" ");
	}
	
	//Média
	double media=0;
	for (double leitura: notasAlunoA) {
		media+=leitura;
	}
	System.out.println("\nMédia: "+(media/notasAlunoA.length));
	
	final double notaArmazenada=5.9;
	double [] notasAlunoB= {6.9, 8.9,notaArmazenada,10};
	double totalB=0;
	for (double notas: notasAlunoB) {
		totalB+=notas;
	}
	System.out.println("Total B: "+totalB/notasAlunoB.length );
	System.out.println("Última nota do Aluno B: "+notasAlunoB[notasAlunoB.length-1]);
	
	}
	}
