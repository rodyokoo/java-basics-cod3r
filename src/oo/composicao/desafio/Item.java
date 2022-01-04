package oo.composicao.desafio;

public class Item {
	int qtde;
	Produto produto;
	
	public Item(int qtde, Produto produto) {
		super();
		this.qtde = qtde;
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Item [qtde=" + qtde + ", produto=" + produto + "]";
	}
	
}
