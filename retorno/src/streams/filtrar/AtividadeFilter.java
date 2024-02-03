package streams.filtrar;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class AtividadeFilter {

	public static void main(String[] args) {
		
		Consumer<String> println = System.out::println;
		
		Produtos p1 = new Produtos("Garrafa", 100.00, 0.5, true);
		Produtos p2 = new Produtos("Celular", 1200.00, 0.1, true);
		Produtos p3 = new Produtos("Bolsa", 100.00, 0.2, false);
		Produtos p4 = new Produtos("Estojo", 50.00, 0.5, false);
		Produtos p5 = new Produtos("Computador", 10000.00, 0.5, true);
		
		List<Produtos> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		Predicate<Produtos> descontoMaior50 = p -> p.desconto > 0.49;
		Function<Produtos, String> texto = p -> p.nome 
					+ " tem frete gratis e desconto de " +
						(p.desconto * 100) + ""
								+ " por cento, custando o valor de: " 
									+ p.preco * p.desconto;
		
		
		produtos.stream()
			.filter(p -> p.preco >= 1000 & p.freteGratis)
				.filter(descontoMaior50)
					.map(texto)
						.forEach(println);
		
	}
	
}
