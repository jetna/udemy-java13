package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos: ");
		int qtdalunos=entrada.nextInt();
		System.out.println("Digite a quantidade de notas por alunos: ");
		int qtdnotas=entrada.nextInt();
		
		
		double notasDaTurma [][]= new double[qtdalunos][qtdnotas];
										//[array mais externo] [array interno]
		double total=0;
		for (int aluno = 0; aluno < notasDaTurma.length; aluno++) { //percorre cada aluno
			for (int nota = 0; nota < notasDaTurma.length; nota++) { //percorre as notas do aluno do FOR acima
				System.out.printf("Informe a nota %d do aluno %d: ",nota+1,aluno+1);
				notasDaTurma[aluno][nota]=entrada.nextDouble();
				total+=notasDaTurma[aluno][nota];
							
			}		}
		//
		
		double media=total/(qtdalunos*qtdnotas);
	
	
	//testes
		
		System.out.println("Qde alunos: "+qtdalunos);
		System.out.println("Média da turma: "+media);
		System.out.println("----- Acessando as posições da matriz -----");
		System.out.println(notasDaTurma[0][0]);
		System.out.println(Arrays.toString(notasDaTurma));
	
	
	
	
	
	entrada.close();}// main
	}//classe
