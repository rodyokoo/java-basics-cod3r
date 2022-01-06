package streams;

import java.util.function.UnaryOperator;

public class Utilitario {
	
	private Utilitario() {
		
	}
	
	public static final UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public static final UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	public static final  String grito(String n) {
		return n + "!!!! ";
	}
}
