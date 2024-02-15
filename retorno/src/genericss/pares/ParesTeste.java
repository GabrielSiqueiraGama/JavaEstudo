package genericss.pares;

public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Zhant");
		resultadoConcurso.adicionar(2, "Bluiz");
		resultadoConcurso.adicionar(3, "Crosser");
		resultadoConcurso.adicionar(4, "Aurora");
		resultadoConcurso.adicionar(2, "Agro");
		
		System.out.println(resultadoConcurso.getValor(2));
		
	}
	
}
