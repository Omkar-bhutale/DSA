import java.util.Arrays;

public class SelectioinSort {
   static void Sort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
           int min = arr[i];
           int minId = i;
            for (int j = i; j < arr.length; j++) {
                if(min>arr[j]) minId=j;
                min=Math.min(min,arr[j]);
                
                
            }
            int temp = arr[i];
            arr[i]=arr[minId] ;
            arr[minId]=temp;
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
       int[] arr =new int[]{4,7,1,3,5,2,6};
        Sort(arr);
        
    }
}
