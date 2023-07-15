public class FirstPeek {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4,6,2,7,3};
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
            System.out.println("the first peek ele is "+arr[i]);
            break;
            }
            
        }
    }
    
}
