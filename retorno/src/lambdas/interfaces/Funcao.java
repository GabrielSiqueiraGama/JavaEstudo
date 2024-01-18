package lambdas.interfaces;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		System.out.println(parOuImpar.apply(10));
		
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		
		String resultado = parOuImpar.andThen(oResultadoE).apply(10);
		
		System.out.println(resultado);
		
		Function<Double, Double> aoQuadrado = numero -> numero * numero; 
		
		System.out.println(aoQuadrado.apply(3.0));
	}
	
}
