public class PrintAllSubArraySum {
    static void BrutPrintSubarraySum(int[] arr){ //-->tc =O(n^3)
        for(int i = 0;i<arr.length;i++){
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                for(int k = i ; k<=j;k++){
                    sum+=arr[k];

                
                }
                System.out.println(sum+" ");
                
                System.out.println();
            }
        }
    }
    static void optiSumofAllSubarrays(int arr[]){// using prifix sunmarray
        //tc-->O(n^2) and SC-->O(n) -->input is not modified new array is created
        int arr1[]= new int[arr.length];
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
            arr1[i]=sum;
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i; j < arr1.length; j++) {
                if(i==0){
                    System.out.print(arr1[j]+" ");
                }
                else{
                    System.out.print(arr1[j]-arr1[i-1 ] + " ");
                }
                
                
            }
            System.out.println();
            
        }
    }

    static void optiSumofAllSubarrays1(int arr[]){// using carry forward technique

        //tc-->O(n^2) and SC-->O(1)
        /*
         * psudo code
         * 
         *  for i --> o to n-1
         *   carry=0;
         *     forj--->0 to n-1
         *      carry+=array[j]
         *      print(carry)
         * 
         */
        for (int  index = 0; index < arr.length; index++) {
            int carry=0;
            for (int j = index; j < arr.length; j++) {
                carry+=arr[j];
                System.out.print(carry+" ");
                
            }
            System.out.println();
            
        }

    }
    
    public static void main(String[] args) {
        optiSumofAllSubarrays1(new int[] {1,2,3,4});
    }
}
