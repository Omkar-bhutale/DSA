package AssingmentNumberSystem;

public class Question4 {
		public static int countSetBit(int num) {
			int ans = 0;
			for(int i=0;i<Integer.SIZE;i++)
				ans+=(num>>i)&1;
			return ans;
		}
		public static void main(String[] args) {
			int num = 15;
			System.out.println("count of set bits are ::"+ countSetBit(num));
		}
}
