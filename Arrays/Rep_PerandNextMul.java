import java.util.Arrays;
//tc=O(n)
//sc = O(1)
public class Rep_PerandNextMul {
    public static void main(String[] args) {

        int[] arr = {0,2,3,4,5,6,7,8,9};
        int res1 = arr[1];
        int res2 = arr[arr.length-2];
        int temp1 = arr[1];
        int temp2 = arr[0];
        for (int i=1;i<arr.length-1;i++) {
            temp1 = arr[i];
            arr[i]=temp2*arr[i+1];
            temp2=temp1;
        }
        arr[0]*=res1;
        arr[arr.length-1]*=res2;


        System.out.println(Arrays.toString(arr));
    }
    
}
