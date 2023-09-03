public class SumOfAllTheSubArray {
    // contribution technique says if there is an element appearing in a sub array munltiple time(but appear at specific times) then ther is 
    //specific contribution of this element in sum of all the suarray sum
    //in 1D array The occurance of an perticular element (i+1)*(n-i) times
    //therefore Contribution of That element in sub array is a[i]*(i+1)*(length-1) 
    static int toalSubArraySum(int[] arr){  //Contributtion tech nique
        int sum=0;
        int length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i]*(i+1)*(length-i);

        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(toalSubArraySum(new int[] {1,2,3}));
        
    }
    
}
