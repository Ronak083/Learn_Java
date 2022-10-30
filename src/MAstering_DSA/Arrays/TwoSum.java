package MAstering_DSA.Arrays;

import java.util.Arrays;

public class TwoSum {
        public static void main(String[] args) {

            TwoSum ts = new TwoSum();
            int[] array = {2,7,11,15};
            int[] result = ts.twosum(array, 9);
            System.out.println(Arrays.toString(result));
        }
    public int[] twosum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
    throw new IllegalArgumentException("Not found");
    }
}
