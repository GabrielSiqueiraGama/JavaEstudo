package lambdas.calculos;

public class CalculoMain {
	
	public static void main(String[] args) {
		
		Calculo soma = (a, b) ->{return a + b; };
		System.out.println(soma.executar(1, 2));
	}
}
