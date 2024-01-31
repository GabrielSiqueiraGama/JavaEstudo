package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {

	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::print; //Criando referencia para poder utilizar a impressão
		//de forma mais facilitada
		
		Stream<String> langs = Stream.of("Java ", "Flutter ", "C#\n");
		langs.forEach(print);//aqui é chamada a stream e o consumer para realizar a impressão.
		
		String[] maisLangs = {"Python ", "Lisp ", "JS ", "Kotlin \n"};
		Stream.of(maisLangs).forEach(print);
	
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 0,3).forEach(print);//aqui delimita até a casa que vai, como inicia no 0, seria do zero(primeira)
		//até a terceira casa(0 - 1 - 2)
		List<String> outrasLangs = Arrays.asList("\nPHP ", "TS");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);//stream paralela
		
		//Stream.generate(()-> "a").forEach(print);//geração de stream infinita
		//Stream.iterate(0, n -> n+1).forEach(print);
	
	}
	
}
