package lambdas.interfaces.operadorBinario;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambdas.interfaces.predicado.Produto;

public class Desafio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		
		Function<Produto, Double> precoFinal =
				p -> p.getPreco() * (1 - p.getDesconto());
		UnaryOperator<Double> imposto = 
				valor -> valor >= 2500 ? valor * 1.085 : valor;
		UnaryOperator<Double> frete =
				valor -> valor >= 3000 ? valor + 100 : valor + 50;
		UnaryOperator<Double> arredondar =
				preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = 
				preco -> ("R$" + preco).replace(".", ",");

		Produto p = new Produto("oi", 105.88, 0.13);

		String precoFinalString = precoFinal
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar).apply(p);
		
		System.out.println(precoFinalString);
		
	}

}
