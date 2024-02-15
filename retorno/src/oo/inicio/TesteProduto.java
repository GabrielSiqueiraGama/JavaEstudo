package oo.inicio;


public class TesteProduto {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		Produto.desconto = 30;
		p1.nome = "Notebook";
		p1.preco = 120.00;
		
		var p2 = new Produto();
		p2.nome = "Caneta azul";
		p2.preco = 100;
		System.out.println("Digite o valor do desconto");
		
		double precofinal1 = p1.preco * (1 -(Produto.desconto/100));
		double precofinal2 = p2.precoComDesconto(Produto.desconto);
		
		System.out.println("O preço do produto: " + p1.nome + "foi de: " + precofinal1);
		System.out.println("O preço do produto: " + p2.nome + "foi de: " + precofinal2);
		
	}
}
