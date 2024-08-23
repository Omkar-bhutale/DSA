package AssingmentLinearAndBinarySearch;

public class Questuin1{
	
	public static int search(int[] input,int size ,int k) {
		for(int i=0;i<size;i++) {
			if (input[i]==k) {
				System.out.println("element found at index ::"+i);
				return i;
			}
		}
		System.out.println("element not found");
		return -1;
		
	}
	public static void main(String[] args) {
		int[] input = {1,2,3,4,5};
		int size = 5;
		int k=5;
		search(input, size, k);
		
		
	}

}
