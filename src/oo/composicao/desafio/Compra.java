package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> compra = new ArrayList<Item>();
	
	void adicionarItens(Item item) {
		compra.add(item);
	}
	
	double valorTotal() {
		double total = 0;
		for(Item item: compra) {
			total += item.qtde * item.produto.preco;
		}
		return total;
	}

	@Override
	public String toString() {
		return "\nCompra [compra=" + compra + "]";
	}
}
