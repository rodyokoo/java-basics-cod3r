package lambdas;

public class CalculoTesteLambda {

	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(5.5, 4.5));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(5.5, 4.5));		
	}
}
