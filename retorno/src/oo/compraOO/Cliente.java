package oo.compraOO;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	List<Compra> compras = new ArrayList<>();
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}
}
