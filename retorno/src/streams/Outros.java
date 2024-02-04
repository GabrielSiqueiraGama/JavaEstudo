package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import streams.filtrar.Aluno;

public class Outros {

	public static void main(String[] args) {
		
		Consumer<Object> prinln = System.out::println;
		
		Aluno a1 = new Aluno("zhant", 8.0);
		Aluno a2 = new Aluno("bluiz", 7.0);
		Aluno a3 = new Aluno("Brock", 10.0);
		Aluno a4 = new Aluno("Julia", 1.0);
		Aluno a5 = new Aluno("zhant", 8.0);
		Aluno a6 = new Aluno("bluiz", 7.0);
		Aluno a7 = new Aluno("Brock", 10.0);
		Aluno a8  = new Aluno("Julia", 1.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distintos: ");
		alunos.stream().distinct().forEach(prinln);//pega apenas os elemntos distintos
		
		System.out.println("\nSkip e limite");
		alunos.stream()
			.distinct()
				.skip(1)//pula um elemento
					.limit(2)//limita a pegar no maximo dois elementos
						.forEach(prinln);
		
		System.out.println("\ntakeWhile");
		alunos.stream()
			.distinct()
				.takeWhile(a -> a.getNota() >= 7);
		
	}
	
}
