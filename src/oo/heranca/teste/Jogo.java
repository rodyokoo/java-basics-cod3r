package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		
		Heroi heroi = new Heroi(10, 10);
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 11;
		
		System.out.println("Vida Heroi: " + heroi.vida);
		System.out.println("Vida Monstro: " + monstro.vida);
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);

		System.out.println("Vida Heroi: " + heroi.vida);
		System.out.println("Vida Monstro: " + monstro.vida);
		
		monstro.andar(Direcao.NORTE);
		
		System.out.println("Vida Heroi: " + heroi.vida);
		System.out.println("Vida Monstro: " + monstro.vida);
	}
}
