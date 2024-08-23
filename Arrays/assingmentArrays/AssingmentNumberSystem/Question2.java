package AssingmentNumberSystem;

public class Question2 {
	public static void main(String[] args) {
		int num = 16;
		if (num>0 && (num&(num-1))==0) {
			System.out.println("given number is prime if two");
		}else {
			System.out.println("given number is not power of two");
		}
		
		
	}
}
