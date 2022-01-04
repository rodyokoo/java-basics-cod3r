package oo.abstrato;

public class TesteAbstrato {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		System.out.println(cachorro.mover());
		System.out.println(cachorro.respitar());
		System.out.println(cachorro.mamar());
	}
}
