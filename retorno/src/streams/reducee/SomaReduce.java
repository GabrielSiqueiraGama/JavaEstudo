package streams.reducee;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class SomaReduce {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		BinaryOperator<Integer> soma  = (ac, n) -> ac + n;
		
		int total = numeros.stream().reduce(soma).get();
		System.out.println(total);
		int total2 = numeros.stream().reduce(100, soma);//Passando um valor inicial no acumulador
		System.out.println(total2);
	}
	
}
