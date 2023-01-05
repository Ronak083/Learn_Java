package Data_Structures.Sorting;

public class MergeSort {
    static void merge(int[] arr , int left, int mid, int right){
        int[] righttemp = new int[mid -left + 2];
        int[] lefttemp = new int[right-mid+1];
        for (int i =0; i<= mid-left; i++){
            lefttemp[i]= arr[left+1];
        }
        for (int i = 0;i<=right-mid;i++){
            righttemp[i] = arr[mid+1 + i];
        }

        lefttemp[mid-left+1] = Integer.MAX_VALUE;
        righttemp[right-mid] = Integer.MAX_VALUE;

        int i = 0;
        int j =0;
        for (int k = left ; k<=right; k++){
            if(lefttemp[i] < righttemp[j]){
                arr[k] = lefttemp[i];
                i++;
            }
            else {
                arr[k] = righttemp[j];
                j++;
            }
        }
    }

    public static void mergeSort(int[] arr, int left, int right){
        if (right>left){
            int m = (left+right)/2;
            mergeSort(arr , left, m);
            mergeSort(arr, m+1, right);
            merge(arr,left, m, right);
        }
    }
    public static void printArray(int[] arr){
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
