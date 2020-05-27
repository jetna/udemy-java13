package controle.desafio.pessoa;

public class Jantar {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Ruy",50);
		Comida c= new Comida("feijão",1.367);
		Comida c2= new Comida("arroz",2.70);
		
		
		p.Comer(c);
		p.Comer(c2);
		
		System.out.println(p.nome+" "+p.peso);
	}
}
