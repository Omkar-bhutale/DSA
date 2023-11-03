import java.util.Arrays;

class Radix{

   static void sort(int[] arr){
        int length = arr.length;

        int max =arr[0];
        for (int i = 0; i < length; i++) {
            max=Math.max(max,arr[i]);
        }

        int R=10;
        int aux[] = new int[length];
        int exp =1;
       
        while(max/exp>0){
            int count[] = new int[R];
            for (int i = 0; i < length; i++) {
                count[(arr[i]/exp)%10]++;
            }

            for (int i = 1; i < R; i++) {
                count[i]=count[i]+count[i-1];
            }

            for (int i = length-1; i >=0; i--) {
                aux[--count[(arr[i]/exp)%10]]=arr[i];
            }
            for (int i = 0; i < length; i++) {
                arr[i]=aux[i];
            }
            exp *= 10;
        }
    }

    public static void main(String[] args) {
        int arr[]={3,6,9,1};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }


}