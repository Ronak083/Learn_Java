package Data_Structures.Sorting;
public class main {
    public static void main(String[] args) {
        int arr[] = {10,54,24,2,7,2,51,3,32,56,87,56,23,};

        MergeSort.mergeSort(arr, 0, arr.length-1);
        MergeSort.printArray(arr);

        BubbleSort.bubbleSort(arr);
        BubbleSort.printArray(arr);
    }
}
