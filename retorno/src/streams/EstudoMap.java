package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class EstudoMap {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<String> println = System.out::println;
		
		List<String> marcas = Arrays.asList("bmw ", "civic ", "honda \n");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
//		Na linha acima ela chama marcas como uma stream, chama o map que
//		converte todas as letras para maiusculo e após isso imprime
		UnaryOperator<String> maiuscula = m -> m.toUpperCase();
		UnaryOperator<String> minuscula = m -> m.toLowerCase();
		UnaryOperator<String> primeiraLetra = m -> m.charAt(0) + "";
		
		marcas.stream().map(maiuscula).forEach(print);
		System.out.println();
		marcas.stream().map(minuscula).forEach(print);
		System.out.println();
		marcas.stream().map(primeiraLetra).forEach(print);
		
		
	}
	
}
