package oo.diversos;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Zhant");
		Aluno aluno2 = new Aluno("Bluiz");
		Aluno aluno3 = new Aluno("Juvia");
		
		Curso curso1 = new Curso("Ingles");
		Curso curso2 = new Curso("Java");
		Curso curso3 = new Curso("Flutter");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso3.adicionarAluno(aluno1);
		
		aluno1.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso de: " + curso3.nome);
			System.out.println("E meu nome é: " + aluno.nome);
			System.out.println("=================");
		}
		
		
	}
}
