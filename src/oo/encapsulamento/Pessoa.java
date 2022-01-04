package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobreNome;
	private int idade;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String sobreNome, int idade) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		idade = Math.abs(idade);
		if(idade >= 0 && idade <= 135) {			
			this.idade = idade;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String NomeCompleto() {
		return getNome() + " " + getSobreNome();
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if(idade >=0 && idade <= 135) {			
			this.idade = idade;
		}
	}

	@Override
	public String toString() {
		return NomeCompleto() + " tem " + idade + " anos!!! (toString)";
	}
	
	
}
