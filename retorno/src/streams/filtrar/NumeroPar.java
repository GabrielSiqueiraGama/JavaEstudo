package streams.filtrar;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NumeroPar {

	public static void main(String[] args) {
		
		Consumer<Integer> print = System.out::print;
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

		numeros.stream().filter(n -> n %2 == 0).forEach(print);
		
	}
	
}
