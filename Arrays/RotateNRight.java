import java.util.Arrays;
import java.util.Scanner;

class RotateNRight 
{
    public static void main(String[] args) {
        int arr[] = {11,22,33,44};
        Scanner sc = new Scanner(System.in);
        int RotatedArray[] = new int[arr.length];
        System.out.println("enter the number of rotation");
        int noOfRotation = sc.nextInt();
        int AnoOfRotation= noOfRotation%arr.length;
        for (int i = 0; i < RotatedArray.length; i++) {
            if(RotatedArray.length>i+AnoOfRotation){
            RotatedArray[i]=arr[i+AnoOfRotation];}
            else{
                RotatedArray[i]=arr[i-AnoOfRotation];
            }
        }
 
        System.out.println(Arrays.toString(RotatedArray));
    }
}