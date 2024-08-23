package AssingmentLinearAndBinarySearch;

public class Question3 {
	public static int countOnes(int[] arr) {
		int size = arr.length;
		int ans = 0;
		for(int i=0;i<size;i++) {
			ans+=arr[i];
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {1,1,1,1,1,0,0,0,0,1,1,1,1};
		System.out.println("Total count of ones are ::"+countOnes(arr));
	}

}
