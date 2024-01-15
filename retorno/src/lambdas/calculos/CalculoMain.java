package lambdas.calculos;

public class CalculoMain {
	
	public static void main(String[] args) {
		
		Calculo calculo = (a, b) ->{return a + b; };
		System.out.println(calculo.executar(1, 2));
		System.out.println(calculo.legal());
		
		calculo = (a,b) -> a * b;//Caso seja uma unica função a chave se torna desnecessaria.
	}
}
