package lambdas;

public class Produto extends Object{

	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		double precoComDesconto = preco * (1 - desconto);
		return "Nome = " + nome + ", pre�o = R$ " + preco + ", desconto = " + desconto + ", pre�o com desconto = R$ " + precoComDesconto;
	}
	
	
}
