package oo.encapsulamento.casaA;

public class Paulo {
	Ana esposa = new Ana();
	
	void testeAcessos() {
		//System.out.println(esposa.segredo); Não tem como acessar por ser privado
		System.out.println(esposa.dentroDeCasa);// possivel de acessar pois está na mesma pasta.
		System.out.println(esposa.sotaque);//mesma pasta também.
		System.out.println(esposa.nome);//Publico é visto por todos.

	}
}
