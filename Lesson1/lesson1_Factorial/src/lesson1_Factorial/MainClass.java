package lesson1_Factorial;

public class MainClass {

	public static void main(String[] args) {
		calculateFactorial(4);
	}

	public static void calculateFactorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		System.out.println(result);
	}
}
