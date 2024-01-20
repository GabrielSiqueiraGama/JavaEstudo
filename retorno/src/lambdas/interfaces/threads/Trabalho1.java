package lambdas.interfaces.threads;

public class Trabalho1 implements Runnable{

	@Override
	public void run() {
		for(int i = 0;  i <5; i++) {
			System.out.println("Thread 01: Tarefa: " + (i+1));
		}
		
	}

}
