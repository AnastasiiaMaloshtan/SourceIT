package lesson2_SortingString;

public class MainClass {

	public static void main(String[] args) {
		String [] phrases = {"dog", "cat", "tree", "house", "electricity", "umbrella", "heart"};
		bubbleSort(phrases);
		arrayToString(phrases);
	}
	public static void arrayToString ( String [] nums) {
		String str = "";
		for (int i = 0; i < nums.length; i++) {
			str = str + nums[i] + " ";
		}
		System.out.println(str);
	}
	public static void bubbleSort(String[] strings){
	    for(int i = strings.length-1 ; i > 0 ; i--){
	        for(int k = 0 ; k < i ; k++){
	            if( strings[k].compareTo (strings[k+1]) > 0){
	                String tmp = strings[k];
	                strings[k] = strings[k+1];
	                strings[k+1] = tmp;
	            }
	        }
	   }
	}
}
