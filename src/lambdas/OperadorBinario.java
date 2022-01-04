package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		
		double variavelMedia = media.apply(8.0, 6.0);
		
		System.out.println(variavelMedia);
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		
		String variavelResultado = resultado.apply(7.8, 6.1);
		
		System.out.println(variavelResultado);
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aporovado" :"Reprovado";
		
		String mediaFinal = media.andThen(conceito).apply(6.8, 7.7);
		
		System.out.println(mediaFinal);
	}
}
