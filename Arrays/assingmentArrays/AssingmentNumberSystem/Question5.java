package AssingmentNumberSystem;



public class Question5 {
	public static int elementWithOddFreq(int[] arr) {
		if(arr.length==0) return -1;
		int ans = arr[0];
		for (int i = 1; i < arr.length; i++) {
			ans^=arr[i];
		}
		return ans;
		
	}
	   public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 2, 3, 1, 3};
	        System.out.println("Element with odd frequency is: " + elementWithOddFreq(arr));
	    }
}
