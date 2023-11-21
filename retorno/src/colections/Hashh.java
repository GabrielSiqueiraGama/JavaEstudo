package colections;

import java.util.HashSet;

public class Hashh {
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Adedonha"));
		boolean resultado = usuarios.contains(new Usuario("Adedonha"));
		System.out.println(resultado);
	}
}
