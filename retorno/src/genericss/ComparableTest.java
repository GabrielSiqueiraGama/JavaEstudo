package genericss;

import java.util.TreeSet;

public class ComparableTest {

	public static void main(String[] args) {
		
		TreeSet<Integer> nums = new TreeSet<Integer>();
		
		nums.add(1);
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(8);
		nums.add(1);
		nums.add(12);
		nums.add(-12);
		nums.add(0);
		
		for(Integer n: nums) {
			System.out.println(n);
		}
		
	}
	
}
