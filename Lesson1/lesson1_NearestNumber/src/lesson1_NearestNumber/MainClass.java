package lesson1_NearestNumber;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(calculateNearestNumber(-2, 8));
	}

	public static int calculateNearestNumber(int n, int m) {
		if ((10 - n) > (10 - m)) {
			return m;
		} else {
			return n;
		}
	}
}
