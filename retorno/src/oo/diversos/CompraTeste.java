package oo.diversos;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "zhant";
		
		c1.adicionarItem("Caneta azul", 20, 10);
		c1.adicionarItem(new Item("Lapis", 1, 1.0));
		c1.adicionarItem(new Item("Azul caneta", 20, 10));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
	}
	
	
}
