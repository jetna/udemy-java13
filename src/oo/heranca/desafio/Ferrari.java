package oo.heranca.desafio;

public class Ferrari extends Carro {
	
Ferrari() {
	// TODO Auto-generated constructor stub
	super(250);
}

	void acelerar(){
		System.out.println("Acelerou");
		velocidadeAtual=velocidadeAtual+15;
	}
	
}
