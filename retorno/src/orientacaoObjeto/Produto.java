package orientacaoObjeto;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	double precoComDesconto(double desconto) {
		return preco * (1 - (desconto/100));
	}
}
