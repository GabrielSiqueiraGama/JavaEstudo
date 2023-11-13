package colections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetHomogeneo {
	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();
		lista.add("Zhant");
		lista.add("Bluiz");
		lista.add("Alexander");
		lista.add("Aurora");
		lista.add("Eme");
		lista.add("Aaaaaaaa");
		
		for(String nome: lista) {
			System.out.println(nome);
		}
		
		TreeSet<String> lista2 = new TreeSet<String>();
		lista2.add("loriel");
		lista2.add("Juvia");
		lista2.add("Edu");
		
		System.out.println();
		
		for(String nome2: lista2) {
			System.out.println(nome2);
		}
		
	}
}
