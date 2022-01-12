package generics;

public class ParesTeste {

	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Lia");
		resultadoConcurso.adicionar(2, "Ric");
		resultadoConcurso.adicionar(3, "Rod");
		resultadoConcurso.adicionar(4, "Fla");
		resultadoConcurso.adicionar(2, "Ana");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(3));
		System.out.println(resultadoConcurso.getValor(4));
	}
}
