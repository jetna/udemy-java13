package arrays;
import java.util.Arrays;
public class Exercicios {
	public static void main(String[] args) {
	double [] notasAlunoA = new double [4];
	System.out.println(Arrays.toString(notasAlunoA));
	notasAlunoA[0]=7.9;
	notasAlunoA[1]=8;
	notasAlunoA[2]=6.7;
	notasAlunoA[3]=9.7;
	
		
	System.out.println("Imprimindo com array.toString: "+Arrays.toString(notasAlunoA)+"\n");
	
	for (int i = 0; i < notasAlunoA.length; i++) {
		
		System.out.println("Imprindo com FOR: "+notasAlunoA[i]);
	}
	double totalA=0;
	for (int i = 0; i < notasAlunoA.length; i++) {
		totalA+=notasAlunoA[i];
	}
	
	System.out.println("Média: "+(totalA/notasAlunoA.length));
	final double notaArmazenada=5.9;
	double [] notasAlunoB= {6.9, 8.9,notaArmazenada,10};
	double totalB=0;
	for (int i = 0; i < notasAlunoB.length; i++) {
		totalB+=notasAlunoB[i];
	}
	System.out.println("Total B: "+totalB/notasAlunoB.length );
	System.out.println("Última nota do Aluno B: "+notasAlunoB[notasAlunoB.length-1]);
	
	
	
	
	
	
	
	}
	}
