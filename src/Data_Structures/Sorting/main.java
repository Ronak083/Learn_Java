package Data_Structures.Sorting;

public class main {
    public static void main(String[] args) {
        int arr[] = {10,54,23,7,3,54,3,32,56,87,56,23,};
        MergeSort.mergeSort(arr, 0, arr.length-1);
        MergeSort.printArray(arr);
    }
}
