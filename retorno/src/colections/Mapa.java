package colections;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "bastiao");//cria usuario;
		usuarios.put(1, "zézé");//Atualiza
		usuarios.put(2, "zhant");
		usuarios.put(99, "Bluiz");
		System.out.println(usuarios.size());//Imprime tamanho.
		System.out.println(usuarios.isEmpty());//vazio ou nao
		System.out.println(usuarios.keySet());// imprime as chaves
		System.out.println(usuarios.values());//imprime valores
		System.out.println(usuarios.containsKey(99));// procura se contem a chave
		System.out.println(usuarios.containsValue("zhant"));//procura se contem o nome
		
		for(int chave: usuarios.keySet()) {
			System.out.println("==========================");
			System.out.println(chave);
			System.out.println("==========================");
		}
		for(String nomes: usuarios.values()) {
			System.out.println("==========================");
			System.out.println(nomes);
			System.out.println("==========================");
		}
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println("==========================");
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
			System.out.println("==========================");
		}
	}
}
