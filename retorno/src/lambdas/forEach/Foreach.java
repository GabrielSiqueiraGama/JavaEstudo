package lambdas.forEach;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Zhant", "Bluiz", "Crosser");
	
		System.out.println("Nomes dos aprovados: ");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01: ");
		aprovados.forEach((nome) -> {System.out.println(nome);});//Chaves opcional em caso de uma unica função
		
		System.out.println("\nLambda #02: ");
		aprovados.forEach((nome) -> meuImprimir(nome));
		
		//imprime a lista com menos codigo.
		System.out.println("\nMethod Reference 01: ");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nMethod Reference 02: ");
		aprovados.forEach(Foreach::meuImprimir);
		
	}
	static void meuImprimir(String nome) {
		System.out.println("Nome: " + nome);
	}
	
}
