package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
		
		//System.out.println(parOuImpar.apply(35));
		
		Function<String, String> oResultadoE = valor -> "O resultado é " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!!!";
		
		Function<String, String> duvida = valor -> valor + "?????";
		
		String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(35);
		
		System.out.println(resultadoFinal);

		resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(duvida).apply(20);
		
		System.out.println(resultadoFinal);
		
	}
}
