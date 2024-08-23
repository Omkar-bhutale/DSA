package AssingmentLinearAndBinarySearch;

public class Question5 {
	public static boolean isPerfectSquare(int num) {
		 if (num < 2) return true; 
		for(int i=0;i<num/2;i++) {
			if(i*i == num) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int num = 25;
		if (isPerfectSquare(num)) {
			System.out.println("the given number is perfect square");
		}else {
			System.out.println("the given number is not perfect quaare");
		}
	}

}
