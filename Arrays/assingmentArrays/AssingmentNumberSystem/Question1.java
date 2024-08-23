package AssingmentNumberSystem;

public class Question1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		int num = 16;
		while(num>0) {
			sb.append(num%2);
			num/=2;
		}
		sb.reverse();
		System.out.println("Binary reperesentation id "+sb.toString());
	}

}
