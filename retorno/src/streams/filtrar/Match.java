package streams.filtrar;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("zhant", 8.0);
		Aluno a2 = new Aluno("bluiz", 7.0);
		Aluno a3 = new Aluno("Brock", 10.0);
		Aluno a4 = new Aluno("Julia", 1.0);
		Aluno a5 = new Aluno("Liri", 3.0);
		Aluno a6 = new Aluno("Well", 5.0);
				
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(reprovado));
		
	}
	
}
