package AssingmentSortingArray;

public class Question2 {
	int  select(int arr[], int i)
	{  int max =arr[i];
	    int idx = i;
       for(;i<arr.length;i++)
        {
            if(max<arr[i]){
                max = arr[i];
                idx = i;
            }
        }        
        return idx;
	}
	
	void selectionSort(int arr[], int n)
	{
	    for(int i=0;i<n-1;i++){
	        int pos = select(arr,i);
	        int temp = arr[i];
	        arr[i] = arr[pos];
	        arr[pos] = temp;
	    }
	}
	 public static void main(String[] args) {
	        Question2 sorter = new Question2();
	        int[] arr = {64, 25, 12, 22, 11};
	        sorter.selectionSort(arr, arr.length);
	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }

}
