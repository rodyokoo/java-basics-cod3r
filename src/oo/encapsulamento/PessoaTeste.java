package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Rodrigo", "Yokoo", -80);
		//p1.idade = -30;
		System.out.println(p1.getNome() + " tem " +p1.getIdade() + " anos.");
		System.out.println(p1.NomeCompleto());
		
		p1.setIdade(30);
		System.out.println(p1.getNome() + " tem " +p1.getIdade() + " anos.");
		System.out.println(p1);
		
		p1.setNome("Flávia");
		p1.setIdade(180);
		System.out.println(p1.getNome() + " tem " +p1.getIdade() + " anos.");
		
		p1.setIdade(-40);
		System.out.println(p1.getNome() + " tem " +p1.getIdade() + " anos.");
		System.out.println(p1);
	}
}
