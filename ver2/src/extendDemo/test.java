package extendDemo;
import java.util.stream.IntStream;

public class test {
	public static void main(String[] args) {
		IntStream intStream = IntStream.range(1,5);
		intStream.forEach(System.out::println);
		

	}

}
