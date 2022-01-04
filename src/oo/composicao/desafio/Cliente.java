package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	List<Compra> compras = new ArrayList<Compra>();
	
	void adicionarCompras(Compra compra) {
		this.compras.add(compra);
	}
	
	double totalCompras() {
		double total = 0;
		for(Compra compra: compras) {
			total += compra.valorTotal();
		}
		return total;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", compras=" + compras + "]";
	}
	
}
