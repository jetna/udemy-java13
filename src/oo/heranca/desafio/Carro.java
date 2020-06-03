package oo.heranca.desafio;

public class Carro {
	double velocidadeAtual=0;

	void acelerar(){
		System.out.println("Acelerou");
		velocidadeAtual=velocidadeAtual+5;
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
