package lambdas.calculos;

@FunctionalInterface
public interface Calculo {

	//@FunctionalInterface força a classe a aceitar apenas uma unica função/metodo
	double executar (double a, double b);
	default String legal() {
		return "legal";
	}
}
