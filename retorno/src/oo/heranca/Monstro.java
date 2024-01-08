package oo.heranca;

public class Monstro extends Jogador{
	
	Monstro(){
		super(0,0);
	}
	
	boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		return ataque1 ||  ataque2;//Modificando o dano da função sem escrever todo o codigo
		//Nesta parte é chamada a função duas vezes para puxar a quantidade de dano em dobro.
	}
}
