import java.util.Arrays;

public class SmallestEqilibriamIndex {
    public static void main(String[] args) {

        int arr[] = {-7,1,5,2,-4,3,0};
        int length = arr.length;
        int pre[]= new int[length];
        int suf[]= new int[length];
        //creating prefix array
        
        pre[0]=arr[0];
        for (int i = 1; i < length; i++) {
            pre[i]=pre[i-1]+arr[i];            
            
        }
        //creating suffix array
        suf[length-1]=arr[length-1];
        for (int i = length-2; i >=0; i--) {
            suf[i]= arr[i]+suf[i+1];
            
        }
        //    //approch 1
        //    int flag =0;
        //     if(suf[1]==0){
        //         System.out.println("smallest equilibra=iam index is "+1);

        //     }
        //     else{
        //         for(int i=1;i<length-2;i++){
        //             if(pre[i-1]==suf[i+1])
        //             {
        //                 System.out.println("smallest equilibriam index is "+ i);
        //                 flag =1;
        //                 break;
        //             }
        //         }

        //     }
        //     if(flag == 0){
        //         if(pre[length-2]==0){
        //             System.out.println("smallest equilibriam index is "+ (length-1));
        //         }
        //     }
        

        // //ignaorig corner cases

        //        //approch 2

        //        for(int i=0;i<length;i++){
        //            if(pre[i]==suf[i])
        //            {
        //                System.out.println("smallest equilibriam index is "+ i);
              
        //                break;
        //            }
        //        }

        //    //approch 3-->TC=O(n),SC=O(n)
        //    //modifing the arrray at only once
        //    for(int i=0;i<length;i++){
        //     if(i==0){
        //         if(pre[i]==pre[length-1]) {
        //             System.out.println("smallest equilibriam index is "+ i);
        //             break;}
            
        //     }
        //     else {
        //         if(pre[i]==(pre[length-1]-pre[i-1])){
        //             System.out.println("smallest equilibriam index is "+ i);
        //             break;
        //         }
        //     }
         
        //    }



        //approch 4 
        //without modifying array  -->TC=O(n),sc=O(1)
         int sumOfAll =0;
        for (int i : arr) {
            sumOfAll+=i;
            
        }
        int sum =0;
        for(int i=0;i<length;i++){
            sum +=arr[i];
            if(sum==(sumOfAll-sum+arr[i])){
                System.out.println("smallest equilibriam index is "+ i);
                 break;
            }
        }



        // System.out.println(Arrays.toString(pre));
        // System.out.println(Arrays.toString(suf));
    }
    
}
