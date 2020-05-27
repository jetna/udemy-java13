package oo.composicao;

import java.util.ArrayList;

public class Compra {
	//Lista com o tipo de dados "Item" - lista homogênea
	ArrayList<Item> itens = new ArrayList<Item>();
	String cliente;
	
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra=this;
	}
	
	double ObterValorTota() {
		double total=0;
		
		for (Item item: itens) {
			total+=item.qtde*item.preco;
		}
		return total;
	}
	
}

