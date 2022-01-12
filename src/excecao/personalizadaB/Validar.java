package excecao.personalizadaB;

import excecao.Aluno;

public class Validar {

	private Validar() {
		
	}
	
	public static void aluno(Aluno aluno) throws StringVaziaException, NumeroForaDoIntervaloException{
		
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		
		if(aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.getNota() < 0 || aluno.getNota() > 10) {
			throw new NumeroForaDoIntervaloException("nota");
		}
	}
}
