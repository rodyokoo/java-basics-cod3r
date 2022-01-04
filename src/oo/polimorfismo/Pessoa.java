package oo.polimorfismo;

public class Pessoa {
	
	private double peso;

	public Pessoa(double peso) {
		super();
		this.peso = peso;
	}
	
	public void comer(Alimento alimento) {
		this.peso += alimento.getPeso();
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
