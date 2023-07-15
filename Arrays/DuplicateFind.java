public class DuplicateFind {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,3,2};
        int count = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j=i+1 ; j < n; j++) {
                if(array[i]==array[j]){
                System.out.println("repeted element is "+ array[i]);
                count ++;
                break;
                }
                
            }
        }
            
            if(count==0){
                System.out.println("Duplicates are not found");

            }
            else{System.out.println("total numbers duplicated "+ count);}
    }
}