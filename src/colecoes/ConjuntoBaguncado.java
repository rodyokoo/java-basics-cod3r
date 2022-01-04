package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(false);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("O tamanho é " + conjunto.size());
		
		conjunto.remove(false);
		
		System.out.println("O tamanho é " + conjunto.size());
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto);
		conjunto.clear();
		System.out.println(conjunto.size());
	}
}
