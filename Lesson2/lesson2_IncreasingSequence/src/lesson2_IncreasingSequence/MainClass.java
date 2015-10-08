package lesson2_IncreasingSequence;

public class MainClass {

	public static void main(String[] args) {
		arrayToString(arrayRandom(4));
	}
	public static void arrayToString ( int[] nums) {
		String str = "";
		for (int i = 0; i < nums.length; i++) {
			str = str + nums[i];
		}
		System.out.println(str);
	}
	public static int[] arrayRandom (int length) {
		int[] nums = new int [length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 89 + 10);
		  if ((nums[0] < nums[1]) && (nums[1] < nums[2]) && (nums[2] < nums[3])){
			System.out.println("Given array is an increasing sequence");
		  }
		}
		return nums;
	}
}