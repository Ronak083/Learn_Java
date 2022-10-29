public class MissingNumber {
    public static void main(String[] args) {
        int Sum1 = 0;
        int Sum2 = 0;
        int[] intArray = {1,2,3,4,5,6,8,9,10};
        for (int i = 0; i < intArray.length; i++) {
            Sum1 += intArray[i];
        }

        Sum2 = (intArray[intArray.length - 1] * (intArray[intArray.length - 1] + 1)) / 2;
        int d = Sum2 - Sum1;
        System.out.println(d);
    }
}
