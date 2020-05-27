package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		Carro carro= new Carro();
		Motor motor = new Motor();
		System.out.println(carro.estaLigado());
		carro.ligarMotor();
		//carro.desligarMotor();
		System.out.println(carro.estaLigado());
		System.out.println(carro.m.giros());
		carro.acelerar();
		System.out.println(carro.estaLigado());
		System.out.println(carro.m.giros());
		carro.frear();
		System.out.println(carro.m.giros());
	}
	
	
}
