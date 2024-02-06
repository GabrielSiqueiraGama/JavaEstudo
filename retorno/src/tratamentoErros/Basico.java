package tratamentoErros;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNome(a1);
		} catch (Exception e) {
			System.out.println("O aluno se encontra como nulo");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}
	
	public static void imprimirNome(Aluno aluno) {
		System.out.println(aluno.nome);
	}
	
}
