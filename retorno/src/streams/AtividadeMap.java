package streams;

public class AtividadeMap {
	
	public static void main(String[] args) {
//		int x = 1;
//		String bin = Integer.toBinaryString(x);
//		System.out.println(bin);
		
		int x =13;
		int r=0;
		String b="";
		System.out.println("x:"+x);
		b=Integer.toBinaryString(x);
		System.out.println("b:"+b);
		System.out.println("conferindo:"+Integer.parseInt(b,2));
		System.out.println("......");
		
		
		int y = 10;
		String bin = "";
		bin = Integer.toBinaryString(y);
		System.out.println(bin);
	}
	
}
