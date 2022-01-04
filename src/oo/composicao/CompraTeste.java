package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "João";
		c1.adicionarItem("Caneta", 20, 2.5);
		c1.adicionarItem(new Item("Borracha", 7, 1.75));
		c1.adicionarItem(new Item("Caderno", 3, 25.5));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
	}
}
