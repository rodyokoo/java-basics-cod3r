package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		BinaryOperator<Double> calc = (x, y) -> x + y;
		System.out.println(calc.apply(5.0, 4.0));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(5.0, 4.0));		
	}
}
