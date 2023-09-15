class Solution {
    public int[] singleNumber(int[] nums) {
    //     //brute force Tc= O(N^2)
        int ans[] = new int[2];
    //     int index=0;
    //     for(int i = 0;i<nums.length;i++){
    //         int count =0;
    //         for(int j=0;j<nums.length;j++){
    //             if(nums[i]==nums[j]){count++;}

    //         }
    //         if(count == 1) ans[index++]=nums[i];
    //     }
    //     return ans;
    // //Tle
    
        //Optimized Approch
        int bit_pos=-1;
        for(int i=0;i<32;i++){
            int bit_val=0;
            for(int j=0;j<nums.length;j++){
                bit_val^=((nums[j]>>i)&1);
            }
            if(bit_val==1){ bit_pos=i; break;}
            
        }
        for(int i=0;i<nums.length;i++){
            if(((nums[i]>>bit_pos)&1)==1) ans[0]^=nums[i];
            else ans[1]^=nums[i];

        }
        return ans;

    }
}
