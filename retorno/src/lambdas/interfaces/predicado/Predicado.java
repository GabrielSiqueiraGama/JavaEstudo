package lambdas.interfaces.predicado;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		Predicate<Produto> isExpensive = 
				produto -> (produto.preco *(1 - produto.desconto))> 1000;
		Produto produto = new Produto("Notebook", 3800, 0.1);
		
		System.out.println(isExpensive.test(produto));
		
	}
	
}
