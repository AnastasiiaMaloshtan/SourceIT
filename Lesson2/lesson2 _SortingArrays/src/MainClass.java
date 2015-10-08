import java.util.Arrays;


public class MainClass {

	public static void main(String[] args) {
		int [] numbers = {1,8,7,5};
		Arrays.sort(numbers);
		selectionSort(numbers);
		bubbleSort(numbers);
		arrayToString(numbers);
	}	
	public static void arrayToString ( int [] nums) {
		String str = "";
		for (int i = 0; i < nums.length; i++) {
			str = str + nums[i];
		}
		System.out.println(str);
	}	
	public static void selectionSort (int [] nums) {
		for (int i = 0; i < nums.length; i++) {
			int min = nums[i];
			int min_i = i;
				for(int k = i+1; k < nums.length; k++) {
					if(nums[k]< min) {
					min = nums[k];	
					min_i = k;
					}
				}	
				if (i != min_i) {
					int tmp = nums[i];
					nums[i] = nums[min_i];
					nums[min_i] = tmp;
				} 
		}
	}
	public static void bubbleSort(int[] nums){
	    for(int i = nums.length-1 ; i > 0 ; i--){
	        for(int k = 0 ; k < i ; k++){
	            if( nums[k] > nums[k+1] ){
	                int tmp = nums[k];
	                nums[k] = nums[k+1];
	                nums[k+1] = tmp;
	            }
	        }
	    }
	}
	
}
	
	
	

