package colections;

import java.util.ArrayList;

public class Listaa {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		Usuario u1 = new Usuario("zhant");
		
		lista.add(u1);
		lista.add(new Usuario("Bluiz"));
		lista.add(new Usuario("Jonas"));
		
		System.out.println(lista.get(0));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		System.out.println(lista.contains(new Usuario("zhant")));
		
	}
}
