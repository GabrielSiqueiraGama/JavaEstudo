package orientacaoObjeto;

public class Dataa {
	int dia;
	int mes;
	int ano;
	
	String obterData(int dia, int mes, int ano) {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	void imprimirData() {
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}
}
