package streams.filtrar;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		Consumer<Object> println = System.out::println;
		
		Aluno a1 = new Aluno("zhant", 8.0);
		Aluno a2 = new Aluno("bluiz", 7.0);
		Aluno a3 = new Aluno("Brock", 10.0);
		Aluno a4 = new Aluno("Julia", 1.0);
		Aluno a5 = new Aluno("Liri", 3.0);
		Aluno a6 = new Aluno("Well", 5.0);
				
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> texto = a -> "Parabéns " + a.nome + " Você foi aprovado";
		alunos.stream()
			.filter(a -> a.nota >= 7)//filtra alunos com notas maiores ou iguais a 7
				.map(a-> "Parabéns " + a.nome + " Você foi aprovado")
					.forEach(println);
		//Mesma coisa da função acima mas com predicate e function.		
		System.out.println();
		
		alunos.stream()
			.filter(aprovado)
				.map(texto)
					.forEach(println);
		
	}
	
}
