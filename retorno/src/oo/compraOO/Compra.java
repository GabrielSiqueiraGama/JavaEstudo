package oo.compraOO;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int qtd) {
		this.itens.add(new Item(p, qtd));
	}
}
