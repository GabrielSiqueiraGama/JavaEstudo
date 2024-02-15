package streams.mapps;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class AtividadeMap {
	
	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::println;
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
		String nome = scn.next();
		String nomeInvertido = new StringBuilder(nome).reverse().toString();
		System.out.println(nomeInvertido);
//		Invertendo a string da variavel.
		
		System.out.println();
				
		UnaryOperator<String> inverter = 
				n -> new StringBuilder(n).reverse().toString();
		Function<String, Integer> binarioParaInt =
				s -> Integer.parseInt(s, 2);
				
				
		numeros.stream()
			.map(n -> Integer.toBinaryString(n)//Aqui transforma o numero em binario
				.toString())//Aqui converte para String
					.map(inverter)//Aqui chama a função inverter
						.map(binarioParaInt)//converte binario para inteiro
						.forEach(print);//Aqui imprime
	}
	
}
