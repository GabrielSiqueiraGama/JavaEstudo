package genericss;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS", "PHP", "Java");
		List<Integer> nums = Arrays.asList(1, 2, 3);
		
		String ultimaLinguagem = (String) ListaUtil.getUltimo(langs);
		System.out.println(ultimaLinguagem);
		
		Integer ultimoNumero = (Integer) ListaUtil.getUltimo(nums);
		System.out.println(ultimoNumero);
		
		Integer ultimoItemEh = ListaUtil.getUltimo2(nums);
		System.out.println(ultimoItemEh);
		
	}
	
}
