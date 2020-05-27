package controle.desafio.pessoa;

public class Pessoa {
	String nome;
	double peso;
	//Comida comida = new Comida();
	
		Pessoa(String nome, double peso) {
		this.nome=nome;
		this.peso=peso;
	}
		
	void Comer(Comida c) {
		peso= peso+c.peso;
		
		}
}
