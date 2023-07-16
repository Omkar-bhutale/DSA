public class Occurrance_K_IndexInSubArray {
   static int KsSountIndexInSubArrayBrut(int[] array,int k ){
        int countK=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
              for (int j2 = i; j2 <= j; j2++) {
                if(j2==k)
                countK++;
                
              }
                
            }
            
        }
        return countK;
    }
    // do  i really need to use this approch with tc---> )(n^3) noooooooo!
    ///rhis can be solved in O(1) tc
    public static int KsSountIndexInSubArrayOpti(int length,int index){
        

        return (length-index)*(index+1);
    }
    public static void main(String[] args) {
        System.out.println(KsSountIndexInSubArrayBrut(new int[] {1,2,3,4,5,6}, 2));
        System.out.println(KsSountIndexInSubArrayOpti((new int[] {1,2,3,4,5,6}).length, 2));
        
    }
    
}
