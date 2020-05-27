package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		//instanciando um produto com tipo, nome, new e o valor
		//utilizando o construtor
		Produto p1=new Produto("Notebook",4356.89);
		
		
		
		//utilizando o construtor padrão
		var p2= new Produto();
		p2.nome="Caneta";
		p2.preco=12.56;
		Produto.desconto=0.29;
	
		
	
		System.out.println(p1.nome+" "+p1.precoComDesconto());
		System.out.println(p2.nome+" "+p2.precoComDesconto());
		
		double precoFinal1=p1.precoComDesconto();
		double precoFinal2=p2.precoComDesconto(0.10);
		double mediaCarrinho=(precoFinal1+precoFinal2)/2;
		System.out.println("Média do carrinho "+mediaCarrinho);
		
	}
	
}
