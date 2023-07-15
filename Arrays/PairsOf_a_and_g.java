//Qns->given acharacter array calculte the nuber of pair such (i<j) s[i]='a' and s[j]='g'

public class PairsOf_a_and_g {
    static int BrutPair(char[] carr){//TC-->O(n^2) SC-->O(1)
        int n = carr.length;
        int ans =0;
        for(int i=0;i<n-1;i++){
            if(carr[i]=='a'){
                for(int j=i+1;j<n;j++){
                    if(carr[j]=='g'){
                        ans++;
                    }
                }
            }
        }
        return ans;

    }

    static int Obs1_pair(char []carr){//TC-->O(n) SC-->O(n)
        int ans=0;
        int n = carr.length;

        int []cnt=new int[n];
        if(carr[n-1]=='g') cnt[n-1]=1;
        for(int i=n-2;i>=0;i--){
            cnt[i]=cnt[i+1];
            if(carr[i]=='g'){
                cnt[i]++;
            }
        }

        for(int i=0;i<n-1;i++){
            if(carr[i]=='a'){
                ans+=cnt[i];
            }
        }

        return ans;
    }

    static int optimized_pair(char[] carr){// TC-->O(n) SC-->O(1)
        //this is solved using carry forward method
        int ans =0;
        int count=0;
        int n = carr.length;

        for(int i=n-1;i>=0;i--){
            if(carr[i]=='g'){
                count++;
            }
            if(carr[i]=='a'){
                ans+=count;
            }
        }


        return ans;


    }

    public static void main(String[] args) {
        char[] carr= {'b','a','a','g','d','c','a','g'};
        //System.out.println(BrutPair(carr));
       // System.out.println(Obs1_pair(carr));
       System.out.println(optimized_pair(carr));



    }
    
}
