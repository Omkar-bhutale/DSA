import java.util.Scanner;

public class EleAboveSecDig{
    public static void ElementAboveSecDignol(int array[][]){
         for (int i = 0; i < array.length-1; i++) {


            for(int j =0;j<array[i].length-1-i;j++){
                System.out.println(array[i][j]);
            }
            
         }

    }
    public static void main(String[] args) {
        int m=0;
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter m (rows) ");
        m=sc.nextInt();
        System.out.println("enter n (columns)");
        n=sc.nextInt();
        int array[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j]=sc.nextInt();
                
            }
            
        }
        ElementAboveSecDignol(array);

    }
}