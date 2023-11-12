package colections;

import java.util.HashSet;
import java.util.Set;

public class SetEstudo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add("x");
		
		System.out.println("O tamanho do conjunto é: " + conjunto.size());
		conjunto.remove("teste");
		System.out.println("O tamanho do conjunto é: " + conjunto.size());
		System.out.println(conjunto.contains(1.2));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		System.out.println(conjunto);
		conjunto.addAll(nums);
		System.out.println(conjunto);
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		conjunto.clear();
		System.out.println(conjunto);
	}
}
