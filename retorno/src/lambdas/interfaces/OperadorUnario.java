package lambdas.interfaces;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(1);
		System.out.println(resultado1);
		
		int resultado2 = aoQuadrado.apply(2);
		System.out.println(resultado2);
		
		//o compose faz com que a função seja executada após a outra entre parenteses
		int resultado3 = maisDois.compose(vezesDois).apply(1);
		System.out.println(resultado3);
		
	}
	
}
