package oo.heranca.desafio;

public class Sistema {
	public static void main(String[] args) {
	 Civic civic = new Civic();
	 civic.velocidadeAtual=10;
	 civic.frear();
	 System.out.println(civic.velocidadeAtual);
	 civic.acelerar();
	 System.out.println(civic.velocidadeAtual);
	 civic.frear();
	 System.out.println(civic.velocidadeAtual);
	 civic.frear();
	 civic.frear();
	 civic.frear();
	 civic.frear();
	 civic.frear();
	 System.out.println(civic.velocidadeAtual);
	 civic.frear();
	 System.out.println(civic.velocidadeAtual);
	 civic.frear();
	 
	 System.out.println(civic.velocidadeAtual);
	 
	 Ferrari ferrari = new Ferrari();
	 ferrari.acelerar();
	 System.out.println("Ferrari: "+ferrari.velocidadeAtual);
	}

}
