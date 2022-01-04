package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA; 
	private int aceleracao;
	public int velocidadeAtual;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + getAceleracao() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}
		if(velocidadeAtual + getAceleracao() <= VELOCIDADE_MAXIMA) {			
			velocidadeAtual += getAceleracao();
		}
		//velocidadeAtual += 5;
	}
	
	public void frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}

	public int getAceleracao() {
		return aceleracao;
	}

	public void setAceleracao(int aceleracao) {
		this.aceleracao = aceleracao;
	}
	
	
}
