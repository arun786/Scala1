package Function;

public class FunctionInJava {

	public static void main(String[] args) {

		int maxValue = max(10,20);
		System.out.println(maxValue);
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
