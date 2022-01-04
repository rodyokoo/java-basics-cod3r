package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		BinaryOperator<Double> realPrice = (preco, desconto) -> preco * (1 - desconto);
		
		UnaryOperator<Double> cityTax = preco -> preco >= 2500 ? preco *  0.085 : 0;
		
		UnaryOperator<Double> ship = preco -> preco >= 3000.0 ? 100.0 : 50.0;
		
		UnaryOperator<Double> roundDbl = preco -> Math.round(preco*100.0)/100.0;
		
		Function<Double, String> formatedPrice = preco -> ("R$" + preco).replace(".", ",");
		
		double precoReal = realPrice.apply(p.preco, p.desconto);
		
		System.out.println(precoReal);
		
		double impostoMunicipal = cityTax.apply(precoReal);
		
		System.out.println(impostoMunicipal);
		
		double frete = ship.apply(precoReal + impostoMunicipal);
		
		System.out.println(frete);
		
		double precoArredondado = roundDbl.apply(precoReal + impostoMunicipal + frete);
		
		System.out.println(precoArredondado);
		
		String precoFormatado = formatedPrice.apply(precoArredondado);
		
		System.out.println(precoFormatado);
	}
}
