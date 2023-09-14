public class DifferentBitsSumPairwise {
    public int cntBits(int[] A) {
        //brute force   
        int n = A.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int count = 0;
            for(int k=0;k<32;k++){
                if(((A[i]>>k)&1) != ((A[j]>>k)&1)){
                    count++;
                }
            }
            ans+=(2*count);
            }
        }
        return ans;
    }
    
}
