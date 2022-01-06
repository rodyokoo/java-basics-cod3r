package streams.filter.desafio;

public class Produto {

	private String nome;
	private String tipo;
	private Double preco;
	
	public Produto(String nome, String tipo, Double preco) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}
