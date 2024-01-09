package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	Ana sogra = new Ana();
	
	void testeAcessos() {
		//System.out.println(sogra.segredo); Não tem como acessar por ser privado
		//System.out.println(sogra.dentroDeCasa);Não é possivel acessar por ser de pasta diferente.
		//System.out.println(sogra.sotaque);Não é possivel acessar por ser de pasta diferente e nao herda
		System.out.println(sogra.nome);//Publico é visto por todos.

	}
}
