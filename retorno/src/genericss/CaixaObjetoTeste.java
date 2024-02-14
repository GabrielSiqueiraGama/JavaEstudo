package genericss;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);
		
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		
		Caixa<String> caixaB = new Caixa<>();
		caixaB.guardar("Opa");
		System.out.println(caixaB);
	}
	
}
