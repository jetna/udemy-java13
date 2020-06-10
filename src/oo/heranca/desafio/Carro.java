package oo.heranca.desafio;

public class Carro {
	final int VELOCIDADE_MAX;
	double velocidadeAtual=0;
	int delta=5;
	
	public Carro(int velocidadeMaxima) {
		// TODO Auto-generated constructor stub
	VELOCIDADE_MAX=velocidadeMaxima;
	}
	
	void acelerar(){
		if (velocidadeAtual+delta>VELOCIDADE_MAX) {
			velocidadeAtual=VELOCIDADE_MAX;
		} else {
			velocidadeAtual+=delta;
		}
		
		System.out.println("Acelerou");
		//velocidadeAtual=velocidadeAtual+5;
	}
	
	void frear() {
		if (velocidadeAtual<=0) {
			System.out.println("impossível");
		} else {
			velocidadeAtual=velocidadeAtual-2;
			if (velocidadeAtual<=0) {
				System.out.println("Velocidade zerada");
				velocidadeAtual=0;
			}else {
				System.out.println("freado");
			}
		}	
	}
}
