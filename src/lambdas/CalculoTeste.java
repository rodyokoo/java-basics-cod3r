package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {

		Somar somar = new Somar();
		Multiplicar multiplicar = new Multiplicar();
		
		System.out.println(somar.executar(5.5, 4.8));
		System.out.println(multiplicar.executar(5.0, 2.0));
	}
}
