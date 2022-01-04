package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Flávia");
		
		lista.add(u1);
		lista.add(new Usuario("Rodrigo"));
		lista.add(new Usuario("Ricardo"));
		lista.add(new Usuario("Sérgio"));
		lista.add(new Usuario("Rose"));
		lista.add(new Usuario("Carla"));
		
		System.out.println("Removeu o usuário: " + lista.remove(0));
		System.out.println("Removeu o usuário Carla: " + lista.remove(new Usuario("Carla")));
		
		System.out.println("A lista contém o usuário Sérgio? " + lista.contains(new Usuario("Sérgio")));
		System.out.println("A lista contém o usuário Carla? " + lista.contains(new Usuario("Carla")));
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
		System.out.printf("Usuário pelo index 2: %s", lista.get(2).nome);
	}
}
