public class DifferentBitsSumPairwise {
    public int cntBits(int[] A) {
        //brute force   
    //     int n = A.length;
    //     int ans=0;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             int count = 0;
    //         for(int k=0;k<32;k++){
    //             if(((A[i]>>k)&1) != ((A[j]>>k)&1)){
    //                 count++;
    //             }
    //         }
    //         ans+=(2*count);
    //         }
    //     }
    //     return ans;
    // }
    //step 1 opti //not works for hard cases
    public class Solution {
    public int cntBits(int[] A) {
        long ans=0;
        for(int i=0;i<32;i++){
            int ones=0;
            int zeros=0;
            for(int j=0;j<A.length;j++){
               if(((A[j]>>i)&1)==1){ ones++;}
               else zeros++;
            }
            ans+= (2*ones*zeros);
            
        }
        return ans;
    }
}

}
