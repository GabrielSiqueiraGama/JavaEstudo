package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class AtividadeMap {
	
	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::println;
		Scanner scn = new Scanner(System.in);
//		int x = 12;
//		String bina = Integer.toBinaryString(x);
//		System.out.println(bina);
//			
//		int y = 10;
//		String bin = "";
//		bin = Integer.toBinaryString(y);
//		System.out.println(bin);
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
		String nome = scn.next();
		List<String> nomes = Arrays.asList(nome);
		
//		UnaryOperator<String> inverterNome = 
//				n -> new StringBuilder(nome).reverse().toString(); Tentando descobrir como inverter a string estando como função
		
		System.out.println();
				
		UnaryOperator<String> inverter = 
				n -> new StringBuilder(n).reverse().toString();
		Function<String, Integer> binarioParaInt =
				s -> Integer.parseInt(s, 2);
				
		nomes.stream().map(inverter).forEach(print);;		
		numeros.stream()
			.map(n -> Integer.toBinaryString(n)//Aqui transforma o numero em binario
				.toString())//Aqui converte para String
					.map(inverter)//Aqui chama a função inverter
						.map(binarioParaInt)//converte binario para inteiro
						.forEach(print);//Aqui imprime
	}
	
}
