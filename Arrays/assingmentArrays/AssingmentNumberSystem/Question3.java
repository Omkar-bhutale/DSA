package AssingmentNumberSystem;

public class Question3 {

	public static boolean isEven(int num) {
		return (num & 1) == 0;
	}

	public static void main(String[] args) {
		int num = 55;
		if (isEven(num)) {
			System.out.println("the given number is even");
		}
		else {
			System.out.println("the given number is odd");
		}
	}
}
