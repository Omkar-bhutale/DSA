//TC=O(n)
//SC=O(1)
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,6,7,3};
        int n = arr.length;
        int Sum_of_Natural_Numbers = (n+1)*(n+2)/2;
        int Sum = 0;
        for (int i : arr) {
            Sum+=i;
            
        }
        int miss_ele = Sum_of_Natural_Numbers-Sum;
        System.out.println("missing number " + miss_ele);
        
    }
    
}
