package tratamentoErros.personalizada2;

import tratamentoErros.Aluno;

public class TesteValidacoes{

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("", -1.0);
			Validar.aluno(aluno);
		} catch (NumeroInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
		
	}
	
}
