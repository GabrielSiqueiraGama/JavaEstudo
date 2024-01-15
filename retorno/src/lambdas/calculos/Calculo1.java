package lambdas.calculos;

public class Calculo1 {

	public static void main(String[] args) {
		
		Calculo soma = new Soma();
		System.out.println(soma.executar(2, 3));
		
		Calculo multiplicar = new Multiplicar();
		System.out.println(multiplicar.executar(2, 3));

	}

}
