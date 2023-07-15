//counting the number of leader in the array
//leader ->an element ehich is greater than all element on the right side of it

public class NoOfLeader {

    static int Brut_LederCount(int[] array){//TC-->O(n^2),SC-->O(1)
        int noOfLeders=1;
        int n = array.length;
        for(int i=0;i<n-1;i++){
            int max = array[i];
            for(int j=i+1;j<n;j++){
            if(max<array[j]){
                max=array[j];
                break;
            }   
            }
            if(max==array[i])
            noOfLeders++;
        }

        return noOfLeders;
    }

    static int optimized_LeaderCount(int[] array){//TC=O(n),//--SC->O(1)//
        int noOfLeders=1;
        int n=array.length;
        int max=array[n-1];
        for(int i=n-2;i>=0;i--){
            if(array[i]>max){
                noOfLeders++;
                max=array[i];
            }
        }
        return noOfLeders;

    }



    public static void main(String[] args) {
        int[] array = {15,-1,7,2,5,4,-2,3};
       System.out.println(Brut_LederCount(array));
      System.out.println(optimized_LeaderCount(array));

    }
    
}
