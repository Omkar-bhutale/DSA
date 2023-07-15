import java.util.Scanner;

public class NoOFPodNevOdd {
    public static void displayCount(int[][] array){
        int pos=0;
        int neg =0;
        int even=0;
        int odd = 0;
        int zero =0;
        for (int[] is : array) {
            for (int is2 : is) {
                if(is2>=0){
                    pos++;
                    if(is2%2==0)
                    even++;
                    else 
                    odd++;
                    if(is2==0)
                    zero++;

                }
                if(is2<0){
                    neg++;
                    if(is2%2==0)
                    even++;
                    else 
                    odd++; 
                }

                
            }
        }
            System.out.println("numbers of zero : " + zero);
            System.out.println("no of +ve number : "+pos);
            System.out.println("no of negative number"+neg);
            System.out.println("no of even numbers : "+ even);
            System.out.println("no of odd nembers : " +odd);

        

    }
    public static void main(String[] args){
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
        displayCount(array);

        


    }

    
}
