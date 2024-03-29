package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Zhant", "Bluiz", "Blake");
		
//		for(int i = 0; i < aprovados.size(); i++) {
//			System.out.println(aprovados.get(i));
//		}
		System.out.println("Utilizando foreach: ");
		for(String nomes: aprovados) {
			System.out.println(nomes);
		}
		
		System.out.println("\nUtilizando iterator: ");
		Iterator<String> iteratorAprovados = aprovados.iterator();
		while(iteratorAprovados.hasNext()) {
			System.out.println(iteratorAprovados.next());
		}
		
		System.out.println("\nUsando Stream: ");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		
		//Registrando estudo teorico. 
	}
	
}
