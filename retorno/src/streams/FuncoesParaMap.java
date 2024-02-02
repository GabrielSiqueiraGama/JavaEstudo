package streams;

import java.util.function.UnaryOperator;

public class FuncoesParaMap {
	
	private FuncoesParaMap() {}//Colocando como privado é evitado que a classe
	//seja instanciada. 
	
	public static final UnaryOperator<String> maiuscula = m -> m.toUpperCase();
	public static final UnaryOperator<String> minuscula = m -> m.toLowerCase();
	public static final UnaryOperator<String> primeiraLetra = m -> m.charAt(0) + "";
}
