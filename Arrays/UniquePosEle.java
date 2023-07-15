import java.util.Scanner;

class UniqueposEle{
    static int uniqueElement(int arr[]){
        int n= arr.length;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                arr[i]=arr[j]=-1;
            }

        }}
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                return arr[i];
            }
        }
       return -1;
    }
    public static void main(String[] args) {
       // int array[] = {1,2,2,1,3};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        System.out.println("enter the element int he array");
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
    System.out.println(uniqueElement(array));
    System.out.println();



    }
}