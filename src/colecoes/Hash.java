package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Artur"));
		usuarios.add(new Usuario("Rodrigo"));
		
		boolean resultado = usuarios.contains(new Usuario("Artur"));
		System.out.println(resultado);
	}
}
