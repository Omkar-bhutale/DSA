import java.util.Scanner;

class TargetSumTriplet {
    public static int Triplet(int array[],int target){
        int ans =0;
        int n = array.length;
        for(int i=0 ;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++)
                if(array[i]+array[j]+array[k]==target){
                    ans++;
                }
            }
        }




        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        System.out.println("enter the element int he array");
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();

        }
        System.out.println("enter the target");
        int target = sc.nextInt();
        System.out.println(     Triplet(array, target));

        
    }
}    