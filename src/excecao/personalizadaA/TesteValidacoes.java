package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno a1 = new Aluno("Ana", -7);
			Validar.aluno(a1);
		} catch (StringVaziaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (NumeroForaDoIntervaloException e) {
			System.out.println(e.getMEssage());
		}
		
		System.out.println("Fim");
	}
}
