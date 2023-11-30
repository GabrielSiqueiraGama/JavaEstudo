package oo.compraOO;

public class Sistema {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Zhant");
	
		Compra compra1 = new Compra();
		compra1.adicionarItem("Faca", 88.80, 1);
		compra1.adicionarItem(new Produto("Foice", 55.80), 1);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Desinfetante", 12.90, 1);
		compra2.adicionarItem(new Produto("Cloro", 55.80), 1);
		
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		System.out.println(cliente.obterValorTotal());
		
	}
	
}
