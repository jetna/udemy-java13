package oo.encapsulamento;

public class Pessoa {
	private int idade;
	
	public Pessoa(int idade) {
		// TODO Auto-generated constructor stub
	alterarIdade(idade);
	}
	
	
	public void alterarIdade(int novaIdade) {
		if(novaIdade>=0 && novaIdade<=120) {
			this.idade=novaIdade;
		}
		
	}
	
	public int lerIdade() {
		return this.idade;
	}
}
