package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		
		Produto caneta = new Produto("Caneta", 1.5, 0.05);
		imprimirNome.accept(caneta);
		
		Produto lapis = new Produto("Lápis", 2.5, 0.03);
		Produto borracha = new Produto("Borracha", 0.75, 0.09);
		Produto caderno = new Produto("Caderno", 25.73, 0.15);
		Produto laptop = new Produto("Laptop", 3896.65, 0.075);

		List<Produto> produtos = Arrays.asList(caneta, lapis, borracha, caderno, laptop);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
