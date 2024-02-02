package streams.mapps;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EstudoMap {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<String> println = System.out::println;
		
		List<String> marcas = Arrays.asList("bmw ", "civic ", "honda \n");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
//		Na linha acima ela chama marcas como uma stream, chama o map que
//		converte todas as letras para maiusculo e após isso imprime

		
		marcas.stream().map(FuncoesParaMap.maiuscula).forEach(print);
		System.out.println();//esse nome de classe ficou assim apenas para estudo
		marcas.stream().map(FuncoesParaMap.minuscula).forEach(print);
		System.out.println();
		marcas.stream().map(FuncoesParaMap.primeiraLetra).forEach(print);
		
		
	}
	
}
