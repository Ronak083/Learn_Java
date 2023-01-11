package Data_Structures.Sorting;
public class main {
    public static void printArray(int[] arr){
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {10,54,24,2,7,2,51,3,32,56,87,56,23,};

        MergeSort.mergeSort(arr, 0, arr.length-1);
        printArray(arr);

        BubbleSort.bubbleSort(arr);
        printArray(arr);

        InsertionSort.InsertionSort(arr);
        printArray(arr);

        SelectionSort.selectionSort(arr);
        printArray(arr);
    }
}
