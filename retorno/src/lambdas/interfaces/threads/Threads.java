package lambdas.interfaces.threads;

public class Threads {

	public static void main(String[] args) {
		
		Runnable trabalho1 = new Trabalho1();
		Runnable trabalho2 = new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0;  i <5; i++) {
					System.out.println("Thread 02: Tarefa: " + (i+1));
				}
			}
		};
		
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		
		t1.start();
		t2.start();
	}
	
}
