package lesson1_NaturalNambers;

public class MainClass {

	public static void main(String[] args) {
		summOfDigits (112321);
	}
	
	public static void summOfDigits(int n) {
		String str = Integer.toString(n);
		int result = 0;
		for (int i = 0; i <= str.length()-1; i++) {
			result = result + Integer.parseInt(str.substring(i, i+1));
		}
		System.out.println(result);
	}

}
