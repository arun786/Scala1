package Function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionInJava {

	public static void main(String[] args) {

		int maxValue = max(10, 20);
		System.out.println(maxValue);

		int increment = function(10);
		System.out.println(increment);

		Function<Integer, Integer> function = (a) -> a + 1;
		increment = function.apply(10);
		System.out.println(increment);
		
		Supplier<String> supplier = () -> "Hello World";
		String value = supplier.get();
		System.out.println(value);
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static int function(int x) {
		return x + 1;
	}

}
