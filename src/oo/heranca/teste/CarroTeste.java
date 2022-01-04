package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	public static void main(String[] args) {
		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari();
		
		System.out.println("Valocidade do Civic " + civic.velocidadeAtual + " Km/h");
		System.out.println("Valocidade da Ferrari " + ferrari.velocidadeAtual + " Km/h");
		
		civic.acelerar();
		ferrari.acelerar();
		
		System.out.println("Valocidade do Civic " + civic.velocidadeAtual + " Km/h");
		System.out.println("Valocidade da Ferrari " + ferrari.velocidadeAtual + " Km/h");
		
		ferrari.ligarTurbo();
		civic.acelerar();
		ferrari.acelerar();
		
		System.out.println("Valocidade do Civic " + civic.velocidadeAtual + " Km/h");
		System.out.println("Valocidade da Ferrari " + ferrari.velocidadeAtual + " Km/h");
		
		ferrari.ligarAr();
		civic.acelerar();
		ferrari.acelerar();

		System.out.println("Valocidade do Civic " + civic.velocidadeAtual + " Km/h");
		System.out.println("Valocidade da Ferrari " + ferrari.velocidadeAtual + " Km/h");
		
		civic.frear();
		ferrari.frear();
		
		System.out.println("Valocidade do Civic " + civic.velocidadeAtual + " Km/h");
		System.out.println("Valocidade da Ferrari " + ferrari.velocidadeAtual + " Km/h");
		System.out.println(ferrari.velocidadeDoAr());
	}
}
