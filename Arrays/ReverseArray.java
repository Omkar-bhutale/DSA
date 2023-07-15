//TTC = O(n)
//SC =O(1)
public class ReverseArray {
 
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int n = array.length-1;
        for(int i=0;i<=n/2;i++){
            int temp = array[i];
            array[i]=array[n-i];
            array[n-i]=temp;
            
        }
        for(int a: array){
            System.out.print(a +" ");
        }

    }
    
}
