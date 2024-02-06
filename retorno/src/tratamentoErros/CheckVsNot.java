package tratamentoErros;

public class CheckVsNot {

	public static void main(String[] args) {
		
		try {
			gerarErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			gerarErro2();
		} catch (Exception e) {
			System.out.println("Ocorreu o seguinte error: " + e.getMessage());
		}
		
		System.out.println("Fim!");
	}
	
	//Exceção NÃO checada
	static void gerarErro1() {
		throw new RuntimeException("Erro de Runtime");
	}
	//Exceção checada. 
	static void gerarErro2() throws Exception{
		throw new Exception("Erro");//throw serve para lançar o erro.
	}
	
}
