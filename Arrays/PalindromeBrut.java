public class PalindromeBrut{
   
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,6,5,4,3,2,1};
        
        int mid =arr.length;
      
    //    int count = 0; 
    //     for(int i=0;i<=mid;i++){
    //         if(arr[i]==arr[n-i]){
    //             count++;  //count=i
    //         }else{
    //             break;
    //         }
    //     }    
    //         if(count== mid){
    //             System.out.println("string is palindrome");

    //         }else{
    //             System.out.println("string is not palindrome");
    //         }
    int n = arr.length;

    int flag =0;
    for(int i =0;i<n/2;i++){
        if(arr[i] != arr[n-1-i]){
            flag = 1;
            System.out.println("not palindrome");
            break;
        }        
    }
        if(flag == 0){
            System.out.println("palindrome");
        }
   

        
     }
}