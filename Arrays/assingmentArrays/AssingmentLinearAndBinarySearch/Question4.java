package AssingmentLinearAndBinarySearch;

public class Question4 {
	public static int totalOccurance(int[] input,int k) {
		int ans = 0;
		for(int i=0;i<input.length;i++) {
			if (input[i]==k) {
				ans++;
			}
		}
		return ans;
		
	}
		
	
	
	public static void main(String[] args) {
		int input[] = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
		System.out.println("the total freaquancy of given element is ::" +totalOccurance(input, 5));
	}

}
