package oo.composicao.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		
		Produto batata = new Produto("Batata", 2.5);
		Produto cenoura = new Produto("Cenoura", 3.5);
		
		Item item1 = new Item(5, batata);
		Item item2 = new Item(3, cenoura);
		
		Compra compra1 = new Compra();
		compra1.adicionarItens(item1);
		compra1.adicionarItens(item2);
		double valorTotal1 = compra1.valorTotal();

		Compra compra2 = new Compra();
		compra2.adicionarItens(new Item(8, batata));
		compra2.adicionarItens(new Item(15, cenoura));
		double valorTotal2 = compra2.valorTotal();
		
		Cliente rodrigo = new Cliente();
		rodrigo.nome = "Rodrigo";
		rodrigo.adicionarCompras(compra1);
		rodrigo.adicionarCompras(compra2);
		
		double totalGeralDosCarrinhos = rodrigo.totalCompras();
		
		System.out.printf("Rodrigo comprou em seu primeiro carrinho %d %ss a R$ %.2f e %d %ss a R$ %.2f\n"
				+ "Somando um total de R$ %.2f\n", item1.qtde, batata.nome, batata.preco, item2.qtde, cenoura.nome, cenoura.preco, valorTotal1);
		System.out.printf("Valor total da compra 1: R$ %.2f\n", valorTotal1);
		System.out.printf("Valor total da compra 2: R$ %.2f\n", valorTotal2);
		System.out.printf("O valor total de todas as compras é R$ %.2f", totalGeralDosCarrinhos);
	}
}
