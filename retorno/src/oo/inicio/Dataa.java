package oo.inicio;

public class Dataa {
	int dia;
	int mes;
	int ano;
	
	Dataa(){
		this(01,11, 1970);
	}
	Dataa(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	String obterData(int dia, int mes, int ano) {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	void imprimirData() {
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}
}
