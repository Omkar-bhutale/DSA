package AssingmentSortingArray;

public class Question3 {
	  static void insert(int arr[],int i){
	      
	      int temp = arr[i];
	      int j = i-1;
	       for(;j>=0;j--){
	          if(temp>arr[j]){
	              arr[j+1] = arr[j];
	          }else{ break;}
	       }
	      arr[j+1] = temp;
	      
	  }
	  //Function to sort the array using insertion sort algorithm.
	  public static void insertionSort(int arr[], int n)
	  {
	      //code here
	      for(int i=1;i<n;i++){
	          insert(arr,i);
	      }
	  }
	  public static void main(String[] args) {
	      
	        int[] arr = {64, 25, 12, 22, 11};
	        insertionSort(arr, arr.length);
	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	  

}
