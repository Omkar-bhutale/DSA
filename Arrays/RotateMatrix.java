import java.util.Arrays;//rotate th matrix
class RotateMatrix{

    public static void printMatrix(int[][] arr){
        for (int[] is : arr) {
            System.out.print("{");
           // System.out.println(Arrays.toString(is));
            for (int is2 : is) {
                System.out.print(is2+" ");    
            }
            System.out.print("}");
            System.out.println();   
        }                                        

    }


    public static void main(String[] args) {
        int[] arr[] = {{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20}};
        System.out.println("Matrix before rotation");

        printMatrix(arr);

    }
}