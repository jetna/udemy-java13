package oo.encapsulamento;

import oo.polimorfismo.Pessoa;
import oo.polimorfismo.Sorvete;

public class PessoaSistema {
public static void main(String[] args) {
	Pessoa p1 = new  Pessoa(119);
	
	Pessoa p1 = new Pessoa();
	 Sorvete s1 = new Sorvete(0.100);
	System.out.println(p1.lerIdade());
}
}
