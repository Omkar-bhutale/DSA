import java.util.Arrays;

public class SelectionSort {

// functon to return the minimum element ine array
static int minArray(int arr[]){
    int min = arr[0];
   System.out.println(Arrays.toString(arr));
    for(int i=1;i<arr.length;i++){
        if(min>arr[i]){ 
            min=arr[i];
        }
        System.out.println("i = " + i +" and  "+ "ans = "+ min);
    }
    return min;
}
/* 
    i=0
    [0,1,2,3,4,5,6,7,8]
 *  [8,6,7,9,3,2,6,4,1]
 * 
 *  i=1
 *  [0,1,2,3,4,5,6,7,8]
 *  [1,6,7,9,3,2,6,4,8]
 * 
 *  i=2
 *  [0,1,2,3,4,5,6,7,8]
 *  [1,2,7,9,3,6,6,4,8]
 * 
 *  i=3
 *  [0,1,2,3,4,5,6,7,8]
 *  [1,2,3,9,7,6,6,4,8]
 *  
 *  i=4
 *  [0,1,2,3,4,5,6,7,8]
 *  [1,2,3,9,7,6,6,4,8]
 * 
 *  i=5
 *  [0,1,2,3,4,5,6,7,8]
 *  [1,2,3,4,7,6,6,9,8]
 * 
 *  i=6
 *  [0,1,2,3,4,5,6,7,8]
 *  [1,2,3,4,6,7,6,9,8]
 * 
 *  i=7
 *  [0,1,2,3,4,5,6,7,8]
 *  [1,2,3,4,6,6,7,9,8]
 * 
 *  i=8
 *  [0,1,2,3,4,5,6,7,8]
 *  [1,2,3,4,6,6,7,9,8]
 * 
 *  i=8
 *  [0,1,2,3,4,5,6,7,8]
 *  [1,2,3,4,6,6,7,8,9]
 */

static void sort(int[] arr){//tc = O(n^2)

    for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int minIndex = i;
            for(int j= i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    minIndex = j;
                }
            }           
            int temp = arr[i];
            arr[i]=arr[minIndex];//min
            arr[minIndex] = temp;
            System.out.println(Arrays.toString(arr));
    }
}



public static void main(String[] args) {
   // System.out.println(min(11,22));
    int inputArray[] = {8,6,7,9,3,2,6,4,1};
   // System.out.println(inputArray[8]);
    // int storeMinimum = minArray(inputArray);
    // System.out.println("last minimum = " +minArray(inputArray));
    // System.out.println("last minimum = " + storeMinimum);
    //sort(inputArray);
    Arrays.sort(inputArray);//-->quick sort  tc = O(n*logn)
    System.out.println(Arrays.toString(inputArray));

}
    
}
