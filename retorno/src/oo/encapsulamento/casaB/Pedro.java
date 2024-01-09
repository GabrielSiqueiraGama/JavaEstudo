package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	Ana mae = new Ana();
	
	void testeAcessos() {
		//System.out.println(esposa.segredo); Não tem como acessar por ser privado
		//System.out.println(mae.dentroDeCasa); Não é possivel de acessar pois está em outra pasta.
		//System.out.println(mae.sotaque); Não se torna necessaria a chamada da classe "mae" já que herda.
		System.out.println(sotaque);
		System.out.println(mae.nome);//Publico é visto por todos.

	}
	
}
