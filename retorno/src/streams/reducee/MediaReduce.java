package streams.reducee;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class MediaReduce {

	public static void main(String[] args) {
		
		Consumer<Double> print = System.out::print;
		
		Aluno a1 = new Aluno("Zhant", 7.0);
		Aluno a2 = new Aluno("Sümeyye", 10.0);
		Aluno a3 = new Aluno("Jessy", 5.0);
		Aluno a4 = new Aluno("Vitto", 8.0);
		Aluno a5 = new Aluno("Timi", 8.1);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Function<Aluno, Double> apenasNota = a -> a.nota;
		BiFunction<Media, Double, Media> calcularMedia = 
				(media, nota) -> media.adicionar(nota);
		BinaryOperator<Media> combinarMedia =
				(m1, m2) -> Media.combinar(m1, m2);
				
				
		Media media = 
				alunos.stream()
						.map(apenasNota)
							.reduce(new Media(), calcularMedia, combinarMedia);
		
		System.out.println("A média da turma é: " + media.getValor());
		
	}
	
}
