package orientacaoObjeto;

import java.util.Scanner;

public class TesteProduto {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 120.50;
		p1.desconto = 25;
		
		var p2 = new Produto();
		p2.nome = "Caneta azul";
		p2.preco = 100;
		System.out.println("Digite o valor do desconto");
		p2.desconto = scn.nextDouble();
		
		double precofinal1 = p1.preco * (1 -(p1.desconto/100));
		double precofinal2 = p2.preco * (1 -(p2.desconto/100));
		
		System.out.println("O preço do produto: " + p1.nome + "foi de: " + precofinal1);
		System.out.println("O preço do produto: " + p2.nome + "foi de: " + precofinal2);
		
	}
}
