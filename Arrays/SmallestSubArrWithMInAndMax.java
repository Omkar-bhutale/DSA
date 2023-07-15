//Qns-->Given an integer array find the length of smallest subarray with an min and max element

public class SmallestSubArrWithMInAndMax {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 1, 3, 4, 6, 4, 6, 3, 5 };
        int length = array.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);

        }
        int minId = -1;
        int maxId = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                minId = i;
                if (maxId != -1) {
                    length = Math.min(length, Math.abs(minId - maxId + 1));
                }
            }
            if (array[i] == max) {
                maxId = i;
                if (minId != -1) {
                    length = Math.min(length, Math.abs(maxId - minId + 1));
                }

            }

        }

        System.out.println("length =" + length);

    }

}
