package streams.filter.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Mercado {

	public static void main(String[] args) {
		
		Produto arroz = new Produto("Arroz", "alimento", 35.87);
		Produto feijao = new Produto("Feijão", "alimento", 8.5);
		Produto agua = new Produto("Água mineral", "bebida", 3.5);
		Produto desinfetante = new Produto("Desinfetante", "limpeza", 7.96);
		
		List<Produto> lista = Arrays.asList(arroz, feijao, agua, desinfetante);
		
		Predicate<Produto> comecaComA = p -> p.getNome().substring(0, 1).equalsIgnoreCase("a");
		Predicate<Produto> produtoAcima10 = p -> p.getPreco() > 10.0;
		Predicate<Produto> tipoAlimento = p -> p.getTipo().equalsIgnoreCase("alimento");
		
		Function<Produto, String> imprimirProduto = p -> String.format("Produto %s \nTipo %s \nPreço R$ %.2f\n", p.getNome(), p.getTipo(), p.getPreco()).replace(".", ",");
		//"Produto: " + p.getNome() + " R$ ";
		
		lista.stream()
		.filter(comecaComA)
		.filter(produtoAcima10)
		.filter(tipoAlimento)
		.map(imprimirProduto)
		.forEach(System.out::println);
	}
}
