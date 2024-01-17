package oo.inicio;

public class Produto {
	String nome;
	double preco;
	static double desconto;
	
	Produto(){}
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	double precoComDesconto(double desconto) {
		return preco * (1 - (desconto/100));
	}
}
