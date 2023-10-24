import java.util.Arrays;

class BubbleSort{
    static void Sort(int arr[]){
        int length = arr.length;
        for(int i=0;i<length;i++){
            for(int j=length-2;j>=i;j--){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
            }
            System.out.println(Arrays.toString(arr)+"\n");
        }

    }
    public static void main(String[] args){
        int[] arr =new int[]{4,7,1,3,5,2,6};
        Sort(arr);
    }

}
