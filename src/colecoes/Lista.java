package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Fl�via");
		
		lista.add(u1);
		lista.add(new Usuario("Rodrigo"));
		lista.add(new Usuario("Ricardo"));
		lista.add(new Usuario("S�rgio"));
		lista.add(new Usuario("Rose"));
		lista.add(new Usuario("Carla"));
		
		System.out.println("Removeu o usu�rio: " + lista.remove(0));
		System.out.println("Removeu o usu�rio Carla: " + lista.remove(new Usuario("Carla")));
		
		System.out.println("A lista cont�m o usu�rio S�rgio? " + lista.contains(new Usuario("S�rgio")));
		System.out.println("A lista cont�m o usu�rio Carla? " + lista.contains(new Usuario("Carla")));
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
		System.out.printf("Usu�rio pelo index 2: %s", lista.get(2).nome);
	}
}
