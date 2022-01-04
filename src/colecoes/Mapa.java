package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Rodrigo");
		usuarios.put(1, "Flavia");
		usuarios.put(2, "Carol");
		usuarios.put(3, "Sun");
		
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.size());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("Carol"));
		
		System.out.println(usuarios.get(2));
		
		for(String usuario: usuarios.values()) {
			System.out.println(usuario);
		}
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
	}
}
