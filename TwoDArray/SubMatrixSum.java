package TwoDArray;

import java.util.Scanner;

public class SubMatrixSum {
    //sub Matrix sum for Single quary
    static int sum(int[][] arr,int sx ,int sy, int ex,int ey){
        int sum=0;
        for(int i=sx;i<=ex;i++){
            for(int j=sy;j<=ey;j++){
                System.out.println(arr[i][j]);
                sum+=arr[i][j];
            }
        }
        return sum;
    }//tc O(m*n)

    static void SumForMultipalQuaries(int[][] a){
        int n=a.length;
        int m=a[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0){
                    a[i][j]=a[i][j];
                }
                else if(i==0){
                    a[i][j]+=a[i][j]+a[i][j-1];
                }
                else if(j==0){
                    a[i][j]+=a[i][j]+a[i-1][j];
                }
                else{
                    a[i][j]+= a[i][j]+a[i-1][j]+a[i][j-1]-a[i-1][j-1];
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of quaries");
        int quaries = sc.nextInt();
    }

    public static void main(String[] args) {
        int arr[][]= new int[][] {{1,3,5,2},{4,8,5,0},{10,20,-1,3}};
        System.out.println(arr.length );
        System.out.println(arr[0].length);
        System.out.println(sum(arr, 0, 1, 1, 2));
        
    }
    
}
