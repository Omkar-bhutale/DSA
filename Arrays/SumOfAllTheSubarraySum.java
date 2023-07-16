public class SumOfAllTheSubarraySum {
    static int BrutSumOfAllSubarraySum(int[] arr){ //-->tc =O(n^3) ///mar jayega sum calculaye kate karte haaa
        int totalSum=0;
        for(int i = 0;i<arr.length;i++){
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                for(int k = i ; k<=j;k++){
                    sum+=arr[k];
                }
                    totalSum+=sum;
            }
        }
        return totalSum;
    }
    //////////////////////////////////////////
    ///using prifix sum approch  TC--(n^2)
    static int prefixSumofAllSubarrays(int arr[]){// using prifix sunmarray
        //tc-->O(n^2) and SC-->O(n) -->input is not modified new array is created
        int pre[]= new int[arr.length];
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
            pre[i]=sum;
        }
        int totalSum=0;
        for (int i = 0; i < pre.length; i++) {
            for (int j = i; j < pre.length; j++) {
                if(i==0){
                  //  System.out.print(pre[j]+" ");
                  totalSum+=pre[j];
                }
                else{
                    //System.out.print(pre[j]-pre[i-1 ] + " ");
                    totalSum += pre[j]-pre[i-1];
                }   
            }            
        }
        return totalSum;
    }

///////////////////////////////////////////////
//using carry forward technique Tc -->O(n^2)
static int carrySumofAllSubarrays(int arr[]){// using carry forward technique
    int totalSum=0;
    for (int  i= 0; i < arr.length; i++) {
        int carry=0;
        for (int j = i; j < arr.length; j++) {
            carry+=arr[j];
            totalSum+=carry;
           // System.out.print(carry+" ");
            
        }
        System.out.println();
        
    }
    return totalSum;

}


 //here comes most optimized qpproch TC=O(n)
 //based on the sum of ouurace of element in the all the sub array

static int basedOnOccuranceOf_k_SumofAllSubarrays(int arr[]){
    int totalSum=0;
    int length = arr.length;
    for (int i = 0; i < arr.length; i++) {
       // totalSum+=(arr[i]*(length-i)*(i+1));
       totalSum+=arr[i]* KsSountIndexInSubArrayOpti(length, i);
        
    }
    return totalSum;
}


 //here comes most optimized qpproch TC=O(n)




 public static int KsSountIndexInSubArrayOpti(int length,int index){
        

    return (length-index)*(index+1);
}


    public static void main(String[] args) {
        System.out.println( BrutSumOfAllSubarraySum(new int[] {1,2,3}));
        System.out.println( prefixSumofAllSubarrays(new int[] {1,2,3}));
        System.out.println (carrySumofAllSubarrays(new int[] {1,2,3}));
        System.out.println( basedOnOccuranceOf_k_SumofAllSubarrays(new int[] {1,2,3}));
 
        
    }
 
  
    
}
