package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

	private boolean ligarTurbo = false;
	private boolean ligarAr = false;

	public Ferrari() {
		super(380);
		setAceleracao(15);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ligarTurbo() {
		// TODO Auto-generated method stub
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		// TODO Auto-generated method stub
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		// TODO Auto-generated method stub
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		// TODO Auto-generated method stub
		ligarAr = false;
	}
	
	@Override
	public int getAceleracao() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {			
			return 15;
		}
	}

	/*void acelerar() {
		if(velocidadeAtual + ACELERACAO > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else if(velocidadeAtual + ACELERACAO < VELOCIDADE_MAXIMA) {			
			velocidadeAtual += ACELERACAO;
		}
	}
	
	void frear() {
		if(velocidadeAtual >= 15) {
			velocidadeAtual -= 15;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	@Override
	void acelerar() {
		super.acelerar();
		super.acelerar();
		super.acelerar();
	}
	
	@Override
	void frear() {
		super.frear();
		super.frear();
		super.frear();
	}*/
}
