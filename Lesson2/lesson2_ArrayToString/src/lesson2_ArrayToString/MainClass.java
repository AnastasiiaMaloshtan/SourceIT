package lesson2_ArrayToString;

public class MainClass {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
		arrayToString(arrayRandom(10));
		}
	}
	public static void arrayToString ( int [] nums) {
		String str = "";
		for (int i = 0; i < nums.length; i++) {
			str = str + nums[i];
		}
		System.out.println(str);
	}
	
	public static int[] arrayRandom (int length) {
		int[] nums = new int [length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int )(Math.random() * 5 + 1);
		}
		return nums;
	}
}  