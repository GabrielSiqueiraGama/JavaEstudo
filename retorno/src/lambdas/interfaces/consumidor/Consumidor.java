package lambdas.interfaces.consumidor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Usuario> printNome = Usuario::printNome;

		Usuario u1 = new Usuario("Zhant");
		Usuario u2 = new Usuario("Blake");
		Usuario u3 = new Usuario("Bluiz");
		
		//printNome.accept(u1);
		
		List<Usuario> usuarios = Arrays.asList(u1, u2, u3);
		System.out.println("\nSem forEach: ");
		usuarios.forEach(printNome);
		
		System.out.println("\nCom forEach: ");
		usuarios.forEach(u -> System.out.println(u.nome));
		
		System.out.println("\nMethod Reference: ");
		//Aqui se faz necessaria a criação do toString
		usuarios.forEach(System.out::println);
	}
	
}
