package oo.composicao;

public class Carro {
	//carro tem um motor(relação:1---1)
		Motor m = new Motor();
		
		
		void acelerar() {
			m.fatorInjecao+=0.4;
		}
		
		void frear() {
			m.fatorInjecao-=0.4;
		}
		void ligarMotor(){
			m.ligado=true;
		}
		void desligarMotor(){
			m.ligado=false;
		}
		boolean estaLigado() { 
			return m.ligado;
		}
		
		

}
