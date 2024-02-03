package streams.reducee;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class AprovadosNotaTotal {

	public static void main(String[] args) {
		
		Consumer<Double> print = System.out::print;
		
		Aluno a1 = new Aluno("Zhant", 7.0);
		Aluno a2 = new Aluno("Sümeyye", 10.0);
		Aluno a3 = new Aluno("Jessy", 5.0);
		Aluno a4 = new Aluno("Vitto", 8.0);
		Aluno a5 = new Aluno("Timi", 8.1);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		BinaryOperator<Double> somatorio = (a,b) -> a + b;
		
		alunos.stream()
			.filter(aprovado)
				.map(apenasNota)
					.reduce(somatorio)
						.ifPresent(print);
		
	}
	
}
