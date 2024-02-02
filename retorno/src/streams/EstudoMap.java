package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EstudoMap {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("bmw", " civic ", " honda");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
//		Na linha acima ela chama marcas como uma stream, chama o map que
//		converte todas as letras para maiusculo e após isso imprime
		
		
	}
	
}
