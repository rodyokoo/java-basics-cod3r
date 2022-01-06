package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		//Function<Integer, String> inteiroParaBinario = i -> Integer.toBinaryString(i);
		//UnaryOperator<String> inverter = str -> reverseString(str);
		UnaryOperator<String> inverter = str -> new StringBuilder(str).reverse().toString();
		Function<String, Integer> binarioParaInteiro = bi -> Integer.parseInt(bi, 2);
		
		//nums.stream().map(inteiroParaBinario).forEach(System.out::println);
		
		//System.out.println("\n");
		
		//nums.stream().map(inteiroParaBinario).map(inverter).forEach(System.out::println);
		
		//System.out.println("\n");
		
		nums.stream().map(Integer::toBinaryString).map(inverter).map(binarioParaInteiro).forEach(System.out::println);
	}
	
	/*
	 * public static String reverseString(String str){ StringBuilder sb=new
	 * StringBuilder(str); sb.reverse(); return sb.toString(); }
	 */
}
