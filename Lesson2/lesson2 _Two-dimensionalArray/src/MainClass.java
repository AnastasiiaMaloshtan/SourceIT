

public class MainClass {

	public static void main(String[] args) {
		arrayToString(arrayRandom (6,7));
		
	}
	public static void arrayToString ( int [][] nums) {
		String str = "";
		for (int i = 0; i < nums.length; i++) {
			bubbleSort(nums[i]);
			for(int j = 0; j < nums[i].length; j++) {
				str = str + nums[i][j];
			}
			System.out.println(str);
			str = "";
		}
	}
	
	public static int[][] arrayRandom (int length, int width) {
		int[][] nums = new int [length][width];	
		for (int i = 0; i <length; i++) {
			for( int j = 0; j<width; j++) {
				nums[i][j] = (int)(Math.random() * 10);
			}
		}
		return nums;
	}
	
	
	public static void bubbleSort(int[] nums){
	    for(int i = nums.length-1 ; i > 0 ; i--){
	        for(int k = 0 ; k < i ; k++){
	            if( nums[k] < nums[k+1] ){
	                int tmp = nums[k];
	                nums[k] = nums[k+1];
	                nums[k+1] = tmp;
	            }
	        }
	    }
	}
}
